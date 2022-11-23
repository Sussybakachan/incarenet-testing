package AbbottTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase8 {
    public static List<Task> AbbottTestCase8List = new ArrayList<>();
    static Task AbbottYellowCRT96Task = new Task();

    public AbbottExpectedTasksTestCase8() {
        createAbbottYellowCRT96Task();
    }

    public static List<Task> createAbbottYellowCRT96Task() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottYellowCRT96Task.setCheckBox("");
        AbbottYellowCRT96Task.setColor("warning");
        AbbottYellowCRT96Task.setStartDate("2022-03-24T22:10:25.000Z");
        // AbbottGeneralYellowTask.setReceiveDate("2022-11-02T09:15:39.618Z");
        //  AbbottGeneralYellowTask.setTargetDate("2022-11-03T09:15:39.617Z");
        AbbottYellowCRT96Task.setTaskDescription("CRT-Stimulation: 96.0%");
        AbbottYellowCRT96Task.setMeasurements("Bitte auswählen");
        AbbottYellowCRT96Task.setPdf("Brady Episode Report (Episode) 20220316093421Heart in FocusAT/AFCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryMRI Summary ReportTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220317020028");
        AbbottYellowCRT96Task.setEmployee("");
        AbbottYellowCRT96Task.setFurtherInformation("");
        AbbottYellowCRT96Task.setAction("Aufgabe an PBA weiterleiten");

        AbbottTestCase8List.add(AbbottYellowCRT96Task);
        return AbbottTestCase8List;
    }
}
