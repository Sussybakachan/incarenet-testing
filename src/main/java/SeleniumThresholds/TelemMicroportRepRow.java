package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;

public class TelemMicroportRepRow {
    //is selected
    static boolean isMicroportParameterSelected() {
        return driver.findElement(By.id("microportParameter")).isSelected();

    }

    static boolean isMicroportFindingSelected() {
        return driver.findElement(By.id("microportFinding")).isSelected();
    }

    static boolean isMicroportCriticalFindingSelected() {
        return driver.findElement(By.id("microportCriticalFinding")).isSelected();
    }

    static void pressMicroportParameterCheckbox() {
        driver.findElement(By.id("microportParameter")).click();
    }

    static void pressMicroportFindingCheckbox() {
        driver.findElement(By.id("microportFinding")).click();
    }

    static void pressMicroportCriticalFindingCheckbox() {
        driver.findElement(By.id("microportCriticalFinding")).click();
    }



    public static void activatedMicroportParameter() {
        if (!isMicroportParameterSelected()) {
            pressMicroportParameterCheckbox();
        }
    }

    public static void deactivateMicroportParameter() {
        boolean isChecked = driver.findElement(By.id("microportParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("microportParameter")).click();

        }

    }


    public static void activateMicroportParameterANDActivateMicroportFinding() throws InterruptedException {
        if (!isMicroportParameterSelected()) {
            System.out.println("Microport Report: "+ !isMicroportParameterSelected());
            activatedMicroportParameter();
            Thread.sleep(2000);
            if (!isMicroportFindingSelected()) {
                System.out.println("Microport Report Finding : "+ isMicroportFindingSelected());
                Thread.sleep(2000);
                pressMicroportFindingCheckbox();
            }
        } else if (!isMicroportFindingSelected()) {
            System.out.println("Microport Report Finding: "+ isMicroportFindingSelected());
            pressMicroportFindingCheckbox();
        }
    }

    public static void activateMicroportParameterANDActivateMicroportCriticalFinding() throws InterruptedException {
        if (!isMicroportParameterSelected()) {
            System.out.println("Microport Report: "+ !isMicroportParameterSelected());
            activatedMicroportParameter();
            Thread.sleep(2000);
            if (!isMicroportCriticalFindingSelected()) {
                System.out.println("Microport Report Critical Finding: "+ isMicroportCriticalFindingSelected());
                Thread.sleep(2000);
                pressMicroportCriticalFindingCheckbox();
            }
        } else if (!isMicroportCriticalFindingSelected()) {
            System.out.println("Microport Report Critical Finding: "+ isMicroportCriticalFindingSelected());
            pressMicroportCriticalFindingCheckbox();
        }
    }


    public static void activateMicroportParameterANDActivateMicroportFindingANDActivateMicroportCriticalFinding() throws InterruptedException {
        if (!isMicroportParameterSelected()) {
            System.out.println("Microport Report: "+ !isMicroportParameterSelected());
            activatedMicroportParameter();
            Thread.sleep(2000);
            if (!isMicroportFindingSelected() && !isMicroportCriticalFindingSelected()) {
                System.out.println("Microport Report Finding and Microport Report Critical Finding: "+ isMicroportFindingSelected() + isMicroportCriticalFindingSelected());
                Thread.sleep(2000);
                pressMicroportFindingCheckbox();
                pressMicroportCriticalFindingCheckbox();
            }
        } else if (!isMicroportFindingSelected() || !isMicroportCriticalFindingSelected()) {
            System.out.println("Microport Report Finding and Microport Report Critical Finding: "+ isMicroportFindingSelected() + isMicroportCriticalFindingSelected());
            pressMicroportFindingCheckbox();
            pressMicroportCriticalFindingCheckbox();
        }
    }

    public static void deactivateMicroportParameterANDActivatedMicroportFindingANDActivateMicroportCriticalFinding() {

    }





}
