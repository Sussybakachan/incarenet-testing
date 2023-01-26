package MedtronicTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MedtronicExpectedTasksTestCase10 {

    public MedtronicExpectedTasksTestCase10(){
        createMedtronicWhiteGeneralAlarmTask();
    }
    public static List<Task> MedtronicTestCase10List = new ArrayList<>();
    static Task MedtronicWhiteGeneralAlarmTask = new Task();

    public static List<Task> createMedtronicWhiteGeneralAlarmTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicWhiteGeneralAlarmTask.setCheckBox("");
        MedtronicWhiteGeneralAlarmTask.setColor("normal");
        MedtronicWhiteGeneralAlarmTask.setStartDate("2021-06-03T09:56:54.000Z");
        MedtronicWhiteGeneralAlarmTask.setTaskDescription("CRT-Stimulation: 98.07%\n" +
                "LV-Stimulation: 98.07%\n" +
                "Batteriestatus: OK");
        MedtronicWhiteGeneralAlarmTask.setMeasurements("Bitte auswählen");
        MedtronicWhiteGeneralAlarmTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicWhiteGeneralAlarmTask.setEmployee("");
        MedtronicWhiteGeneralAlarmTask.setFurtherInformation("");
        MedtronicWhiteGeneralAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase10List.add(MedtronicWhiteGeneralAlarmTask);
        return MedtronicTestCase10List;
    }
}
