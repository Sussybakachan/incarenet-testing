package patientHistoryTest;

import dsutilities.LoggerLoader;
import org.openqa.selenium.By;


import static patientHistoryTest.ReadHistoryTable.readHistoryTable;
import static patientHistoryTest.ReadTable.readTable;
import static patientHistoryTest.compareTaskHistory.compareTaskHistory;
import static selenium.ChromeWebDriver.driver;

public class PatientHistoryTest {




    public static void patientHistory() {

        try {
        //visit Tasks Tab
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]")).click();
        Thread.sleep(5000);
        readTable();
        Thread.sleep(2000);
        //visit History Tab
        driver.findElement(By.xpath("//div[2]/div[1]/div[4]")).click();
        Thread.sleep(2000);
        readHistoryTable();
        Thread.sleep(2000);
        compareTaskHistory();
        Thread.sleep(2000);
        }
        catch (Exception e){
            LoggerLoader.info("the test didn't pass, means that the date, time and description in the patient History doesn't match with the task");
        }

    }



}