package MicroPortTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MicroPortExpectedTasksTestCase8 {

    public static List<Task> MicroPortTestCase8List = new ArrayList<>();
    
    static Task microPortWhiteTask = new Task();
    static Task MicroPortEosAlarmTask = new Task();
    static Task MicroPortEriAlarmTask = new Task();

    public MicroPortExpectedTasksTestCase8(){
        createMicroPortEosAlarmTask();
        createMicroPortEriAlarmTask();
        createMicroPortWhiteTask();
    }
    
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

        MicroPortTestCase8List.add(MicroPortEosAlarmTask);
        return MicroPortTestCase8List; }


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

        MicroPortTestCase8List.add(MicroPortEriAlarmTask);
        return MicroPortTestCase8List;

    }
    public static List<Task> createMicroPortWhiteTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        microPortWhiteTask.setCheckBox("");
        microPortWhiteTask.setColor("normal");
        microPortWhiteTask.setStartDate("2020-01-29T00:26:05.000Z");
        microPortWhiteTask.setReceiveDate("2022-10-19T14:28:15.701Z");
        microPortWhiteTask.setTargetDate("2022-10-20T14:28:15.701Z");
        microPortWhiteTask.setTaskDescription("Episode(n) im Bericht:\n" +
                "AT/AF, AT/AF, VF, Other, Other, VF, VF, Other, VF, Other, VF, VF, Monitor\n" +
                "\n" +
                "Batteriestatus: MOS\n" +
                "TM-Ereignis:\n" +
                "[4] Dernière impédance de choc > 150 ohms. Système de défibrillation potentiellement inefficace.\n" +
                "[9] Impédance sonde auriculaire > 3000 ohms, 20/Mar/2015.\n" +
                "[10] Impédance sonde ventriculaire > 3000 ohms,14/Avr/2016. Système de défibrillation potentiellement inefficace.\n" +
                "[13] Continuité électrode de choc VCS > 3 000 ohms 14/Avr/2016. Système de défibrillation potentiellement inefficace.\n" +
                "[14] Continuité électrode de choc VD > 3 000 ohms 14/Avr/2016. Système de défibrillation potentiellement inefficace.\n" +
                "[60] Amplitude faible des ondes P actuelles : 0.4 mV.\n" +
                "[24] CHOC OFF.\n" +
                "[A30] CHOC OFF 28/Jan/2020.\n" +
                "Anzahl Fallback Mode Switch = 7\n" +
                "Nb d'épisodes d'arythmies auriculaires = 2\n" +
                "Temps total en repli : 07h 40min (86.6 %)\n" +
                "En mode de repli, la fréquence ventriculaire est stimulée à 100 %\n" +
                "La Fréquence ventriculaire moyenne en mode de repli est de 60 min-1");
        microPortWhiteTask.setMeasurements("Bitte auswählen");
        microPortWhiteTask.setPdf("EpisodeReport");
        microPortWhiteTask.setEmployee("");
        microPortWhiteTask.setFurtherInformation("");
        microPortWhiteTask.setAction("Aufgabe an PBA weiterleiten");

        MicroPortTestCase8List.add(microPortWhiteTask);
        return MicroPortTestCase8List;

    }
}
