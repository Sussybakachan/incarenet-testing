package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;

public class CRTRow {
    //is selected
    static boolean isCrtParameterSelected() {
        return driver.findElement(By.id("crtParameter")).isSelected();

    }

    static boolean isCrtFindingSelected() {
        return driver.findElement(By.id("crtFinding")).isSelected();
    }

    static boolean isCrtCriticalFindingSelected() {
        return driver.findElement(By.id("crtCriticalFinding")).isSelected();
    }

    static void pressCrtParameterCheckbox() {
        driver.findElement(By.id("crtParameter")).click();
    }

    static void pressCrtFindingCheckbox() {
        driver.findElement(By.id("crtFinding")).click();
    }

    static void pressCrtCriticalFindingCheckbox() {
        driver.findElement(By.id("crtCriticalFinding")).click();
    }

    public static void activatedCrtParameter() {
        if (!isCrtParameterSelected()) {
            pressCrtParameterCheckbox();
        }
    }

    public static void deactivateCrtParameter() {
        boolean isChecked = driver.findElement(By.id("crtParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("crtParameter")).click();

        }

    }

    public static void activateCrtFindingANDActivateCrtCriticalFindingANDActivateCrtParameter() throws InterruptedException {
        if (!isCrtParameterSelected()) {
            System.out.println("CRT-Pacing: "+ !isCrtParameterSelected());
            activatedCrtParameter();
            Thread.sleep(2000);
            if (!isCrtFindingSelected() && !isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                pressCrtFindingCheckbox();
                pressCrtCriticalFindingCheckbox();
            }
        } else if (!isCrtFindingSelected() || !isCrtCriticalFindingSelected()) {
            System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
            pressCrtFindingCheckbox();
            pressCrtCriticalFindingCheckbox();
        }
    }

    public static void activateCrtCriticalFindingANDDeactivateCrtFindingANDActivateCrtParameter() throws InterruptedException {
        if (!isCrtParameterSelected()) {
            System.out.println("CRT-Pacing: "+ !isCrtParameterSelected());
            activatedCrtParameter();
            Thread.sleep(2000);
            if (!isCrtFindingSelected() && !isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                pressCrtFindingCheckbox();
                pressCrtCriticalFindingCheckbox();
            }
        } else if (!isCrtFindingSelected() || !isCrtCriticalFindingSelected()) {
            System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
            pressCrtFindingCheckbox();
            pressCrtCriticalFindingCheckbox();
        }
    }

    public static void activateCrtParameterANDDeactivateCrtFindingANDDeactivateCrtCriticalFinding() throws InterruptedException {
        if (!isCrtParameterSelected()) {
            System.out.println("CRT-Pacing: "+ !isCrtParameterSelected());
            activatedCrtParameter();
            Thread.sleep(2000);
            if (!isCrtFindingSelected() && !isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                pressCrtFindingCheckbox();
                pressCrtCriticalFindingCheckbox();
            }
        } else if (!isCrtFindingSelected() || !isCrtCriticalFindingSelected()) {
            System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
            pressCrtFindingCheckbox();
            pressCrtCriticalFindingCheckbox();
        }
    }

    public static void deactivateCrtParameterANDActivatedCrtFindingANDActivateCrtCriticalFinding() {

    }


    public static void deactivateCrtParameterANDActivatedCrtFindingANDDeactivateCrtCriticalFinding() {

    }

    public static void deactivateCrtParameterANDActivateCrtCriticalFindingANDDeactivatedCrtFinding() {

    }


}
