package SeleniumThresholds;


import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.*;


public class BatteryStatusRow {

    static boolean isEriEosSelected() {
        boolean EriEosIsChecked = driver.findElement(By.id("batteryStatusCriticalFinding")).isSelected();
        return EriEosIsChecked;
    }

    static boolean isBatteryStatusSelected() {
        return driver.findElement(By.id("batteryStatusParameter")).isSelected();
    }

    static void pressBatterieStatusCheckbox() {
        driver.findElement(By.id("batteryStatusParameter")).click();
    }

    static void pressEriEosCCheckbox() {
        driver.findElement(By.id("batteryStatusCriticalFinding")).click();
    }


    public static void activateBatteryStatus() {
        if (!isBatteryStatusSelected()) {
            pressBatterieStatusCheckbox();
        }
    }

    public static void deactivateBatteryStatus() {
        boolean isChecked = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[1]/span/span[1]/input")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.xpath("//input[@value='']")).click();

        }

    }

    public static void activatedEriEosANDActivatedBatteryStatus() throws InterruptedException {
        if (!isBatteryStatusSelected()) {
            System.out.println("Batteriestatus: "+ !isBatteryStatusSelected());
            activateBatteryStatus();
            Thread.sleep(2000);
            if (!isEriEosSelected()) {
                System.out.println("eri and eos: "+ isEriEosSelected());
                Thread.sleep(2000);
                pressEriEosCCheckbox();
            }
        } else if (!isEriEosSelected()) {
            System.out.println("eri and eos: "+ isEriEosSelected());
            pressEriEosCCheckbox();
        }
    }

    public static void activatedEriEosANDDeactivatedBatteryStatus() throws InterruptedException {
        if (!isBatteryStatusSelected()) {
            System.out.println("Batteriestatus: "+ !isBatteryStatusSelected());
            activateBatteryStatus();
            Thread.sleep(2000);
            if (!isEriEosSelected()) {
                System.out.println("eri and eos: "+ isEriEosSelected());
                Thread.sleep(2000);
                pressEriEosCCheckbox();
                Thread.sleep(2000);
                deactivateBatteryStatus();
            }
        } else if (!isEriEosSelected()) {
            System.out.println("eri and eos: "+ isEriEosSelected());
            pressEriEosCCheckbox();
        }
    }

    public static void deactivateERIEOS() {
        if (!isBatteryStatusSelected()) {
            activateBatteryStatus();
            if (isEriEosSelected()) {
                pressEriEosCCheckbox();
            }
        } else if (isEriEosSelected()) {
            pressEriEosCCheckbox();
        }
    }

    //TODO write a method that deactivates every checkbox
    // TODO möglicherweise screenshots erstellen die Selenium gemacht hat und vergeleichen mit expected Screenshots

}
