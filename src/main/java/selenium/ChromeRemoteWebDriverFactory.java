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

    @Override
    protected ChromeOptions getRemoteDriverOptions() {
        return new ChromeOptions();
    }

}
