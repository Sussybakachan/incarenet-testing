package MedtronicTestCasesExpertedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MedtronicExpectedTasksTestCase1 {
    public static List<Task> MedtronicTestCase1List = new ArrayList<>();
    static Task MedtronicYellowGeneralAlarmTask = new Task();

    public MedtronicExpectedTasksTestCase1(){
        createMedtronicYellowGeneralAlarmTask();
    }

    public static List<Task> createMedtronicYellowGeneralAlarmTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicYellowGeneralAlarmTask.setCheckBox("");
        MedtronicYellowGeneralAlarmTask.setColor("warning");
        MedtronicYellowGeneralAlarmTask.setStartDate("2021-06-03T09:56:54.000Z");
        MedtronicYellowGeneralAlarmTask.setTaskDescription("CRT-Stimulation: 98.07%\n" +
                "LV-Stimulation: 98.07%\n" +
                "Batteriestatus: OK");
        MedtronicYellowGeneralAlarmTask.setMeasurements("Bitte auswählen");
        MedtronicYellowGeneralAlarmTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicYellowGeneralAlarmTask.setEmployee("");
        MedtronicYellowGeneralAlarmTask.setFurtherInformation("");
        MedtronicYellowGeneralAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase1List.add(MedtronicYellowGeneralAlarmTask);
        return MedtronicTestCase1List;
    }
}
