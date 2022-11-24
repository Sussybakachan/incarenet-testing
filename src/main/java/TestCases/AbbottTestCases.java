package TestCases;

import AbbottTestCasesExpectedTasks.AbbottExpectedTasksTestCase1;
import AbbottTestCasesExpectedTasks.AbbottExpectedTasksTestCase2;
import selenium.CollectTasks;
import selenium.Task;

import java.util.List;

import static SeleniumThresholds.ThresholdCheckMethod.thresholdCheck;
import static selenium.CompareTasksInCardio.choosepatient;
import static selenium.CompareTasksInCardio.compareCrt;
import static selenium.DeletingTasks.deleteTask;
import static selenium.PasteFile.pasteFile;

public class AbbottTestCases {
    //Testcase1
    String rootDir = System.getProperty("user.dir");
    //TODO need to make it ubuntu path
    String fileDirectory = rootDir + "\\src\\main\\resources\\Selenium-IDCO-Files\\Abbott\\";
    String FfInputPath = rootDir + "\\input\\";
    String fileName;

    public AbbottTestCases() throws Exception {
        abbottTestCase1();
    }

    public void abbottTestCase1() throws Exception {
        //Set Template needs to be done before
        choosepatient("Sel-Boston");
       // thresholdCheck("Abbott", 1);
      //  fileName = "Abbott Implant CRT 84%";
      //  String pathToOldHl7 = fileDirectory + fileName + ".hl7";
      //  String pathToInput = FfInputPath + fileName + ".hl7";
     //   pasteFile(pathToOldHl7, pathToInput);
       // Thread.sleep(10000);
       // getGeneratedTasks();
        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", getGeneratedTasks());
      //  deleteTask();
    }

    private List<Task> getGeneratedTasks() throws InterruptedException {
        CollectTasks collectTasks = new CollectTasks();
        return collectTasks.getTasks();
    }

   /*public void abbottTestCase2() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck()
        fileName = "Abbott Implant CRT 84%";
        String pathToOldHl7 = fileDirectory + fileName + ".hl7";
        String pathToInput = FfInputPath + fileName + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        //compareCrt(AbbottExpectedTasksTestCase2.AbbottTestCase2List);
        deleteTask();
    } */

}

