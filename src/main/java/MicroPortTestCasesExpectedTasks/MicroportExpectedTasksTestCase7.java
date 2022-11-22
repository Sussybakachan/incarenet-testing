package MicroPortTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MicroportExpectedTasksTestCase7 {

    public static List<Task> MicroPortTestCase7List = new ArrayList<>();
    static Task MicroPortEriTask = new Task();
    static Task MicroPortEosTask = new Task();
    
    static Task MicroPortEosAlarmTask = new Task();
    static Task MicroPortEriAlarmTask = new Task();

    public MicroportExpectedTasksTestCase7(){
        createMicroPortEriTask();
        createMicroPortEosTask();
        createMicroPortEosAlarmTask();
        createMicroPortEriAlarmTask();
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

        MicroPortTestCase7List.add(MicroPortEriTask);
        return MicroPortTestCase7List;

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

        MicroPortTestCase7List.add(MicroPortEosTask);
        return MicroPortTestCase7List;}



    public static  List<Task> createMicroPortEosAlarmTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MicroPortEosAlarmTask.setCheckBox("");
        MicroPortEosAlarmTask.setColor("normal");
        MicroPortEosAlarmTask.setStartDate("2021-10-31T13:38:44.000Z");
        MicroPortEosAlarmTask.setTaskDescription("Episode(n) im Bericht:\n" +
                "Other, Other, Other, Other, AT/AF, AT/AF, AT/AF, AT/AF, Monitor\n" +
                "\n" +
                "Batteriestatus: EOS\n" +
                "TM-Ereignis:\n" +
                "[A45] V Reizschwelle (2.0 V) liegt über dem Grenzwert (1.75 V) am 27/Okt/2021.");
        MicroPortEosAlarmTask.setMeasurements("Bitte auswählen");
        MicroPortEosAlarmTask.setPdf("EpisodeReport");
        MicroPortEosAlarmTask.setEmployee("");
        MicroPortEosAlarmTask.setFurtherInformation("");
        MicroPortEosAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        MicroPortTestCase7List.add(MicroPortEosAlarmTask);
        return MicroPortTestCase7List; }


    public static  List<Task> createMicroPortEriAlarmTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MicroPortEriAlarmTask.setCheckBox("");
        MicroPortEriAlarmTask.setColor("normal");
        MicroPortEriAlarmTask.setStartDate("2021-10-31T13:38:44.000Z");
        MicroPortEriAlarmTask.setTaskDescription("Episode(n) im Bericht:\n" +
                "Other, Other, Other, Other, AT/AF, AT/AF, AT/AF, AT/AF, Monitor\n" +
                "\n" +
                "Batteriestatus: ERI\n" +
                "TM-Ereignis:\n" +
                "[A45] V Reizschwelle (2.0 V) liegt über dem Grenzwert (1.75 V) am 27/Okt/2021.");
        MicroPortEriAlarmTask.setMeasurements("Bitte auswählen");
        MicroPortEriAlarmTask.setPdf("EpisodeReport");
        MicroPortEriAlarmTask.setEmployee("");
        MicroPortEriAlarmTask.setFurtherInformation("");
        MicroPortEriAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        MicroPortTestCase7List.add(MicroPortEriAlarmTask);
        return MicroPortTestCase7List;

    }
}
