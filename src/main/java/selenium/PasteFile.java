package selenium;

import org.apache.commons.io.FileUtils;

import java.io.File;


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
        while (!FileUtils.listFiles(input, null, true).isEmpty()) {
            // Wait for some time
            Thread.sleep(1000); // Wait for 1 second
        }
        System.out.println("Folder is now empty");
        Thread.sleep(3000);

    }

}
