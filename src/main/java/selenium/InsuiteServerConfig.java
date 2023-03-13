package selenium;

import dsutilities.LoggerLoader;

import java.io.IOException;


import static selenium.CompareTasksInCardio.driver;

public class InsuiteServerConfig {

void getInSuiteURL() throws IOException {
    if(System.getenv("ICN_URL")==null){
        ReadingConfig rc = new ReadingConfig();
        driver.get(rc.loadProperty().getProperty("SERVER_URL"));
        LoggerLoader.info("Using config.properties InSuite URL");
    }else {
        String inSuiteURL = System.getenv("ICN_URL");
        System.out.println(inSuiteURL);
        driver.get(inSuiteURL);
        LoggerLoader.info("Using docker-compose InSuite URL");
    }
}
}
