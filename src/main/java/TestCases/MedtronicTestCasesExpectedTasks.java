package TestCases;

import AbbottTestCasesExpectedTasks.*;

import static SeleniumThresholds.ThresholdCheckMethod.thresholdCheck;
import static selenium.CompareTasksInCardio.choosepatient;
import static selenium.CompareTasksInCardio.compareCrt;
import static selenium.DeletingTasks.deleteTask;
import static selenium.PasteFile.pasteFile;

public class MedtronicTestCasesExpectedTasks {
    //Testcase1
    String rootDir= System.getProperty("user.dir");
//TODO need to make it ubuntu path
    String fileDirectory = rootDir + "\\src\\main\\resources\\Selenium-IDCO-Files\\Abbott\\";
    String FfInputPath = rootDir + "\\input\\";
    String[] fileName;

    public MedtronicTestCasesExpectedTasks() throws Exception {
        abbottTestCase1();
    }
    public void abbottTestCase1() throws Exception {
        //Set Template needs to be done before
        choosepatient("Sel-Abbott");
        thresholdCheck("Abbott", 1);
        fileName = new String[]{"Abbott Implant CRT 84%"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
       pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List);
        deleteTask();
}
    public void abbottTestCase2() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Abbott", 2)
        fileName = new String[]{"Abbott Implant CRT 84%"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(AbbottExpectedTasksTestCase2.AbbottTestCase2List);
        deleteTask();
    }

    public void abbottTestCase3() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Abbott", 3)
        fileName = new String[]{"Abbott Implant CRT 84%"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(AbbottExpectedTasksTestCase3.AbbottTestCase3List);
        deleteTask();
    }

    public void abbottTestCase4() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Abbott", 4)
        fileName = new String[]{"Abbott Implant CRT 84%", "Abbott Implant CRT 96%", "Abbott Implant manipulated Batt-stat EOS added 100% CRT", "Abbott Implant manipulated Batt-stat ERI added 100% CRT"};
        for (int i = 0; i < fileName.length; i++) {
            String a = fileName[i];
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(AbbottExpectedTasksTestCase4.AbbottTestCase4List);
        deleteTask();
    }

    public void abbottTestCase5() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Abbott", 5)
        fileName = new String[]{"Abbott Implant CRT 84%", "Abbott Implant CRT 96%", "Abbott Implant manipulated Batt-stat EOS added 100% CRT", "Abbott Implant manipulated Batt-stat ERI added 100% CRT"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(AbbottExpectedTasksTestCase5.AbbottTestCase5List);
        deleteTask();
    }

    public void abbottTestCase6() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Abbott", 6)
        fileName = new String[]{"Abbott Implant CRT 84%", "Abbott Implant CRT 96%", "Abbott Implant manipulated Batt-stat EOS added 100% CRT", "Abbott Implant manipulated Batt-stat ERI added 100% CRT"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(AbbottExpectedTasksTestCase6.AbbottTestCase6List);
        deleteTask();
    }

    public void abbottTestCase7() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Abbott", 7)
        fileName = new String[]{"Abbott Implant manipulated Batt-stat ERI added 100% CRT", "Abbott Implant CRT 84%", "Abbott Implant manipulated Batt-stat EOS added 100% CRT", };
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(AbbottExpectedTasksTestCase7.AbbottTestCase7List);
        deleteTask();
    }

    public void abbottTestCase8() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Abbott", 8)
        fileName = new String[]{"Abbott Implant CRT 96%"};
        String pathToOldHl7 = fileDirectory + fileName[0]  + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(AbbottExpectedTasksTestCase8.AbbottTestCase8List);
        deleteTask();
    }

    public void abbottTestCase9() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Abbott", 9)
        fileName = new String[]{"Abbott Implant CRT 84%"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(AbbottExpectedTasksTestCase9.AbbottTestCase9List);
        deleteTask();
    }

}

