package BostonTestCasesExpectedTasks;
import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BostonExpectedTasksTestCase5 {
    public static List<Task> BostonTestCase5List = new ArrayList<>();
    static Task BostonYellowLVTask = new Task();
    static Task BostonLv85AlarmTask = new Task();

    public BostonExpectedTasksTestCase5() {
        createBostonYellowLVTask();
        createBostonYellowLV85AlarmTask();
    }

    public static List<Task> createBostonYellowLVTask() {

        BostonYellowLVTask.setCheckBox("");
        BostonYellowLVTask.setColor("warning");
        BostonYellowLVTask.setStartDate("2022-03-22T10:27:00.000Z");
        BostonYellowLVTask.setTaskDescription("LV-Stimulation: 85%");
        BostonYellowLVTask.setMeasurements("Bitte auswählen");
        BostonYellowLVTask.setPdf("RVAT-483 - EreignisdetailberichtATR-3347 - EreignisdetailberichtKombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonYellowLVTask.setEmployee("");
        BostonYellowLVTask.setFurtherInformation("");
        BostonYellowLVTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase5List.add(BostonYellowLVTask);
        return BostonTestCase5List;
    }

    public static List<Task> createBostonYellowLV85AlarmTask() {

        BostonLv85AlarmTask.setCheckBox("");
        BostonLv85AlarmTask.setColor("warning");
        BostonLv85AlarmTask.setStartDate("2022-03-22T10:27:00.000Z");
        BostonLv85AlarmTask.setTaskDescription("TM-Ereignis:\n" +
                "AF Burden von mindestens 24,0 Stunden in einem 24\n" +
                "\n" +
                "Episode(n) im Bericht:\n" +
                "APMRT, ATR\n" +
                "\n" +
                "LV-Stimulation: 85%\n" +
                "Batteriestatus: BOS");
        BostonLv85AlarmTask.setMeasurements("Bitte auswählen");
        BostonLv85AlarmTask.setPdf("RVAT-483 - EreignisdetailberichtATR-3347 - EreignisdetailberichtKombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonLv85AlarmTask.setEmployee("");
        BostonLv85AlarmTask.setFurtherInformation("");
        BostonLv85AlarmTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase5List.add(BostonLv85AlarmTask);
        return BostonTestCase5List;
    }
}
