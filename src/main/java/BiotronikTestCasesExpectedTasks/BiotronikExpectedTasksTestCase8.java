package BiotronikTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BiotronikExpectedTasksTestCase8 {
    public static List<Task> BiotronikTestCase8List = new ArrayList<>();
    static Task Biotronik97LVAlarmTask = new Task();
    static Task BiotronikERIAlarmTask = new Task();
    static Task BiotronikEOSAlarmTask = new Task();
    static Task Biotronik93AlarmTask = new Task();

    public BiotronikExpectedTasksTestCase8() {
        createBiotronik93generalTaskCase7();
        createBiotronik97generalTaskCase7();
        createBiotronikERIAlarmTask();
        createBiotronikEOSAlarmTask();
    }

    public static List<Task> createBiotronik93generalTaskCase7() {

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

        BiotronikTestCase8List.add(Biotronik93AlarmTask);
        return BiotronikTestCase8List;
    }

    public static List<Task> createBiotronik97generalTaskCase7() {

        Biotronik97LVAlarmTask.setCheckBox("");
        Biotronik97LVAlarmTask.setColor("warning");
        Biotronik97LVAlarmTask.setStartDate("2022-04-27T02:12:55.000Z");
        Biotronik97LVAlarmTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        Biotronik97LVAlarmTask.setTargetDate("2022-10-27T12:34:14.265Z");
        Biotronik97LVAlarmTask.setTaskDescription("TM-Ereignis:\n" +
                "RV-Wahrnehmungsamplitude unter dem Grenzwert\n" +
                "\n" +
                "CRT-Stimulation: 97%\n" +
                "LV-Stimulation: 97%\n" +
                "Batteriestatus: MOS");
        Biotronik97LVAlarmTask.setMeasurements("Bitte auswählen");
        Biotronik97LVAlarmTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881db78d1c30d0178f424e17e4a2fStatus_report_11525_11228833_2022-04-27_04-12-55.pdf");
        Biotronik97LVAlarmTask.setEmployee("");
        Biotronik97LVAlarmTask.setFurtherInformation("");
        Biotronik97LVAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase8List.add(Biotronik97LVAlarmTask);
        return BiotronikTestCase8List;
    }

    public static List<Task> createBiotronikERIAlarmTask() {

        BiotronikERIAlarmTask.setCheckBox("");
        BiotronikERIAlarmTask.setColor("warning");
        BiotronikERIAlarmTask.setStartDate("2022-04-27T02:12:55.000Z");
        BiotronikERIAlarmTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        BiotronikERIAlarmTask.setTargetDate("2022-10-27T12:34:14.265Z");
        BiotronikERIAlarmTask.setTaskDescription("TM-Ereignis:\n" +
                "RV-Wahrnehmungsamplitude unter dem Grenzwert\n" +
                "\n" +
                "CRT-Stimulation: 100%\n" +
                "LV-Stimulation: 100%\n" +
                "Batteriestatus: ERI");
        BiotronikERIAlarmTask.setMeasurements("Bitte auswählen");
        BiotronikERIAlarmTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881db78d1c30d0178f424e17e4a2fStatus_report_11525_11228833_2022-04-27_04-12-55.pdf");
        BiotronikERIAlarmTask.setEmployee("");
        BiotronikERIAlarmTask.setFurtherInformation("");
        BiotronikERIAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase8List.add(BiotronikERIAlarmTask);
        return BiotronikTestCase8List;
    }

    public static List<Task> createBiotronikEOSAlarmTask() {

        BiotronikEOSAlarmTask.setCheckBox("");
        BiotronikEOSAlarmTask.setColor("warning");
        BiotronikEOSAlarmTask.setStartDate("2022-04-27T02:12:55.000Z");
        BiotronikEOSAlarmTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        BiotronikEOSAlarmTask.setTargetDate("2022-10-27T12:34:14.265Z");
        BiotronikEOSAlarmTask.setTaskDescription("TM-Ereignis:\n" +
                "RV-Wahrnehmungsamplitude unter dem Grenzwert\n" +
                "\n" +
                "CRT-Stimulation: 100%\n" +
                "LV-Stimulation: 100%\n" +
                "Batteriestatus: EOS");
        BiotronikEOSAlarmTask.setMeasurements("Bitte auswählen");
        BiotronikEOSAlarmTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881db78d1c30d0178f424e17e4a2fStatus_report_11525_11228833_2022-04-27_04-12-55.pdf");
        BiotronikEOSAlarmTask.setEmployee("");
        BiotronikEOSAlarmTask.setFurtherInformation("");
        BiotronikEOSAlarmTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase8List.add(BiotronikEOSAlarmTask);
        return BiotronikTestCase8List;
    }
}
