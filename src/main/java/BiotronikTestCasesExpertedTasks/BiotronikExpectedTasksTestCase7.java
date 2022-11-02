package BiotronikTestCasesExpertedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BiotronikExpectedTasksTestCase7 {


    static Task Biotronik93AlarmTask = new Task();
    static Task Biotronik97LvTask = new Task();
    static Task Biotronik93LvTask = new Task();

    static Task Biotronik97CRTTask = new Task();
    static Task Biotronik93CRTTask = new Task();
    static Task Biotronik97LVAlarmTask = new Task();
    static Task BiotronikERIAlarmTask = new Task();
    static Task BiotronikEOSAlarmTask = new Task();

    static Task BiotronikERITask = new Task();

    static Task BiotronikEOSTask = new Task();

    public static List<Task> BiotronikTestCase7List = new ArrayList<>();

    public BiotronikExpectedTasksTestCase7() {
        createBiotronik93generalTaskCase7();
        createBiotronikEOSAlarmTask();
        createBiotronikERIAlarmTask();
        createBiotronik97generalTaskCase7();
        createBiotronik93LVTask();
        createBiotronik97LvTask();
        createBiotronikERITask();
        createBiotronikEOSTask();
        this.createBiotronik93CrtTask();
        createBiotronik97CrtTask7();
    }
    public static  List<Task> createBiotronik97CrtTask7() {

        Biotronik97CRTTask.setCheckBox("");
        Biotronik97CRTTask.setColor("warning");
        Biotronik97CRTTask.setStartDate("2022-04-27T02:12:55.000Z");
        // Biotronik93CrtTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        //Biotronik93CrtTask.setTargetDate("2022-10-27T12:34:14.265Z");
        Biotronik97CRTTask.setTaskDescription("CRT-Stimulation: 97%");
        Biotronik97CRTTask.setMeasurements("Bitte auswählen");
        Biotronik97CRTTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881db78d1c30d0178f424e17e4a2fStatus_report_11525_11228833_2022-04-27_04-12-55.pdf");
        Biotronik97CRTTask.setEmployee("");
        Biotronik97CRTTask.setFurtherInformation("");
        Biotronik97CRTTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase7List.add(Biotronik97CRTTask);
        return BiotronikTestCase7List;
    }
    public  List<Task> createBiotronik93CrtTask() {

        Biotronik93CRTTask.setCheckBox("");
        Biotronik93CRTTask.setColor("danger");
        Biotronik93CRTTask.setStartDate("2022-03-27T23:58:06.000Z");
        // Biotronik93CrtTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        //Biotronik93CrtTask.setTargetDate("2022-10-27T12:34:14.265Z");
        Biotronik93CRTTask.setTaskDescription("CRT-Stimulation: 93%");
        Biotronik93CRTTask.setMeasurements("Bitte auswählen");
        Biotronik93CRTTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881dc78d1c39201790d5929842afeStatus_report_36682_11228833_2022-03-28_01-58-06.pdfEpisode_report_11228833_417_2022-03-28_01-58-06.pdfEpisode_report_11228833_414_2022-03-28_01-58-06.pdfEpisode_report_11228833_412_2022-03-28_01-58-06.pdfEpisode_report_11228833_408_2022-03-28_01-58-06.pdfEpisode_report_11228833_406_2022-03-28_01-58-06.pdfEpisode_report_11228833_396_2022-03-28_01-58-06.pdfEpisode_report_11228833_390_2022-03-28_01-58-06.pdfEpisode_report_11228833_389_2022-03-28_01-58-06.pdfEpisode_report_11228833_379_2022-03-28_01-58-06.pdfEpisode_report_11228833_367_2022-03-28_01-58-06.pdf");
        Biotronik93CRTTask.setEmployee("");
        Biotronik93CRTTask.setFurtherInformation("");
        Biotronik93CRTTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase7List.add(Biotronik93CRTTask);
        return BiotronikTestCase7List;
    }

    public static  List<Task> createBiotronikERITask() {

        BiotronikERITask.setCheckBox("");
        BiotronikERITask.setColor("danger");
        BiotronikERITask.setStartDate("2022-04-27T02:12:55.000Z");
        BiotronikERITask.setReceiveDate("2022-10-26T12:34:14.265Z");
        BiotronikERITask.setTargetDate("2022-10-27T12:34:14.265Z");
        BiotronikERITask.setTaskDescription("Batteriestatus: ERI");
        BiotronikERITask.setMeasurements("Bitte auswählen");
        BiotronikERITask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881db78d1c30d0178f424e17e4a2fStatus_report_11525_11228833_2022-04-27_04-12-55.pdf");
        BiotronikERITask.setEmployee("");
        BiotronikERITask.setFurtherInformation("");
        BiotronikERITask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase7List.add(BiotronikERITask);
        return BiotronikTestCase7List;
    }
    public static  List<Task> createBiotronikEOSTask() {

        BiotronikEOSTask.setCheckBox("");
        BiotronikEOSTask.setColor("danger");
        BiotronikEOSTask.setStartDate("2022-04-27T02:12:55.000Z");
        BiotronikEOSTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        BiotronikEOSTask.setTargetDate("2022-10-27T12:34:14.265Z");
        BiotronikEOSTask.setTaskDescription("Batteriestatus: EOS");
        BiotronikEOSTask.setMeasurements("Bitte auswählen");
        BiotronikEOSTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881db78d1c30d0178f424e17e4a2fStatus_report_11525_11228833_2022-04-27_04-12-55.pdf");
        BiotronikEOSTask.setEmployee("");
        BiotronikEOSTask.setFurtherInformation("");
        BiotronikEOSTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase7List.add(BiotronikEOSTask);
        return BiotronikTestCase7List;
    }
    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
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

        BiotronikTestCase7List.add(Biotronik93AlarmTask);
        return BiotronikTestCase7List;
    }
    public static  List<Task> createBiotronik97LvTask() {

        Biotronik97LvTask.setCheckBox("");
        Biotronik97LvTask.setColor("warning");
        Biotronik97LvTask.setStartDate("2022-04-27T02:12:55.000Z");
        // Biotronik93LvTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        // Biotronik93LvTask.setTargetDate("2022-10-27T12:34:14.265Z");
        Biotronik97LvTask.setTaskDescription("LV-Stimulation: 97%");
        Biotronik97LvTask.setMeasurements("Bitte auswählen");
        Biotronik97LvTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881db78d1c30d0178f424e17e4a2fStatus_report_11525_11228833_2022-04-27_04-12-55.pdf");
        Biotronik97LvTask.setEmployee("");
        Biotronik97LvTask.setFurtherInformation("");
        Biotronik97LvTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase7List.add(Biotronik97LvTask);
        return BiotronikTestCase7List;
    }
    public static  List<Task> createBiotronik93LVTask() {

        Biotronik93LvTask.setCheckBox("");
        Biotronik93LvTask.setColor("danger");
        Biotronik93LvTask.setStartDate("2022-03-27T23:58:06.000Z");
        // Biotronik93CrtTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        //Biotronik93CrtTask.setTargetDate("2022-10-27T12:34:14.265Z");
        Biotronik93LvTask.setTaskDescription("LV-Stimulation: 93%");
        Biotronik93LvTask.setMeasurements("Bitte auswählen");
        Biotronik93LvTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881dc78d1c39201790d5929842afeStatus_report_36682_11228833_2022-03-28_01-58-06.pdfEpisode_report_11228833_417_2022-03-28_01-58-06.pdfEpisode_report_11228833_414_2022-03-28_01-58-06.pdfEpisode_report_11228833_412_2022-03-28_01-58-06.pdfEpisode_report_11228833_408_2022-03-28_01-58-06.pdfEpisode_report_11228833_406_2022-03-28_01-58-06.pdfEpisode_report_11228833_396_2022-03-28_01-58-06.pdfEpisode_report_11228833_390_2022-03-28_01-58-06.pdfEpisode_report_11228833_389_2022-03-28_01-58-06.pdfEpisode_report_11228833_379_2022-03-28_01-58-06.pdfEpisode_report_11228833_367_2022-03-28_01-58-06.pdf");
        Biotronik93LvTask.setEmployee("");
        Biotronik93LvTask.setFurtherInformation("");
        Biotronik93LvTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase7List.add(Biotronik93LvTask);
        return BiotronikTestCase7List;
    }


    public static  List<Task> createBiotronik97generalTaskCase7() {

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

        BiotronikTestCase7List.add(Biotronik97LVAlarmTask);
        return BiotronikTestCase7List;
    }
    public static  List<Task> createBiotronikERIAlarmTask() {

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

        BiotronikTestCase7List.add(BiotronikERIAlarmTask);
        return BiotronikTestCase7List;
    }
    public static  List<Task> createBiotronikEOSAlarmTask() {

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

        BiotronikTestCase7List.add(BiotronikEOSAlarmTask);
        return BiotronikTestCase7List;
    }
}
