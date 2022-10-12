package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExpectedTasks {
    static Task expectedTask = new Task();
    static List<Task> abbottCrt = new ArrayList<>();
    //TODO RECEIVE DATE und Target Date müssen angepasst werden
    //TODO Taskobjekt erstellen mitr expected Arrays
    //getexpected Tasks Methode liefert dir mehrer
       public static  List<Task> createTasks() {

            //setCheckbox beinhaltet möglicherweise was anderes als ""
             expectedTask.setCheckBox("");
             expectedTask.setColor("danger");
             expectedTask.setStartDate("2022-02-28T00:11:44.000Z");
             expectedTask.setReceiveDate("2022-10-05T08:39:11.665Z");
             expectedTask.setTargetDate("2022-10-06T08:39:11.663Z");
             expectedTask.setTaskDescription("CRT-Pacing: 84.0%");
             expectedTask.setMeasurements("Please choose");
             expectedTask.setPdf("Brady Episode Report (Episode) 20220202104502Heart in FocusCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220228020022");
             expectedTask.setEmployee("");
             expectedTask.setFurtherInformation("");
             expectedTask.setAction("");

            abbottCrt.add(expectedTask);
            return abbottCrt;

        }
  //  public static List<Task> abbottCRT = new ArrayList<>("","danger", "2022-02-28T00:11:44.000Z", "2022-10-05T08:39:11.665Z", "2022-10-06T08:39:11.663Z", "CRT-Pacing: 84.0%", "Please choose", "Brady Episode Report (Episode) 20220202104502Heart in FocusCongestion MonitoringAlert SummaryExtended DiagnosticsDirect Trend 1 Year ReportFastPath SummaryEpisodes SummaryExtended EpisodesDiagnostics SummaryTest ResultsWrap-up OverviewParameterReal Time EGM Report 20220228020022", "", "", "");

}
