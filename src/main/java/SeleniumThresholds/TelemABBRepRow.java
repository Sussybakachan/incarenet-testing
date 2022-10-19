package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;

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



    public static void activatedAbbParameter() {
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


    public static void activateAbbParameterANDActivateAbbFinding() throws InterruptedException {
        if (!isAbbParameterSelected()) {
            System.out.println("ABB Report: "+ !isAbbParameterSelected());
            activatedAbbParameter();
            Thread.sleep(2000);
            if (!isAbbFindingSelected()) {
                System.out.println("ABB Report Finding : "+ isAbbFindingSelected());
                Thread.sleep(2000);
                pressAbbFindingCheckbox();
            }
        } else if (!isAbbFindingSelected()) {
            System.out.println("ABB Report Finding: "+ isAbbFindingSelected());
            pressAbbFindingCheckbox();
        }
    }

    public static void activateAbbParameterANDActivateAbbCriticalFinding() throws InterruptedException {
        if (!isAbbParameterSelected()) {
            System.out.println("ABB Report: "+ !isAbbParameterSelected());
            activatedAbbParameter();
            Thread.sleep(2000);
            if (!isAbbCriticalFindingSelected()) {
                System.out.println("ABB Report Critical Finding: "+ isAbbCriticalFindingSelected());
                Thread.sleep(2000);
                pressAbbCriticalFindingCheckbox();
            }
        } else if (!isAbbCriticalFindingSelected()) {
            System.out.println("ABB Report Critical Finding: "+ isAbbCriticalFindingSelected());
            pressAbbCriticalFindingCheckbox();
        }
    }


    public static void activateAbbParameterANDActivateAbbFindingANDActivateAbbCriticalFinding() throws InterruptedException {
        if (!isAbbParameterSelected()) {
            System.out.println("ABB Report: "+ !isAbbParameterSelected());
            activatedAbbParameter();
            Thread.sleep(2000);
            if (!isAbbFindingSelected() && !isAbbCriticalFindingSelected()) {
                System.out.println("ABB Report Finding and ABB Report Critical Finding: "+ isAbbFindingSelected() + isAbbCriticalFindingSelected());
                Thread.sleep(2000);
                pressAbbFindingCheckbox();
                pressAbbCriticalFindingCheckbox();
            }
        } else if (!isAbbFindingSelected() || !isAbbCriticalFindingSelected()) {
            System.out.println("ABB Report Finding and ABB Report Critical Finding: "+ isAbbFindingSelected() + isAbbCriticalFindingSelected());
            pressAbbFindingCheckbox();
            pressAbbCriticalFindingCheckbox();
        }
    }

    public static void deactivateAbbParameterANDActivatedAbbFindingANDActivateAbbCriticalFinding() {

    }





}
