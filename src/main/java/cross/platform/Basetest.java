package cross.platform;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;

import selenium.ReadingConfig;

import java.io.IOException;
import java.net.URL;


public class Basetest {


    public static final String USERNAME = "oauth-fernand.mushinzimana-d3b4c";
    public static final String ACCESS_KEY = "7306e47b-7b1e-48e9-b530-dd175f706754";


    public static final String URL1 = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";


    public static void main(String[] args) throws IOException, InterruptedException {
        //Add the browser and platform capabilities
        MutableCapabilities sauceOptions = new MutableCapabilities();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("platformName", "Windows 10");
        chromeOptions.setCapability("browserVersion", "latest");
        chromeOptions.setCapability("sauce:options", sauceOptions);

        //Create a new RemoteWebDriver instance
        WebDriver driver = new RemoteWebDriver(new URL(URL1), chromeOptions);

        //Navigate to the Insuite page
        driver.get("https://cnx12003dp.hub.doc-cirrus.com/");
        ReadingConfig rc = new ReadingConfig();
        System.out.println("test2");
        driver.findElement(By.id("usernameField")).sendKeys(rc.loadProperty().getProperty("USERNAME"));
        System.out.println(rc.loadProperty().getProperty("USERNAME"));
        Thread.sleep(2000);
        driver.findElement(By.id("passwordField")).sendKeys(rc.loadProperty().getProperty("PASSWORD"));
        System.out.println(rc.loadProperty().getProperty("PASSWORD"));
        Thread.sleep(2000);
        System.out.println("test3");
        boolean isDisplayed = driver.findElement(By.id("doLoginBtn")).isDisplayed();
        System.out.println(isDisplayed);
        Thread.sleep(2000);
        driver.findElement(By.id("doLoginBtn")).click();
        System.out.println("test4");
        Thread.sleep(8000);


        //Print title of webpage to Console
        System.out.println(driver.getTitle());

        Thread.sleep(3000);

        driver.quit();


    }

}
