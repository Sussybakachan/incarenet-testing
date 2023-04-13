package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocalWebDriverFactory implements WebDriverFactory {
    public ChromeOptions getLocalDriverOptionsForChrome() {
        // the webdriver is local
        ChromeOptions options = new ChromeOptions();

        //  Need to allow all origins, because: new Chromedriver version needed it to work
        // XXX we don't know why really. Should check this.
        options.addArguments("--remote-allow-origins=*");

        return options;
    }

    public WebDriver createWebDriver() throws Exception {
        return new ChromeDriver(getLocalDriverOptionsForChrome());
    }

    public WebDriver createWebDriverForContext(TestContext context) throws Exception {
        return createWebDriver();
    }
}
