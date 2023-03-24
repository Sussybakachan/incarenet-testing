package selenium;

import dsutilities.LoggerLoader;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PasteFile {
    String pathToInput = System.getProperty("user.dir") + "input\\";

    public void copyFile(String pathToOldHl7, String pathToInput) throws InterruptedException {
        File source = new File(pathToOldHl7);
        File dest = new File(pathToInput);

        try {
            FileUtils.copyFile(source, dest);
        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }

    public void waitUntilFilesGotProcessed(List<String> fileName) throws InterruptedException {
        File input = new File(pathToInput);

        List<String> extensions = Arrays.asList("hl7", "json");
        while (hasFilesWithExtensions(input, extensions)) {
            try {
                // Wait for 1 second before checking again
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private boolean hasFilesWithExtensions(File input, List<String> extensions) {
        // Get the list of files in the folder
        File[] files = input.listFiles();

        // Check if any of the files have the desired extensions
        for (File file : files) {
            String extension = getFileExtension(file);
            if (extensions.contains(extension)) {
                return true;
            }
        }

        return false;
    }

    private String getFileExtension(File file) {
        String name = file.getName();
        int lastDotIndex = name.lastIndexOf('.');
        if (lastDotIndex == -1) {
            return "";
        }
        return name.substring(lastDotIndex + 1);
    }

    public void checkUnsuccessfullySendFiles(File inputFolder, List<String> originalPaths) throws InterruptedException {


        Set<String> originalNamesHashSet = new HashSet<>();

        // Extract the original file names from the paths
        for (String path : originalPaths) {
            File file = new File(path);
            originalNamesHashSet.add(file.getName());
        }

        File[] files = inputFolder.listFiles();

        // Check if any file names have been modified to include ".ignore" or ".skipped"
        for (File file : files) {
            if (file.isFile() && !file.getName().equals(".ignore") &&
                    (file.getName().endsWith(".ignore") || file.getName().endsWith(".skipped"))) {
                String originalName = file.getName().substring(0, file.getName().lastIndexOf('.'));
                if (originalNamesHashSet.contains(originalName)) {
                    LoggerLoader.error("\n\"" + originalName + "\" was not send to inCARDIO-Dashboard \n file extension was changed to: \"" + file.getName().substring(file.getName().lastIndexOf('.')) + "\"");
                    for (String path : originalPaths) {
                        System.out.println(path + "ungefiltert");
                        if (path.contains(originalName)) {
                            System.out.println(path + "Enthält den original name " + originalName);
                            resentFiles(inputFolder, path);
                        }
                    }
                }
            }
        }
    }

    /*
            while (!FileUtils.listFiles(input, null, true).isEmpty()) {
                // Wait for some time
                Thread.sleep(1000); // Wait for 1 second
            }
            System.out.println("Folder is now empty");
            Thread.sleep(3000);

        }
        */
    private void resentFiles(File inputFolder, String idcoPath) {
        File dest = new File(String.valueOf(inputFolder));
        File source = new File(idcoPath);
        try {
            FileUtils.copyFile(source, dest);
        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }
}

