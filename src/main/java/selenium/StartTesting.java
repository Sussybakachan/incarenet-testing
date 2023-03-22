package selenium;

import log4j2.LoggerLoader;

import static selenium.ChromeWebDriver.driver;
import static selenium.CompareTasksInCardio.*;


public class StartTesting {


    public static void main(String[] args) throws Exception {
        //  System.out.println(PatternTest.useRegex("2022-12-26T12:34:14.265Z"));
        //  System.out.println(PatternTest.useRegex("2022-12-26T12:34:14.265Z"));

        InsuiteServerConfig insuiteServerConfig = new InsuiteServerConfig();
        ReadingConfig rc = null;
        rc = new ReadingConfig();
        ChromeWebDriver chromeWebDriver= new ChromeWebDriver();
        chromeWebDriver.initiateChromeWebDriver(rc);
        LoggerLoader.info("Weitergegangen");
        System.out.println("irgendwas");
        try{
            insuiteServerConfig.getInSuiteURL();
        } catch (Exception e){
            LoggerLoader.fatal(String.valueOf(e));
        }

Thread.sleep(1000000000);
        LoggerLoader.info("Automation test started");
        LoggingDataModif loggingDataModif = new LoggingDataModif();
        LoggerLoader.info("Automation test finished");
        LoggerLoader.info("Following Testcase(s) were successful: \n " + successfulTestCases);
        LoggerLoader.info("Following Testcase(s) failed:\n" + loggingDataModif.editFailedTaskLogging());

        driver.close();


    }


}
