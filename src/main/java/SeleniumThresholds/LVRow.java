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
        return driver.findElement(By.id("lvfinding")).isSelected();
    }

    static boolean isLvCriticalFindingSelected() {
        return driver.findElement(By.id("lvCriticalFinding")).isSelected();
    }

    static void pressLvParameterCheckbox() {
        driver.findElement(By.id("lvParameter")).click();
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

    private static void pressLvFindingCheckbox() {
        driver.findElement(By.id("lvfinding")).click();
    }

    public static void activateLvFinding(int lvFindingValue) {
        if (!isLvFindingSelected()) {
            pressLvFindingCheckbox();
            driver.findElement(By.id("[object Object]-parameterB-params-valueA")).sendKeys(Integer.toString(lvFindingValue));
        }
    }

    public static void deactivateLvFinding() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("lvfinding")).isSelected();
        if (isChecked) {
            WebElement checked = driver.findElement(By.id("[object Object]-parameterB-params-valueA"));
            Actions a = new Actions(driver);
            a.moveToElement(checked).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
            Thread.sleep(2000);
            pressLvFindingCheckbox();
        }
    }

    public static void deactivateLvFindingWithValue() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("lvfinding")).isSelected();
        if (isChecked) {
            pressLvFindingCheckbox();
        }
    }

    private static void pressLvCriticalFindingCheckbox() {
        driver.findElement(By.id("lvCriticalFinding")).click();
    }

    public static void activateLvCritical(int lvCriticalFindingValue) {
        if (!isLvCriticalFindingSelected()) {
            pressLvCriticalFindingCheckbox();
            driver.findElement(By.id("[object Object]-parameterB-params-valueB")).sendKeys(Integer.toString(lvCriticalFindingValue));
        }
    }

    public static void deactivateLvCritical() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("lvCriticalFinding")).isSelected();
        if (isChecked) {
            WebElement checked = driver.findElement(By.id("[object Object]-parameterB-params-valueB"));
            Actions a = new Actions(driver);
            a.moveToElement(checked).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
            Thread.sleep(2000);
            pressLvCriticalFindingCheckbox();
        }
    }

    public static void deactivateLvCriticalWithValue() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("lvCriticalFinding")).isSelected();
        if (isChecked) {
            pressLvCriticalFindingCheckbox();
        }
    }


    public static void activateAllLv(int lvFindingValue, int lvCriticalFindingValue) throws InterruptedException {
        activateLvParameter();
        Thread.sleep(2000);
        activateLvFinding(lvFindingValue);
        Thread.sleep(2000);
        activateLvCritical(lvCriticalFindingValue);
        Thread.sleep(2000);
    }

    public static void findingParamActivatedLv(int lvFindingValue, int lvCriticalFindingValue) throws InterruptedException {
        activateAllLv(lvFindingValue, lvCriticalFindingValue);
        Thread.sleep(2000);
        deactivateLvCriticalWithValue();
        Thread.sleep(2000);
    }

    public static void criticalParamActivatedLv(int lvFindingValue, int lvCriticalFindingValue) throws InterruptedException {
        activateAllLv(lvFindingValue, lvCriticalFindingValue);
        Thread.sleep(2000);
        deactivateLvFindingWithValue();
        Thread.sleep(2000);
    }

    public static void onlyFindingCriticalActivatedLv(int lvFindingValue, int lvCriticalFindingValue) throws InterruptedException {
        activateAllLv(lvFindingValue, lvCriticalFindingValue);
        Thread.sleep(2000);
        deactivateLvParameter();
        Thread.sleep(2000);
    }
    public static void onlyParamActivatedLv(int lvFindingValue, int lvCriticalFindingValue) throws InterruptedException {
        activateAllLv(lvFindingValue, lvCriticalFindingValue);
        Thread.sleep(2000);
        deactivateLvFindingWithValue();
        Thread.sleep(2000);
        deactivateLvCriticalWithValue();
        Thread.sleep(2000);
    }
    public static void onlyFindingActivatedLv(int lvFindingValue, int lvCriticalFindingValue) throws InterruptedException {
        activateAllLv(lvFindingValue, lvCriticalFindingValue);
        Thread.sleep(2000);
        deactivateLvCriticalWithValue();
        Thread.sleep(2000);
        deactivateLvParameter();
        Thread.sleep(2000);
    }

    public static void onlyCriticalActivatedLv(int lvFindingValue, int lvCriticalFindingValue) throws InterruptedException {
        activateAllLv(lvFindingValue, lvCriticalFindingValue);
        Thread.sleep(2000);
        deactivateLvFindingWithValue();
        Thread.sleep(2000);
        deactivateLvParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllLvWithValue(int lvFindingValue, int lvCriticalFindingValue) throws InterruptedException {
        activateAllLv(lvFindingValue, lvCriticalFindingValue);
        Thread.sleep(1000);
        deactivateLvFindingWithValue();
        Thread.sleep(1000);
        deactivateLvCriticalWithValue();
        Thread.sleep(1000);
        deactivateLvParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllLv() throws InterruptedException {
        activateAllLv(0,0);
        Thread.sleep(1000);
        deactivateLvFinding();
        Thread.sleep(1000);
        deactivateLvCritical();
        Thread.sleep(1000);
        deactivateLvParameter();
        Thread.sleep(2000);
    }


}
