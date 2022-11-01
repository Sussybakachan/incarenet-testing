package SeleniumThresholds;

import org.openqa.selenium.By;

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

    static void pressNoMeasurementsFindingCheckbox() {
        driver.findElement(By.id("noMeasurementsFinding")).click();
    }

    static void pressNoMeasurementsCriticalFindingCheckbox() {
        driver.findElement(By.id("noMeasurementsCriticalFinding")).click();
    }

    public static void activatedNoMeasurementsParameter() {
        if (!isNoMeasurementsParameterSelected()) {
            pressNoMeasurementsParameterCheckbox();
        }
    }

    public static void deactivateNoMeasurementsParameter() {
        boolean isChecked = driver.findElement(By.id("noMeasurementsParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("noMeasurementsParameter")).click();

        }

    }
    public static void activatedNoMeasurementsFinding() {
        if (!isNoMeasurementsFindingSelected()) {
            pressNoMeasurementsFindingCheckbox();
        }
    }

    public static void deactivateNoMeasurementsFinding() {
        boolean isChecked = driver.findElement(By.id("noMeasurementsFinding")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("noMeasurementsFinding")).click();

        }

    }

    public static void activatedNoMeasurementsCritical() {
        if (!isNoMeasurementsCriticalFindingSelected()) {
            pressNoMeasurementsCriticalFindingCheckbox();
        }
    }

    public static void deactivateNoMeasurementsCritical() {
        boolean isChecked = driver.findElement(By.id("noMeasurementsCriticalFinding")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("noMeasurementsCriticalFinding")).click();

        }

    }

    public static void onlyParamActivatedNM() throws InterruptedException {

        activatedNoMeasurementsParameter();
        Thread.sleep(2000);
    }

    public static void findingParamActivatedNM() throws InterruptedException {

        onlyParamActivatedNM();
        Thread.sleep(2000);
        activatedNoMeasurementsFinding();
        Thread.sleep(2000);

    }

    public static void criticalParamActivatedNM() throws InterruptedException {

        onlyParamActivatedNM();
        Thread.sleep(2000);
        activatedNoMeasurementsCritical();
        Thread.sleep(2000);

    }

    public static void activateAllNM() throws InterruptedException {

        findingParamActivatedNM();
        Thread.sleep(2000);
        activatedNoMeasurementsCritical();
        Thread.sleep(2000);
    }

    public static void onlyFindingCriticalActivatedNM() throws InterruptedException {
        activateAllNM();
        Thread.sleep(2000);
        deactivateNoMeasurementsParameter();
        Thread.sleep(2000);
    }

    public static void onlyFindingActivatedNM() throws InterruptedException {
        findingParamActivatedNM();
        Thread.sleep(2000);
        deactivateNoMeasurementsParameter();
        Thread.sleep(2000);
    }

    public static void onlyCriticalActivatedNM() throws InterruptedException {
        criticalParamActivatedNM();
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
