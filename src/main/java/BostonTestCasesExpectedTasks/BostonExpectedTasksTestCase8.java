package BostonTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BostonExpectedTasksTestCase8 {

    static Task BostonRedLVTask = new Task();

    static Task BostonYellowLVTask = new Task();

    static Task BostonEriTask = new Task();

    static Task BostonEosTask = new Task();

    static Task BostonLv70AlarmTask = new Task();

    static Task BostonLv85AlarmTask = new Task();

    static Task BostonEosAlarmTask = new Task();

    static Task BostonEriAlarmTask = new Task();

    public static List<Task> BostonTestCase8List = new ArrayList<>();


    public BostonExpectedTasksTestCase8() {
        createBostonRedLVTask();
        createBostonYellowLVTask();
        createBostonEriTask();
        createBostonEosTask();
        createBostonRedLv70AlarmTask();
        createBostonYellowLV85AlarmTask();
        createBostonEriAlarmTask();
        createBostonEosAlarmTask();
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

        BostonTestCase8List.add(BostonRedLVTask);
        return BostonTestCase8List;
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

        BostonTestCase8List.add(BostonYellowLVTask);
        return BostonTestCase8List;
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

        BostonTestCase8List.add(BostonEriTask);
        return BostonTestCase8List;
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

        BostonTestCase8List.add(BostonEosTask);
        return BostonTestCase8List;
    }

    //alarm tasks
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

        BostonTestCase8List.add(BostonLv70AlarmTask);
        return BostonTestCase8List;
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

        BostonTestCase8List.add(BostonLv85AlarmTask);
        return BostonTestCase8List;
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

        BostonTestCase8List.add(BostonEriAlarmTask);
        return BostonTestCase8List;
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

        BostonTestCase8List.add(BostonEosAlarmTask);
        return BostonTestCase8List;
    }
}
