package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static selenium.CompareTasksInCardio.*;
import static selenium.ExpectedTasks.createTasks;
import static selenium.ExpectedTasks.expectedTask;



public class StartTesting {

    public static void main(String[] args) throws InterruptedException, IOException {


      ReadingConfig rc = new ReadingConfig();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dboiko\\Desktop\\Last-Test\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(rc.loadProperty().getProperty("SERVER_URL"));
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;
        action = new Actions(driver);
        PasteFile.pasteFile("C:\\Users\\dboiko\\IdeaProjects\\Selenium-Plugin2\\hl7\\Atriale Arrhythmielast über dem Grenzwert.hl7", "C:\\File-Forwarder-Armee\\ff2\\input\\Atriale Arrhythmielast über dem Grenzwert.hl7");

        createTasks();
        System.out.println(createTasks());
        System.out.println("expectedTask checkbox: " + expectedTask.getCheckBox() + expectedTask.getAction() + expectedTask.getTaskDescription() + expectedTask.getColor() + expectedTask.getEmployee() + expectedTask.getStartDate() + expectedTask.getReceiveDate() + expectedTask.getTargetDate() + expectedTask.getMeasurements() + expectedTask.getPdf() + expectedTask.getFurtherInformation());
        loginP();
        inCardioDash();
        // thresholdCheck();
       comparison();

    }
}
