package AbbottTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase3 {

    public static List<Task> AbbottTestCase3List = new ArrayList<>();
    static Task AbbottYellowCRT84Task = new Task();
    static Task AbbottGeneralWhiteTask84 = new Task();
    static Task AbbottGeneralWhiteTask96 = new Task();
    static Task AbbottGeneralWhiteTaskERI = new Task();
    static Task AbbottGeneralWhiteTaskEOS = new Task();

    public AbbottExpectedTasksTestCase3() {
        createAbbottYellowCRT84Task();
        createAbbottGeneralYellowTask96();
        createAbbottGeneralYellowTaskEOS();
        createAbbottGeneralYellowTaskERI();
        createAbbottGeneralYellowTask84();
    }


    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static List<Task> createAbbottYellowCRT84Task() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottYellowCRT84Task.setCheckBox("");
        AbbottYellowCRT84Task.setColor("warning");
        AbbottYellowCRT84Task.setStartDate("2022-02-28T00:11:44.000Z");
        // AbbottGeneralYellowTask.setReceiveDate("2022-11-02T09:15:39.618Z");
        //  AbbottGeneralYellowTask.setTargetDate("2022-11-03T09:15:39.617Z");
        AbbottYellowCRT84Task.setTaskDescription("CRT-Stimulation: 84.0%");
        AbbottYellowCRT84Task.setMeasurements("Bitte auswählen");
        AbbottYellowCRT84Task.setPdf("Brady Episode Report (Episode) 20220202104502Heart in FocusCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220228020022");
        AbbottYellowCRT84Task.setEmployee("");
        AbbottYellowCRT84Task.setFurtherInformation("");
        AbbottYellowCRT84Task.setAction("Aufgabe an PBA weiterleiten");

        AbbottTestCase3List.add(AbbottYellowCRT84Task);
        return AbbottTestCase3List;
    }

    public static List<Task> createAbbottGeneralYellowTask84() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottGeneralWhiteTask84.setCheckBox("");
        AbbottGeneralWhiteTask84.setColor("warning");
        AbbottGeneralWhiteTask84.setStartDate("2022-02-28T00:11:44.000Z");
        // AbbottGeneralYellowTask.setReceiveDate("2022-11-02T09:15:39.618Z");
        //  AbbottGeneralYellowTask.setTargetDate("2022-11-03T09:15:39.617Z");
        AbbottGeneralWhiteTask84.setTaskDescription("CRT-Stimulation: 84.0%\n" +
                "Batteriestatus: MOS");
        AbbottGeneralWhiteTask84.setMeasurements("Bitte auswählen");
        AbbottGeneralWhiteTask84.setPdf("Brady Episode Report (Episode) 20220202104502Heart in FocusCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220228020022");
        AbbottGeneralWhiteTask84.setEmployee("");
        AbbottGeneralWhiteTask84.setFurtherInformation("");
        AbbottGeneralWhiteTask84.setAction("Aufgabe an PBA weiterleiten");

        AbbottTestCase3List.add(AbbottGeneralWhiteTask84);
        return AbbottTestCase3List;
    }

    public static List<Task> createAbbottGeneralYellowTask96() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottGeneralWhiteTask96.setCheckBox("");
        AbbottGeneralWhiteTask96.setColor("warning");
        AbbottGeneralWhiteTask96.setStartDate("2022-03-24T22:10:25.000Z");
        // AbbottGeneralYellowTask.setReceiveDate("2022-11-02T09:15:39.618Z");
        //  AbbottGeneralYellowTask.setTargetDate("2022-11-03T09:15:39.617Z");
        AbbottGeneralWhiteTask96.setTaskDescription("CRT-Stimulation: 96.0%\n" +
                "Batteriestatus: MOS");
        AbbottGeneralWhiteTask96.setMeasurements("Bitte auswählen");
        AbbottGeneralWhiteTask96.setPdf("Brady Episode Report (Episode) 20220316093421Heart in FocusAT/AFCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryMRI Summary ReportTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220317020028");
        AbbottGeneralWhiteTask96.setEmployee("");
        AbbottGeneralWhiteTask96.setFurtherInformation("");
        AbbottGeneralWhiteTask96.setAction("Aufgabe an PBA weiterleiten");

        AbbottTestCase3List.add(AbbottGeneralWhiteTask96);
        return AbbottTestCase3List;
    }
    public static List<Task> createAbbottGeneralYellowTaskEOS() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottGeneralWhiteTaskEOS.setCheckBox("");
        AbbottGeneralWhiteTaskEOS.setColor("warning");
        AbbottGeneralWhiteTaskEOS.setStartDate("2022-03-24T22:10:25.000Z");
        // AbbottGeneralYellowTask.setReceiveDate("2022-11-02T09:15:39.618Z");
        //  AbbottGeneralYellowTask.setTargetDate("2022-11-03T09:15:39.617Z");
        AbbottGeneralWhiteTaskEOS.setTaskDescription("CRT-Stimulation: 100.0%\n" +
                "Batteriestatus: EOS");
        AbbottGeneralWhiteTaskEOS.setMeasurements("Bitte auswählen");
        AbbottGeneralWhiteTaskEOS.setPdf("Brady Episode Report (Episode) 20220316093421Heart in FocusAT/AFCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryMRI Summary ReportTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220317020028");
        AbbottGeneralWhiteTaskEOS.setEmployee("");
        AbbottGeneralWhiteTaskEOS.setFurtherInformation("");
        AbbottGeneralWhiteTaskEOS.setAction("Aufgabe an PBA weiterleiten");

        AbbottTestCase3List.add(AbbottGeneralWhiteTaskEOS);
        return AbbottTestCase3List;
    }
    public static List<Task> createAbbottGeneralYellowTaskERI() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottGeneralWhiteTaskERI.setCheckBox("");
        AbbottGeneralWhiteTaskERI.setColor("warning");
        AbbottGeneralWhiteTaskERI.setStartDate("2022-03-24T22:10:25.000Z");
        // AbbottGeneralYellowTask.setReceiveDate("2022-11-02T09:15:39.618Z");
        //  AbbottGeneralYellowTask.setTargetDate("2022-11-03T09:15:39.617Z");
        AbbottGeneralWhiteTaskERI.setTaskDescription("CRT-Stimulation: 100.0%\n" +
                "Batteriestatus: ERI");
        AbbottGeneralWhiteTaskERI.setMeasurements("Bitte auswählen");
        AbbottGeneralWhiteTaskERI.setPdf("Brady Episode Report (Episode) 20220316093421Heart in FocusAT/AFCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryMRI Summary ReportTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220317020028");
        AbbottGeneralWhiteTaskERI.setEmployee("");
        AbbottGeneralWhiteTaskERI.setFurtherInformation("");
        AbbottGeneralWhiteTaskERI.setAction("Aufgabe an PBA weiterleiten");

        AbbottTestCase3List.add(AbbottGeneralWhiteTaskERI);
        return AbbottTestCase3List;
    }
}
