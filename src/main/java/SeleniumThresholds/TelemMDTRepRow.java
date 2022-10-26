package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;

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



    public static void activatedMdtParameter() {
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


    public static void activateMdtParameterANDActivateMdtFinding() throws InterruptedException {
        if (!isMdtParameterSelected()) {
            System.out.println("MDT Report: "+ !isMdtParameterSelected());
            activatedMdtParameter();
            Thread.sleep(2000);
            if (!isMdtFindingSelected()) {
                System.out.println("MDT Report Finding : "+ isMdtFindingSelected());
                Thread.sleep(2000);
                pressMdtFindingCheckbox();
            }
        } else if (!isMdtFindingSelected()) {
            System.out.println("MDT Report Finding: "+ isMdtFindingSelected());
            pressMdtFindingCheckbox();
        }
    }

    public static void activateMdtParameterANDActivateMdtCriticalFinding() throws InterruptedException {
        if (!isMdtParameterSelected()) {
            System.out.println("MDT Report: "+ !isMdtParameterSelected());
            activatedMdtParameter();
            Thread.sleep(2000);
            if (!isMdtCriticalFindingSelected()) {
                System.out.println("MDT Report Critical Finding: "+ isMdtCriticalFindingSelected());
                Thread.sleep(2000);
                pressMdtCriticalFindingCheckbox();
            }
        } else if (!isMdtCriticalFindingSelected()) {
            System.out.println("MDT Report Critical Finding: "+ isMdtCriticalFindingSelected());
            pressMdtCriticalFindingCheckbox();
        }
    }


    public static void activateMdtParameterANDActivateMdtFindingANDActivateMdtCriticalFinding() throws InterruptedException {
        if (!isMdtParameterSelected()) {
            System.out.println("MDT Report: "+ !isMdtParameterSelected());
            activatedMdtParameter();
            Thread.sleep(2000);
            if (!isMdtFindingSelected() && !isMdtCriticalFindingSelected()) {
                System.out.println("MDT Report Finding and MDT Report Critical Finding: "+ isMdtFindingSelected() + isMdtCriticalFindingSelected());
                Thread.sleep(2000);
                pressMdtFindingCheckbox();
                pressMdtCriticalFindingCheckbox();
            }
        } else if (!isMdtFindingSelected() || !isMdtCriticalFindingSelected()) {
            System.out.println("MDT Report Finding and MDT Report Critical Finding: "+ isMdtFindingSelected() + isMdtCriticalFindingSelected());
            pressMdtFindingCheckbox();
            pressMdtCriticalFindingCheckbox();
        }
    }

    public static void deactivateMdtParameterANDActivatedMdtFindingANDActivateMdtCriticalFinding() {

    }





}
