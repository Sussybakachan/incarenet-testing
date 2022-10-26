package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;




//activateAll=activateCrtFindingANDActivateCrtCriticalFindingANDActivateCrtParameter
//findingParamActivated=activateCrtFindingANDDeactivateCrtCriticalFindingANDActivateCrtParameter
//criticalParamActivated=activateCrtCriticalFindingANDDeactivateCrtFindingANDActivateCrtParameter


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

    static void pressCrtFindingCheckbox() throws InterruptedException {
        driver.findElement(By.id("crtFinding")).click();
        if (isCrtFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterA-params-valueA\"]")).sendKeys("97");
        }
        Thread.sleep(2000);
    }

    static void pressCrtCriticalFindingCheckbox() throws InterruptedException {
        driver.findElement(By.id("crtCriticalFinding")).click();
        if (isCrtCriticalFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterA-params-valueB\"]")).sendKeys("90");
        }
        Thread.sleep(2000);
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

    public static void activateAll() throws InterruptedException {
        if (!isCrtParameterSelected()) {
            System.out.println("CRT-Pacing: "+ !isCrtParameterSelected());
            activatedCrtParameter();
            Thread.sleep(2000);
            if (!isCrtFindingSelected() && !isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ !isCrtFindingSelected() + " " + !isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                pressCrtFindingCheckbox();
                pressCrtCriticalFindingCheckbox();
            } else if (!isCrtFindingSelected() || !isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ !isCrtFindingSelected() + " " + !isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                if (!isCrtFindingSelected()){
                    pressCrtFindingCheckbox();
                } else {
                    pressCrtCriticalFindingCheckbox();
                }
            }
        } else if (!isCrtFindingSelected()) {
            System.out.println("CRT-Pacing Finding : "+ isCrtFindingSelected() + " " +isCrtCriticalFindingSelected());
            pressCrtFindingCheckbox();

        } else if (!isCrtCriticalFindingSelected()) {
            System.out.println("CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + " " + isCrtCriticalFindingSelected());
            pressCrtCriticalFindingCheckbox();
        }
    }

    public static void criticalParamActivated() throws InterruptedException {
        if (!isCrtParameterSelected()) {
            System.out.println("CRT-Pacing: "+ !isCrtParameterSelected());
            activatedCrtParameter();
            Thread.sleep(2000);
            if (!isCrtCriticalFindingSelected() && !isCrtFindingSelected() ) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                pressCrtCriticalFindingCheckbox();
            } else if (isCrtFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                pressCrtFindingCheckbox();
            }
        } else if (!isCrtCriticalFindingSelected() && !isCrtFindingSelected()) {
            System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
            pressCrtCriticalFindingCheckbox();
        } else if (!isCrtCriticalFindingSelected() || isCrtFindingSelected()) {
            System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
            if (!isCrtCriticalFindingSelected()){
                pressCrtCriticalFindingCheckbox();
            }
            pressCrtFindingCheckbox();
        }
    }

    public static void findingParamActivated() throws InterruptedException {
        if (!isCrtParameterSelected()) {
            System.out.println("CRT-Pacing: " + !isCrtParameterSelected());
            activatedCrtParameter();
            Thread.sleep(2000);
            if (!isCrtFindingSelected() && !isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: " + isCrtFindingSelected() + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                pressCrtFindingCheckbox();
            } else if (isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: " + isCrtFindingSelected() + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                pressCrtCriticalFindingCheckbox();
            }
        }else if (!isCrtFindingSelected() && !isCrtCriticalFindingSelected()) {
            System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
            pressCrtFindingCheckbox();
        } else if (!isCrtFindingSelected() || isCrtCriticalFindingSelected()) {
            System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
            if (!isCrtCriticalFindingSelected()){
                pressCrtFindingCheckbox();
            }
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
