package selenium;

import TestCases.AllTestCasesPutTogether;
import dsutilities.LoggerLoader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import static selenium.ChromeWebDriver.driver;
import static selenium.CompareTasksInCardio.*;
import static selenium.CreationOfAllExpectedTasks.createAllExpectedTasks;


public class StartTesting {


    public static void main(String[] args) throws Exception {
        LoggerLoader.info("Automation test started");
        InsuiteServerConfig insuiteServerConfig = new InsuiteServerConfig();
        ReadingConfig rc = null;
        rc = new ReadingConfig();
        ChromeWebDriver chromeWebDriver= new ChromeWebDriver();
        chromeWebDriver.initiateChromeWebDriver(rc);
        LoggerLoader.info("Weitergegangen");
        try{
            insuiteServerConfig.getInSuiteURL();
        } catch (Exception e){
            LoggerLoader.fatal(String.valueOf(e));
        }

        driver.manage().window().maximize();
        LoggerLoader.info("Window maximized");
        js = (JavascriptExecutor) driver;
        action = new Actions(driver);
        createAllExpectedTasks();
        loginP();
        inCardioDash();
        // XXX This is a hack. "allTestCasesPutTogether" is actually running all the testcases.
        // XXX All the testcases are in the constructor of the AllTestCasesPutTogether Class.
        AllTestCasesPutTogether allTestCasesPutTogether = new AllTestCasesPutTogether();
        LoggingDataModif loggingDataModif = new LoggingDataModif();
        LoggerLoader.info("Automation test finished");
        LoggerLoader.info("Following Testcase(s) were successful: \n " + successfulTestCases);
        LoggerLoader.info("Following Testcase(s) failed:\n" + loggingDataModif.editFailedTaskLogging());
        driver.close();

    }


}
