package SeleniumThresholds;


import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.*;


public class BatteryStatusRow {

    public static boolean isEriEosSelected() {
        boolean EriEosIsChecked = driver.findElement(By.id("batteryStatusCriticalFinding")).isSelected();
        System.out.println("is checked");
        return EriEosIsChecked;
    }

    public static boolean isBatteryStatusSelected() {
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
        boolean isChecked = driver.findElement(By.id("batteryStatusParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("batteryStatusParameter")).click();

        }

    }

    public static void activateEriEosANDActivateBatteryStatus() throws InterruptedException {
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

    public static void activateEriEosANDDeactivateBatteryStatus() throws InterruptedException {
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

    public static void deactivateAllBattery() throws InterruptedException {
        deactivateERIEOS();
        deactivateBatteryStatus();
    }

    //TODO write a method that deactivates every checkbox
    // TODO möglicherweise screenshots erstellen die Selenium gemacht hat und vergeleichen mit expected Screenshots

}
