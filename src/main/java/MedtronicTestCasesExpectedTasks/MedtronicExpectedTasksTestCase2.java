package MedtronicTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MedtronicExpectedTasksTestCase2 {
    public static List<Task> MedtronicTestCase2List = new ArrayList<>();
    static Task MedtronicWhiteGeneralAlarmTask = new Task();
    static Task MedtronicYellow76generalAlarmTask = new Task();

    static Task MedtronicYellowERIgeneralAlarmTask = new Task();

    static Task MedtronicYellowEOSgeneralAlarmTask = new Task();


    public MedtronicExpectedTasksTestCase2() {
        createMedtronicWhiteGeneralAlarmTask();
        createMedtronicWhite76generalAlarmTask();
        createMedtronicWhiteEOSgeneralAlarmTask();
        createMedtronicWhiteERIgeneralAlarmTask();
    }

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

        MedtronicTestCase2List.add(MedtronicWhiteGeneralAlarmTask);
        return MedtronicTestCase2List;
    }
    public static List<Task> createMedtronicWhite76generalAlarmTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicYellow76generalAlarmTask.setCheckBox("");
        MedtronicYellow76generalAlarmTask.setColor("normal");
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

        MedtronicTestCase2List.add(MedtronicYellow76generalAlarmTask);
        return MedtronicTestCase2List;
    }
    public static List<Task> createMedtronicWhiteEOSgeneralAlarmTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicYellowEOSgeneralAlarmTask.setCheckBox("");
        MedtronicYellowEOSgeneralAlarmTask.setColor("normal");
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

        MedtronicTestCase2List.add(MedtronicYellowEOSgeneralAlarmTask);
        return MedtronicTestCase2List;
    }
    public static List<Task> createMedtronicWhiteERIgeneralAlarmTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicYellowERIgeneralAlarmTask.setCheckBox("");
        MedtronicYellowERIgeneralAlarmTask.setColor("normal");
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

        MedtronicTestCase2List.add(MedtronicYellowERIgeneralAlarmTask);
        return MedtronicTestCase2List;
    }
}
