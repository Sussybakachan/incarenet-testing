package MicroPortTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MicroportExpectedTasksTestCase2 {
    public static List<Task> MicroPortTestCase2List = new ArrayList<>();
    static Task MicroPortEriTask = new Task();
    static Task MicroPortEosTask = new Task();

    public MicroportExpectedTasksTestCase2(){
        createMicroPortEriTask();
        createMicroPortEosTask();
    }

    public static  List<Task> createMicroPortEriTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MicroPortEriTask.setCheckBox("");
        MicroPortEriTask.setColor("danger");
        MicroPortEriTask.setStartDate("2021-10-31T13:38:44.000Z");
        MicroPortEriTask.setTaskDescription("Batteriestatus: ERI");
        MicroPortEriTask.setMeasurements("Bitte auswählen");
        MicroPortEriTask.setPdf("EpisodeReport");
        MicroPortEriTask.setEmployee("");
        MicroPortEriTask.setFurtherInformation("");
        MicroPortEriTask.setAction("Aufgabe an PBA weiterleiten");

        MicroPortTestCase2List.add(MicroPortEriTask);
        return MicroPortTestCase2List;

    }
    public static  List<Task> createMicroPortEosTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MicroPortEosTask.setCheckBox("");
        MicroPortEosTask.setColor("danger");
        MicroPortEosTask.setStartDate("2021-10-31T13:38:44.000Z");
        MicroPortEosTask.setTaskDescription("Batteriestatus: EOS");
        MicroPortEosTask.setMeasurements("Bitte auswählen");
        MicroPortEosTask.setPdf("EpisodeReport");
        MicroPortEosTask.setEmployee("");
        MicroPortEosTask.setFurtherInformation("");
        MicroPortEosTask.setAction("Aufgabe an PBA weiterleiten");

        MicroPortTestCase2List.add(MicroPortEosTask);
        return MicroPortTestCase2List;

    }
}
