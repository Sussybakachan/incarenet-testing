package selenium;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeRemoteWebDriverFactory extends RemoteWebDriverFactory{


    ChromeRemoteWebDriverFactory(String url) {
        super(url);
    }

    @Override
    protected ChromeOptions getRemoteDriverOptions() {
        return new ChromeOptions();
    }

}
