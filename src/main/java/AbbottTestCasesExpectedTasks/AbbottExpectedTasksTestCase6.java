package AbbottTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase6 {
    public static List<Task> AbbottTestCase6List = new ArrayList<>();
    static Task AbbottRedCRT84Task = new Task();
    static Task AbbottEriTask = new Task();
    static Task AbbottEosTask = new Task();
    static Task AbbottYellowCRT96Task = new Task();

    public AbbottExpectedTasksTestCase6() {
        createAbbottRedCRT84Task();
        createAbbottYellowCRT96Task();
        createAbbottEosTask();
        createAbbottEriTask();
    }

    public static List<Task> createAbbottRedCRT84Task() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottRedCRT84Task.setCheckBox("");
        AbbottRedCRT84Task.setColor("danger");
        AbbottRedCRT84Task.setStartDate("2022-02-28T00:11:44.000Z");
        // AbbottGeneralYellowTask.setReceiveDate("2022-11-02T09:15:39.618Z");
        //  AbbottGeneralYellowTask.setTargetDate("2022-11-03T09:15:39.617Z");
        AbbottRedCRT84Task.setTaskDescription("CRT-Stimulation: 84.0%");
        AbbottRedCRT84Task.setMeasurements("Bitte auswählen");
        AbbottRedCRT84Task.setPdf("Brady Episode Report (Episode) 20220202104502Heart in FocusCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220228020022");
        AbbottRedCRT84Task.setEmployee("");
        AbbottRedCRT84Task.setFurtherInformation("");
        AbbottRedCRT84Task.setAction("Aufgabe an PBA weiterleiten");

        AbbottTestCase6List.add(AbbottRedCRT84Task);
        return AbbottTestCase6List;
    }

    public static List<Task> createAbbottEriTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottEriTask.setCheckBox("");
        AbbottEriTask.setColor("danger");
        AbbottEriTask.setStartDate("2022-03-24T22:10:25.000Z");
        // AbbottGeneralYellowTask.setReceiveDate("2022-11-02T09:15:39.618Z");
        //  AbbottGeneralYellowTask.setTargetDate("2022-11-03T09:15:39.617Z");
        AbbottEriTask.setTaskDescription("Batteriestatus: ERI");
        AbbottEriTask.setMeasurements("Bitte auswählen");
        AbbottEriTask.setPdf("Brady Episode Report (Episode) 20220316093421Heart in FocusAT/AFCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryMRI Summary ReportTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220317020028");
        AbbottEriTask.setEmployee("");
        AbbottEriTask.setFurtherInformation("");
        AbbottEriTask.setAction("Aufgabe an PBA weiterleiten");

        AbbottTestCase6List.add(AbbottEriTask);
        return AbbottTestCase6List;
    }

    public static List<Task> createAbbottEosTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottEosTask.setCheckBox("");
        AbbottEosTask.setColor("danger");
        AbbottEosTask.setStartDate("2022-03-24T22:10:25.000Z");
        // AbbottGeneralYellowTask.setReceiveDate("2022-11-02T09:15:39.618Z");
        //  AbbottGeneralYellowTask.setTargetDate("2022-11-03T09:15:39.617Z");
        AbbottEosTask.setTaskDescription("Batteriestatus: EOS");
        AbbottEosTask.setMeasurements("Bitte auswählen");
        AbbottEosTask.setPdf("Brady Episode Report (Episode) 20220316093421Heart in FocusAT/AFCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryMRI Summary ReportTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220317020028");
        AbbottEosTask.setEmployee("");
        AbbottEosTask.setFurtherInformation("");
        AbbottEosTask.setAction("Aufgabe an PBA weiterleiten");

        AbbottTestCase6List.add(AbbottEosTask);
        return AbbottTestCase6List;
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

        AbbottTestCase6List.add(AbbottYellowCRT96Task);
        return AbbottTestCase6List;
    }
}
