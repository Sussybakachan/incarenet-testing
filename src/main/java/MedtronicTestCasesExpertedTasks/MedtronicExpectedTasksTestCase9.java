package MedtronicTestCasesExpertedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MedtronicExpectedTasksTestCase9 {
    public static List<Task> MedtronicTestCase9List = new ArrayList<>();
    static Task MedtronicRedGeneralAlarmTask = new Task();

    public MedtronicExpectedTasksTestCase9() {
        createMedtronicRedGeneralAlarmTask();
    }

    public static List<Task> createMedtronicRedGeneralAlarmTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicRedGeneralAlarmTask.setCheckBox("");
        MedtronicRedGeneralAlarmTask.setColor("danger");
        MedtronicRedGeneralAlarmTask.setStartDate("2021-06-03T09:56:54.000Z");
        MedtronicRedGeneralAlarmTask.setTaskDescription("CRT-Stimulation: 98.07%\n" +
                "LV-Stimulation: 98.07%\n" +
                "Batteriestatus: OK");
        MedtronicRedGeneralAlarmTask.setMeasurements("Bitte auswählen");
        MedtronicRedGeneralAlarmTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicRedGeneralAlarmTask.setEmployee("");
        MedtronicRedGeneralAlarmTask.setFurtherInformation("");
        MedtronicRedGeneralAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase9List.add(MedtronicRedGeneralAlarmTask);
        return MedtronicTestCase9List;
    }
}
