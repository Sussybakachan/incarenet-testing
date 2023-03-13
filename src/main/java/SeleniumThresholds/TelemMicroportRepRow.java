package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.ChromeWebDriver.driver;

//NM = NoMeasurements
//activateAllNM = activateNMFindingANDActivateNMCriticalFindingANDActivateNMParameter
//findingParamActivatedNM = activateNMFindingANDDeactivateNMCriticalFindingANDActivateNMParameter
//criticalParamActivatedNM = activateNMCriticalFindingANDDeactivateNMFindingANDActivateNMParameter
//onlyParamActivatedNM = activateNMParameterANDDeactivateNMFindingANDDeactivateNMCriticalFinding
//onlyFindingCriticalActivatedNM = deactivateNMParameterANDActivatedNMFindingANDActivateNMCriticalFinding
//onlyFindingActivatedNM = activatedNMFindingANDDeactivateNMParameterANDDeactivateNMCriticalFinding
//onlyCriticalActivatedNM = activateNMCriticalFindingANDDeactivateNMParameterANDDeactivatedNMFinding

public class TelemMicroportRepRow {
    //is selected
    static boolean isMicroportParameterSelected() {
        return driver.findElement(By.id("microportTelemonitoring-ReportParameter")).isSelected();

    }

    static boolean isMicroportFindingSelected() {
        return driver.findElement(By.id("microportTelemonitoring-ReportFinding")).isSelected();
    }

    static boolean isMicroportCriticalFindingSelected() {
        return driver.findElement(By.id("microportTelemonitoring-ReportCriticalFinding")).isSelected();
    }

    static void pressMicroportParameterCheckbox() {
        driver.findElement(By.id("microportTelemonitoring-ReportParameter")).click();
    }

    static void pressMicroportFindingCheckbox() {
        driver.findElement(By.id("microportTelemonitoring-ReportFinding")).click();
    }

    static void pressMicroportCriticalFindingCheckbox() {
        driver.findElement(By.id("microportTelemonitoring-ReportCriticalFinding")).click();
    }


    public static void activateMicroportParameter() {
        if (!isMicroportParameterSelected()) {
            pressMicroportParameterCheckbox();
        }
    }

    public static void deactivateMicroportParameter() {
        boolean isChecked = driver.findElement(By.id("microportTelemonitoring-ReportParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("microportTelemonitoring-ReportParameter")).click();

        }
    }

    public static void activateMicroportFinding() {
        if (!isMicroportFindingSelected()) {
            pressMicroportFindingCheckbox();
        }
    }

    public static void deactivateMicroportFinding() {
        boolean isChecked = driver.findElement(By.id("microportTelemonitoring-ReportFinding")).isSelected();
        if (isChecked) {
            driver.findElement(By.id("microportTelemonitoring-ReportFinding")).click();

        }
    }

    public static void activateMicroportCritical() {
        if (!isMicroportCriticalFindingSelected()) {
            pressMicroportCriticalFindingCheckbox();
        }
    }

    public static void deactivateMicroportCritical() {
        boolean isChecked = driver.findElement(By.id("microportTelemonitoring-ReportCriticalFinding")).isSelected();
        if (isChecked) {
            driver.findElement(By.id("microportTelemonitoring-ReportCriticalFinding")).click();

        }
    }

    public static void onlyParamActivatedMicroport() throws InterruptedException {
        activateMicroportParameter();
        Thread.sleep(2000);
    }

    public static void findingParamActivatedMicroport() throws InterruptedException {
        onlyParamActivatedMicroport();
        Thread.sleep(2000);
        activateMicroportFinding();
        Thread.sleep(2000);

    }

    public static void criticalParamActivatedMicroport() throws InterruptedException {
        onlyParamActivatedMicroport();
        Thread.sleep(2000);
        activateMicroportCritical();
        Thread.sleep(2000);

    }

    public static void onlyFindingActivatedMicroport() throws InterruptedException {
        findingParamActivatedMicroport();
        Thread.sleep(2000);
        deactivateMicroportParameter();
        Thread.sleep(2000);
    }

    public static void onlyCriticalActivatedMicroport() throws InterruptedException {
        criticalParamActivatedMicroport();
        Thread.sleep(2000);
        deactivateMicroportParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllMicroport() throws InterruptedException {
        onlyParamActivatedMicroport();
        deactivateMicroportFinding();
        deactivateMicroportCritical();
        deactivateMicroportParameter();
    }

}
