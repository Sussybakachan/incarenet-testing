package BostonTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BostonExpectedTasksTestCase10 {
    public static List<Task> BostonTestCase10List = new ArrayList<>();
    static Task BostonLv70AlarmTask = new Task();
    static Task BostonLv85AlarmTask = new Task();
    static Task BostonEosAlarmTask = new Task();
    static Task BostonEriAlarmTask = new Task();

    public static List<Task> createBostonRedLv70AlarmTask() {

        BostonLv70AlarmTask.setCheckBox("");
        BostonLv70AlarmTask.setColor("warning");
        BostonLv70AlarmTask.setStartDate("2022-03-22T10:27:00.000Z");
        BostonLv70AlarmTask.setTaskDescription("TM-Ereignis:\n" +
                "AF Burden von mindestens 24,0 Stunden in einem 24\n" +
                "\n" +
                "Episode(n) im Bericht:\n" +
                "APMRT, ATR\n" +
                "\n" +
                "LV-Stimulation: 70%\n" +
                "Batteriestatus: BOS");
        BostonLv70AlarmTask.setMeasurements("Bitte auswählen");
        BostonLv70AlarmTask.setPdf("RVAT-483 - EreignisdetailberichtATR-3347 - EreignisdetailberichtKombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonLv70AlarmTask.setEmployee("");
        BostonLv70AlarmTask.setFurtherInformation("");
        BostonLv70AlarmTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase10List.add(BostonLv70AlarmTask);
        return BostonTestCase10List;
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

        BostonTestCase10List.add(BostonLv85AlarmTask);
        return BostonTestCase10List;
    }

    public static List<Task> createBostonEriAlarmTask() {

        BostonEriAlarmTask.setCheckBox("");
        BostonEriAlarmTask.setColor("warning");
        BostonEriAlarmTask.setStartDate("2022-03-22T10:27:00.000Z");
        BostonEriAlarmTask.setTaskDescription("TM-Ereignis:\n" +
                "AF Burden von mindestens 24,0 Stunden in einem 24\n" +
                "\n" +
                "Episode(n) im Bericht:\n" +
                "APMRT, ATR\n" +
                "\n" +
                "LV-Stimulation: 100%\n" +
                "Batteriestatus: ERI");
        BostonEriAlarmTask.setMeasurements("Bitte auswählen");
        BostonEriAlarmTask.setPdf("RVAT-483 - EreignisdetailberichtATR-3347 - EreignisdetailberichtKombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonEriAlarmTask.setEmployee("");
        BostonEriAlarmTask.setFurtherInformation("");
        BostonEriAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase10List.add(BostonEriAlarmTask);
        return BostonTestCase10List;
    }

    public static List<Task> createBostonEosAlarmTask() {

        BostonEosAlarmTask.setCheckBox("");
        BostonEosAlarmTask.setColor("warning");
        BostonEosAlarmTask.setStartDate("2022-03-22T10:27:00.000Z");
        BostonEosAlarmTask.setTaskDescription("TM-Ereignis:\n" +
                "AF Burden von mindestens 24,0 Stunden in einem 24\n" +
                "\n" +
                "Episode(n) im Bericht:\n" +
                "APMRT, ATR\n" +
                "\n" +
                "LV-Stimulation: 100%\n" +
                "Batteriestatus: EOS");
        BostonEosAlarmTask.setMeasurements("Bitte auswählen");
        BostonEosAlarmTask.setPdf("RVAT-483 - EreignisdetailberichtATR-3347 - EreignisdetailberichtKombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonEosAlarmTask.setEmployee("");
        BostonEosAlarmTask.setFurtherInformation("");
        BostonEosAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase10List.add(BostonEosAlarmTask);
        return BostonTestCase10List;
    }
}
