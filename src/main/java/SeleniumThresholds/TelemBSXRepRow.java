package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;

public class TelemBSXRepRow {
    //is selected
    static boolean isBsxParameterSelected() {
        return driver.findElement(By.id("bsxParameter")).isSelected();

    }

    static boolean isBsxFindingSelected() {
        return driver.findElement(By.id("bsxFinding")).isSelected();
    }

    static boolean isBsxCriticalFindingSelected() {
        return driver.findElement(By.id("bsxCriticalFinding")).isSelected();
    }

    static void pressBsxParameterCheckbox() {
        driver.findElement(By.id("bsxParameter")).click();
    }

    static void pressBsxFindingCheckbox() {
        driver.findElement(By.id("bsxFinding")).click();
    }

    static void pressBsxCriticalFindingCheckbox() {
        driver.findElement(By.id("bsxCriticalFinding")).click();
    }



    public static void activatedBsxParameter() {
        if (!isBsxParameterSelected()) {
            pressBsxParameterCheckbox();
        }
    }

    public static void deactivateBsxParameter() {
        boolean isChecked = driver.findElement(By.id("bsxParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("bsxParameter")).click();

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
