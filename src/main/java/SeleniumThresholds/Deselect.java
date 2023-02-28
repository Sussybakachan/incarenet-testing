package SeleniumThresholds;

import dsutilities.LoggerLoader;
import org.openqa.selenium.By;
import selenium.LoggingDataModif;


import static SeleniumThresholds.BatteryStatusRow.*;
import static SeleniumThresholds.CRTRow.*;
import static SeleniumThresholds.LVRow.*;
import static SeleniumThresholds.NoMeasurementsRow.*;
import static SeleniumThresholds.TelemABBRepRow.*;
import static SeleniumThresholds.TelemBIORepRow.*;
import static SeleniumThresholds.TelemBSXRepRow.*;
import static SeleniumThresholds.TelemMDTRepRow.*;
import static SeleniumThresholds.TelemMicroportRepRow.*;
import static selenium.CompareTasksInCardio.driver;
import static selenium.CompareTasksInCardio.successfulTestCases;


public class Deselect {
    //is selected

    public static void deselectAll() throws InterruptedException {
        try {


        Thread.sleep(6000);
        //driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[6]")).click();
        driver.findElement(By.id("thresholdValue")).click();    //new develop branch ehealth
        Thread.sleep(3000);
        //driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/table/tbody/tr[9]/td[4]/div/button")).click();
        driver.findElement(By.id("showImplantTemplate")).click();    //new develop branch ehealth
        Thread.sleep(2000);

        deselectAllBattery();
        deselectAllCrt();
        deselectAllLv();
        deselectAllBio();
        deselectAllBsx();
        deselectAllMdt();
        deselectAllAbb();
        deselectAllMicroport();
        deselectAllNM();

        Thread.sleep(2000);
        driver.findElement(By.id("saveAndBack")).click();        //saveAndBack
        Thread.sleep(2000);
        driver.findElement(By.id("save")).click();      //save
        Thread.sleep(2000);

        System.out.println("Threshold reset");
    } catch (Exception e){
            LoggingDataModif loggingDataModif = new LoggingDataModif();
            LoggerLoader.fatal("Some Error occurred while trying to deselect the thresholds: "+ e );
            LoggerLoader.info("Following Testcase(s) were successful: \n " + successfulTestCases);
            LoggerLoader.info("Following Testcase(s) failed:\n" + loggingDataModif.editFailedTaskLogging());
        }
    }


}
