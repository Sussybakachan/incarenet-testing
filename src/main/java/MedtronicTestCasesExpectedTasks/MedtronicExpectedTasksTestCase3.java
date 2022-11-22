package MedtronicTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MedtronicExpectedTasksTestCase3 {
    public static List<Task> MedtronicTestCase3List = new ArrayList<>();
    static Task MedtronicYellow76generalAlarmTask = new Task();
    static Task MedtronicYellow76LvTask = new Task();


    public MedtronicExpectedTasksTestCase3(){
        createMedtronicYellow76LvTask();
        createMedtronicYellow76generalAlarmTask();
    }

    public static List<Task> createMedtronicYellow76LvTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicYellow76LvTask.setCheckBox("");
        MedtronicYellow76LvTask.setColor("warning");
        MedtronicYellow76LvTask.setStartDate("2021-11-12T21:50:57.000Z");
        MedtronicYellow76LvTask.setTaskDescription("LV-Stimulation: 76.95%");
        MedtronicYellow76LvTask.setMeasurements("Bitte auswählen");
        MedtronicYellow76LvTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicYellow76LvTask.setEmployee("");
        MedtronicYellow76LvTask.setFurtherInformation("");
        MedtronicYellow76LvTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase3List.add(MedtronicYellow76LvTask);
        return MedtronicTestCase3List;
    }
    public static List<Task> createMedtronicYellow76generalAlarmTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicYellow76generalAlarmTask.setCheckBox("");
        MedtronicYellow76generalAlarmTask.setColor("warning");
        MedtronicYellow76generalAlarmTask.setStartDate("2021-11-12T21:50:57.000Z");
        MedtronicYellow76generalAlarmTask.setTaskDescription("Episode(n) im Bericht:\n" +
                "VT, Monitor\n" +
                "\n" +
                "CRT-Stimulation: 76.95%\n" +
                "LV-Stimulation: 76.95%\n" +
                "Batteriestatus: OK");
        MedtronicYellow76generalAlarmTask.setMeasurements("Bitte auswählen");
        MedtronicYellow76generalAlarmTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicYellow76generalAlarmTask.setEmployee("");
        MedtronicYellow76generalAlarmTask.setFurtherInformation("");
        MedtronicYellow76generalAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase3List.add(MedtronicYellow76generalAlarmTask);
        return MedtronicTestCase3List;
    }
}
