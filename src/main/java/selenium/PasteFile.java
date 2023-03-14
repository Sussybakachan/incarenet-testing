package selenium;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Arrays;
import java.util.List;


public class PasteFile {
    static String pathToInput = System.getProperty("user.dir") + "input\\";

    public static void pasteFile(String pathToOldHl7, String pathToInput) throws InterruptedException {
        File source = new File(pathToOldHl7);
        File dest = new File(pathToInput);

        try {
            FileUtils.copyFile(source, dest);
        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }

    public static void inputIsEmpty() throws InterruptedException {
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
    }



    private static boolean hasFilesWithExtensions(File input, List<String> extensions) {
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

    private static String getFileExtension(File file) {
        String name = file.getName();
        int lastDotIndex = name.lastIndexOf('.');
        if (lastDotIndex == -1) {
            return "";
        }
        return name.substring(lastDotIndex + 1);
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
