package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;

public class LVRow {
    //is selected
    static boolean isLvParameterSelected() {
        return driver.findElement(By.id("lvParameter")).isSelected();

    }

    static boolean isLvFindingSelected() {
        return driver.findElement(By.id("lvFinding")).isSelected();
    }

    static boolean isLvCriticalFindingSelected() {
        return driver.findElement(By.id("lvCriticalFinding")).isSelected();
    }

    static void pressLvParameterCheckbox() {
        driver.findElement(By.id("lvParameter")).click();
    }

    static void pressLvFindingCheckbox() {
        driver.findElement(By.id("lvFinding")).click();
    }

    static void pressLvCriticalFindingCheckbox() {
        driver.findElement(By.id("lvCriticalFinding")).click();
    }



    public static void activatedLvParameter() {
        if (!isLvParameterSelected()) {
            pressLvParameterCheckbox();
        }
    }

    public static void deactivateLvParameter() {
        boolean isChecked = driver.findElement(By.id("lvParameter")).isSelected();
        //batterieStatusStatus = isChecked;
        if (isChecked) {
            driver.findElement(By.id("lvParameter")).click();

        }

    }


    public static void activateLvParameterANDActivateLvFinding() throws InterruptedException {
        if (!isLvParameterSelected()) {
            System.out.println("LV-Pacing: "+ !isLvParameterSelected());
            activatedLvParameter();
            Thread.sleep(2000);
            if (!isLvFindingSelected()) {
                System.out.println("LV-Pacing Finding : "+ isLvFindingSelected());
                Thread.sleep(2000);
                pressLvFindingCheckbox();
            }
        } else if (!isLvFindingSelected()) {
            System.out.println("LV-Pacing Finding: "+ isLvFindingSelected());
            pressLvFindingCheckbox();
        }
    }

    public static void activateLvParameterANDActivateLvCriticalFinding() throws InterruptedException {
        if (!isLvParameterSelected()) {
            System.out.println("LV-Pacing: "+ !isLvParameterSelected());
            activatedLvParameter();
            Thread.sleep(2000);
            if (!isLvCriticalFindingSelected()) {
                System.out.println("LV-Pacing Critical Finding: "+ isLvCriticalFindingSelected());
                Thread.sleep(2000);
                pressLvCriticalFindingCheckbox();
            }
        } else if (!isLvCriticalFindingSelected()) {
            System.out.println("LV-Pacing Critical Finding: "+ isLvCriticalFindingSelected());
            pressLvCriticalFindingCheckbox();
        }
    }


    public static void activateLvParameterANDActivateLvFindingANDActivateLvCriticalFinding() throws InterruptedException {
        if (!isLvParameterSelected()) {
            System.out.println("LV-Pacing: "+ !isLvParameterSelected());
            activatedLvParameter();
            Thread.sleep(2000);
            if (!isLvFindingSelected() && !isLvCriticalFindingSelected()) {
                System.out.println("LV-Pacing Finding and LV-Pacing Critical Finding: "+ isLvFindingSelected() + isLvCriticalFindingSelected());
                Thread.sleep(2000);
                pressLvFindingCheckbox();
                pressLvCriticalFindingCheckbox();
            }
        } else if (!isLvFindingSelected() || !isLvCriticalFindingSelected()) {
            System.out.println("LV-Pacing Finding and LV-Pacing Critical Finding: "+ isLvFindingSelected() + isLvCriticalFindingSelected());
            pressLvFindingCheckbox();
            pressLvCriticalFindingCheckbox();
        }
    }

    public static void deactivateLvParameterANDActivatedLvFindingANDActivateLvCriticalFinding() {

    }





}
