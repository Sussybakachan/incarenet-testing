package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;

public class NoMeasurementRow {
    //is selected
    static boolean isNoMeasurementParameterSelected() {
        return driver.findElement(By.id("noMeasurementParameter")).isSelected();

    }

    static boolean isNoMeasurementFindingSelected() {
        return driver.findElement(By.id("noMeasurementFinding")).isSelected();
    }

    static boolean isNoMeasurementCriticalFindingSelected() {
        return driver.findElement(By.id("noMeasurementCriticalFinding")).isSelected();
    }

    static void pressNoMeasurementParameterCheckbox() {
        driver.findElement(By.id("noMeasurementParameter")).click();
    }

    static void pressNoMeasurementFindingCheckbox() {
        driver.findElement(By.id("noMeasurementFinding")).click();
    }

    static void pressNoMeasurementCriticalFindingCheckbox() {
        driver.findElement(By.id("noMeasurementCriticalFinding")).click();
    }



    public static void activatedNoMeasurementParameter() {
        if (!isNoMeasurementParameterSelected()) {
            pressNoMeasurementParameterCheckbox();
        }
    }

    public static void deactivateNoMeasurementParameter() {
        boolean isChecked = driver.findElement(By.id("noMeasurementParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("noMeasurementParameter")).click();

        }

    }


    public static void activateNoMeasurementParameterANDActivateNoMeasurementFinding() throws InterruptedException {
        if (!isNoMeasurementParameterSelected()) {
            System.out.println("No Measurement Report: "+ !isNoMeasurementParameterSelected());
            activatedNoMeasurementParameter();
            Thread.sleep(2000);
            if (!isNoMeasurementFindingSelected()) {
                System.out.println("No Measurement Report Finding : "+ isNoMeasurementFindingSelected());
                Thread.sleep(2000);
                pressNoMeasurementFindingCheckbox();
            }
        } else if (!isNoMeasurementFindingSelected()) {
            System.out.println("No Measurement Report Finding: "+ isNoMeasurementFindingSelected());
            pressNoMeasurementFindingCheckbox();
        }
    }

    public static void activateNoMeasurementParameterANDActivateNoMeasurementCriticalFinding() throws InterruptedException {
        if (!isNoMeasurementParameterSelected()) {
            System.out.println("No Measurement Report: "+ !isNoMeasurementParameterSelected());
            activatedNoMeasurementParameter();
            Thread.sleep(2000);
            if (!isNoMeasurementCriticalFindingSelected()) {
                System.out.println("No Measurement Report Critical Finding: "+ isNoMeasurementCriticalFindingSelected());
                Thread.sleep(2000);
                pressNoMeasurementCriticalFindingCheckbox();
            }
        } else if (!isNoMeasurementCriticalFindingSelected()) {
            System.out.println("No Measurement Report Critical Finding: "+ isNoMeasurementCriticalFindingSelected());
            pressNoMeasurementCriticalFindingCheckbox();
        }
    }


    public static void activateNoMeasurementParameterANDActivateNoMeasurementFindingANDActivateNoMeasurementCriticalFinding() throws InterruptedException {
        if (!isNoMeasurementParameterSelected()) {
            System.out.println("No Measurement Report: "+ !isNoMeasurementParameterSelected());
            activatedNoMeasurementParameter();
            Thread.sleep(2000);
            if (!isNoMeasurementFindingSelected() && !isNoMeasurementCriticalFindingSelected()) {
                System.out.println("No Measurement Report Finding and No Measurement Report Critical Finding: "+ isNoMeasurementFindingSelected() + isNoMeasurementCriticalFindingSelected());
                Thread.sleep(2000);
                pressNoMeasurementFindingCheckbox();
                pressNoMeasurementCriticalFindingCheckbox();
            }
        } else if (!isNoMeasurementFindingSelected() || !isNoMeasurementCriticalFindingSelected()) {
            System.out.println("No Measurement Report Finding and No Measurement Report Critical Finding: "+ isNoMeasurementFindingSelected() + isNoMeasurementCriticalFindingSelected());
            pressNoMeasurementFindingCheckbox();
            pressNoMeasurementCriticalFindingCheckbox();
        }
    }

    public static void deactivateNoMeasurementParameterANDActivatedNoMeasurementFindingANDActivateNoMeasurementCriticalFinding() {

    }





}
