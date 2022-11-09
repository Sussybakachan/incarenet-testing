package BostonTestCasesExpertedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BostonExpectedTasksTestCase3 {
    static Task BostonRedLVTask = new Task();

    static Task BostonYellowLVTask = new Task();

    static Task BostonEriTask = new Task();

    static Task BostonEosTask = new Task();

    public static List<Task> BostonTestCase3List = new ArrayList<>();


    public BostonExpectedTasksTestCase3() {
        createBostonRedLVTask();
        createBostonYellowLVTask();
        createBostonEriTask();
        createBostonEosTask();

    }
    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference

    public static List<Task> createBostonRedLVTask() {

        BostonRedLVTask.setCheckBox("");
        BostonRedLVTask.setColor("danger");
        BostonRedLVTask.setStartDate("2022-03-27T23:24:00.000Z");
        BostonRedLVTask.setTaskDescription("LV-Stimulation: 78%");
        BostonRedLVTask.setMeasurements("Bitte auswählen");
        BostonRedLVTask.setPdf("Kombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonRedLVTask.setEmployee("");
        BostonRedLVTask.setFurtherInformation("");
        BostonRedLVTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase3List.add(BostonRedLVTask);
        return BostonTestCase3List;
    }
    public static List<Task> createBostonYellowLVTask() {

        BostonYellowLVTask.setCheckBox("");
        BostonYellowLVTask.setColor("warning");
        BostonYellowLVTask.setStartDate("2022-03-27T23:24:00.000Z");
        BostonYellowLVTask.setTaskDescription("LV-Stimulation: 85%");
        BostonYellowLVTask.setMeasurements("Bitte auswählen");
        BostonYellowLVTask.setPdf("Kombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonYellowLVTask.setEmployee("");
        BostonYellowLVTask.setFurtherInformation("");
        BostonYellowLVTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase3List.add(BostonYellowLVTask);
        return BostonTestCase3List;
    }
    public static List<Task> createBostonEriTask() {

        BostonEriTask.setCheckBox("");
        BostonEriTask.setColor("danger");
        BostonEriTask.setStartDate("2022-03-27T23:24:00.000Z");
        BostonEriTask.setTaskDescription("Batteriestatus: ERI");
        BostonEriTask.setMeasurements("Bitte auswählen");
        BostonEriTask.setPdf("Kombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonEriTask.setEmployee("");
        BostonEriTask.setFurtherInformation("");
        BostonEriTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase3List.add(BostonEriTask);
        return BostonTestCase3List;
    }
    public static List<Task> createBostonEosTask() {

        BostonEosTask.setCheckBox("");
        BostonEosTask.setColor("danger");
        BostonEosTask.setStartDate("2022-03-27T23:24:00.000Z");
        BostonEosTask.setTaskDescription("Batteriestatus: EOS");
        BostonEosTask.setMeasurements("Bitte auswählen");
        BostonEosTask.setPdf("Kombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonEosTask.setEmployee("");
        BostonEosTask.setFurtherInformation("");
        BostonEosTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase3List.add(BostonEosTask);
        return BostonTestCase3List;
    }
}
