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

    static void pressLvFindingCheckboxAndAddValue(int lvFindingValue) {
        driver.findElement(By.id("lvFinding")).click();
        if (isLvFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterB-params-valueA\"]")).sendKeys(Integer.toString(lvFindingValue));
        }
    }

    static void pressLvCriticalFindingCheckbox(int lvCriticalFindingValue) {
        driver.findElement(By.id("lvCriticalFinding")).click();
        if (isLvCriticalFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterB-params-valueB\"]")).sendKeys(Integer.toString(lvCriticalFindingValue));
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

    public static void activateLvFinding(int lvFindingValue) {
        if (!isLvFindingSelected()) {
            pressLvFindingCheckboxAndAddValue(lvFindingValue);
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

    public static void activateLvCritical(int lvCriticalFindingValue) {
        if (!isLvCriticalFindingSelected()) {
            pressLvCriticalFindingCheckbox(lvCriticalFindingValue);
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

    public static void findingParamActivatedLv(int lvFindingValue) throws InterruptedException {

        onlyParamActivatedLv();
        Thread.sleep(2000);
        activateLvFinding(lvFindingValue);
        Thread.sleep(2000);

    } //TODO should lvFinding be activated?

    public static void criticalParamActivatedLv(int lvCriticalFindingValue) throws InterruptedException {

        onlyParamActivatedLv();
        Thread.sleep(2000);
        activateLvCritical(lvCriticalFindingValue);
        Thread.sleep(2000);

    }

    public static void activateAllLv(int lvFindingValue, int lvCriticalFindingValue) throws InterruptedException {

        findingParamActivatedLv(lvFindingValue);
        Thread.sleep(2000);
        activateLvCritical(lvCriticalFindingValue);
        Thread.sleep(2000);
    }


    public static void onlyFindingCriticalActivatedLv(int lvFindingValue, int lvCriticalFindingValue) throws InterruptedException {
        activateAllLv(lvFindingValue, lvCriticalFindingValue);
        Thread.sleep(2000);
        deactivateLvParameter();
        Thread.sleep(2000);
    }

    public static void onlyFindingActivatedLv(int lvFindingValue) throws InterruptedException {
        findingParamActivatedLv(lvFindingValue);
        Thread.sleep(2000);
        deactivateLvParameter();
        Thread.sleep(2000);
    }

    public static void onlyCriticalActivatedLv(int lvCriticalFindingValue) throws InterruptedException {
        criticalParamActivatedLv(lvCriticalFindingValue);
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
