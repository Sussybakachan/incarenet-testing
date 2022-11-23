package AbbottTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase3 {

    public static List<Task> AbbottTestCase3List = new ArrayList<>();
    static Task AbbottYellowCRT84Task = new Task();
    static Task AbbottGeneralWhiteTask = new Task();

    public AbbottExpectedTasksTestCase3() {
        createAbbottYellowCRT84Task();
        createAbbottGeneralWhiteTask();
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

    public static List<Task> createAbbottGeneralWhiteTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottGeneralWhiteTask.setCheckBox("");
        AbbottGeneralWhiteTask.setColor("normal");
        AbbottGeneralWhiteTask.setStartDate("2022-02-28T00:11:44.000Z");
        // AbbottGeneralYellowTask.setReceiveDate("2022-11-02T09:15:39.618Z");
        //  AbbottGeneralYellowTask.setTargetDate("2022-11-03T09:15:39.617Z");
        AbbottGeneralWhiteTask.setTaskDescription("CRT-Stimulation: 84.0%\n" +
                "Batteriestatus: MOS");
        AbbottGeneralWhiteTask.setMeasurements("Bitte auswählen");
        AbbottGeneralWhiteTask.setPdf("Brady Episode Report (Episode) 20220202104502Heart in FocusCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220228020022");
        AbbottGeneralWhiteTask.setEmployee("");
        AbbottGeneralWhiteTask.setFurtherInformation("");
        AbbottGeneralWhiteTask.setAction("Aufgabe an PBA weiterleiten");

        AbbottTestCase3List.add(AbbottGeneralWhiteTask);
        return AbbottTestCase3List;
    }
}
