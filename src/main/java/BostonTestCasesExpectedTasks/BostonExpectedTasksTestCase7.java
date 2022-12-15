package BostonTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BostonExpectedTasksTestCase7 {


    public static List<Task> BostonTestCase7List = new ArrayList<>();
    static Task BostonYellowTask = new Task();


    public BostonExpectedTasksTestCase7() {
        createBostonRedTask();
    }
    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference

    public static List<Task> createBostonRedTask() {

        BostonYellowTask.setCheckBox("");
        BostonYellowTask.setColor("warning");
        BostonYellowTask.setStartDate("2022-03-27T23:24:00.000Z");
        BostonYellowTask.setTaskDescription("Episode(n) im Bericht:\n" +
                "APMRT\n" +
                "\n" +
                "LV-Stimulation: 85%\n" +
                "Batteriestatus: BOS");
        BostonYellowTask.setMeasurements("Bitte auswählen");
        BostonYellowTask.setPdf("Kombinierter Follow-up BerichtEingangs-EGM-BerichtBericht Herzinsuffizienz-ManagementBericht Arrhythmie-Logbuch");
        BostonYellowTask.setEmployee("");
        BostonYellowTask.setFurtherInformation("");
        BostonYellowTask.setAction("Aufgabe an PBA weiterleiten");

        BostonTestCase7List.add(BostonYellowTask);
        return BostonTestCase7List;
    }
}
