package selenium;

import TestCases.*;
import dsutilities.LoggerLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.swing.*;

import java.net.URL;

import static selenium.ChromeWebDriver.driver;
import static selenium.CompareTasksInCardio.*;
import static selenium.CreationOfAllExpectedTasks.createAllExpectedTasks;


public class StartTesting {


    public static void main(String[] args) throws Exception {
        //  System.out.println(PatternTest.useRegex("2022-12-26T12:34:14.265Z"));
        //  System.out.println(PatternTest.useRegex("2022-12-26T12:34:14.265Z"));
        LoggerLoader.info("Automation test started");
        InsuiteServerConfig insuiteServerConfig = new InsuiteServerConfig();
        ReadingConfig rc = null;
        rc = new ReadingConfig();
        ChromeWebDriver chromeWebDriver= new ChromeWebDriver();
        chromeWebDriver.initiateChromeWebDriver(rc);
        LoggerLoader.info("Weitergegangen");
        try{
            insuiteServerConfig.getInSuiteURL();
        } catch (Exception e){
            LoggerLoader.fatal(String.valueOf(e));
        }

        driver.manage().window().maximize();
        LoggerLoader.info("Window maximized");
        js = (JavascriptExecutor) driver;
        action = new Actions(driver);
        // PasteFile.pasteFile("C:\\Users\\dboiko\\IdeaProjects\\Selenium-Plugin2\\hl7\\Atriale Arrhythmielast über dem Grenzwert.hl7", "C:\\File-Forwarder-Armee\\ff2\\input\\Atriale Arrhythmielast über dem Grenzwert.hl7");

        //createTasks();
         createAllExpectedTasks();
        // System.out.println("expectedTask checkbox: " + expectedTask.getCheckBox() + expectedTask.getAction() + expectedTask.getTaskDescription() + expectedTask.getColor() + expectedTask.getEmployee() + expectedTask.getStartDate() + expectedTask.getReceiveDate() + expectedTask.getTargetDate() + expectedTask.getMeasurements() + expectedTask.getPdf() + expectedTask.getFurtherInformation());
           loginP();
           inCardioDash();

        AbbottTestCases abbottTestCases = new AbbottTestCases();
        //TODO method-> in utils.java
       // BiotronikTestCases biotronikTestCases = new BiotronikTestCases();
        //TODO method-> in utils.java
   // BostonTestCases bostonTestCases = new BostonTestCases();
        //TODO method-> in utils.java
       // MedtronicTestCases medtronicTestCases = new MedtronicTestCases();
        //TODO method-> in utils.java
        //MicroPortTestCases microPortTestCases = new MicroPortTestCases();
        // thresholdCheck();
        //comparison();
        LoggingDataModif loggingDataModif = new LoggingDataModif();
        LoggerLoader.info("Automation test finished");
        LoggerLoader.info("Following Testcase(s) were successful: \n " + successfulTestCases);
        LoggerLoader.info("Following Testcase(s) failed:\n" + loggingDataModif.editFailedTaskLogging());
        driver.close();

    }



}
