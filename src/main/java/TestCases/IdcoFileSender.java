package TestCases;


import org.apache.commons.io.FileUtils;

import java.io.File;





public class FileForwarderSender implements FileSender  {
    public record Options (
            String inputDir,
            Number defaultTimeout
    ){}

    Options options;

    public FileForwarderSender(Options options) {
        this.options = options;
    }

    //HIGH LEVEL FUNCTION(can be seen on public modifier)
    public sendFile(final String[] sourceFiles) {

    }

    //Low LEVEL FUNCTION(can be seen on priavte modifier)
    private String copyFile(final String[] sourceFiles) {



        try {
            FileUtils.copyFile(source, dest);
        } catch (Exception var5) {
            var5.printStackTrace();
        }
        return sourceDirectory;
    }

    private String waitUntilFileHasBeenProcessed(Number timeout) {

    }

    private  boolean hasFilesWithExtensions(){

    }

    private String getFileExtension() {

    }
}