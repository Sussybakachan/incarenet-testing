package TestCases;

import org.openqa.selenium.By;

import static selenium.ChromeWebDriver.driver;

public class AllTestCasesPutTogether {

    public AllTestCasesPutTogether() throws Exception {
        new AbbottTestCases();
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

