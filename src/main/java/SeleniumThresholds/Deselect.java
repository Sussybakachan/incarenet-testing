package SeleniumThresholds;

import static SeleniumThresholds.BatteryStatusRow.deactivateAllBattery;
import static SeleniumThresholds.CRTRow.deactivateAllCRT;
import static SeleniumThresholds.LVRow.deselectAllLv;
import static SeleniumThresholds.NoMeasurementsRow.deselectAllNM;
import static SeleniumThresholds.TelemABBRepRow.deselectAllAbb;
import static SeleniumThresholds.TelemBIORepRow.deselectAllBio;
import static SeleniumThresholds.TelemBSXRepRow.deselectAllBsx;
import static SeleniumThresholds.TelemMDTRepRow.deselectAllMdt;
import static SeleniumThresholds.TelemMicroportRepRow.deselectAllMicroport;


public class Deselect {
    //is selected

    public static void deselectAll() throws InterruptedException {
        deactivateAllBattery();
        deactivateAllCRT();
        deselectAllLv();
        deselectAllBio();
        deselectAllBsx();
        deselectAllMdt();
        deselectAllAbb();
        deselectAllMicroport();
        deselectAllNM();
    }


}
