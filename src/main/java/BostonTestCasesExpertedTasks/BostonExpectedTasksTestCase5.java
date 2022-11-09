package BostonTestCasesExpertedTasks;
import selenium.Task;

import java.util.ArrayList;
import java.util.List;
public class BostonExpectedTasksTestCase5 {
    static Task BostonYellowLVTask = new Task();

    public static List<Task> BostonTestCase5List = new ArrayList<>();

    public BostonExpectedTasksTestCase5() {
        createBostonYellowLVTask();
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

        BostonTestCase5List.add(BostonYellowLVTask);
        return BostonTestCase5List;
    }

}
