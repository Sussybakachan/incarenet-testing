package selenium;

import java.io.IOException;


import static selenium.CompareTasksInCardio.driver;

public class InsuiteServerConfig {

void getInSuiteURL() throws IOException {
    if(System.getenv("INSUITE_URL")!=null){
        String inSuiteURL = System.getenv("INSUITE_URL");
        System.out.println(inSuiteURL);
        driver.get(inSuiteURL);
    }else {
       ReadingConfig rc = new ReadingConfig();
       driver.get(rc.loadProperty().getProperty("SERVER_URL"));
    }
}
}
