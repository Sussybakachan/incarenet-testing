package selenium;

import log4j2.LoggerLoader;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PasteFile {
     String pathToInput = System.getProperty("user.dir") + "input\\";

    public void pasteFile(String pathToOldHl7, String pathToInput) throws InterruptedException {
        File source = new File(pathToOldHl7);
        File dest = new File(pathToInput);

        try {
            FileUtils.copyFile(source, dest);
        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }

    public void checkIfFilesGotSend(List<String> fileName) throws InterruptedException {
        File input = new File(System.getProperty("user.dir") + "/input");

        List<String> extensions = Arrays.asList("hl7", "xml");

        while (hasFilesWithExtensions(input, extensions)) {
            try {
                // Wait for 1 second before checking again
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All files with extensions " + extensions + " have been processed or removed from the folder.");
        Thread.sleep(5000);
        checkUnsuccessfullySendFiles(input, fileName);
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

    public void checkUnsuccessfullySendFiles(File folder, List<String> originalPaths) {
        Set<String> originalNames = new HashSet<>();

        // Extract the original file names from the paths
        for (String path : originalPaths) {
            File file = new File(path);
            originalNames.add(file.getName());
        }

        File[] files = folder.listFiles();

        // Check if any file names have been modified to include ".ignore" or ".skipped"
        for (File file : files) {
            if (file.isFile() && !file.getName().equals(".ignore") &&
                    (file.getName().endsWith(".ignore") || file.getName().endsWith(".skipped"))) {
                String originalName = file.getName().substring(0, file.getName().lastIndexOf('.'));
                if (originalNames.contains(originalName)) {
                    LoggerLoader.error("\n\"" + originalName + "\" was not send to inCARDIO-Dashboard \n file extension was changed to: \"" + file.getName().substring(file.getName().lastIndexOf('.')) + "\"");
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

}
