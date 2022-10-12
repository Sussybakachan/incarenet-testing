package SeleniumThresholds;

import org.openqa.selenium.By;

import static selenium.CompareTasksInCardio.driver;

public class CRTRow {
    //is selected
    static boolean isCrtParameterSelected() {
        return driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[1]/span/span[1]/input")).isSelected();
    }






    public static void activatedCrtParameter() {

    }
    public static void activatedCrtParameterANDactivatedCrtYellow() {

    }

    public static void activatedCrtParameterANDactivatedCrtRed() {

    }
    public static void activatedCrtParameterANDactivatedCrtYellowANDactivatedCrtRed() {

    }

    public static void deactivatedCrtParameterANDactivatedCrtYellowANDactivatedCrtRed() {

    }





}
