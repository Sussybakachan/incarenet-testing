package SeleniumThresholds;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static selenium.CompareTasksInCardio.driver;

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

    static void pressCrtFindingCheckboxAndAddValue(int crtValue) {
        pressCrtFindingCheckbox();
        if (isCrtFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterA-params-valueA\"]")).sendKeys(Integer.toString(crtValue));
        }
    }

    private static void pressCrtFindingCheckbox() {
        driver.findElement(By.id("crtFinding")).click();
    }

    static void pressCrtCriticalFindingCheckboxAndAddValue(int crtCriticalValue) {
        pressCrtCriticalFindingCheckbox();
        if (isCrtCriticalFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterA-params-valueB\"]")).sendKeys(Integer.toString(crtCriticalValue));
        }
    }

    private static void pressCrtCriticalFindingCheckbox() {
        driver.findElement(By.id("crtCriticalFinding")).click();
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

    public static void activateCrtFinding(int crtValue) {
        if (!isCrtFindingSelected()) {
            pressCrtFindingCheckboxAndAddValue(crtValue);
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

    public static void activateCrtCritical(int crtCriticalValue) {
        if (!isCrtCriticalFindingSelected()) {
            pressCrtCriticalFindingCheckboxAndAddValue(crtCriticalValue);
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
        pressCrtParameterCheckbox();
        Thread.sleep(1000);
        pressCrtFindingCheckboxAndAddValue(crtValue);
        Thread.sleep(1000);
        pressCrtCriticalFindingCheckboxAndAddValue(crtCriticalValue);
        Thread.sleep(1000);

    }




    public static void findingParamActivatedCrt(int crtValue, int crtCriticalValue) throws InterruptedException {
        activateAllCrt(crtValue,crtCriticalValue);
        Thread.sleep(1000);
        pressCrtCriticalFindingCheckbox();
        Thread.sleep(2000);
    }


    public static void onlyFindingCriticalActivatedCrt(int crtValue, int crtCriticalValue) throws InterruptedException {
        activateAllCrt(crtValue,crtCriticalValue);
        Thread.sleep(1000);
        pressCrtParameterCheckbox();
        Thread.sleep(2000);
    }
    public static void criticalParamActivatedCrt(int crtValue, int crtCriticalValue) throws InterruptedException {
        activateAllCrt(crtValue,crtCriticalValue);
        Thread.sleep(1000);
        pressCrtFindingCheckbox();
        Thread.sleep(2000);
    }
    public static void onlyParamActivatedCrt(int crtValue, int crtCriticalValue) throws InterruptedException {
        activateAllCrt(crtValue,crtCriticalValue);
        Thread.sleep(1000);
        pressCrtFindingCheckbox();
        Thread.sleep(1000);
        pressCrtCriticalFindingCheckbox();
        Thread.sleep(2000);
    }
    public static void onlyFindingActivatedCrt(int crtValue, int crtCriticalValue) throws InterruptedException {
        activateAllCrt(crtValue,crtCriticalValue);
        Thread.sleep(1000);
        pressCrtCriticalFindingCheckbox();
        Thread.sleep(1000);
        pressCrtParameterCheckbox();
        Thread.sleep(2000);

    }

    public static void onlyCriticalActivatedCrt(int crtValue, int crtCriticalValue) throws InterruptedException {
        activateAllCrt(crtValue,crtCriticalValue);
        Thread.sleep(1000);
        pressCrtFindingCheckbox();
        Thread.sleep(1000);
        pressCrtParameterCheckbox();
        Thread.sleep(2000);
    }

    public static void deselectAllCrtWithValue() throws InterruptedException {
        deactivateCrtFindingWithValue();
        Thread.sleep(1000);
        deactivateCrtCriticalWithValue();
        Thread.sleep(1000);
        deactivateCrtParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllCrt() throws InterruptedException {
        deactivateCrtFindingAndRemoveValue();
        Thread.sleep(1000);
        deactivateCrtCriticalAndRemoveValue();
        Thread.sleep(1000);
        deactivateCrtParameter();
        Thread.sleep(1000);
    }

}
