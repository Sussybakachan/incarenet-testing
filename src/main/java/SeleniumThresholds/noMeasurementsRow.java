package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;

public class noMeasurementsRow {
    //is selected
    static boolean isNoMeasurementsParameterSelected() {
        return driver.findElement(By.id("noMeasurementsParameter")).isSelected();

    }

    static boolean isNoMeasurementsFindingSelected() {
        return driver.findElement(By.id("noMeasurementsFinding")).isSelected();
    }

    static boolean isNoMeasurementsCriticalFindingSelected() {
        return driver.findElement(By.id("noMeasurementsCriticalFinding")).isSelected();
    }

    static void pressNoMeasurementsParameterCheckbox() {
        driver.findElement(By.id("noMeasurementsParameter")).click();
    }

    static void pressNoMeasurementsFindingCheckbox() {
        driver.findElement(By.id("noMeasurementsFinding")).click();
    }

    static void pressNoMeasurementsCriticalFindingCheckbox() {
        driver.findElement(By.id("noMeasurementsCriticalFinding")).click();
    }



    public static void activatedNoMeasurementsParameter() {
        if (!isNoMeasurementsParameterSelected()) {
            pressNoMeasurementsParameterCheckbox();
        }
    }

    public static void deactivateNoMeasurementsParameter() {
        boolean isChecked = driver.findElement(By.id("noMeasurementsParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("noMeasurementsParameter")).click();

        }

    }


    public static void activateNoMeasurementsParameterANDActivateNoMeasurementsFinding() throws InterruptedException {
        if (!isNoMeasurementsParameterSelected()) {
            System.out.println("No Measurements Report: "+ !isNoMeasurementsParameterSelected());
            activatedNoMeasurementsParameter();
            Thread.sleep(2000);
            if (!isNoMeasurementsFindingSelected()) {
                System.out.println("No Measurements Report Finding : "+ isNoMeasurementsFindingSelected());
                Thread.sleep(2000);
                pressNoMeasurementsFindingCheckbox();
            }
        } else if (!isNoMeasurementsFindingSelected()) {
            System.out.println("No Measurements Report Finding: "+ isNoMeasurementsFindingSelected());
            pressNoMeasurementsFindingCheckbox();
        }
    }

    public static void activateNoMeasurementsParameterANDActivateNoMeasurementsCriticalFinding() throws InterruptedException {
        if (!isNoMeasurementsParameterSelected()) {
            System.out.println("No Measurements Report: "+ !isNoMeasurementsParameterSelected());
            activatedNoMeasurementsParameter();
            Thread.sleep(2000);
            if (!isNoMeasurementsCriticalFindingSelected()) {
                System.out.println("No Measurements Report Critical Finding: "+ isNoMeasurementsCriticalFindingSelected());
                Thread.sleep(2000);
                pressNoMeasurementsCriticalFindingCheckbox();
            }
        } else if (!isNoMeasurementsCriticalFindingSelected()) {
            System.out.println("No Measurements Report Critical Finding: "+ isNoMeasurementsCriticalFindingSelected());
            pressNoMeasurementsCriticalFindingCheckbox();
        }
    }


    public static void activateNoMeasurementsParameterANDActivateNoMeasurementsFindingANDActivateNoMeasurementsCriticalFinding() throws InterruptedException {
        if (!isNoMeasurementsParameterSelected()) {
            System.out.println("No Measurements Report: "+ !isNoMeasurementsParameterSelected());
            activatedNoMeasurementsParameter();
            Thread.sleep(2000);
            if (!isNoMeasurementsFindingSelected() && !isNoMeasurementsCriticalFindingSelected()) {
                System.out.println("No Measurements Report Finding and No Measurement Report Critical Finding: "+ isNoMeasurementsFindingSelected() + isNoMeasurementsCriticalFindingSelected());
                Thread.sleep(2000);
                pressNoMeasurementsFindingCheckbox();
                pressNoMeasurementsCriticalFindingCheckbox();
            }
        } else if (!isNoMeasurementsFindingSelected() || !isNoMeasurementsCriticalFindingSelected()) {
            System.out.println("No Measurements Report Finding and No Measurements Report Critical Finding: "+ isNoMeasurementsFindingSelected() + isNoMeasurementsCriticalFindingSelected());
            pressNoMeasurementsFindingCheckbox();
            pressNoMeasurementsCriticalFindingCheckbox();
        }
    }

    public static void deactivateNoMeasurementsParameterANDActivatedNoMeasurementsFindingANDActivateNoMeasurementsCriticalFinding() {

    }





}
