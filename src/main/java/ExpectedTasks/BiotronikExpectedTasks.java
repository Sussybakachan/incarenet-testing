package ExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BiotronikExpectedTasks {
//TestCase1
    static Task Biotronik97generalTask = new Task();
    static Task Biotronik97LvTask = new Task();

    static Task Biotronik97CrtTask = new Task();
    public static List<Task> BiotronikExpectedList = new ArrayList<>();
    public static  List<Task> createBiotronik97generalTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        Biotronik97generalTask.setCheckBox("");
        Biotronik97generalTask.setColor("warning");
        Biotronik97generalTask.setStartDate("2022-04-27T02:12:55.000Z");
        Biotronik97generalTask.setReceiveDate("2022-10-26T12:34:14.497Z");
        Biotronik97generalTask.setTargetDate("2022-10-27T12:34:14.497Z");
        Biotronik97generalTask.setTaskDescription("TM-Ereignis:\n" +
                "RV-Wahrnehmungsamplitude unter dem Grenzwert\n" +
                "\n" +
                "CRT-Stimulation: 97%\n" +
                "LV-Stimulation: 97%\n" +
                "Batteriestatus: MOS");
        Biotronik97generalTask.setMeasurements("Bitte auswählen");
        Biotronik97generalTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881db78d1c30d0178f424e17e4a2fStatus_report_11525_11228833_2022-04-27_04-12-55.pdf");
        Biotronik97generalTask.setEmployee("");
        Biotronik97generalTask.setFurtherInformation("");
        Biotronik97generalTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikExpectedList.add(Biotronik97generalTask);
        return BiotronikExpectedList;
    }
    public static  List<Task> createBiotronik97LvTask() {

        Biotronik97LvTask.setCheckBox("");
        Biotronik97LvTask.setColor("warning");
        Biotronik97LvTask.setStartDate("2022-04-27T02:12:55.000Z");
        Biotronik97LvTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        Biotronik97LvTask.setTargetDate("2022-10-27T12:34:14.265Z");
        Biotronik97LvTask.setTaskDescription("LV-Stimulation: 97%");
        Biotronik97LvTask.setMeasurements("Bitte auswählen");
        Biotronik97LvTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881db78d1c30d0178f424e17e4a2fStatus_report_11525_11228833_2022-04-27_04-12-55.pdf");
        Biotronik97LvTask.setEmployee("");
        Biotronik97LvTask.setFurtherInformation("");
        Biotronik97LvTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikExpectedList.add(Biotronik97LvTask);
        return BiotronikExpectedList;
    }
    public static  List<Task> createBiotronik97CrtTask() {

        Biotronik97CrtTask.setCheckBox("");
        Biotronik97CrtTask.setColor("warning");
        Biotronik97CrtTask.setStartDate("2022-04-27T02:12:55.000Z");
        Biotronik97CrtTask.setReceiveDate("2022-10-26T12:34:14.265Z");
        Biotronik97CrtTask.setTargetDate("2022-10-27T12:34:14.265Z");
        Biotronik97CrtTask.setTaskDescription("CRT-Stimulation: 97%");
        Biotronik97CrtTask.setMeasurements("Bitte auswählen");
        Biotronik97CrtTask.setPdf("https://www.biotronik-homemonitoring.com/hmsc_guiWeb/qs/2c9881db78d1c30d0178f424e17e4a2fStatus_report_11525_11228833_2022-04-27_04-12-55.pdf");
        Biotronik97CrtTask.setEmployee("");
        Biotronik97CrtTask.setFurtherInformation("");
        Biotronik97CrtTask.setAction("Aufgabe an PBA weiterleiten");

        BiotronikExpectedList.add(Biotronik97CrtTask);
        return BiotronikExpectedList;
    }

}
