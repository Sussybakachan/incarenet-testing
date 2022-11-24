package selenium;

//TODO typo in "Expected"-> "Experted"

import TestCases.AbbottTestCases;
import dsutilities.LoggerLoader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

import static selenium.CompareTasksInCardio.*;
import static selenium.CreationOfAllExpectedTasks.createAllExpectedTasks;


public class StartTesting {

    public static void main(String[] args) throws Exception {
        //  System.out.println(PatternTest.useRegex("2022-12-26T12:34:14.265Z"));
        //  System.out.println(PatternTest.useRegex("2022-12-26T12:34:14.265Z"));
        LoggerLoader.info("Automation test started");
        ReadingConfig rc = new ReadingConfig();
        System.setProperty("webdriver.chrome.driver", rc.loadProperty().getProperty("SELENIUM_WEBDRIVER_PATH"));
        driver = new ChromeDriver();
        driver.get(rc.loadProperty().getProperty("SERVER_URL"));
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;
        action = new Actions(driver);
        // PasteFile.pasteFile("C:\\Users\\dboiko\\IdeaProjects\\Selenium-Plugin2\\hl7\\Atriale Arrhythmielast über dem Grenzwert.hl7", "C:\\File-Forwarder-Armee\\ff2\\input\\Atriale Arrhythmielast über dem Grenzwert.hl7");

        //createTasks();
        createAllExpectedTasks();
        // System.out.println("expectedTask checkbox: " + expectedTask.getCheckBox() + expectedTask.getAction() + expectedTask.getTaskDescription() + expectedTask.getColor() + expectedTask.getEmployee() + expectedTask.getStartDate() + expectedTask.getReceiveDate() + expectedTask.getTargetDate() + expectedTask.getMeasurements() + expectedTask.getPdf() + expectedTask.getFurtherInformation());
        loginP();
        inCardioDash();
        AbbottTestCases abbottTestCases = new AbbottTestCases();
        // thresholdCheck();
        //comparison();
        List<String> failedTasksString;
        failedTasksString = new ArrayList<>();
        String fails;
        for (FailedTasks i : listOfFailedTasksAndReason) {
            fails = i.getManufacturerTestCase() + ": \n" + i.getReasonForFailure();
            failedTasksString.add(fails);
        }LoggerLoader.info("Automation test finished");
        LoggerLoader.info("Following Testcase(s) were successful: \n " + successfulTestCases);
        LoggerLoader.error("Following Testcase failed because the Task could not be found:\n " + failedTasksString);

    }
}
