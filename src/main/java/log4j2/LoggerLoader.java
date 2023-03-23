package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import selenium.LoggingDataModif;

import static selenium.ChromeWebDriver.driver;
import static selenium.CompareTasksInCardio.successfulTestCases;


// import "import dsutilities.LoggerLoader;" into the class you want to use the logger
// depending on the Loggerlevel you want to use, type e.g.: LoggerLoader.info("start");
// The logging will happen in the logs folder into a file and into the console
//TODO decide what logginglevels need be logged
public class LoggerLoader {

    private static Logger logger = LogManager.getLogger();


    public static void info(String message) {
        logger.info(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void fatal(String message) {
        logger.fatal(message);
        LoggingDataModif loggingDataModif = new LoggingDataModif();
        LoggerLoader.info("Automation test finished");
        LoggerLoader.info("Following Testcase(s) were successful: \n " + successfulTestCases);
        LoggerLoader.info("Following Testcase(s) failed:\n" + loggingDataModif.editFailedTaskLogging());
        if (driver!=null){
            driver.close();

        }
        System.exit(-1);
    }

    public static void debug(String message) {
        logger.debug(message);
    }
}
