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

    static void pressNoMeasurementsFindingCheckbox(int daysFinding) {
        driver.findElement(By.id("noMeasurementsFinding")).click();
        if (isNoMeasurementsFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterB-params-valueB\"]")).sendKeys(Integer.toString(daysFinding));
    }
    }

    static void pressNoMeasurementsCriticalFindingCheckbox(int daysCriticalFinding) {
        driver.findElement(By.id("noMeasurementsCriticalFinding")).click();
        if (isNoMeasurementsCriticalFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterB-params-valueB\"]")).sendKeys(Integer.toString(daysCriticalFinding));
    }
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
    public static void activatedNoMeasurementsFinding(int daysFinding) {
        if (!isNoMeasurementsFindingSelected()) {
            pressNoMeasurementsFindingCheckbox(daysFinding);
        }
    }

    public static void deactivateNoMeasurementsFinding() {
        boolean isChecked = driver.findElement(By.id("noMeasurementsFinding")).isSelected();
        if (isChecked) {
            driver.findElement(By.id("noMeasurementsFinding")).click();

        }

    }

    public static void activatedNoMeasurementsCritical(int daysCriticalFinding) {
        if (!isNoMeasurementsCriticalFindingSelected()) {
            pressNoMeasurementsCriticalFindingCheckbox(daysCriticalFinding);
        }
    }

    public static void deactivateNoMeasurementsCritical() {
        boolean isChecked = driver.findElement(By.id("noMeasurementsCriticalFinding")).isSelected();
        if (isChecked) {
            driver.findElement(By.id("noMeasurementsCriticalFinding")).click();

        }

    }

    public static void onlyParamActivatedNM() throws InterruptedException {

        activatedNoMeasurementsParameter();
        Thread.sleep(2000);
    }

    public static void findingParamActivatedNM(int daysFinding) throws InterruptedException {

        onlyParamActivatedNM();
        Thread.sleep(2000);
        activatedNoMeasurementsFinding(daysFinding);
        Thread.sleep(2000);

    }

    public static void criticalParamActivatedNM(int daysCriticalFinding) throws InterruptedException {

        onlyParamActivatedNM();
        Thread.sleep(2000);
        activatedNoMeasurementsCritical(daysCriticalFinding);
        Thread.sleep(2000);

    }

    public static void activateAllNM(int daysFinding, int daysCriticalFinding) throws InterruptedException {

        findingParamActivatedNM(daysFinding);
        Thread.sleep(2000);
        activatedNoMeasurementsCritical(daysCriticalFinding);
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
            driver.findElement(By.id("noMeasurementsFinding")).click();
        }
    }
    public static void onlyFindingCriticalActivatedNM(int daysFinding, int daysCriticalFinding) throws InterruptedException {
        activateAllNM(daysFinding, daysCriticalFinding);
        Thread.sleep(2000);
        deactivateNoMeasurementsParameter();
        Thread.sleep(2000);
    }

    public static void onlyFindingActivatedNM(int daysFinding) throws InterruptedException {
        findingParamActivatedNM(daysFinding);
        Thread.sleep(2000);
        deactivateNoMeasurementsParameter();
        Thread.sleep(2000);
    }

    public static void onlyCriticalActivatedNM(int daysCriticalFinding) throws InterruptedException {
        criticalParamActivatedNM(daysCriticalFinding);
        Thread.sleep(2000);
        deactivateNoMeasurementsParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllNM() throws InterruptedException {
        deactivateNoMeasurementsFinding();
        deactivateNoMeasurementsCritical();
        deactivateNoMeasurementsParameter();
    }

}
