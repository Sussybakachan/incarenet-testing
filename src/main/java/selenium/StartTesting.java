package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static selenium.inCardio.*;

public class StartTesting {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dboiko\\Desktop\\Last-Test\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dcm1al4fpj.hub.doc-cirrus.com");
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;
        action = new Actions(driver);
        PasteFile.pasteFile("C:\\Users\\dboiko\\IdeaProjects\\Selenium-Plugin2\\hl7\\Atriale Arrhythmielast über dem Grenzwert.hl7", "C:\\File-Forwarder-Armee\\ff1\\input\\Atriale Arrhythmielast über dem Grenzwert.hl7");

        loginP();
        inCardioDash();
        // thresholdCheck();
        comparison();
    }
}