package MicroPortTestCasesExpertedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MicroPortExpectedTasksTestCase5 {
    public static List<Task> MicroPortTestCase5List = new ArrayList<>();
    static Task microPortWhiteTask = new Task();

    public MicroPortExpectedTasksTestCase5() {
        createMicroPortWhiteTask();
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

        MicroPortTestCase5List.add(microPortWhiteTask);
        return MicroPortTestCase5List;

    }
}
