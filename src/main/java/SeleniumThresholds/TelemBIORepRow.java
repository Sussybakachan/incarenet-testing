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

public class TelemBIORepRow {
    //is selected
    static boolean isBioParameterSelected() {
        return driver.findElement(By.id("BiotronikTelemonitoringReportWithoutEventParameter")).isSelected();

    }

    static boolean isBioFindingSelected() {
        return driver.findElement(By.id("BiotronikTelemonitoringReportWithoutEventFinding")).isSelected();
    }

    static boolean isBioCriticalFindingSelected() {
        return driver.findElement(By.id("BiotronikTelemonitoringReportWithoutEventCriticalFinding")).isSelected();
    }

    static void pressBioParameterCheckbox() {
        driver.findElement(By.id("BiotronikTelemonitoringReportWithoutEventParameter")).click();
    }

    static void pressBioFindingCheckbox() {
        driver.findElement(By.id("BiotronikTelemonitoringReportWithoutEventFinding")).click();
    }

    static void pressBioCriticalFindingCheckbox() {
        driver.findElement(By.id("BiotronikTelemonitoringReportWithoutEventCriticalFinding")).click();
    }



    public static void activateBioParameter() {
        if (!isBioParameterSelected()) {
            pressBioParameterCheckbox();
        }
    }

    public static void deactivateBioParameter() {
        boolean isChecked = driver.findElement(By.id("BiotronikTelemonitoringReportWithoutEventParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("BiotronikTelemonitoringReportWithoutEventParameter")).click();

        }

    }

    public static void activateBioFinding() {
        if (!isBioFindingSelected()) {
            pressBioFindingCheckbox();
        }
    }

    public static void deactivateBioFinding() {
        boolean isChecked = driver.findElement(By.id("BiotronikTelemonitoringReportWithoutEventFinding")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("BiotronikTelemonitoringReportWithoutEventFinding")).click();

        }

    }

    public static void activateBioCritical() {
        if (!isBioCriticalFindingSelected()) {
            pressBioCriticalFindingCheckbox();
        }
    }

    public static void deactivateBioCritical() {
        boolean isChecked = driver.findElement(By.id("BiotronikTelemonitoringReportWithoutEventCriticalFinding")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("BiotronikTelemonitoringReportWithoutEventCriticalFinding")).click();

        }

    }

    public static void onlyParamActivatedBio() throws InterruptedException {

        activateBioParameter();
        Thread.sleep(2000);
    }

    public static void findingParamActivatedBio() throws InterruptedException {

        onlyParamActivatedBio();
        Thread.sleep(2000);
        activateBioFinding();
        Thread.sleep(2000);

    }

    public static void criticalParamActivatedBio() throws InterruptedException {

        onlyParamActivatedBio();
        Thread.sleep(2000);
        activateBioCritical();
        Thread.sleep(2000);

    }

    public static void onlyFindingActivatedBio() throws InterruptedException {
        findingParamActivatedBio();
        Thread.sleep(2000);
        deactivateBioParameter();
        Thread.sleep(2000);
    }

    public static void onlyCriticalActivatedBio() throws InterruptedException {
        criticalParamActivatedBio();
        Thread.sleep(2000);
        deactivateBioParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllBio() throws InterruptedException {
        deactivateBioFinding();
        deactivateBioCritical();
        deactivateBioParameter();
    }

}
