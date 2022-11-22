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
        return driver.findElement(By.id("noMeasurementsFinding")).isSelected();
    }

    static boolean isNoMeasurementsCriticalFindingSelected() {
        return driver.findElement(By.id("noMeasurementsCriticalFinding")).isSelected();
    }

    static void pressNoMeasurementsParameterCheckbox() {
        driver.findElement(By.id("noMeasurementsParameter")).click();
    }

    static void pressNoMeasurementsFindingCheckboxAndAddValue(int daysFinding) {
        pressNoMeasurementsFindingCheckbox();
        if (isNoMeasurementsFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterB-params-valueB\"]")).sendKeys(Integer.toString(daysFinding));
    }
    }

    private static void pressNoMeasurementsFindingCheckbox() {
        driver.findElement(By.id("noMeasurementsFinding")).click();
    }

    static void pressNoMeasurementsCriticalFindingCheckboxAndAddValue(int daysCriticalFinding) {
        pressNoMeasurementsCriticalFindingCheckbox();
        if (isNoMeasurementsCriticalFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterB-params-valueB\"]")).sendKeys(Integer.toString(daysCriticalFinding));
    }
    }

    private static void pressNoMeasurementsCriticalFindingCheckbox() {
        driver.findElement(By.id("noMeasurementsCriticalFinding")).click();
    }
/*
    public static void activatedNoMeasurementsParameter() {
        if (!isNoMeasurementsParameterSelected()) {
            pressNoMeasurementsParameterCheckbox();
        }
    }
*/
    public static void deactivateNoMeasurementsParameter() {
        boolean isChecked = driver.findElement(By.id("noMeasurementsParameter")).isSelected();
        if (isChecked) {
            driver.findElement(By.id("noMeasurementsParameter")).click();

        }

    }
    /*
    public static void activatedNoMeasurementsFinding(int daysFinding) {
        if (!isNoMeasurementsFindingSelected()) {
            pressNoMeasurementsFindingCheckboxAndAddValue(daysFinding);
        }
    }
*/
    public static void deactivateNoMeasurementsFinding() {
        boolean isChecked = driver.findElement(By.id("noMeasurementsFinding")).isSelected();
        if (isChecked) {
            pressNoMeasurementsFindingCheckbox();

        }

    }
/*
    public static void activatedNoMeasurementsCritical(int daysCriticalFinding) {
        if (!isNoMeasurementsCriticalFindingSelected()) {
            pressNoMeasurementsCriticalFindingCheckboxAndAddValue(daysCriticalFinding);
        }
    }
*/
    public static void deactivateNoMeasurementsCritical() {
        boolean isChecked = driver.findElement(By.id("noMeasurementsCriticalFinding")).isSelected();
        if (isChecked) {
            pressNoMeasurementsCriticalFindingCheckbox();

        }

    }



    public static void activateAllNM(int daysFinding, int daysCriticalFinding) throws InterruptedException {
        pressNoMeasurementsParameterCheckbox();
        Thread.sleep(2000);
        pressNoMeasurementsFindingCheckboxAndAddValue(daysFinding);
        Thread.sleep(2000);
        pressNoMeasurementsCriticalFindingCheckboxAndAddValue(daysCriticalFinding);
        Thread.sleep(2000);
    }
    public static void deactivateNMParameter() {
        boolean isChecked = driver.findElement(By.id("noMeasurementsParameter")).isSelected();
        if (isChecked) {
            driver.findElement(By.id("noMeasurementsParameter")).click();
        }
    }

    public static void deactivateNMFinding() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("noMeasurementsFinding")).isSelected();
        if (isChecked) {
            WebElement checked = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/table/tbody/tr[9]/td[3]/div/div/div/input"));
            Actions a = new Actions(driver);
            a.moveToElement(checked).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
            Thread.sleep(2000);
            pressNoMeasurementsFindingCheckbox();
        }
    }
    public static void onlyParamActivatedNM(int daysFinding, int daysCriticalFinding) throws InterruptedException {
        activateAllNM(daysFinding, daysCriticalFinding);
        Thread.sleep(2000);
        pressNoMeasurementsFindingCheckbox();
        Thread.sleep(2000);
        pressNoMeasurementsCriticalFindingCheckbox();
    }

    public static void findingParamActivatedNM(int daysFinding, int daysCriticalFinding) throws InterruptedException {
        activateAllNM(daysFinding, daysCriticalFinding);
        Thread.sleep(2000);
        pressNoMeasurementsCriticalFindingCheckbox();
        Thread.sleep(2000);

    }

    public static void criticalParamActivatedNM(int daysFinding, int daysCriticalFinding) throws InterruptedException {

        activateAllNM(daysFinding, daysCriticalFinding);
        Thread.sleep(2000);
        pressNoMeasurementsFindingCheckbox();
        Thread.sleep(2000);

    }
    public static void onlyFindingCriticalActivatedNM(int daysFinding, int daysCriticalFinding) throws InterruptedException {
        activateAllNM(daysFinding, daysCriticalFinding);
        Thread.sleep(2000);
        pressNoMeasurementsParameterCheckbox();
        Thread.sleep(2000);
    }

    public static void onlyFindingActivatedNM(int daysFinding, int daysCriticalFinding) throws InterruptedException {
        activateAllNM(daysFinding, daysCriticalFinding);
        Thread.sleep(2000);
        pressNoMeasurementsCriticalFindingCheckbox();
        Thread.sleep(2000);
        pressNoMeasurementsParameterCheckbox();
        Thread.sleep(2000);
    }

    public static void onlyCriticalActivatedNM(int daysFinding, int daysCriticalFinding) throws InterruptedException {
        activateAllNM(daysFinding, daysCriticalFinding);
        Thread.sleep(2000);
        pressNoMeasurementsFindingCheckbox();
        Thread.sleep(2000);
        pressNoMeasurementsParameterCheckbox();
        Thread.sleep(2000);
    }

    public static void deselectAllNM() throws InterruptedException {
        deactivateNoMeasurementsFinding();
        deactivateNoMeasurementsCritical();
        deactivateNoMeasurementsParameter();
    }

}
