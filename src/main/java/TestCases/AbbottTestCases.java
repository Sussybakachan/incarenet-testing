package TestCases;

import AbbottTestCasesExpectedTasks.*;

import static selenium.CompareTasksInCardio.compareCrt;
import static selenium.DeletingTasks.deleteTask;
import static selenium.PasteFile.*;

public class AbbottTestCases {
    //Testcase1
    String rootDir= System.getProperty("user.dir");
//TODO need to make it ubuntu path
    String fileDirectory = rootDir + "\\src\\main\\resources\\Selenium-IDCO-Files\\Abbott\\";
    String FfInputPath = rootDir + "\\input\\";
    String fileName;

    public void abbottTestCase1() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck()
        fileName = "Abbott Implant CRT 84%";
        String pathToOldHl7 = fileDirectory + fileName + ".hl7";
        String pathToInput = FfInputPath + fileName + ".hl7";
       pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List);
        deleteTask();
}
    public void abbottTestCase2() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck()
        fileName = "Abbott Implant CRT 84%";
        String pathToOldHl7 = fileDirectory + fileName + ".hl7";
        String pathToInput = FfInputPath + fileName + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(AbbottExpectedTasksTestCase2.AbbottTestCase2List);
        deleteTask();
    }

}

