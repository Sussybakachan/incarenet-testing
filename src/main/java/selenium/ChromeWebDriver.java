package selenium;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import com.browserstack.local.Local;

 public class ChromeWebDriver {
    // declare BrowserStack credentails as environment variables
    public static final String USERNAME = (System.getenv("BROWSERSTACK_USERNAME") != null) ? System.getenv("BROWSERSTACK_USERNAME") : "danielboiko_KEfyze";
    public static final String AUTOMATE_KEY = (System.getenv("BROWSERSTACK_ACCESS_KEY") != null) ? System.getenv("BROWSERSTACK_ACCESS_KEY") : "WaWznYHT7scEtWGNxpjv";
    // declare remote URL in a variable
    public static final String URLBS = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";

    public static WebDriver driver;

     // Creates an instance of Local
     static Local bsLocal = new Local();

     // You can also set an environment variable - "BROWSERSTACK_ACCESS_KEY".
     static HashMap<String, String> bsLocalArgs = new HashMap<String, String>();
    static void initiateChromeWebDriver(ReadingConfig rc) throws Exception {
        System.out.println(USERNAME);
        System.out.println(AUTOMATE_KEY);
        System.out.println(URLBS);
        bsLocalArgs.put("key", "WaWznYHT7scEtWGNxpjv");
        bsLocal.start(bsLocalArgs);
        System.out.println(bsLocal.isRunning());
        MutableCapabilities capabilities = new MutableCapabilities();
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("browserVersion", "latest");
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("os", "Windows");
        browserstackOptions.put("osVersion", "10");
        browserstackOptions.put("local", "true");
        browserstackOptions.put("projectName", "Marketing Website v2");
        browserstackOptions.put("buildName", "alpha_0.1.7");
        browserstackOptions.put("sessionName", "Home page must have a title");
        capabilities.setCapability("bstack:options", browserstackOptions);
        driver = new RemoteWebDriver(new URL(URLBS), capabilities);
        System.out.println("ende");
        bsLocal.stop();
       /* try {
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
        }*/
    }
}
