package TestCases;

import helpers.fileForwarder.FileForwarderSender;
import helpers.interfaces.FileSender;
import org.openqa.selenium.By;

import static selenium.ChromeWebDriver.driver;

public class AllTestCasesPutTogether {
    String rootDir = System.getProperty("user.dir");
    FileForwarderSender.Options abbottOptions = new FileForwarderSender.Options(
            rootDir + "/input",
            100000, new String[]{"ignored", "skipped"},
            rootDir + "/resources/Selenium-IDCO-Files/Abbott/");
    FileSender fileSender = new FileForwarderSender(abbottOptions);
    AbbottTestCases.Options finalAbbottOptions = new AbbottTestCases.Options(fileSender);
    public AllTestCasesPutTogether() throws Exception {
        new AbbottTestCases(finalAbbottOptions);
        goToICDPatientList();
        new BostonTestCases();
        goToICDPatientList();
        new BiotronikTestCases();
        goToICDPatientList();
        new MedtronicTestCases();
        goToICDPatientList();
        new MicroPortTestCases();
    }
    void goToICDPatientList() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/header/div/div[2]/button[1]")).click();
        Thread.sleep(2000);
    }
}

