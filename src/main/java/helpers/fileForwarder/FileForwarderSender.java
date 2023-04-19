package helpers.fileForwarder;


import helpers.interfaces.FileSender;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeoutException;


public class FileForwarderSender implements FileSender {
    public record Options (
            String inputDir,
            int defaultTimeout,

            String[] failedExtensions,

            String sourceFileDirectory
    ){

        public Options {
            if (sourceFileDirectory == null) {
                throw new IllegalArgumentException("sourceFileDirectory must not be null");
            }
            if (inputDir == null) {
                throw new IllegalArgumentException("inputDir must not be null");
            }

            if (failedExtensions == null) {
                failedExtensions = new String[]{"skipped", "ignore"};
            }

            if (defaultTimeout < 0) {
                throw new IllegalArgumentException("defaultTimeout must be greater than 0");
            }
        }
    }

    Options options;

    public FileForwarderSender(Options options) {
        this.options = options;
    }
    private String[] joinFileNamesAndDirectory(String[] fileNames) {
        String[] filePaths = new String[fileNames.length];

        for (int i = 0; i < fileNames.length; i++) {
            filePaths[i] = options.sourceFileDirectory + File.separator + fileNames[i];
        }
        return filePaths;
    }

    //HIGH LEVEL FUNCTION(can be seen on public modifier)
    public void sendFile(final String[] sourceFiles) throws Exception {

        File[] inputFiles = this.copyFiles(joinFileNamesAndDirectory(sourceFiles));

        this.waitUntilFileHasBeenProcessed(inputFiles, options.defaultTimeout);

        File[] skippedFiles = this.findSkippedFiles(inputFiles);

        if (skippedFiles.length > 0) {
            throw new Exception("File forwarder skipped these files: " + skippedFiles);
        }
    }

    //Low LEVEL FUNCTION(can be seen on priavte modifier)
    private File[] copyFiles(final String[] sourceFiles) throws Exception {
        String targetDirectory = options.inputDir;

        File[] files = new File[sourceFiles.length];

            for (int i = 0; i < files.length; i++) {
            String sourceFile = sourceFiles[i];
            File source = new File(sourceFile);
            File dest = new File(targetDirectory + File.separator + source.getName());
            FileUtils.copyFile(source, dest);
            files[i] = dest;
        }

        return files;
    }

    private Boolean filesExist(final File[] files) {
        for (File file : files) {
            if (!file.exists()) {
                return false;
            }
        }
        return true;
    }

    private void waitUntilFileHasBeenProcessed(final File[] files, int timeout) throws TimeoutException, Exception {
        // Wait for all files to be processed. They are processed when they are removed from the input directory.
        // Check if all files have been removed from the input directory
        int period = 1000;

        // XXX this is a hack and a bit inefficient. We should be able to monitor the input directory for changes
        // from another thread
        for (int i = 0; i < timeout; i += period) {
            if (!filesExist(files)) {
                return;
            }
            Thread.sleep(period);
        }
                throw new TimeoutException("File forwarder did not process these files: " + files);
    }


    private File[] findSkippedFiles(final File[] files) {
        // A skipped file is renamed to end with .skipped or .ignore
        // Check if any file matches this pattern

        // convert file paths to refer to possible skipped files
        Set<File> skippedFiles = new HashSet<>();

        for (File file : files) {
            for (String extension : this.options.failedExtensions) {
                File skippedFile = new File(file.getAbsolutePath() + "." + extension);
                if (skippedFile.exists()) {
                    skippedFiles.add(skippedFile);
                }
            }
        }

        return skippedFiles.toArray(new File[0]);
    }

}