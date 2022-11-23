package selenium;

//TODO typo in "Expected"-> "Experted"
import AbbottTestCasesExpectedTasks.*;
import MedtronicTestCasesExpertedTasks.*;
import MicroPortTestCasesExpertedTasks.*;
import TestCases.AbbottTestCases;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static selenium.CompareTasksInCardio.*;
import static selenium.ExpectedTasks.expectedTask;
import static SeleniumThresholds.BatteryStatusRow.*;
import static selenium.DeletingTasks.deleteTask;


        import static selenium.CompareTasksInCardio.*;
import static selenium.CreationOfAllExpectedTasks.createAllExpectedTasks;
import static selenium.PdfCheck.pdfCheck;


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
      createAllExpectedTasks();
       // System.out.println("expectedTask checkbox: " + expectedTask.getCheckBox() + expectedTask.getAction() + expectedTask.getTaskDescription() + expectedTask.getColor() + expectedTask.getEmployee() + expectedTask.getStartDate() + expectedTask.getReceiveDate() + expectedTask.getTargetDate() + expectedTask.getMeasurements() + expectedTask.getPdf() + expectedTask.getFurtherInformation());
        loginP();
        inCardioDash();
        AbbottTestCases abbottTestCases = new AbbottTestCases();

        // thresholdCheck();
        //comparison();
        //driver.close();

    }

}
