package selenium;

import AbbottTestCasesExpectedTasks.AbbottExpectedTasksTestCase1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static BiotronikTestCasesExpertedTasks.BiotronikExpectedTasksTestCase1.createBiotronik97generalTask;
import static BiotronikTestCasesExpertedTasks.BiotronikExpectedTasksTestCase2.BiotronikTestCase2List;
import static AbbottTestCasesExpectedTasks.AbbottExpectedTasksTestCase1.*;
import static selenium.CompareTasksInCardio.*;
import static selenium.CreationOfAllExpectedTasks.createBiotronikExpectedTasks;
import static selenium.CreationOfAllExpectedTasks.createExpectedTasks;
import static selenium.ExpectedTasks.*;


public class StartTesting {

    public static void main(String[] args) throws Exception {
      //  System.out.println(PatternTest.useRegex("2022-12-26T12:34:14.265Z"));


      ReadingConfig rc = new ReadingConfig();
        System.setProperty("webdriver.chrome.driver", rc.loadProperty().getProperty("SELENIUM_WEBDRIVER_PATH"));
        driver = new ChromeDriver();
        driver.get(rc.loadProperty().getProperty("SERVER_URL"));
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;
        action = new Actions(driver);
       // PasteFile.pasteFile("C:\\Users\\dboiko\\IdeaProjects\\Selenium-Plugin2\\hl7\\Atriale Arrhythmielast über dem Grenzwert.hl7", "C:\\File-Forwarder-Armee\\ff2\\input\\Atriale Arrhythmielast über dem Grenzwert.hl7");

       //createTasks();
      createBiotronikExpectedTasks();
        System.out.println("expectedTask checkbox: " + expectedTask.getCheckBox() + expectedTask.getAction() + expectedTask.getTaskDescription() + expectedTask.getColor() + expectedTask.getEmployee() + expectedTask.getStartDate() + expectedTask.getReceiveDate() + expectedTask.getTargetDate() + expectedTask.getMeasurements() + expectedTask.getPdf() + expectedTask.getFurtherInformation());
        loginP();
        inCardioDash();
        choosepatient("Sel-Abbott");
      System.out.println("abbottCrt size: " + abbottCrt.size());
        compareCrt(AbbottTestCase1List);
        // thresholdCheck();
       //comparison();

    }
}
