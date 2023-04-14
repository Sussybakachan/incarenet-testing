package selenium;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class RemoteWebDriverFactory implements WebDriverFactory{
    protected String url;

    RemoteWebDriverFactory(String url) {
        this.url = url;
    }

    protected DesiredCapabilities getRemoteDriverOptions() {
        return new DesiredCapabilities();
    }
    protected DesiredCapabilities getRemoteDriverOptions(TestContext context){
        return getRemoteDriverOptions();
    }

    private RemoteWebDriver createWebDriver(Capabilities options) throws Exception {
        return new RemoteWebDriver(new URL(url), options);
    }

    public RemoteWebDriver createWebDriver() throws Exception {
        return new RemoteWebDriver(new URL(url), getRemoteDriverOptions());
    }

    public RemoteWebDriver createWebDriverForContext(TestContext context) throws Exception {
        return createWebDriver(getRemoteDriverOptions(context));
    }
}
