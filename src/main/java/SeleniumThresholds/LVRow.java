package SeleniumThresholds;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static selenium.CompareTasksInCardio.driver;

//activateAllLv = activateLvFindingANDActivateLvCriticalFindingANDActivateLvParameter
//findingParamActivatedLv = activateLvFindingANDDeactivateLvCriticalFindingANDActivateLvParameter
//criticalParamActivatedLv = activateLvCriticalFindingANDDeactivateLvFindingANDActivateLvParameter
//onlyParamActivatedLv = activateLvParameterANDDeactivateLvFindingANDDeactivateLvCriticalFinding
//onlyFindingCriticalActivatedLv = deactivateLvParameterANDActivatedLvFindingANDActivateLvCriticalFinding
//onlyFindingActivatedLv = activatedLvFindingANDDeactivateLvParameterANDDeactivateLvCriticalFinding
//onlyCriticalActivatedLv = activateLvCriticalFindingANDDeactivateLvParameterANDDeactivatedLvFinding

public class LVRow {
    //is selected
    static boolean isLvParameterSelected() {
        return driver.findElement(By.id("lvParameter")).isSelected();

    }

    static boolean isLvFindingSelected() {
        return driver.findElement(By.id("lvFinding")).isSelected();
    }

    static boolean isLvCriticalFindingSelected() {
        return driver.findElement(By.id("lvCriticalFinding")).isSelected();
    }

    static void pressLvParameterCheckbox() {
        driver.findElement(By.id("lvParameter")).click();
    }

    static void pressLvFindingCheckbox() {
        driver.findElement(By.id("lvFinding")).click();
        if (isLvFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterB-params-valueA\"]")).sendKeys("97");
        }
    }

    static void pressLvCriticalFindingCheckbox() {
        driver.findElement(By.id("lvCriticalFinding")).click();
        if (isLvCriticalFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterB-params-valueB\"]")).sendKeys("90");
        }
    }

    public static void activateLvParameter() {
        if (!isLvParameterSelected()) {
            pressLvParameterCheckbox();
        }
    }

    public static void deactivateLvParameter() {
        boolean isChecked = driver.findElement(By.id("lvParameter")).isSelected();
        if (isChecked) {
            driver.findElement(By.id("lvParameter")).click();
        }
    }

    public static void activateLvFinding() {
        if (!isLvFindingSelected()) {
            pressLvFindingCheckbox();
        }
    }

    public static void deactivateLvFinding() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("lvFinding")).isSelected();
        if (isChecked) {
            WebElement checked = driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterB-params-valueA\"]"));
            Actions a = new Actions(driver);
            a.moveToElement(checked).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
            Thread.sleep(2000);
            driver.findElement(By.id("lvFinding")).click();
        }
    }

    public static void activateLvCritical() {
        if (!isLvCriticalFindingSelected()) {
            pressLvCriticalFindingCheckbox();
        }
    }

    public static void deactivateLvCritical() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("lvCriticalFinding")).isSelected();
        if (isChecked) {
            WebElement checked = driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterB-params-valueB\"]"));
            Actions a = new Actions(driver);
            a.moveToElement(checked).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
            Thread.sleep(2000);
            driver.findElement(By.id("lvCriticalFinding")).click();
        }
    }

    public static void onlyParamActivatedLv() throws InterruptedException {

        activateLvParameter();
        Thread.sleep(2000);
    }

    public static void findingParamActivatedLv() throws InterruptedException {

        onlyParamActivatedLv();
        Thread.sleep(2000);
        activateLvFinding();
        Thread.sleep(2000);

    }

    public static void criticalParamActivatedLv() throws InterruptedException {

        onlyParamActivatedLv();
        Thread.sleep(2000);
        activateLvCritical();
        Thread.sleep(2000);

    }

    public static void activateAllLv() throws InterruptedException {

        findingParamActivatedLv();
        Thread.sleep(2000);
        activateLvCritical();
        Thread.sleep(2000);
    }


    public static void onlyFindingCriticalActivatedLv() throws InterruptedException {
        activateAllLv();
        Thread.sleep(2000);
        deactivateLvParameter();
        Thread.sleep(2000);
    }

    public static void onlyFindingActivatedLv() throws InterruptedException {
        findingParamActivatedLv();
        Thread.sleep(2000);
        deactivateLvParameter();
        Thread.sleep(2000);
    }

    public static void onlyCriticalActivatedLv() throws InterruptedException {
        criticalParamActivatedLv();
        Thread.sleep(2000);
        deactivateLvParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllLv() throws InterruptedException {
        deactivateLvFinding();
        deactivateLvCritical();
        deactivateLvParameter();
    }


}
