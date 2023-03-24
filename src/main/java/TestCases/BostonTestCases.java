package TestCases;

import BostonTestCasesExpectedTasks.*;
import selenium.PasteFile;

import java.util.ArrayList;
import java.util.List;

import static SeleniumThresholds.Deselect.deselectAll;
import static SeleniumThresholds.ThresholdCheckMethod.thresholdCheck;
import static selenium.CompareTasksInCardio.*;
import static selenium.DeletingTasks.deleteTask;

public class BostonTestCases {


    //Testcase1
    GeneratedTasks g = new GeneratedTasks();
    String rootDir= System.getProperty("user.dir");
//TODO need to make it ubuntu path
    String fileDirectory = rootDir + "/resources/Selenium-IDCO-Files/Boston/Boston without internal Alarms/";
    String fileDirectory8 = rootDir + "/resources/Selenium-IDCO-Files/Boston/Boston files with alarms but for the Medizinpodukttesting/";
    String FfInputPath = rootDir + "/input/";
    PasteFile sendingIdcoFile = new PasteFile();
    String[] fileName;

    public BostonTestCases() throws Exception {
        choosepatient("Sel-Boston");
        bostonTestCase1();
        bostonTestCase2();
        bostonTestCase3();
        bostonTestCase4();
        bostonTestCase5();
        bostonTestCase6();
        bostonTestCase7();
        bostonTestCase8();
        bostonTestCase9();
        bostonTestCase10();
        bostonTestCase11();
        bostonTestCase12();
    }
    public void bostonTestCase1() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Boston", 1);
        fileName = new String[]{"Boston Implant added LV 85%"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(BostonExpectedTasksTestCase1.BostonTestCase1List, "Boston1", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }
    public void bostonTestCase2() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Boston", 2);
        fileName = new String[]{"lv 70%", "ERI", "EOS", "lv 85%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory8 + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(BostonExpectedTasksTestCase2.BostonTestCase2List, "Boston2", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void bostonTestCase3() throws Exception {
        //Set Template needs to be done before
        //to check the new doc
        thresholdCheck("Boston", 3);
        fileName = new String[]{"Boston Implant added EOS", "Boston Implant added ERI", "Boston Implant added LV 78% ", "Boston Implant added LV 85%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(BostonExpectedTasksTestCase3.BostonTestCase3List, "Boston3", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void bostonTestCase4() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Boston", 4);
        fileName = new String[]{"EOS", "lv 70%", "ERI"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory8 + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(BostonExpectedTasksTestCase4.BostonTestCase4List, "Boston4", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void bostonTestCase5() throws Exception {
        //Set Template needs to be done before

        thresholdCheck("Boston", 5);
        fileName = new String[]{"lv 85%"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory8 + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(BostonExpectedTasksTestCase5.BostonTestCase5List, "Boston5", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void bostonTestCase6() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Boston", 6);
        fileName = new String[]{"Boston Implant added LV 85%"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(BostonExpectedTasksTestCase6.BostonTestCase6List, "Boston6", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void bostonTestCase7() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Boston", 7);
        fileName = new String[]{"Boston Implant added LV 85%"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(BostonExpectedTasksTestCase7.BostonTestCase7List, "Boston7", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void bostonTestCase8() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Boston", 8);
        fileName = new String[]{"EOS", "ERI", "lv 70%", "lv 85%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory8 + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(BostonExpectedTasksTestCase8.BostonTestCase8List, "Boston8", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void bostonTestCase9() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Boston", 9);
        fileName = new String[]{"lv 70%", "ERI", "EOS", "lv 85%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory8 + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(BostonExpectedTasksTestCase9.BostonTestCase9List, "Boston9", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void bostonTestCase10() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Boston", 10);
        fileName = new String[]{"lv 70%", "ERI", "EOS", "lv 85%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory8 + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(BostonExpectedTasksTestCase10.BostonTestCase10List, "Boston10", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void bostonTestCase11() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Boston", 11);
        fileName = new String[]{"lv 70%", "ERI", "EOS", "lv 85%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory8 + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(BostonExpectedTasksTestCase11.BostonTestCase11List, "Boston11", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void bostonTestCase12() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Boston", 12);
        fileName = new String[]{"lv 70%", "ERI", "EOS", "lv 85%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory8 + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(BostonExpectedTasksTestCase12.BostonTestCase12List, "Boston12", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

}

