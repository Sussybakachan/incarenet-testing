package BiotronikTestCasesExpertedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BiotronikExpectedTasksTestCase2 {
    //TestCase2
    static Task Biotronik93AlarmTask = new Task();
    static Task Biotronik93LvTask = new Task();

    static Task Biotronik93CrtTask = new Task();

    static Task BiotronikERITask = new Task();

    static Task BiotronikEOSTask = new Task();

    static Task BiotronikEOSAlarmTask = new Task();

    static Task BiotronikERIAlarmTask = new Task();
    public static List<Task> BiotronikTestCase1List = new ArrayList<>();


    public static void createExpectedTasksBioTestCase1() {
        createBiotronik97CrtTask();
        createBiotronik97LvTask();
        createBiotronik97generalTask();
    }
    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static void createBiotronik97generalTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        Biotronik93AlarmTask.setCheckBox("");
        Biotronik93AlarmTask.setColor("warning");
        Biotronik93AlarmTask.setStartDate("2022-04-27T02:12:55.000Z");
        Biotronik93AlarmTask.setReceiveDate("2022-10-26T12:34:14.497Z");
        Biotronik93AlarmTask.setTargetDate("2022-10-27T12:34:14.497Z");
        Biotronik93AlarmTask.setTaskDescription("TM-Ereignis:\n" +
                "RV-Wahrnehmungsamplitude unter dem Grenzwert\n" +
                "\n" +
                "CRT-Stimulation: 97%\n" +
                "LV-Stimulation: 97%\n" +
                "Batteriestatus: MOS");
        Biotronik93AlarmTask.setMeasurements("Bitte auswählen");
        Biotronik93AlarmTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881db78d1c30d0178f424e17e4a2fStatus_report_11525_11228833_2022-04-27_04-12-55.pdf");
        Biotronik93AlarmTask.setEmployee("");
        Biotronik93AlarmTask.setFurtherInformation("");
        Biotronik93AlarmTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase1List.add(Biotronik93AlarmTask);
    }
    public static  List<Task> createBiotronik97LvTask() {

        Biotronik93LvTask.setCheckBox("");
        Biotronik93LvTask.setColor("warning");
        Biotronik93LvTask.setStartDate("2022-04-27T02:12:55.000Z");
        Biotronik93LvTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        Biotronik93LvTask.setTargetDate("2022-10-27T12:34:14.265Z");
        Biotronik93LvTask.setTaskDescription("LV-Stimulation: 97%");
        Biotronik93LvTask.setMeasurements("Bitte auswählen");
        Biotronik93LvTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881db78d1c30d0178f424e17e4a2fStatus_report_11525_11228833_2022-04-27_04-12-55.pdf");
        Biotronik93LvTask.setEmployee("");
        Biotronik93LvTask.setFurtherInformation("");
        Biotronik93LvTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase1List.add(Biotronik93LvTask);
        return BiotronikTestCase1List;
    }
    public static  List<Task> createBiotronik97CrtTask() {

        Biotronik93CrtTask.setCheckBox("");
        Biotronik93CrtTask.setColor("warning");
        Biotronik93CrtTask.setStartDate("2022-04-27T02:12:55.000Z");
        Biotronik93CrtTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        Biotronik93CrtTask.setTargetDate("2022-10-27T12:34:14.265Z");
        Biotronik93CrtTask.setTaskDescription("CRT-Stimulation: 97%");
        Biotronik93CrtTask.setMeasurements("Bitte auswählen");
        Biotronik93CrtTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881db78d1c30d0178f424e17e4a2fStatus_report_11525_11228833_2022-04-27_04-12-55.pdf");
        Biotronik93CrtTask.setEmployee("");
        Biotronik93CrtTask.setFurtherInformation("");
        Biotronik93CrtTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikTestCase1List.add(Biotronik93CrtTask);
        return BiotronikTestCase1List;
    }
}
