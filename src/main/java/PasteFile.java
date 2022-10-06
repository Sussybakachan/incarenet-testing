import org.apache.commons.io.FileUtils;

import java.io.File;


public class PasteFile {

    public static void pasteFile(String pathToOldHl7, String pathtoInput) {
        File source = new File(pathToOldHl7);
        File dest = new File(pathtoInput);

        try {
            FileUtils.copyFile(source, dest);
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }
}
