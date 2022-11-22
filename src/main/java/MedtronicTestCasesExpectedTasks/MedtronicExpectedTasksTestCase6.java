package MedtronicTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MedtronicExpectedTasksTestCase6 {
    public static List<Task> MedtronicTestCase6List = new ArrayList<>();

    static Task MedtronicRed76LvTask = new Task();
    static Task MedtronicRed76CrtTask = new Task();
    static Task MedtronicYellow98LvTask = new Task();
    static Task MedtronicYellow98CRTTask = new Task();
    static Task MedtronicEriTask = new Task();
    static Task MedtronicEosTask = new Task();


    public MedtronicExpectedTasksTestCase6(){
        createMedtronicRed76LvTask();
        createMedtronicEosTask();
        createMedtronicEriTask();
        createMedtronicYellow98LvTask();
        createMedtronicYellow98CrtTask();
        createMedtronicRed76CrtTask();
    }

    public static List<Task> createMedtronicRed76LvTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicRed76LvTask.setCheckBox("");
        MedtronicRed76LvTask.setColor("danger");
        MedtronicRed76LvTask.setStartDate("2021-11-12T21:50:57.000Z");
        MedtronicRed76LvTask.setTaskDescription("LV-Stimulation: 76.95%");
        MedtronicRed76LvTask.setMeasurements("Bitte auswählen");
        MedtronicRed76LvTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicRed76LvTask.setEmployee("");
        MedtronicRed76LvTask.setFurtherInformation("");
        MedtronicRed76LvTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase6List.add(MedtronicRed76LvTask);
        return MedtronicTestCase6List;
    }

    public static List<Task> createMedtronicRed76CrtTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicRed76CrtTask.setCheckBox("");
        MedtronicRed76CrtTask.setColor("danger");
        MedtronicRed76CrtTask.setStartDate("2021-11-12T21:50:57.000Z");
        MedtronicRed76CrtTask.setTaskDescription("CRT-Stimulation: 76.95%");
        MedtronicRed76CrtTask.setMeasurements("Bitte auswählen");
        MedtronicRed76CrtTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicRed76CrtTask.setEmployee("");
        MedtronicRed76CrtTask.setFurtherInformation("");
        MedtronicRed76CrtTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase6List.add(MedtronicRed76CrtTask);
        return MedtronicTestCase6List;
    }
    public static List<Task> createMedtronicEriTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicEriTask.setCheckBox("");
        MedtronicEriTask.setColor("danger");
        MedtronicEriTask.setStartDate("2021-11-12T21:50:57.000Z");
        MedtronicEriTask.setTaskDescription("Batteriestatus: ERI");
        MedtronicEriTask.setMeasurements("Bitte auswählen");
        MedtronicEriTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicEriTask.setEmployee("");
        MedtronicEriTask.setFurtherInformation("");
        MedtronicEriTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase6List.add(MedtronicEriTask);
        return MedtronicTestCase6List;
    }
    public static List<Task> createMedtronicEosTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicEosTask.setCheckBox("");
        MedtronicEosTask.setColor("danger");
        MedtronicEosTask.setStartDate("2021-11-12T21:50:57.000Z");
        MedtronicEosTask.setTaskDescription("Batteriestatus: EOS");
        MedtronicEosTask.setMeasurements("Bitte auswählen");
        MedtronicEosTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicEosTask.setEmployee("");
        MedtronicEosTask.setFurtherInformation("");
        MedtronicEosTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase6List.add(MedtronicEosTask);
        return MedtronicTestCase6List;
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

        MedtronicTestCase6List.add(MedtronicYellow98CRTTask);
        return MedtronicTestCase6List;
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

        MedtronicTestCase6List.add(MedtronicYellow98LvTask);
        return MedtronicTestCase6List;
    }
}
