package AbbottTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase9 {
    static Task AbbottGeneralRedTask = new Task();

    public static List<Task> AbbottTestCase9List = new ArrayList<>();

    public AbbottExpectedTasksTestCase9() {
        createAbbottGeneralRedTask();
    }

    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static List<Task> createAbbottGeneralRedTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottGeneralRedTask.setCheckBox("");
        AbbottGeneralRedTask.setColor("danger");
        AbbottGeneralRedTask.setStartDate("2022-02-28T00:11:44.000Z");
        // AbbottGeneralYellowTask.setReceiveDate("2022-11-02T09:15:39.618Z");
        //  AbbottGeneralYellowTask.setTargetDate("2022-11-03T09:15:39.617Z");
        AbbottGeneralRedTask.setTaskDescription("CRT-Stimulation: 84.0%\n" +
                "Batteriestatus: MOS");
        AbbottGeneralRedTask.setMeasurements("Bitte auswählen");
        AbbottGeneralRedTask.setPdf("Brady Episode Report (Episode) 20220202104502Heart in FocusCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220228020022");
        AbbottGeneralRedTask.setEmployee("");
        AbbottGeneralRedTask.setFurtherInformation("");
        AbbottGeneralRedTask.setAction("Aufgabe an PBA weiterleiten");

        AbbottTestCase9List.add(AbbottGeneralRedTask);
        return AbbottTestCase9List;
    }
}
