package BiotronikTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BiotronikExpectedTasksTestCase9 {
    //TestCase9

    public static List<Task> BiotronikTestCase9List = new ArrayList<>();
    static Task Biotronik93AlarmTask = new Task();
    static Task Biotronik93LvTask = new Task();
    static Task Biotronik93CrtTask = new Task();

    public BiotronikExpectedTasksTestCase9() {
        createBiotronik93generalTask();
        createBiotronik93LvTask();
        createBiotronik93CrtTask();
    }

    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static List<Task> createBiotronik93generalTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        Biotronik93AlarmTask.setCheckBox("");
        Biotronik93AlarmTask.setColor("warning");
        Biotronik93AlarmTask.setStartDate("2022-03-27T23:58:06.000Z");
        // Biotronik93AlarmTask.setReceiveDate("2022-10-26T12:34:14.497Z");
        // Biotronik93AlarmTask.setTargetDate("2022-10-27T12:34:14.497Z");
        Biotronik93AlarmTask.setTaskDescription("TM-Ereignis:\n" +
                "CRT-Stimulation unter dem Grenzwert\n" +
                "BiV-Stimulation unter dem Grenzwert\n" +
                "\n" +
                "Episode(n) im Bericht:\n" +
                "Atr. Mon, Atr. Mon, Atr. Mon, Atr. Mon, Atr. Mon, Atr. Mon, Atr. Mon, Atr. Mon, Atr. Mon, Atr. Mon\n" +
                "\n" +
                "CRT-Stimulation: 93%\n" +
                "LV-Stimulation: 93%\n" +
                "Batteriestatus: MOS");
        Biotronik93AlarmTask.setMeasurements("Bitte auswählen");
        Biotronik93AlarmTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881dc78d1c39201790d5929842afeStatus_report_36682_11228833_2022-03-28_01-58-06.pdfEpisode_report_11228833_417_2022-03-28_01-58-06.pdfEpisode_report_11228833_414_2022-03-28_01-58-06.pdfEpisode_report_11228833_412_2022-03-28_01-58-06.pdfEpisode_report_11228833_408_2022-03-28_01-58-06.pdfEpisode_report_11228833_406_2022-03-28_01-58-06.pdfEpisode_report_11228833_396_2022-03-28_01-58-06.pdfEpisode_report_11228833_390_2022-03-28_01-58-06.pdfEpisode_report_11228833_389_2022-03-28_01-58-06.pdfEpisode_report_11228833_379_2022-03-28_01-58-06.pdfEpisode_report_11228833_367_2022-03-28_01-58-06.pdf");
        Biotronik93AlarmTask.setEmployee("");
        Biotronik93AlarmTask.setFurtherInformation("");
        Biotronik93AlarmTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase9List.add(Biotronik93AlarmTask);
        return BiotronikTestCase9List;
    }

    public static List<Task> createBiotronik93LvTask() {

        Biotronik93LvTask.setCheckBox("");
        Biotronik93LvTask.setColor("warning");
        Biotronik93LvTask.setStartDate("2022-03-27T23:58:06.000Z");
        // Biotronik93LvTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        // Biotronik93LvTask.setTargetDate("2022-10-27T12:34:14.265Z");
        Biotronik93LvTask.setTaskDescription("LV-Stimulation: 93%");
        Biotronik93LvTask.setMeasurements("Bitte auswählen");
        Biotronik93LvTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881dc78d1c39201790d5929842afeStatus_report_36682_11228833_2022-03-28_01-58-06.pdfEpisode_report_11228833_417_2022-03-28_01-58-06.pdfEpisode_report_11228833_414_2022-03-28_01-58-06.pdfEpisode_report_11228833_412_2022-03-28_01-58-06.pdfEpisode_report_11228833_408_2022-03-28_01-58-06.pdfEpisode_report_11228833_406_2022-03-28_01-58-06.pdfEpisode_report_11228833_396_2022-03-28_01-58-06.pdfEpisode_report_11228833_390_2022-03-28_01-58-06.pdfEpisode_report_11228833_389_2022-03-28_01-58-06.pdfEpisode_report_11228833_379_2022-03-28_01-58-06.pdfEpisode_report_11228833_367_2022-03-28_01-58-06.pdf");
        Biotronik93LvTask.setEmployee("");
        Biotronik93LvTask.setFurtherInformation("");
        Biotronik93LvTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase9List.add(Biotronik93LvTask);
        return BiotronikTestCase9List;
    }

    public static List<Task> createBiotronik93CrtTask() {

        Biotronik93CrtTask.setCheckBox("");
        Biotronik93CrtTask.setColor("warning");
        Biotronik93CrtTask.setStartDate("2022-03-27T23:58:06.000Z");
        // Biotronik93CrtTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        //Biotronik93CrtTask.setTargetDate("2022-10-27T12:34:14.265Z");
        Biotronik93CrtTask.setTaskDescription("CRT-Stimulation: 93%");
        Biotronik93CrtTask.setMeasurements("Bitte auswählen");
        Biotronik93CrtTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881dc78d1c39201790d5929842afeStatus_report_36682_11228833_2022-03-28_01-58-06.pdfEpisode_report_11228833_417_2022-03-28_01-58-06.pdfEpisode_report_11228833_414_2022-03-28_01-58-06.pdfEpisode_report_11228833_412_2022-03-28_01-58-06.pdfEpisode_report_11228833_408_2022-03-28_01-58-06.pdfEpisode_report_11228833_406_2022-03-28_01-58-06.pdfEpisode_report_11228833_396_2022-03-28_01-58-06.pdfEpisode_report_11228833_390_2022-03-28_01-58-06.pdfEpisode_report_11228833_389_2022-03-28_01-58-06.pdfEpisode_report_11228833_379_2022-03-28_01-58-06.pdfEpisode_report_11228833_367_2022-03-28_01-58-06.pdf");
        Biotronik93CrtTask.setEmployee("");
        Biotronik93CrtTask.setFurtherInformation("");
        Biotronik93CrtTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase9List.add(Biotronik93CrtTask);
        return BiotronikTestCase9List;
    }
}
