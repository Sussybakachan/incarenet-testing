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

public class TelemMDTRepRow {
    //is selected
    static boolean isMdtParameterSelected() {
        return driver.findElement(By.id("MedtronicTelemonitoring-ReportParameter")).isSelected();

    }

    static boolean isMdtFindingSelected() {
        return driver.findElement(By.id("MedtronicTelemonitoring-ReportFinding")).isSelected();
    }

    static boolean isMdtCriticalFindingSelected() {
        return driver.findElement(By.id("MedtronicTelemonitoring-ReportCriticalFinding")).isSelected();
    }

    static void pressMdtParameterCheckbox() {
        driver.findElement(By.id("MedtronicTelemonitoring-ReportParameter")).click();
    }

    static void pressMdtFindingCheckbox() {
        driver.findElement(By.id("MedtronicTelemonitoring-ReportFinding")).click();
    }

    static void pressMdtCriticalFindingCheckbox() {
        driver.findElement(By.id("MedtronicTelemonitoring-ReportCriticalFinding")).click();
    }

    public static void activateMdtParameter() {
        if (!isMdtParameterSelected()) {
            pressMdtParameterCheckbox();
        }
    }

    public static void deactivateMdtParameter() {
        boolean isChecked = driver.findElement(By.id("MedtronicTelemonitoring-ReportParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("MedtronicTelemonitoring-ReportParameter")).click();

        }

    }

    public static void activateMdtFinding() {
        if (!isMdtFindingSelected()) {
            pressMdtFindingCheckbox();
        }
    }

    public static void deactivateMdtFinding() {
        boolean isChecked = driver.findElement(By.id("MedtronicTelemonitoring-ReportFinding")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("MedtronicTelemonitoring-ReportFinding")).click();

        }

    }

    public static void activateMdtCritical() {
        if (!isMdtCriticalFindingSelected()) {
            pressMdtCriticalFindingCheckbox();
        }
    }

    public static void deactivateMdtCritical() {
        boolean isChecked = driver.findElement(By.id("MedtronicTelemonitoring-ReportCriticalFinding")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("MedtronicTelemonitoring-ReportCriticalFinding")).click();

        }

    }

    public static void onlyParamActivatedMdt() throws InterruptedException {

        activateMdtParameter();
        Thread.sleep(2000);
    }

    public static void findingParamActivatedMdt() throws InterruptedException {

        onlyParamActivatedMdt();
        Thread.sleep(2000);
        activateMdtFinding();
        Thread.sleep(2000);

    }

    public static void criticalParamActivatedMdt() throws InterruptedException {

        onlyParamActivatedMdt();
        Thread.sleep(2000);
        activateMdtCritical();
        Thread.sleep(2000);

    }

    public static void onlyFindingActivatedMdt() throws InterruptedException {
        findingParamActivatedMdt();
        Thread.sleep(2000);
        deactivateMdtParameter();
        Thread.sleep(2000);
    }

    public static void onlyCriticalActivatedMdt() throws InterruptedException {
        criticalParamActivatedMdt();
        Thread.sleep(2000);
        deactivateMdtParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllMdt() throws InterruptedException {
        deactivateMdtFinding();
        deactivateMdtCritical();
        deactivateMdtParameter();
    }

}
