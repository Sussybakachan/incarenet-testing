package SeleniumThresholds;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static selenium.CompareTasksInCardio.driver;




//activateAll = activateCrtFindingANDActivateCrtCriticalFindingANDActivateCrtParameter
//findingParamActivated = activateCrtFindingANDDeactivateCrtCriticalFindingANDActivateCrtParameter
//criticalParamActivated = activateCrtCriticalFindingANDDeactivateCrtFindingANDActivateCrtParameter
//onlyParamActivated = activateCrtParameterANDDeactivateCrtFindingANDDeactivateCrtCriticalFinding
//onlyFindingCriticalActivated = deactivateCrtParameterANDActivatedCrtFindingANDActivateCrtCriticalFinding
//onlyFindingActivated = activatedCrtFindingANDDeactivateCrtParameterANDDeactivateCrtCriticalFinding
//onlyCriticalActivated = activateCrtCriticalFindingANDDeactivateCrtParameterANDDeactivatedCrtFinding


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
        Thread.sleep(2000);
        if (isCrtFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterA-params-valueA\"]")).sendKeys("97");
        }
    }

    static void pressCrtCriticalFindingCheckbox() throws InterruptedException {
        driver.findElement(By.id("crtCriticalFinding")).click();
        Thread.sleep(2000);
        if (isCrtCriticalFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterA-params-valueB\"]")).sendKeys("90");
        }
    }

    public static void activateCrtParameter() {
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
            activateCrtParameter();
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
        } else if (!isCrtFindingSelected() || !isCrtCriticalFindingSelected()) {
            System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ !isCrtFindingSelected() + " " + !isCrtCriticalFindingSelected());
            Thread.sleep(2000);
            if (!isCrtFindingSelected()){
                pressCrtFindingCheckbox();
            } else {
                pressCrtCriticalFindingCheckbox();
            }
        }
    }

    public static void criticalParamActivated() throws InterruptedException {
        if (!isCrtParameterSelected()) {
            System.out.println("CRT-Pacing: "+ !isCrtParameterSelected());
            activateCrtParameter();
            Thread.sleep(2000);
            if (!isCrtCriticalFindingSelected() && !isCrtFindingSelected() ) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                pressCrtCriticalFindingCheckbox();
            } else if (isCrtFindingSelected() || !isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                if (isCrtFindingSelected()){
                    pressCrtFindingCheckbox();
                }
                pressCrtCriticalFindingCheckbox();
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
            activateCrtParameter();
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

    public static void onlyParamActivated() throws InterruptedException {
        if (isCrtParameterSelected()) {
            System.out.println("CRT-Pacing: "+ !isCrtParameterSelected());
            if (isCrtFindingSelected() && isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + " " + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                pressCrtFindingCheckbox();
                pressCrtCriticalFindingCheckbox();
            } else if (isCrtFindingSelected() || isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + " " + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                if (isCrtFindingSelected()){
                    pressCrtFindingCheckbox();
                } else {
                    pressCrtCriticalFindingCheckbox();
                }
            }
        } else {
            System.out.println("CRT-Pacing: "+ !isCrtParameterSelected());
            activateCrtParameter();
            Thread.sleep(2000);
            if (isCrtFindingSelected() && isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + " " + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                pressCrtFindingCheckbox();
                pressCrtCriticalFindingCheckbox();
            } else if (isCrtFindingSelected() || isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + " " + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                if (isCrtFindingSelected()){
                    pressCrtFindingCheckbox();
                } else {
                    pressCrtCriticalFindingCheckbox();
                }
            }
        }
    }

    public static void onlyFindingCriticalActivated() throws InterruptedException {
        onlyParamActivated();
        Thread.sleep(4000);
        pressCrtFindingCheckbox();
        Thread.sleep(2000);
        pressCrtCriticalFindingCheckbox();
        Thread.sleep(2000);
        deactivateCrtParameter();
        Thread.sleep(2000);






        /*if (!isCrtParameterSelected()) {
            System.out.println("CRT-Pacing: "+ !isCrtParameterSelected());
            activateCrtParameter();
            if (!isCrtFindingSelected() && !isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + " " + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                pressCrtFindingCheckbox();
                pressCrtCriticalFindingCheckbox();
            } else if (!isCrtFindingSelected() || !isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + " " + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                if (!isCrtFindingSelected()){
                    pressCrtFindingCheckbox();
                } else {
                    pressCrtCriticalFindingCheckbox();
                }
            }
            deactivateCrtParameter();
            Thread.sleep(2000);
        } else {
            System.out.println("CRT-Pacing Parameter: "+ isCrtParameterSelected());
            Thread.sleep(2000);
            if (!isCrtFindingSelected() && !isCrtCriticalFindingSelected()) {
                pressCrtFindingCheckbox();
                pressCrtCriticalFindingCheckbox();
            } else if (!isCrtFindingSelected() || !isCrtCriticalFindingSelected()) {
                System.out.println("CRT-Pacing Finding and CRT-Pacing Critical Finding: "+ isCrtFindingSelected() + " " + isCrtCriticalFindingSelected());
                Thread.sleep(2000);
                if (!isCrtFindingSelected()){
                    pressCrtFindingCheckbox();
                } else {
                    pressCrtCriticalFindingCheckbox();
                }
            }
            deactivateCrtParameter();
            Thread.sleep(2000);
        }
*/    }


    public static void onlyFindingActivated() throws InterruptedException {
        findingParamActivated();
        Thread.sleep(2000);
        deactivateCrtParameter();
        Thread.sleep(2000);

    }

    public static void onlyCriticalActivated() throws InterruptedException {
        criticalParamActivated();
        Thread.sleep(2000);
        deactivateCrtParameter();
        Thread.sleep(2000);
    }


}
