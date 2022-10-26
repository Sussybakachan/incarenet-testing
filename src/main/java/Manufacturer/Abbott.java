package Manufacturer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static selenium.CompareTasksInCardio.driver;


public class Abbott {

    public static boolean isEriEosSelected() {
        boolean EriEosIsChecked = driver.findElement(By.id("batteryStatusCriticalFinding")).isSelected();
        System.out.println("is checked");
        return EriEosIsChecked;
    }



    //TODO write a method that deactivates every checkbox
    // TODO möglicherweise screenshots erstellen die Selenium gemacht hat und vergeleichen mit expected Screenshots

  /*  static WebDriver driver;
    //activate only white Telemonitoring-Report
    //TODO
    public static void activateWhiteTelemonitoringReport(){
        String checked = driver.findElement(By.xpath(xpathTAble + i + "]/td[" + j + "]")).getAttribute("value");
    }
*/

}
