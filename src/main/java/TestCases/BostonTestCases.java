package TestCases;

import BostonTestCasesExpectedTasks.*;

import static SeleniumThresholds.ThresholdCheckMethod.thresholdCheck;
import static selenium.CompareTasksInCardio.choosepatient;
import static selenium.CompareTasksInCardio.compareCrt;
import static selenium.DeletingTasks.deleteTask;
import static selenium.PasteFile.pasteFile;

public class BostonTestCases {
    //Testcase1
    String rootDir= System.getProperty("user.dir");
//TODO need to make it ubuntu path
    String fileDirectory = rootDir + "/src/main/resources/Boston/";
    String FfInputPath = rootDir + "/input/";
    String[] fileName;

    public BostonTestCases() throws Exception {
        bostonTestCase1();
    }
    public void bostonTestCase1() throws Exception {
        //Set Template needs to be done before
        choosepatient("Sel-Boston");
        thresholdCheck("Boston", 1);
        fileName = new String[]{"Boston Implant added LV 85%"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(BostonExpectedTasksTestCase1.BostonTestCase1List);
        deleteTask();
    }
    public void BostonTestCase2() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Boston", 2)
        fileName = new String[]{"Boston Implant added EOS", "Boston Implant added ERI", "Boston Implant added LV 78%", "Boston Implant added LV 85%"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BostonExpectedTasksTestCase2.BostonEmptyTestCase);
        deleteTask();
    }

    public void BostonTestCase3() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Boston", 3)
        fileName = new String[]{"Boston Implant added EOS", "Boston Implant added ERI", "Boston Implant added LV 78%", "Boston Implant added LV 85%"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BostonExpectedTasksTestCase3.BostonTestCase3List);
        deleteTask();
    }

    public void BostonTestCase4() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Boston", 4)
        fileName = new String[]{"Boston Implant added EOS", "Boston Implant added LV 78%", "Boston Implant added ERI"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BostonExpectedTasksTestCase4.BostonTestCase4List);
        deleteTask();
    }

    public void BostonTestCase5() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Boston", 5)
        fileName = new String[]{"Boston Implant added LV 85%"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(BostonExpectedTasksTestCase5.BostonTestCase5List);
        deleteTask();
    }

    public void BostonTestCase6() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Boston", 6)
        fileName = new String[]{"Boston Implant added LV 85%"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(BostonExpectedTasksTestCase6.BostonTestCase6List);
        deleteTask();
    }

    public void BostonTestCase7() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Boston", 7)
        fileName = new String[]{"Boston Implant added LV 85%"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(BostonExpectedTasksTestCase7.BostonTestCase7List);
        deleteTask();
    }

    public void BostonTestCase8() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Boston", 8)
        fileName = new String[]{"EOS", "ERI", "Lv70%", "LV80%"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BostonExpectedTasksTestCase8.BostonTestCase8List);
        deleteTask();
    }

}

