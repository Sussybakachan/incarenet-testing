package MicroPortTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MicroportExpectedTasksTestCase4 {

    static Task microPortYellowTask = new Task();
    public static List<Task> MicroPortTestCase4List = new ArrayList<>();

    public MicroportExpectedTasksTestCase4(){
        createMicroPortYellowTask();
    }

    public static  List<Task> createMicroPortYellowTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        microPortYellowTask.setCheckBox("");
        microPortYellowTask.setColor("warning");
        microPortYellowTask.setStartDate("2020-01-29T00:26:05.000Z");
        microPortYellowTask.setReceiveDate("2022-10-19T14:28:15.701Z");
        microPortYellowTask.setTargetDate("2022-10-20T14:28:15.701Z");
        microPortYellowTask.setTaskDescription("Episode(n) im Bericht:\n" +
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
        microPortYellowTask.setMeasurements("Bitte auswählen");
        microPortYellowTask.setPdf("EpisodeReport");
        microPortYellowTask.setEmployee("");
        microPortYellowTask.setFurtherInformation("");
        microPortYellowTask.setAction("Aufgabe an PBA weiterleiten");

        MicroPortTestCase4List.add(microPortYellowTask);
        return MicroPortTestCase4List;

    }
}
