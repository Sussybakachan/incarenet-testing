package MedtronicTestCasesExpertedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MedtronicExpectedTasksTestCase7 {
    public static List<Task> MedtronicTestCase7List = new ArrayList<>();

    static Task MedtronicRed76LvTask = new Task();
    static Task MedtronicRed76CrtTask = new Task();
    static Task MedtronicEriTask = new Task();
    static Task MedtronicEosTask = new Task();


    public MedtronicExpectedTasksTestCase7() {
        createMedtronicRed76LvTask();
        createMedtronicEosTask();
        createMedtronicEriTask();
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

        MedtronicTestCase7List.add(MedtronicRed76LvTask);
        return MedtronicTestCase7List;
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

        MedtronicTestCase7List.add(MedtronicRed76CrtTask);
        return MedtronicTestCase7List;
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

        MedtronicTestCase7List.add(MedtronicEriTask);
        return MedtronicTestCase7List;
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

        MedtronicTestCase7List.add(MedtronicEosTask);
        return MedtronicTestCase7List;
    }
}
