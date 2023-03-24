package TestCases;

import AbbottTestCasesExpectedTasks.*;
import selenium.PasteFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static SeleniumThresholds.Deselect.deselectAll;
import static SeleniumThresholds.ThresholdCheckMethod.thresholdCheck;
import static selenium.CompareTasksInCardio.choosepatient;
import static selenium.CompareTasksInCardio.compareCrt;
import static selenium.DeletingTasks.deleteTask;

public class AbbottTestCases {
    //Testcase1
    GeneratedTasks g = new GeneratedTasks();
    String rootDir = System.getProperty("user.dir");
    //TODO need to make it ubuntu path

    //TODO questrich at the end of fileDirectory
    String fileDirectory = rootDir + "/resources/Selenium-IDCO-Files/Abbott/";
    File FfInputPath = new File(rootDir) + "/input/";
    PasteFile sendingIdcoFile = new PasteFile();
    String[] fileNames;

    public AbbottTestCases() throws Exception {
        choosepatient("Sel-Abbott");
        abbottTestCase1();
        abbottTestCase2();
        abbottTestCase3();
        abbottTestCase4();
        abbottTestCase5();
        abbottTestCase6();
        abbottTestCase7();
        abbottTestCase8();
        abbottTestCase9();
        abbottTestCase10();
    }

    public void abbottTestCase1() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 1);

        sendIdcoFiles({"Abbott Implant CRT 84%"});

        Thread.sleep(5000);

        checkIfTaskListMatches("sdafaasdf");


//        sendingIdcoFile.checkUnsuccessfullySendFiles(FfInputPath, fileNames);
//        //getGeneratedTasks();
//        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());
//        deleteTask();
//        deselectAll();
    }

    public void abbottTestCase2() throws Exception {
        thresholdCheck("Abbott", 2);
        fileNames = new String[]{"Abbott Implant CRT 84%"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory + fileNames[0] + ".hl7";
        String pathToInput = FfInputPath + fileNames[0] + ".hl7";
        sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
        originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(AbbottExpectedTasksTestCase2.AbbottTestCase2List, "Abbott2", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void abbottTestCase3() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 3);
        fileNames = new String[]{"Abbott Implant CRT 84%", "Abbott Implant manipulated Batt-stat EOS added 100% CRT", "Abbott Implant manipulated Batt-stat ERI added 100% CRT", "Abbott Implant CRT 96%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileNames.length; i++) {
            String pathToOldHl7 = fileDirectory + fileNames[i] + ".hl7";
            String pathToInput = FfInputPath + fileNames[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        }
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(AbbottExpectedTasksTestCase3.AbbottTestCase3List, "Abbott3", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void abbottTestCase4() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 4);
        fileNames = new String[]{"Abbott Implant CRT 84%", "Abbott Implant CRT 96%", "Abbott Implant manipulated Batt-stat EOS added 100% CRT", "Abbott Implant manipulated Batt-stat ERI added 100% CRT"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileNames.length; i++) {
            String pathToOldHl7 = fileDirectory + fileNames[i] + ".hl7";
            String pathToInput = FfInputPath + fileNames[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        }
        ;
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(AbbottExpectedTasksTestCase4.AbbottTestCase4List, "Abbott4", g.getGeneratedTasks());
        deselectAll();
    }

    public void abbottTestCase5() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 5);
        fileNames = new String[]{"Abbott Implant CRT 84%", "Abbott Implant CRT 96%", "Abbott Implant manipulated Batt-stat EOS added 100% CRT", "Abbott Implant manipulated Batt-stat ERI added 100% CRT"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileNames.length; i++) {
            String pathToOldHl7 = fileDirectory + fileNames[i] + ".hl7";
            String pathToInput = FfInputPath + fileNames[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        }
        ;
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(AbbottExpectedTasksTestCase5.AbbottTestCase5List, "Abbott5", g.getGeneratedTasks());
        deselectAll();
    }

    public void abbottTestCase6() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 6);
        fileNames = new String[]{"Abbott Implant CRT 84%", "Abbott Implant CRT 96%", "Abbott Implant manipulated Batt-stat EOS added 100% CRT", "Abbott Implant manipulated Batt-stat ERI added 100% CRT"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileNames.length; i++) {
            String pathToOldHl7 = fileDirectory + fileNames[i] + ".hl7";
            String pathToInput = FfInputPath + fileNames[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        }
        ;
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(AbbottExpectedTasksTestCase6.AbbottTestCase6List, "Abbott6", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void abbottTestCase7() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 7);
        fileNames = new String[]{"Abbott Implant manipulated Batt-stat ERI added 100% CRT", "Abbott Implant CRT 84%", "Abbott Implant manipulated Batt-stat EOS added 100% CRT",};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileNames.length; i++) {
            String pathToOldHl7 = fileDirectory + fileNames[i] + ".hl7";
            String pathToInput = FfInputPath + fileNames[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        }
        ;
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(AbbottExpectedTasksTestCase7.AbbottTestCase7List, "Abbott7", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void abbottTestCase8() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 8);
        fileNames = new String[]{"Abbott Implant CRT 96%"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory + fileNames[0] + ".hl7";
        String pathToInput = FfInputPath + fileNames[0] + ".hl7";
        sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
        originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(AbbottExpectedTasksTestCase8.AbbottTestCase8List, "Abbott8", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void abbottTestCase9() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 9);
        fileNames = new String[]{"Abbott Implant CRT 84%"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory + fileNames[0] + ".hl7";
        String pathToInput = FfInputPath + fileNames[0] + ".hl7";
        sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
        originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(AbbottExpectedTasksTestCase9.AbbottTestCase9List, "Abbott9", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void abbottTestCase10() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 10);
        fileNames = new String[]{"Abbott Implant CRT 84%", "Abbott Implant CRT 96%", "Abbott Implant manipulated Batt-stat EOS added 100% CRT", "Abbott Implant manipulated Batt-stat ERI added 100% CRT"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileNames.length; i++) {
            String pathToOldHl7 = fileDirectory + fileNames[i] + ".hl7";
            String pathToInput = FfInputPath + fileNames[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        }
        ;
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(AbbottExpectedTasksTestCase10.AbbottTestCase10List, "Abbott10", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

}

