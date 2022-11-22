package SeleniumThresholds;


import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;


//activateAll = activateEriEosANDActivateBatteryStatus
//onlyBatteryStatus = activateBatteryStatusANDDeactivateEriEos
//onlyEriEosActivated = activateEriEosANDDeactivateBatteryStatus
//deactivateAllBattery = deactivateEriEosANDDeactivateBatteryStatus


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

    public static void pressEriEosCheckbox() {
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

    public static void activateEriEos() {
        if (!isEriEosSelected()) {
            pressEriEosCheckbox();
        }
    }

    public static void deactivateEriEos() {
        boolean isChecked = driver.findElement(By.id("batteryStatusCriticalFinding")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("batteryStatusCriticalFinding")).click();

        }

    }

    public static void onlyBatteryStatusActivated() throws InterruptedException {
        activateBatteryStatus();
        Thread.sleep(2000);
    }

    public static void activateAll() throws InterruptedException {
        onlyBatteryStatusActivated();
        Thread.sleep(1000);
        activateEriEos();
        Thread.sleep(2000);

    }

    public static void onlyEriEosActivated() throws InterruptedException {
        activateAll();
        Thread.sleep(1000);
        deactivateBatteryStatus();
        Thread.sleep(2000);
    }

    public static void deselectAllBattery() throws InterruptedException {
        activateAll();
        Thread.sleep(1000);
        deactivateEriEos();
        Thread.sleep(1000);
        deactivateBatteryStatus();
        Thread.sleep(2000);
    }

    //TODO write a method that deactivates every checkbox
    // TODO möglicherweise screenshots erstellen die Selenium gemacht hat und vergeleichen mit expected Screenshots

}
