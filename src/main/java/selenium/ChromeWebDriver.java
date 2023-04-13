package selenium;

import log4j2.LoggerLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;


public class ChromeWebDriver {
    public static WebDriver driver;
    public void initiateChromeWebDriver(ReadingConfig rc) {
        try {
            //Use the remote Chrome webdriver if the Env. variable is empty
            String seleniumWebdriverURL = System.getenv("SELENIUM_WEBDRIVER_URL");
            if(seleniumWebdriverURL == null){
                factory = new LocalWebDriverFactory();
                LoggerLoader.info("Using Local Webdriver");
            } else if ( lambdaTestPlatform != null){
                HashMap<String, String> options = new HashMap<>();

                options.put("LAMBDATEST_USERNAME", System.getenv("LAMBDATEST_USERNAME"));
                options.put("LAMBDATEST_ACCESS_TOKEN", System.getenv("LAMBDATEST_ACCESS_TOKEN"));
                options.put("LAMBDATEST_PLATFORM", lambdaTestPlatform);
                options.put("LAMBDATEST_VERSION", System.getenv("LAMBDATEST_VERSION"));
                options.put("LAMBDATEST_BROWSER_NAME", System.getenv("LAMBDATEST_BROWSER_NAME"));
                options.put("LAMBDATEST_BROWSER_VERSION", System.getenv("LAMBDATEST_BROWSER_VERSION"));

                factory = new LambdaTestWebDriverFactory(seleniumWebdriverURL,options);
                LoggerLoader.info("Using LambdaTest");
            }
        } catch (Exception e) {
            LoggerLoader.fatal(String.valueOf(e));
        }
    }
}
