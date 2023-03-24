package TestCases;

import dsutilities.LoggerLoader;
import selenium.LoggingDataModif;

import static selenium.ChromeWebDriver.driver;
import static selenium.CompareTasksInCardio.successfulTestCases;

public class shutdownHook {

    public static void addShutdownHookStop() {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                LoggingDataModif loggingDataModif = new LoggingDataModif();
                LoggerLoader.info("Automation test is abruptly stopped in Intellij");
                LoggerLoader.info("Following Testcase(s) were successful: \n " + successfulTestCases);
                LoggerLoader.info("Following Testcase(s) failed:\n" + loggingDataModif.editFailedTaskLogging());
                driver.quit();
            }
        });
    }


}
