package SeleniumThresholds;

import org.openqa.selenium.By;


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


public class Deselect {
    //is selected

    public static void deselectAll() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/button[6]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/table/tbody/tr[9]/td[4]/div/button")).click();       //showImplantTemplate
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
        driver.findElement(By.xpath("save")).click();      //save
        Thread.sleep(2000);

        System.out.println("Threshold reset");
    }



}
