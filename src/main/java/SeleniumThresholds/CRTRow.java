package SeleniumThresholds;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static selenium.ChromeWebDriver.driver;

//activateAllCrt = activateCrtFindingANDActivateCrtCriticalFindingANDActivateCrtParameter
//findingParamActivatedCrt = activateCrtFindingANDDeactivateCrtCriticalFindingANDActivateCrtParameter
//criticalParamActivatedCrt = activateCrtCriticalFindingANDDeactivateCrtFindingANDActivateCrtParameter
//onlyParamActivatedCrt = activateCrtParameterANDDeactivateCrtFindingANDDeactivateCrtCriticalFinding
//onlyFindingCriticalActivatedCrt = deactivateCrtParameterANDActivateCrtFindingANDActivateCrtCriticalFinding
//onlyFindingActivatedCrt = activateCrtFindingANDDeactivateCrtParameterANDDeactivateCrtCriticalFinding
//onlyCriticalActivatedCrt = activateCrtCriticalFindingANDDeactivateCrtParameterANDDeactivateCrtFinding


public class CRTRow {
    //is selected
    static boolean isCrtParameterSelected() {
        return driver.findElement(By.id("crtParameter")).isSelected();

    }

    static boolean isCrtFindingSelected() {
        return driver.findElement(By.id("crtFinding")).isSelected();
    }

    static boolean isCrtCriticalFindingSelected() {
        return driver.findElement(By.id("crtCriticalFinding")).isSelected();
    }

    static void pressCrtParameterCheckbox() {
        driver.findElement(By.id("crtParameter")).click();
    }

    public static void activateCrtParameter() {
        if (!isCrtParameterSelected()) {
            pressCrtParameterCheckbox();
        }
    }

    public static void deactivateCrtParameter() {
        boolean isChecked = driver.findElement(By.id("crtParameter")).isSelected();
        if (isChecked) {
            driver.findElement(By.id("crtParameter")).click();
        }
    }

    private static void pressCrtFindingCheckbox() {
        driver.findElement(By.id("crtFinding")).click();
    }

    static void activateCrtFinding(int crtValue) {

        if (!isCrtFindingSelected()) {
            pressCrtFindingCheckbox();
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterA-params-valueA\"]")).sendKeys(Integer.toString(crtValue));
        }
    }

    public static void deactivateCrtFindingAndRemoveValue() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("crtFinding")).isSelected();
        if (isChecked) {
            WebElement checked = driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterA-params-valueA\"]"));
            Actions a = new Actions(driver);
            a.moveToElement(checked).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
            Thread.sleep(2000);
            pressCrtFindingCheckbox();

        }

    }

    public static void deactivateCrtFindingWithValue() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("crtFinding")).isSelected();
        if (isChecked) {
            pressCrtFindingCheckbox();
        }
    }

    private static void pressCrtCriticalFindingCheckbox() {
        driver.findElement(By.id("crtCriticalFinding")).click();
    }

    public static void activateCrtCritical(int crtCriticalValue) {
        if (!isCrtCriticalFindingSelected()) {
            pressCrtCriticalFindingCheckbox();
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterA-params-valueB\"]")).sendKeys(Integer.toString(crtCriticalValue));
        }
    }

    public static void deactivateCrtCriticalAndRemoveValue() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("crtCriticalFinding")).isSelected();
        if (isChecked) {
            WebElement checked = driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterA-params-valueB\"]"));
            Actions a = new Actions(driver);
            a.moveToElement(checked).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
            Thread.sleep(2000);
            pressCrtCriticalFindingCheckbox();

        }

    }

    public static void deactivateCrtCriticalWithValue() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("crtCriticalFinding")).isSelected();
        if (isChecked) {
            pressCrtCriticalFindingCheckbox();
        }

    }

    public static void activateAllCrt(int crtValue, int crtCriticalValue) throws InterruptedException {
        Thread.sleep(1000);
        activateCrtParameter();
        Thread.sleep(1000);
        activateCrtFinding(crtValue);
        Thread.sleep(1000);
        activateCrtCritical(crtCriticalValue);
        Thread.sleep(1000);

    }


    public static void findingParamActivatedCrt(int crtValue, int crtCriticalValue) throws InterruptedException {
        activateAllCrt(crtValue,crtCriticalValue);
        Thread.sleep(1000);
        deactivateCrtCriticalWithValue();
        Thread.sleep(2000);
    }

    public static void criticalParamActivatedCrt(int crtValue, int crtCriticalValue) throws InterruptedException {
        activateAllCrt(crtValue,crtCriticalValue);
        Thread.sleep(1000);
        deactivateCrtFindingWithValue();
        Thread.sleep(2000);
    }

    public static void onlyFindingCriticalActivatedCrt(int crtValue, int crtCriticalValue) throws InterruptedException {
        activateAllCrt(crtValue,crtCriticalValue);
        Thread.sleep(1000);
        deactivateCrtParameter();
        Thread.sleep(2000);
    }

    public static void onlyParamActivatedCrt(int crtValue, int crtCriticalValue) throws InterruptedException {
        activateAllCrt(crtValue,crtCriticalValue);
        Thread.sleep(1000);
        deactivateCrtFindingWithValue();
        Thread.sleep(1000);
        deactivateCrtCriticalWithValue();
        Thread.sleep(2000);
    }
    public static void onlyFindingActivatedCrt(int crtValue, int crtCriticalValue) throws InterruptedException {
        activateAllCrt(crtValue,crtCriticalValue);
        Thread.sleep(1000);
        deactivateCrtCriticalWithValue();
        Thread.sleep(1000);
        deactivateCrtParameter();
        Thread.sleep(2000);

    }

    public static void onlyCriticalActivatedCrt(int crtValue, int crtCriticalValue) throws InterruptedException {
        activateAllCrt(crtValue,crtCriticalValue);
        Thread.sleep(1000);
        deactivateCrtFindingWithValue();
        Thread.sleep(1000);
        deactivateCrtParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllCrtWithValue(int crtValue, int crtCriticalValue) throws InterruptedException {
        activateAllCrt(crtValue, crtCriticalValue);
        Thread.sleep(1000);
        deactivateCrtFindingWithValue();
        Thread.sleep(1000);
        deactivateCrtCriticalWithValue();
        Thread.sleep(1000);
        deactivateCrtParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllCrt() throws InterruptedException {
        activateAllCrt(0, 0);
        Thread.sleep(1000);
        deactivateCrtFindingAndRemoveValue();
        Thread.sleep(1000);
        deactivateCrtCriticalAndRemoveValue();
        Thread.sleep(1000);
        deactivateCrtParameter();
        Thread.sleep(1000);
    }

}
