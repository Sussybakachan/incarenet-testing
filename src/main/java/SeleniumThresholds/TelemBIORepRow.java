package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;

public class TelemBIORepRow {
    //is selected
    static boolean isBioParameterSelected() {
        return driver.findElement(By.id("bioParameter")).isSelected();

    }

    static boolean isBioFindingSelected() {
        return driver.findElement(By.id("bioFinding")).isSelected();
    }

    static boolean isBioCriticalFindingSelected() {
        return driver.findElement(By.id("bioCriticalFinding")).isSelected();
    }

    static void pressBioParameterCheckbox() {
        driver.findElement(By.id("bioParameter")).click();
    }

    static void pressBioFindingCheckbox() {
        driver.findElement(By.id("bioFinding")).click();
    }

    static void pressBioCriticalFindingCheckbox() {
        driver.findElement(By.id("bioCriticalFinding")).click();
    }



    public static void activatedBioParameter() {
        if (!isBioParameterSelected()) {
            pressBioParameterCheckbox();
        }
    }

    public static void deactivateBioParameter() {
        boolean isChecked = driver.findElement(By.id("bioParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("bioParameter")).click();

        }

    }


    public static void activateBioParameterANDActivateBioFinding() throws InterruptedException {
        if (!isBioParameterSelected()) {
            System.out.println("BIO Report: "+ !isBioParameterSelected());
            activatedBioParameter();
            Thread.sleep(2000);
            if (!isBioFindingSelected()) {
                System.out.println("BIO Report Finding : "+ isBioFindingSelected());
                Thread.sleep(2000);
                pressBioFindingCheckbox();
            }
        } else if (!isBioFindingSelected()) {
            System.out.println("BIO Report Finding: "+ isBioFindingSelected());
            pressBioFindingCheckbox();
        }
    }

    public static void activateBioParameterANDActivateBioCriticalFinding() throws InterruptedException {
        if (!isBioParameterSelected()) {
            System.out.println("BIO Report: "+ !isBioParameterSelected());
            activatedBioParameter();
            Thread.sleep(2000);
            if (!isBioCriticalFindingSelected()) {
                System.out.println("BIO Report Critical Finding: "+ isBioCriticalFindingSelected());
                Thread.sleep(2000);
                pressBioCriticalFindingCheckbox();
            }
        } else if (!isBioCriticalFindingSelected()) {
            System.out.println("BIO Report Critical Finding: "+ isBioCriticalFindingSelected());
            pressBioCriticalFindingCheckbox();
        }
    }


    public static void activateBioParameterANDActivateBioFindingANDActivateBioCriticalFinding() throws InterruptedException {
        if (!isBioParameterSelected()) {
            System.out.println("BIO Report: "+ !isBioParameterSelected());
            activatedBioParameter();
            Thread.sleep(2000);
            if (!isBioFindingSelected() && !isBioCriticalFindingSelected()) {
                System.out.println("BIO Report Finding and BIO Report Critical Finding: "+ isBioFindingSelected() + isBioCriticalFindingSelected());
                Thread.sleep(2000);
                pressBioFindingCheckbox();
                pressBioCriticalFindingCheckbox();
            }
        } else if (!isBioFindingSelected() || !isBioCriticalFindingSelected()) {
            System.out.println("BIO Report Finding and BIO Report Critical Finding: "+ isBioFindingSelected() + isBioCriticalFindingSelected());
            pressBioFindingCheckbox();
            pressBioCriticalFindingCheckbox();
        }
    }

    public static void deactivateBioParameterANDActivatedBioFindingANDActivateBioCriticalFinding() {

    }





}
