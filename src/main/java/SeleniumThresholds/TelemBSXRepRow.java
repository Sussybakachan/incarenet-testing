package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;

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



    public static void activatedBsxParameter() {
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


    public static void activateBsxParameterANDActivateBsxFinding() throws InterruptedException {
        if (!isBsxParameterSelected()) {
            System.out.println("BSX Report: "+ !isBsxParameterSelected());
            activatedBsxParameter();
            Thread.sleep(2000);
            if (!isBsxFindingSelected()) {
                System.out.println("BSX Report Finding : "+ isBsxFindingSelected());
                Thread.sleep(2000);
                pressBsxFindingCheckbox();
            }
        } else if (!isBsxFindingSelected()) {
            System.out.println("BSX Report Finding: "+ isBsxFindingSelected());
            pressBsxFindingCheckbox();
        }
    }

    public static void activateBsxParameterANDActivateBsxCriticalFinding() throws InterruptedException {
        if (!isBsxParameterSelected()) {
            System.out.println("BSX Report: "+ !isBsxParameterSelected());
            activatedBsxParameter();
            Thread.sleep(2000);
            if (!isBsxCriticalFindingSelected()) {
                System.out.println("BSX Report Critical Finding: "+ isBsxCriticalFindingSelected());
                Thread.sleep(2000);
                pressBsxCriticalFindingCheckbox();
            }
        } else if (!isBsxCriticalFindingSelected()) {
            System.out.println("BSX Report Critical Finding: "+ isBsxCriticalFindingSelected());
            pressBsxCriticalFindingCheckbox();
        }
    }


    public static void activateBsxParameterANDActivateBsxFindingANDActivateBsxCriticalFinding() throws InterruptedException {
        if (!isBsxParameterSelected()) {
            System.out.println("BSX Report: "+ !isBsxParameterSelected());
            activatedBsxParameter();
            Thread.sleep(2000);
            if (!isBsxFindingSelected() && !isBsxCriticalFindingSelected()) {
                System.out.println("BSX Report Finding and BSX Report Critical Finding: "+ isBsxFindingSelected() + isBsxCriticalFindingSelected());
                Thread.sleep(2000);
                pressBsxFindingCheckbox();
                pressBsxCriticalFindingCheckbox();
            }
        } else if (!isBsxFindingSelected() || !isBsxCriticalFindingSelected()) {
            System.out.println("BSX Report Finding and BSX Report Critical Finding: "+ isBsxFindingSelected() + isBsxCriticalFindingSelected());
            pressBsxFindingCheckbox();
            pressBsxCriticalFindingCheckbox();
        }
    }

    public static void deactivateBsxParameterANDActivatedBsxFindingANDActivateBsxCriticalFinding() {

    }





}
