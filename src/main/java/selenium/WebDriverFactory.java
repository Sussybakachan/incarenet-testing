package selenium;

import org.openqa.selenium.WebDriver;

public interface WebDriverFactory {
    //TestContext describes what the test is about (e.g. name, build)
    WebDriver createWebDriver() throws Exception;
    WebDriver createWebDriverForContext(TestContext context) throws Exception;
}
