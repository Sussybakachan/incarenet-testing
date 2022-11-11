package selenium;

import org.apache.commons.io.FileUtils;

import java.io.File;


public class PasteFile {
    static String pathToInput = System.getProperty("user.dir") + "input\\";

    public static void pasteFile(String pathToOldHl7, String pathToInput) {
        File source = new File(pathToOldHl7);
        File dest = new File(pathToInput);

        try {
            FileUtils.copyFile(source, dest);
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }
}
