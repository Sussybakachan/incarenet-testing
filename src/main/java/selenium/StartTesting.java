package selenium;

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
import static selenium.CompareTasksInCardio.*;
import static selenium.PdfCheck.*;
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
        //PasteFile.pasteFile("/home/fernand/Documents/sdx/biotronik/Biotronik Implant CRT 97% LV 97%.hl7", "/home/fernand/IdeaProjects/sdx-file-forwarder/input/Biotronik Implant CRT 97% LV 97%.hl7");

        //createTasks();
        //createBiotronikExpectedTasks();
        //System.out.println("expectedTask checkbox: " + expectedTask.getCheckBox() + expectedTask.getAction() + expectedTask.getTaskDescription() + expectedTask.getColor() + expectedTask.getEmployee() + expectedTask.getStartDate() + expectedTask.getReceiveDate() + expectedTask.getTargetDate() + expectedTask.getMeasurements() + expectedTask.getPdf() + expectedTask.getFurtherInformation());
        loginP();
        inCardioDash();
        choosepatient("Sel-Abbott");
        readPdfContent();
        //System.out.println("abbottCrt size: " + abbottCrt.size());
        //compareCrt(BiotronikTestCase2List);
        // thresholdCheck();
        //comparison();
        //driver.close();

    }

}
