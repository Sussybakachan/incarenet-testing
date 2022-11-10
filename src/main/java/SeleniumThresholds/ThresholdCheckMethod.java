package SeleniumThresholds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import SeleniumThresholds.CRTRow.*;

import java.util.List;

import static SeleniumThresholds.CRTRow.findingParamActivated;
import static SeleniumThresholds.CRTRow.pressCrtFindingCheckboxAndAddValue;
import static selenium.CompareTasksInCardio.driver;

public class ThresholdCheckMethod {
    public static void thresholdCheck() throws InterruptedException {
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
        findingParamActivated(80);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/div/div[2]/div/button")).click();        //saveAndBack
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[2]/div[2]/form/div[2]/div/button")).click();      //save
        Thread.sleep(2000);

        System.out.println("Threshold Value modified");
        }
    }

