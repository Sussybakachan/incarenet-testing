package BostonTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BostonExpectedTasksTestCase4 {

    public static List<Task> BostonTestCase4List = new ArrayList<>();
    static Task BostonRedLVTask = new Task();
    static Task BostonEriTask = new Task();
    static Task BostonEosTask = new Task();
    static Task BostonLv70AlarmTask = new Task();
    static Task BostonEosAlarmTask = new Task();
    static Task BostonEriAlarmTask = new Task();


    public BostonExpectedTasksTestCase4() {
        createBostonRedLVTask();
        createBostonEriTask();
        createBostonEosTask();
        createBostonEosAlarmTask();
        createBostonEriAlarmTask();
        createBostonRedLv70AlarmTask();
    }
    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference

    public static List<Task> createBostonRedLVTask() {

        BostonRedLVTask.setCheckBox("");
        BostonRedLVTask.setColor("danger");
        BostonRedLVTask.setStartDate("2022-03-22T10:27:00.000Z");
        BostonRedLVTask.setTaskDescription("LV-Stimulation: 70%");
        BostonRedLVTask.setMeasurements("Bitte auswählen");
        BostonRedLVTask.setPdf("RVAT-483 - EreignisdetailberichtATR-3347 - EreignisdetailberichtKombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonRedLVTask.setEmployee("");
        BostonRedLVTask.setFurtherInformation("");
        BostonRedLVTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase4List.add(BostonRedLVTask);
        return BostonTestCase4List;
    }

    public static List<Task> createBostonEriTask() {

        BostonEriTask.setCheckBox("");
        BostonEriTask.setColor("danger");
        BostonEriTask.setStartDate("2022-03-22T10:27:00.000Z");
        BostonEriTask.setTaskDescription("Batteriestatus: ERI");
        BostonEriTask.setMeasurements("Bitte auswählen");
        BostonEriTask.setPdf("RVAT-483 - EreignisdetailberichtATR-3347 - EreignisdetailberichtKombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonEriTask.setEmployee("");
        BostonEriTask.setFurtherInformation("");
        BostonEriTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase4List.add(BostonEriTask);
        return BostonTestCase4List;
    }

    public static List<Task> createBostonEosTask() {

        BostonEosTask.setCheckBox("");
        BostonEosTask.setColor("danger");
        BostonEosTask.setStartDate("2022-03-22T10:27:00.000Z");
        BostonEosTask.setTaskDescription("Batteriestatus: EOS");
        BostonEosTask.setMeasurements("Bitte auswählen");
        BostonEosTask.setPdf("RVAT-483 - EreignisdetailberichtATR-3347 - EreignisdetailberichtKombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonEosTask.setEmployee("");
        BostonEosTask.setFurtherInformation("");
        BostonEosTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase4List.add(BostonEosTask);
        return BostonTestCase4List;
    }
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

        BostonTestCase4List.add(BostonLv70AlarmTask);
        return BostonTestCase4List;
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

        BostonTestCase4List.add(BostonEriAlarmTask);
        return BostonTestCase4List;
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

        BostonTestCase4List.add(BostonEosAlarmTask);
        return BostonTestCase4List;
    }
}
