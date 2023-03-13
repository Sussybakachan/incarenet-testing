package selenium;

import dsutilities.LoggerLoader;
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
                System.setProperty("webdriver.chrome.driver", rc.loadProperty().getProperty("SELENIUM_WEBDRIVER_PATH"));
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                LoggerLoader.info("Using local Chrome Webdriver");
            } else {
                ChromeOptions options = new ChromeOptions();
                driver = new RemoteWebDriver(new URL(seleniumWebdriverURL), options);
                LoggerLoader.info("Using Remote Chrome Webdriver");
            }
        } catch (Exception e) {
            LoggerLoader.fatal(String.valueOf(e));
        }
    }
}
