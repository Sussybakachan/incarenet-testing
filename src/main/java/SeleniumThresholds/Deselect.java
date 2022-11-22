package SeleniumThresholds;

import org.openqa.selenium.By;


import static SeleniumThresholds.BatteryStatusRow.*;
import static SeleniumThresholds.CRTRow.*;
import static SeleniumThresholds.LVRow.*;
import static SeleniumThresholds.NoMeasurementsRow.*;
import static SeleniumThresholds.TelemABBRepRow.*;
import static SeleniumThresholds.TelemBIORepRow.*;
import static SeleniumThresholds.TelemBSXRepRow.*;
import static SeleniumThresholds.TelemMDTRepRow.*;
import static SeleniumThresholds.TelemMicroportRepRow.*;



public class Deselect {
    //is selected

    public static void deselectAll() throws InterruptedException {
        deselectAllBattery();
        deselectAllCrt();
        deselectAllLv();
        deselectAllBio();
        deselectAllBsx();
        deselectAllMdt();
        deselectAllAbb();
        deselectAllMicroport();
        deselectAllNM();
    }



}
