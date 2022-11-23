package BostonTestCasesExpertedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BostonExpectedTasksTestCase6 {

    public static List<Task> BostonTestCase6List = new ArrayList<>();
    static Task BostonRedTask = new Task();


    public BostonExpectedTasksTestCase6() {
        createBostonRedTask();
    }
    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference

    public static List<Task> createBostonRedTask() {

        BostonRedTask.setCheckBox("");
        BostonRedTask.setColor("danger");
        BostonRedTask.setStartDate("2022-03-27T23:24:00.000Z");
        BostonRedTask.setTaskDescription("Episode(n) im Bericht:\n" +
                "APMRT\n" +
                "\n" +
                "LV-Stimulation: 85%\n" +
                "Batteriestatus: BOS");
        BostonRedTask.setMeasurements("Bitte auswählen");
        BostonRedTask.setPdf("Kombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonRedTask.setEmployee("");
        BostonRedTask.setFurtherInformation("");
        BostonRedTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase6List.add(BostonRedTask);
        return BostonTestCase6List;
    }
}
