package SeleniumThresholds;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static selenium.CompareTasksInCardio.driver;

//activateAllCrt = activateCrtFindingANDActivateCrtCriticalFindingANDActivateCrtParameter
//findingParamActivatedCrt = activateCrtFindingANDDeactivateCrtCriticalFindingANDActivateCrtParameter
//criticalParamActivatedCrt = activateCrtCriticalFindingANDDeactivateCrtFindingANDActivateCrtParameter
//onlyParamActivatedCrt = activateCrtParameterANDDeactivateCrtFindingANDDeactivateCrtCriticalFinding
//onlyFindingCriticalActivatedCrt = deactivateCrtParameterANDActivateCrtFindingANDActivateCrtCriticalFinding
//onlyFindingActivatedCrt = activateCrtFindingANDDeactivateCrtParameterANDDeactivateCrtCriticalFinding
//onlyCriticalActivatedCrt = activateCrtCriticalFindingANDDeactivateCrtParameterANDDeactivateCrtFinding


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
        if (isCrtFindingSelected()) {
            driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterA-params-valueA\"]")).sendKeys("97");
        }
    }

    static void pressCrtCriticalFindingCheckbox() {
        driver.findElement(By.id("crtCriticalFinding")).click();
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
        if (isChecked) {
            driver.findElement(By.id("crtParameter")).click();

        }

    }

    public static void activateCrtFinding() {
        if (!isCrtFindingSelected()) {
            pressCrtFindingCheckbox();
        }
    }

    public static void deactivateCrtFinding() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("crtFinding")).isSelected();
        if (isChecked) {
            WebElement checked = driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterA-params-valueA\"]"));
            Actions a = new Actions(driver);
            a.moveToElement(checked).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
            Thread.sleep(2000);
            driver.findElement(By.id("crtFinding")).click();

        }

    }

    public static void activateCrtCritical() {
        if (!isCrtCriticalFindingSelected()) {
            pressCrtCriticalFindingCheckbox();
        }
    }

    public static void deactivateCrtCritical() throws InterruptedException {
        boolean isChecked = driver.findElement(By.id("crtCriticalFinding")).isSelected();
        if (isChecked) {
            WebElement checked = driver.findElement(By.xpath("//*[@id=\"[object Object]-parameterA-params-valueB\"]"));
            Actions a = new Actions(driver);
            a.moveToElement(checked).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
            Thread.sleep(2000);
            driver.findElement(By.id("crtCriticalFinding")).click();

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

    public static void onlyParamActivated() throws InterruptedException {
        activateCrtParameter();
        Thread.sleep(2000);
    }

    public static void findingParamActivated() throws InterruptedException {
        onlyParamActivated();
        Thread.sleep(1000);
        activateCrtFinding();
        Thread.sleep(2000);
    }

    public static void criticalParamActivated() throws InterruptedException {
        onlyParamActivated();
        Thread.sleep(1000);
        activateCrtCritical();
        Thread.sleep(2000);
    }

    public static void onlyFindingCriticalActivated() throws InterruptedException {
        onlyParamActivated();
        Thread.sleep(1000);
        activateCrtFinding();
        Thread.sleep(1000);
        activateCrtCritical();
        Thread.sleep(1000);
        deactivateCrtParameter();
        Thread.sleep(2000);
    }

    public static void onlyFindingActivated() throws InterruptedException {
        findingParamActivated();
        Thread.sleep(1000);
        deactivateCrtParameter();
        Thread.sleep(2000);

    }

    public static void onlyCriticalActivated() throws InterruptedException {
        criticalParamActivated();
        Thread.sleep(1000);
        deactivateCrtParameter();
        Thread.sleep(2000);
    }

    public static void deactivateAllCRT() throws InterruptedException {
        deactivateCrtFinding();
        Thread.sleep(1000);
        deactivateCrtCritical();
        Thread.sleep(1000);
        deactivateCrtParameter();
        Thread.sleep(2000);
    }

}
