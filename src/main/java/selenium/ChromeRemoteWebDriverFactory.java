package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class ChromeRemoteWebDriverFactory extends RemoteWebDriverFactory{

    ChromeRemoteWebDriverFactory(String url) {
        super(url);
    }
    public ChromeOptions getRemoteDriverOptionsForChrome() {
        // the webdriver is local
        ChromeOptions options = new ChromeOptions();

        return options;
    }
    //XXX should we override this method? See the implementation in ChromeWebDriverFactory.java
    public RemoteWebDriver createWebDriver() throws Exception {
        return new RemoteWebDriver(new URL(super.url), getRemoteDriverOptionsForChrome());
    }
}
