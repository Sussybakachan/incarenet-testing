package BostonTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BostonExpectedTasksTestCase1 {
    public static List<Task> BostonTestCase1List = new ArrayList<>();
    //TestCase1
    static Task BostonWhiteTask = new Task();


    public BostonExpectedTasksTestCase1() {
        createBostonWhiteTask();
    }
    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference

    public static List<Task> createBostonWhiteTask() {

        BostonWhiteTask.setCheckBox("");
        BostonWhiteTask.setColor("normal");
        BostonWhiteTask.setStartDate("2022-03-27T23:24:00.000Z");
        BostonWhiteTask.setTaskDescription("Episode(n) im Bericht:\n" +
                "APMRT\n" +
                "\n" +
                "LV-Stimulation: 85%\n" +
                "Batteriestatus: BOS");
        BostonWhiteTask.setMeasurements("Bitte auswählen");
        BostonWhiteTask.setPdf("Kombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonWhiteTask.setEmployee("");
        BostonWhiteTask.setFurtherInformation("");
        BostonWhiteTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase1List.add(BostonWhiteTask);
        return BostonTestCase1List;
    }
}


