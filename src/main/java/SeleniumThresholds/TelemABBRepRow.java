package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;

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
        return driver.findElement(By.id("abbParameter")).isSelected();

    }

    static boolean isAbbFindingSelected() {
        return driver.findElement(By.id("abbFinding")).isSelected();
    }

    static boolean isAbbCriticalFindingSelected() {
        return driver.findElement(By.id("abbCriticalFinding")).isSelected();
    }

    static void pressAbbParameterCheckbox() {
        driver.findElement(By.id("abbParameter")).click();
    }

    static void pressAbbFindingCheckbox() {
        driver.findElement(By.id("abbFinding")).click();
    }

    static void pressAbbCriticalFindingCheckbox() {
        driver.findElement(By.id("abbCriticalFinding")).click();
    }

    public static void activateAbbParameter() {
        if (!isAbbParameterSelected()) {
            pressAbbParameterCheckbox();
        }
    }

    public static void deactivateAbbParameter() {
        boolean isChecked = driver.findElement(By.id("abbParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("abbParameter")).click();

        }

    }

    public static void activateAbbFinding() {
        if (!isAbbFindingSelected()) {
            pressAbbFindingCheckbox();
        }
    }

    public static void deactivateAbbFinding() {
        boolean isChecked = driver.findElement(By.id("abbottTelemonitoring-ReportFinding")).isSelected();
        //batterieStatusStatus = isChecked;
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
        //batterieStatusStatus = isChecked;
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

    public static void activateAllAbb() throws InterruptedException {

        findingParamActivatedAbb();
        Thread.sleep(2000);
        activateAbbCritical();
        Thread.sleep(2000);
    }

    public static void onlyFindingCriticalActivatedAbb() throws InterruptedException {
        activateAllAbb();
        Thread.sleep(2000);
        deactivateAbbParameter();
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
        deactivateAbbFinding();
        deactivateAbbCritical();
        deactivateAbbParameter();
    }

}
