package SeleniumThresholds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import SeleniumThresholds.CRTRow.*;

import java.util.List;

import static SeleniumThresholds.BatteryStatusRow.*;
import static SeleniumThresholds.CRTRow.*;
import static SeleniumThresholds.LVRow.*;
import static SeleniumThresholds.NoMeasurementsRow.onlyFindingCriticalActivatedNM;
import static SeleniumThresholds.TelemABBRepRow.*;
import static SeleniumThresholds.TelemABBRepRow.*;
import static selenium.CompareTasksInCardio.driver;

public class ThresholdCheckMethod {
    public static void thresholdCheck(String manufacturer, int testCase) throws InterruptedException {
        Thread.sleep(5000);
        //TODO I changed the path to the Schwellenwerte because he didn't find it with the other xpath
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[6]")).click();     //Schwellenwerte
        Thread.sleep(2000);
        //create a template if patient doesnt have one
        List<WebElement> bearbeitenButtonAnzahl = driver.findElements(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/form/div[1]/div/div/span"));
        if(bearbeitenButtonAnzahl.size() > 0){
            driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/button/span[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/table/tbody/tr[9]/td[1]/span/span[1]/input")).click();
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/table/tbody/tr[9]/td[4]/div/button")).click();       //showImplantTemplate
        Thread.sleep(2000);
        if (manufacturer.equals("Abbott")){
            switch (testCase){
                case 1: findingParamActivatedAbb();
                break;
                case 2: onlyParamActivatedAbb();
                break;
                case 3: findingParamActivated(96, 85);
                        Thread.sleep(2000);
                        findingParamActivatedAbb();
                break;
                case 4: onlyEriEosActivated();
                        onlyFindingCriticalActivated(97, 85);
                        onlyFindingCriticalActivatedLv(97, 85);
                        onlyFindingCriticalActivatedNM(1,2);
                case 5: onlyBatteryStatusActivated();
                    onlyParamActivated(97,85); //CRT
                    onlyParamActivatedLv(97,85);
                    onlyFindingCriticalActivatedNM(1,2);
                    break;
                case 6: BatteryStatusRow.activateAll();
                    CRTRow.activateAll(97,85);
                    activateAllLv(97,85);
                    onlyFindingCriticalActivatedNM(1,2);
                    break;
                case 7: BatteryStatusRow.activateAll();
                    onlyCriticalParamActivated(97,85); //CRT
                    criticalParamActivatedLv(97,85);
                    onlyFindingCriticalActivatedNM(1,2);
                    break;
                case 8: BatteryStatusRow.activateAll();
                    findingParamActivated(97,85);
                    findingParamActivatedLv(97, 85);
                    onlyFindingCriticalActivatedNM(1,2);
                    break;
                case 9:
                    //TODO CRT and LV are completely off, but still need to have 97 and 85 as values
                    criticalParamActivatedAbb();
                    onlyFindingCriticalActivatedNM(1,2);
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

