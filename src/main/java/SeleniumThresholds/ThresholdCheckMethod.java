package SeleniumThresholds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import SeleniumThresholds.CRTRow.*;

import java.util.List;

import static SeleniumThresholds.BatteryStatusRow.*;
import static SeleniumThresholds.CRTRow.*;
import static SeleniumThresholds.LVRow.*;
import static SeleniumThresholds.NoMeasurementsRow.*;
import static SeleniumThresholds.TelemABBRepRow.*;
import static SeleniumThresholds.TelemABBRepRow.*;
import static SeleniumThresholds.TelemBIORepRow.*;
import static SeleniumThresholds.TelemBSXRepRow.*;
import static SeleniumThresholds.TelemMDTRepRow.*;
import static SeleniumThresholds.TelemMicroportRepRow.*;
import static selenium.CompareTasksInCardio.driver;

public class ThresholdCheckMethod {
    public static void thresholdCheck(String manufacturer, int testCase) throws InterruptedException {
        Thread.sleep(9000);
        //TODO I changed the path to the Schwellenwerte because he didn't find it with the other xpath
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[6]")).click();     //Schwellenwerte
        Thread.sleep(2000);
        //create a template if patient doesn't have one
        List<WebElement> bearbeitenButtonAnzahl = driver.findElements(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/form/div[1]/div/div/span"));
        if (bearbeitenButtonAnzahl.size() > 0) {
            driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/button/span[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/table/tbody/tr[9]/td[1]/span/span[1]/input")).click();
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/table/tbody/tr[9]/td[4]/div/button")).click();       //showImplantTemplate
        Thread.sleep(2000);
        if (manufacturer.equals("Abbott")) {
            switch (testCase) {
                case 1:
                    findingParamActivatedAbb();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 2:
                    onlyParamActivatedAbb();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 3:
                    findingParamActivatedCrt(96, 85);
                    findingParamActivatedAbb();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 4:
                    onlyEriEosActivated();
                    onlyFindingCriticalActivatedCrt(97, 85);
                    onlyFindingCriticalActivatedLv(97, 85);
                    onlyFindingCriticalActivatedNM(3, 7);
                case 5:
                    onlyBatteryStatusActivated();
                    onlyParamActivatedCrt(97, 85); //CRT
                    onlyParamActivatedLv(97, 85);
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 6:
                    activateAll();
                    activateAllCrt(97, 85);
                    activateAllLv(97, 85);
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 7:
                    activateAll();
                    criticalParamActivatedCrt(97, 85); //CRT
                    criticalParamActivatedLv(97, 85);
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 8:
                    findingParamActivatedCrt(97, 85);
                    findingParamActivatedLv(97, 85);
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 9:
                    //TODO CRT and LV are completely off, but still need to have 97 and 85 as values
                    criticalParamActivatedAbb();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
            }
        } else if (manufacturer.equals("Biotronik")) {
            switch (testCase) {
                case 1:
                    findingParamActivatedCrt(99, 95);
                    findingParamActivatedLv(99, 95);
                    findingParamActivatedBio();
                    onlyFindingActivatedNM(1, 7);
                    break;
                case 2:
                    activateAll();
                    criticalParamActivatedCrt(99, 95);
                    criticalParamActivatedLv(99, 95);
                    criticalParamActivatedBio();
                    onlyFindingActivatedNM(1, 7);
                    break;
                case 3:
                    onlyEriEosActivated();
                    onlyFindingCriticalActivatedCrt(99, 95);
                    findingParamActivatedLv(99, 95);
                    onlyParamActivatedBio();
                    onlyFindingActivatedNM(1, 7);
                    break;
                case 4:
                    onlyEriEosActivated();
                    onlyFindingCriticalActivatedCrt(99, 95);
                    onlyFindingCriticalActivatedLv(99, 95);
                    onlyParamActivatedBio();
                    onlyFindingActivatedNM(1, 7);
                case 5:
                    onlyEriEosActivated();
                    onlyFindingCriticalActivatedCrt(99, 95); //CRT
                    onlyFindingCriticalActivatedCrt(99, 95);
                    onlyFindingActivatedNM(1, 7);
                    break;
                case 6:
                    onlyBatteryStatusActivated();
                    onlyParamActivatedCrt(99, 95);
                    onlyParamActivatedLv(99, 95);
                    onlyFindingActivatedNM(1, 7);
                    break;
                case 7:
                    activateAll();
                    activateAllCrt(99, 95); //CRT
                    activateAllLv(99, 95);
                    onlyFindingActivatedNM(1, 7);
                    break;
                case 8:
                    onlyFindingCriticalActivatedCrt(99, 95);
                    deselectAllCrt();
                    onlyFindingCriticalActivatedLv(99, 95);
                    deselectAllLv();
                    onlyFindingActivatedNM(1, 7);
                    break;
            }

        } else if (manufacturer.equals("Boston")) {
            switch (testCase) {
                case 1:
                    activateAllCrt(86, 80);
                    deselectAllCrt();
                    onlyFindingCriticalActivatedLv(85, 80);
                    deselectAllLv();
                    onlyParamActivatedBsx();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 2:
                    onlyBatteryStatusActivated();
                    activateAllCrt(86, 80);
                    deselectAllCrt();
                    onlyParamActivatedLv(86, 80);
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 3:
                    activateAll();
                    activateAllCrt(86, 80);
                    deselectAllCrt();
                    activateAllLv(86, 80);
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 4:
                    activateAll();
                    activateAllCrt(86, 80);
                    deselectAllCrt();
                    criticalParamActivatedLv(86, 80);
                    onlyFindingCriticalActivatedNM(3, 7);
                case 5:
                    activateAllCrt(98, 99);
                    activateAllCrt(86, 80); //CRT
                    deselectAllCrt();
                    findingParamActivatedLv(86, 80);
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 6:
                    activateAllCrt(86, 80);
                    deselectAllCrt();
                    activateAllLv(85, 80);
                    deselectAllLv();
                    criticalParamActivatedBsx();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 7:
                    activateAllCrt(86, 80); //CRT
                    deselectAllCrt();
                    activateAllLv(85, 80);
                    deselectAllLv();
                    findingParamActivatedBsx();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 8:
                    activateAll();
                    activateAllCrt(86, 80);
                    deselectAllCrt();
                    activateAllLv(86, 80);
                    onlyParamActivatedBsx();
                    onlyFindingCriticalActivatedNM(0, 0);
                    break;
            }

        } else if (manufacturer.equals("Medtronic")) {
            switch (testCase) {
                case 1:
                    activateAllCrt(98, 77);
                    deselectAllCrt();
                    onlyFindingCriticalActivatedLv(98, 77);
                    deselectAllLv();
                    findingParamActivatedMdt();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 2:
                    activateAllCrt(98, 77);
                    deselectAllCrt();
                    onlyFindingCriticalActivatedLv(98, 77);
                    deselectAllLv();
                    onlyParamActivatedMdt();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 3:
                    activateAllCrt(98, 77);
                    deselectAllCrt();
                    findingParamActivatedLv(98, 77);
                    findingParamActivatedMdt();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 4:
                    onlyEriEosActivated();
                    onlyFindingCriticalActivatedCrt(99, 77);
                    deselectAllCrt();
                    onlyFindingCriticalActivatedLv(99, 77);
                    onlyFindingCriticalActivatedNM(3, 7);
                case 5:
                    onlyBatteryStatusActivated();
                    onlyParamActivatedCrt(99, 77); //CRT
                    onlyParamActivatedLv(99, 77);
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 6:
                    activateAll();
                    activateAllCrt(99, 77);
                    activateAllLv(99, 77);
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 7:
                    activateAll(); //CRT
                    criticalParamActivatedCrt(99, 77);
                    criticalParamActivatedLv(99, 77);
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 8:
                    findingParamActivatedCrt(99, 76);
                    findingParamActivatedLv(99, 76);
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 9:
                    activateAllCrt(98, 77);
                    deselectAllCrt();
                    activateAllLv(98, 77);
                    deselectAllLv();
                    criticalParamActivatedMdt();
                    onlyFindingCriticalActivatedNM(3, 7);
            }

        } else if (manufacturer.equals("MicroPort")) {
            switch (testCase) {
                case 1:
                    activateAllCrt(98, 99);
                    deselectAllCrt();
                    onlyFindingCriticalActivatedLv(98, 99);
                    deselectAllLv();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 2:
                    activateAll();
                    activateAllCrt(98, 99);
                    deselectAllCrt();
                    activateAllLv(98, 99);
                    deselectAllLv();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 3:
                    activateAllCrt(98, 99);
                    deselectAllCrt();
                    activateAllLv(98, 99);
                    deselectAllLv();
                    criticalParamActivatedMicroport();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 4:
                    activateAllCrt(98, 99);
                    deselectAllCrt();
                    activateAllLv(98, 99);
                    deselectAllLv();
                    findingParamActivatedMicroport();
                    onlyFindingCriticalActivatedNM(3, 7);
                case 5:
                    activateAllCrt(98, 99);  //CRT
                    deselectAllCrt();
                    activateAllLv(98, 99);
                    onlyParamActivatedMicroport();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 6:
                    onlyBatteryStatusActivated();
                    activateAllCrt(98, 99);
                    deselectAllCrt();
                    activateAllLv(98, 99);
                    deselectAllLv();
                    onlyFindingCriticalActivatedNM(3, 7);
                    break;
                case 7:
                    activateAll(); //CRT
                    onlyParamActivatedMicroport();
                    break;

            }

        }

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/div/div[2]/div/button")).click();        //saveAndBack
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[2]/div[2]/form/div[2]/div/button")).click();      //save
        Thread.sleep(2000);

        System.out.println("Threshold Value modified");

    }
}

