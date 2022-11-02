package AbbottTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase1 {
    //TestCase1
    static Task AbbottGeneralYellowTask = new Task();

    public static List<Task> AbbottTestCase1List = new ArrayList<>();



    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static List<Task> createAbbottGeneralYellowTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottGeneralYellowTask.setCheckBox("");
        AbbottGeneralYellowTask.setColor("warning");
        AbbottGeneralYellowTask.setStartDate("2022-02-28T00:11:44.000Z");
       // AbbottGeneralYellowTask.setReceiveDate("2022-11-02T09:15:39.618Z");
      //  AbbottGeneralYellowTask.setTargetDate("2022-11-03T09:15:39.617Z");
        AbbottGeneralYellowTask.setTaskDescription("CRT-Stimulation: 84.0%\n" +
                "Batteriestatus: MOS");
        AbbottGeneralYellowTask.setMeasurements("Bitte auswählen");
        AbbottGeneralYellowTask.setPdf("Brady Episode Report (Episode) 20220202104502Heart in FocusCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220228020022");
        AbbottGeneralYellowTask.setEmployee("");
        AbbottGeneralYellowTask.setFurtherInformation("");
        AbbottGeneralYellowTask.setAction("Aufgabe an PBA weiterleiten");

        AbbottTestCase1List.add(AbbottGeneralYellowTask);
        return AbbottTestCase1List;
    }

}

