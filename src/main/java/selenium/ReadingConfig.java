package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingConfig {
    Properties loadProperty() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("resources/config.properties");
        prop.load(fis);
        return prop;
    }
}
