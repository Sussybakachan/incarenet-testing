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

public class TelemBSXRepRow {
    //is selected
    static boolean isBsxParameterSelected() {
        return driver.findElement(By.id("BostonTelemonitoringReportWithoutEventParameter")).isSelected();

    }

    static boolean isBsxFindingSelected() {
        return driver.findElement(By.id("BostonTelemonitoringReportWithoutEventFinding")).isSelected();
    }

    static boolean isBsxCriticalFindingSelected() {
        return driver.findElement(By.id("BostonTelemonitoringReportWithoutEventCriticalFinding")).isSelected();
    }

    static void pressBsxParameterCheckbox() {
        driver.findElement(By.id("BostonTelemonitoringReportWithoutEventParameter")).click();
    }

    static void pressBsxFindingCheckbox() {
        driver.findElement(By.id("BostonTelemonitoringReportWithoutEventFinding")).click();
    }

    static void pressBsxCriticalFindingCheckbox() {
        driver.findElement(By.id("BostonTelemonitoringReportWithoutEventCriticalFinding")).click();
    }

    public static void activateBsxParameter() {
        if (!isBsxParameterSelected()) {
            pressBsxParameterCheckbox();
        }
    }

    public static void deactivateBsxParameter() {
        boolean isChecked = driver.findElement(By.id("BostonTelemonitoringReportWithoutEventParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("BostonTelemonitoringReportWithoutEventParameter")).click();

        }

    }

    public static void activateBsxFinding() {
        if (!isBsxFindingSelected()) {
            pressBsxFindingCheckbox();
        }
    }

    public static void deactivateBsxFinding() {
        boolean isChecked = driver.findElement(By.id("BostonTelemonitoringReportWithoutEventFinding")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("BostonTelemonitoringReportWithoutEventFinding")).click();

        }

    }

    public static void activateBsxCritical() {
        if (!isBsxCriticalFindingSelected()) {
            pressBsxCriticalFindingCheckbox();
        }
    }

    public static void deactivateBsxCritical() {
        boolean isChecked = driver.findElement(By.id("BostonTelemonitoringReportWithoutEventCriticalFinding")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("BostonTelemonitoringReportWithoutEventCriticalFinding")).click();

        }

    }

    public static void onlyParamActivatedBsx() throws InterruptedException {

        activateBsxParameter();
        Thread.sleep(2000);
    }

    public static void findingParamActivatedBsx() throws InterruptedException {

        onlyParamActivatedBsx();
        Thread.sleep(2000);
        activateBsxFinding();
        Thread.sleep(2000);

    }

    public static void criticalParamActivatedBsx() throws InterruptedException {

        onlyParamActivatedBsx();
        Thread.sleep(2000);
        activateBsxCritical();
        Thread.sleep(2000);

    }

    public static void activateAllBsx() throws InterruptedException {

        findingParamActivatedBsx();
        Thread.sleep(2000);
        activateBsxCritical();
        Thread.sleep(2000);
    }


    public static void onlyFindingCriticalActivatedBsx() throws InterruptedException {
        activateAllBsx();
        Thread.sleep(2000);
        deactivateBsxParameter();
        Thread.sleep(2000);
    }

    public static void onlyFindingActivatedBsx() throws InterruptedException {
        findingParamActivatedBsx();
        Thread.sleep(2000);
        deactivateBsxParameter();
        Thread.sleep(2000);
    }

    public static void onlyCriticalActivatedBsx() throws InterruptedException {
        criticalParamActivatedBsx();
        Thread.sleep(2000);
        deactivateBsxParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllBsx() throws InterruptedException {
        deactivateBsxFinding();
        deactivateBsxCritical();
        deactivateBsxParameter();
    }

}
