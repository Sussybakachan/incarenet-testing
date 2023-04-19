package selenium;

import log4j2.LoggerLoader;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Objects;


/**
 * This is a backward compatibility adapter
 * @deprecated
 */

public class ChromeWebDriver {
    public static WebDriver driver;
    public void initiateChromeWebDriver(ReadingConfig rc) {

        try {
            WebDriverFactory factory;
            //Use the remote Chrome webdriver if the Env. variable is empty
            String seleniumWebdriverURL = System.getenv("SELENIUM_WEBDRIVER_URL");
            String  lambdaTestPlatform = System.getenv("LAMBDATEST_PLATFORM");
            String lambdaTestPlatformConfig = rc.loadProperty().getProperty("LAMBDATEST_PLATFORM");
            String lambdaTestUrlConfig = rc.loadProperty().getProperty("LAMBDATEST_HUB_URL");
            if(seleniumWebdriverURL == null && Objects.equals(lambdaTestUrlConfig, "")){
                factory = new LocalWebDriverFactory();
                System.setProperty("webdriver.chrome.driver", rc.loadProperty().getProperty("SELENIUM_WEBDRIVER_PATH"));
                LoggerLoader.info("Using Local Webdriver");
            } else if ( lambdaTestPlatform != null || !Objects.equals(lambdaTestUrlConfig, "")) {
                HashMap<String, String> options = new HashMap<>();
                if (lambdaTestPlatform != null) {
                    options.put("LAMBDATEST_USERNAME", System.getenv("LAMBDATEST_USERNAME"));
                    options.put("LAMBDATEST_ACCESS_TOKEN", System.getenv("LAMBDATEST_ACCESS_TOKEN"));
                    options.put("LAMBDATEST_PLATFORM", lambdaTestPlatform);
                    options.put("LAMBDATEST_VERSION", System.getenv("LAMBDATEST_VERSION"));
                    options.put("LAMBDATEST_BROWSER_NAME", System.getenv("LAMBDATEST_BROWSER_NAME"));
                    options.put("LAMBDATEST_BROWSER_VERSION", System.getenv("LAMBDATEST_BROWSER_VERSION"));
                    factory = new LambdaTestWebDriverFactory(Objects.requireNonNullElse(seleniumWebdriverURL, lambdaTestUrlConfig), options);
                    LoggerLoader.info("Using LambdaTest with docker-compose Env. variables");
                } else {
                    options.put("LAMBDATEST_USERNAME", rc.loadProperty().getProperty("LAMBDATEST_USERNAME"));
                    options.put("LAMBDATEST_ACCESS_TOKEN", rc.loadProperty().getProperty("LAMBDATEST_ACCESS_TOKEN"));
                    options.put("LAMBDATEST_PLATFORM", lambdaTestPlatformConfig);
                    options.put("LAMBDATEST_VERSION", rc.loadProperty().getProperty("LAMBDATEST_VERSION"));
                    options.put("LAMBDATEST_BROWSER_NAME", rc.loadProperty().getProperty("LAMBDATEST_BROWSER_NAME"));
                    options.put("LAMBDATEST_BROWSER_VERSION", rc.loadProperty().getProperty("LAMBDATEST_BROWSER_VERSION"));
                    factory = new LambdaTestWebDriverFactory(Objects.requireNonNullElse(seleniumWebdriverURL, lambdaTestUrlConfig), options);
                    LoggerLoader.info("Using LambdaTest with config.properties");
                }
            }
            else {
                factory = new ChromeRemoteWebDriverFactory(seleniumWebdriverURL);
                LoggerLoader.info("Using generic Remote Web Driver");
            }
            driver = factory.createWebDriver();
        } catch (Exception e) {
            LoggerLoader.fatal(String.valueOf(e));
        }
    }
}
