package MedtronicTestCasesExpertedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MedtronicExpectedTasksTestCase8 {
    public static List<Task> MedtronicTestCase8List = new ArrayList<>();
    static Task MedtronicYellow98LvTask = new Task();
    static Task MedtronicYellow98CRTTask = new Task();

    public MedtronicExpectedTasksTestCase8() {
        createMedtronicYellow98LvTask();
        createMedtronicYellow98CrtTask();
    }

    public static List<Task> createMedtronicYellow98CrtTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicYellow98CRTTask.setCheckBox("");
        MedtronicYellow98CRTTask.setColor("warning");
        MedtronicYellow98CRTTask.setStartDate("2021-06-03T09:56:54.000Z");
        MedtronicYellow98CRTTask.setTaskDescription("CRT-Stimulation: 98.07%");
        MedtronicYellow98CRTTask.setMeasurements("Bitte auswählen");
        MedtronicYellow98CRTTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicYellow98CRTTask.setEmployee("");
        MedtronicYellow98CRTTask.setFurtherInformation("");
        MedtronicYellow98CRTTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase8List.add(MedtronicYellow98CRTTask);
        return MedtronicTestCase8List;
    }

    public static List<Task> createMedtronicYellow98LvTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicYellow98LvTask.setCheckBox("");
        MedtronicYellow98LvTask.setColor("warning");
        MedtronicYellow98LvTask.setStartDate("2021-06-03T09:56:54.000Z");
        MedtronicYellow98LvTask.setTaskDescription("LV-Stimulation: 98.07%");
        MedtronicYellow98LvTask.setMeasurements("Bitte auswählen");
        MedtronicYellow98LvTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicYellow98LvTask.setEmployee("");
        MedtronicYellow98LvTask.setFurtherInformation("");
        MedtronicYellow98LvTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase8List.add(MedtronicYellow98LvTask);
        return MedtronicTestCase8List;
    }
}
