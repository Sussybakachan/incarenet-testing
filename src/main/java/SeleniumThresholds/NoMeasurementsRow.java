package SeleniumThresholds;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static selenium.CompareTasksInCardio.driver;

//NM = NoMeasurements
//activateAllNM = activateNMFindingANDActivateNMCriticalFindingANDActivateNMParameter
//findingParamActivatedNM = activateNMFindingANDDeactivateNMCriticalFindingANDActivateNMParameter
//criticalParamActivatedNM = activateNMCriticalFindingANDDeactivateNMFindingANDActivateNMParameter
//onlyParamActivatedNM = activateNMParameterANDDeactivateNMFindingANDDeactivateNMCriticalFinding
//onlyFindingCriticalActivatedNM = deactivateNMParameterANDActivatedNMFindingANDActivateNMCriticalFinding
//onlyFindingActivatedNM = activatedNMFindingANDDeactivateNMParameterANDDeactivateNMCriticalFinding
//onlyCriticalActivatedNM = activateNMCriticalFindingANDDeactivateNMParameterANDDeactivatedNMFinding

public class NoMeasurementsRow {
    //is selected
    static boolean isNoMeasurementsParameterSelected() {
        return driver.findElement(By.id("noMeasurementsParameter")).isSelected();
    }

    static boolean isNoMeasurementsFindingSelected() {
        return driver.findElement(By.id("[object Object]-noMeasurementReceived-params-min")).isSelected();
    }

    static void pressNoMeasurementsParameterCheckbox() {
        driver.findElement(By.id("noMeasurementsParameter")).click();
    }

    public static void activatedNoMeasurementsParameter() {
        if (!isNoMeasurementsParameterSelected()) {
            pressNoMeasurementsParameterCheckbox();
        }
    }

    public static void deactivateNoMeasurementsParameter() {
        boolean isChecked = driver.findElement(By.id("noMeasurementsParameter")).isSelected();
        if (isChecked) {
            driver.findElement(By.id("noMeasurementsParameter")).click();
        }
    }

    private static void pressNoMeasurementsFindingCheckbox() {
        driver.findElement(By.id("[object Object]-noMeasurementReceived-params-min")).click();
    }

    public static void activatedNoMeasurementsFinding(int daysFinding) {
        if (!isNoMeasurementsFindingSelected()) {
            pressNoMeasurementsFindingCheckbox();
            driver.findElement(By.id("[object Object]-noMeasurementReceived-params-min")).sendKeys(Integer.toString(daysFinding));
        }
    }

    public static void deactivateNoMeasurementsFinding() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("[object Object]-noMeasurementReceived-params-min")).isSelected();
        if (isChecked) {
            WebElement checked = driver.findElement(By.id("[object Object]-noMeasurementReceived-params-min"));
            Actions a = new Actions(driver);
            a.moveToElement(checked).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
            Thread.sleep(2000);
            pressNoMeasurementsFindingCheckbox();
        }
    }

    public static void deactivateNoMeasurementsFindingWithValue() {
        boolean isChecked = driver.findElement(By.id("[object Object]-noMeasurementReceived-params-min")).isSelected();
        if (isChecked) {
            pressNoMeasurementsFindingCheckbox();
        }
    }

    public static void activateAllNM(int daysFinding) throws InterruptedException {
        activatedNoMeasurementsParameter();
        Thread.sleep(1000);
        activatedNoMeasurementsFinding(daysFinding);
        Thread.sleep(2000);
    }

    public static void onlyParamActivatedNM(int daysFinding) throws InterruptedException {
        activateAllNM(daysFinding);
        Thread.sleep(1000);
        deactivateNoMeasurementsFindingWithValue();
        Thread.sleep(2000);
    }

    public static void onlyFindingActivatedNM(int daysFinding) throws InterruptedException {
        activateAllNM(daysFinding);
        Thread.sleep(2000);
        deactivateNoMeasurementsParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllNMWithValue(int daysFinding) throws InterruptedException {
        activateAllNM(daysFinding);
        Thread.sleep(1000);
        deactivateNoMeasurementsFindingWithValue();
        Thread.sleep(1000);
        deactivateNoMeasurementsParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllNM() throws InterruptedException {
        activateAllNM(0);
        Thread.sleep(1000);
        deactivateNoMeasurementsFinding();
        Thread.sleep(1000);
        deactivateNoMeasurementsParameter();
        Thread.sleep(2000);
    }

}
