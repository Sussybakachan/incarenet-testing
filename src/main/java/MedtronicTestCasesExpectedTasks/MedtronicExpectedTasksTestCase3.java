package MedtronicTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MedtronicExpectedTasksTestCase3 {
    public static List<Task> MedtronicTestCase3List = new ArrayList<>();
    static Task MedtronicYellow76generalAlarmTask = new Task();
    static Task MedtronicYellow76LvTask = new Task();

    static Task MedtronicYellow98GeneralAlarmTask = new Task();
    static Task MedtronicYellowERIgeneralAlarmTask = new Task();

    static Task MedtronicYellowEOSgeneralAlarmTask = new Task();

    public MedtronicExpectedTasksTestCase3() {
        createMedtronicYellow76LvTask();
        createMedtronicYellow76generalAlarmTask();
        createMedtronicWhiteEOSgeneralAlarmTask();
        createMedtronicWhiteERIgeneralAlarmTask();
        createMedtronicYellow98GeneralAlarmTask();
    }


    public static List<Task> createMedtronicYellow98GeneralAlarmTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicYellow98GeneralAlarmTask.setCheckBox("");
        MedtronicYellow98GeneralAlarmTask.setColor("warning");
        MedtronicYellow98GeneralAlarmTask.setStartDate("2021-06-03T09:56:54.000Z");
        MedtronicYellow98GeneralAlarmTask.setTaskDescription("CRT-Stimulation: 98.07%\n" +
                "LV-Stimulation: 98.07%\n" +
                "Batteriestatus: OK");
        MedtronicYellow98GeneralAlarmTask.setMeasurements("Bitte auswählen");
        MedtronicYellow98GeneralAlarmTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicYellow98GeneralAlarmTask.setEmployee("");
        MedtronicYellow98GeneralAlarmTask.setFurtherInformation("");
        MedtronicYellow98GeneralAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase3List.add(MedtronicYellow98GeneralAlarmTask);
        return MedtronicTestCase3List;
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

    public static List<Task> createMedtronicWhiteEOSgeneralAlarmTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicYellowEOSgeneralAlarmTask.setCheckBox("");
        MedtronicYellowEOSgeneralAlarmTask.setColor("warning");
        MedtronicYellowEOSgeneralAlarmTask.setStartDate("2021-11-12T21:50:57.000Z");
        MedtronicYellowEOSgeneralAlarmTask.setTaskDescription("Episode(n) im Bericht:\n" +
                "VT, Monitor\n" +
                "\n" +
                "CRT-Stimulation: 100%\n" +
                "LV-Stimulation: 100%\n" +
                "Batteriestatus: EOS");
        MedtronicYellowEOSgeneralAlarmTask.setMeasurements("Bitte auswählen");
        MedtronicYellowEOSgeneralAlarmTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicYellowEOSgeneralAlarmTask.setEmployee("");
        MedtronicYellowEOSgeneralAlarmTask.setFurtherInformation("");
        MedtronicYellowEOSgeneralAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase3List.add(MedtronicYellowEOSgeneralAlarmTask);
        return MedtronicTestCase3List;
    }
    public static List<Task> createMedtronicWhiteERIgeneralAlarmTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicYellowERIgeneralAlarmTask.setCheckBox("");
        MedtronicYellowERIgeneralAlarmTask.setColor("warning");
        MedtronicYellowERIgeneralAlarmTask.setStartDate("2021-11-12T21:50:57.000Z");
        MedtronicYellowERIgeneralAlarmTask.setTaskDescription("Episode(n) im Bericht:\n" +
                "VT, Monitor\n" +
                "\n" +
                "CRT-Stimulation: 100%\n" +
                "LV-Stimulation: 100%\n" +
                "Batteriestatus: ERI");
        MedtronicYellowERIgeneralAlarmTask.setMeasurements("Bitte auswählen");
        MedtronicYellowERIgeneralAlarmTask.setPdf("Cardiac Electrophysiology Report");
        MedtronicYellowERIgeneralAlarmTask.setEmployee("");
        MedtronicYellowERIgeneralAlarmTask.setFurtherInformation("");
        MedtronicYellowERIgeneralAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        MedtronicTestCase3List.add(MedtronicYellowERIgeneralAlarmTask);
        return MedtronicTestCase3List;
    }
}
