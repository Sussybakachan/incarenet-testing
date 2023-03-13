package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.ChromeWebDriver.driver;

//NM = NoMeasurements
//activateAllABB = activateABBFindingANDActivateABBCriticalFindingANDActivateABBParameter
//findingParamActivatedABB = activateABBFindingANDDeactivateABBCriticalFindingANDActivateABBParameter
//criticalParamActivatedABB = activateABBCriticalFindingANDDeactivateABBFindingANDActivateABBParameter
//onlyParamActivatedABB = activateABBParameterANDDeactivateABBFindingANDDeactivateABBCriticalFinding
//onlyFindingCriticalActivatedABB = deactivateABBParameterANDActivatedABBFindingANDActivateABBCriticalFinding
//onlyFindingActivatedABB = activatedABBFindingANDDeactivateABBParameterANDDeactivateABBCriticalFinding
//onlyCriticalActivatedABB = activateABBCriticalFindingANDDeactivateABBParameterANDDeactivatedABBFinding

public class TelemABBRepRow {
    //is selected
    static boolean isAbbParameterSelected() {
        return driver.findElement(By.id("abbottTelemonitoring-ReportParameter")).isSelected();

    }

    static boolean isAbbFindingSelected() {
        return driver.findElement(By.id("abbottTelemonitoring-ReportFinding")).isSelected();
    }

    static boolean isAbbCriticalFindingSelected() {
        return driver.findElement(By.id("abbottTelemonitoring-ReportCriticalFinding")).isSelected();
    }

    static void pressAbbParameterCheckbox() {
        driver.findElement(By.id("abbottTelemonitoring-ReportParameter")).click();
    }

    static void pressAbbFindingCheckbox() {
        driver.findElement(By.id("abbottTelemonitoring-ReportFinding")).click();
    }

    static void pressAbbCriticalFindingCheckbox() {
        driver.findElement(By.id("abbottTelemonitoring-ReportCriticalFinding")).click();
    }

    public static void activateAbbParameter() {
        if (!isAbbParameterSelected()) {
            pressAbbParameterCheckbox();
        }
    }

    public static void deactivateAbbParameter() {
        boolean isChecked = driver.findElement(By.id("abbottTelemonitoring-ReportParameter")).isSelected();
        if (isChecked) {
            driver.findElement(By.id("abbottTelemonitoring-ReportParameter")).click();

        }

    }

    public static void activateAbbFinding() {
        if (!isAbbFindingSelected()) {
            pressAbbFindingCheckbox();
        }
    }

    public static void deactivateAbbFinding() {
        boolean isChecked = driver.findElement(By.id("abbottTelemonitoring-ReportFinding")).isSelected();
        if (isChecked) {
            driver.findElement(By.id("abbottTelemonitoring-ReportFinding")).click();

        }

    }

    public static void activateAbbCritical() {
        if (!isAbbCriticalFindingSelected()) {
            pressAbbCriticalFindingCheckbox();
        }
    }

    public static void deactivateAbbCritical() {
        boolean isChecked = driver.findElement(By.id("abbottTelemonitoring-ReportCriticalFinding")).isSelected();
        if (isChecked) {
            driver.findElement(By.id("abbottTelemonitoring-ReportCriticalFinding")).click();

        }
    }

    public static void onlyParamActivatedAbb() throws InterruptedException {
        activateAbbParameter();
        Thread.sleep(2000);
    }

    public static void findingParamActivatedAbb() throws InterruptedException {
        onlyParamActivatedAbb();
        Thread.sleep(2000);
        activateAbbFinding();
        Thread.sleep(2000);

    }

    public static void criticalParamActivatedAbb() throws InterruptedException {
        onlyParamActivatedAbb();
        Thread.sleep(2000);
        activateAbbCritical();
        Thread.sleep(2000);

    }

    public static void onlyFindingActivatedAbb() throws InterruptedException {
        findingParamActivatedAbb();
        Thread.sleep(2000);
        deactivateAbbParameter();
        Thread.sleep(2000);
    }

    public static void onlyCriticalActivatedAbb() throws InterruptedException {
        criticalParamActivatedAbb();
        Thread.sleep(2000);
        deactivateAbbParameter();
        Thread.sleep(2000);
    }

    public static void deselectAllAbb() throws InterruptedException {
        onlyParamActivatedAbb();
        deactivateAbbFinding();
        deactivateAbbCritical();
        deactivateAbbParameter();
    }

}
