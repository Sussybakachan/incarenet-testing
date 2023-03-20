package TestCases;

import BiotronikTestCasesExpectedTasks.*;
import selenium.PasteFile;

import java.util.ArrayList;
import java.util.List;

import static SeleniumThresholds.Deselect.deselectAll;
import static SeleniumThresholds.ThresholdCheckMethod.thresholdCheck;
import static selenium.CompareTasksInCardio.choosepatient;
import static selenium.CompareTasksInCardio.compareCrt;
import static selenium.DeletingTasks.deleteTask;

public class BiotronikTestCases {
    //Testcase1
    GeneratedTasks g = new GeneratedTasks();
    String rootDir = System.getProperty("user.dir");
    //TODO need to make it ubuntu path
    String fileDirectory = rootDir + "/resources/Selenium-IDCO-Files/Biotronik/";
    String FfInputPath = rootDir + "/input/";
    PasteFile sendingIdcoFile = new PasteFile();
    String[] fileName;

    public BiotronikTestCases() throws Exception {
        choosepatient("Sel-Biotronik");
        biotronikTestCase1();
        biotronikTestCase2();
        biotronikTestCase3();
        biotronikTestCase4();
        biotronikTestCase5();
        biotronikTestCase6();
        biotronikTestCase7();
        biotronikTestCase8();
        biotronikTestCase9();
        biotronikTestCase10();
    }

    public void biotronikTestCase1() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 1);
        fileName = new String[]{"Biotronik Implant CRT 97% LV 97%"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        sendingIdcoFile.pasteFile(pathToOldHl7, pathToInput);
        originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.checkIfFilesGotSend(originalPaths);
        compareCrt(BiotronikExpectedTasksTestCase1.BiotronikTestCase1List, "Biotronik1", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase2() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 2);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.pasteFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        }
        ;
        Thread.sleep(3000);
        sendingIdcoFile.checkIfFilesGotSend(originalPaths);
        compareCrt(BiotronikExpectedTasksTestCase2.BiotronikTestCase2List, "Biotronik2", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase3() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 3);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.pasteFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        }
        ;
        Thread.sleep(3000);
        sendingIdcoFile.checkIfFilesGotSend(originalPaths);
        compareCrt(BiotronikExpectedTasksTestCase3.BiotronikTestCase3List, "Biotronik3", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase4() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 4);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.pasteFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        }
        ;
        Thread.sleep(3000);
        sendingIdcoFile.checkIfFilesGotSend(originalPaths);
        compareCrt(BiotronikExpectedTasksTestCase4.BiotronikTestCase4List, "Biotronik4", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase5() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 5);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.pasteFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        }
        ;
        Thread.sleep(3000);
        sendingIdcoFile.checkIfFilesGotSend(originalPaths);
        compareCrt(BiotronikExpectedTasksTestCase5.BiotronikTestCase5List, "Biotronik5", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase6() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 6);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.pasteFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        }
        ;
        Thread.sleep(3000);
        sendingIdcoFile.checkIfFilesGotSend(originalPaths);
        compareCrt(BiotronikExpectedTasksTestCase6.BiotronikTestCase6List, "Biotronik6", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase7() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 7);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%",};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.pasteFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        }
        ;
        Thread.sleep(3000);
        sendingIdcoFile.checkIfFilesGotSend(originalPaths);
        compareCrt(BiotronikExpectedTasksTestCase7.BiotronikTestCase7List, "Biotronik7", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase8() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 8);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.pasteFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        }
        ;
        Thread.sleep(3000);
        sendingIdcoFile.checkIfFilesGotSend(originalPaths);
        compareCrt(BiotronikExpectedTasksTestCase8.BiotronikTestCase8List, "Biotronik8", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase9() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 9);
        fileName = new String[]{"Biotronik Implant CRT 93% LV 93%"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        sendingIdcoFile.pasteFile(pathToOldHl7, pathToInput);
        originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.checkIfFilesGotSend(originalPaths);
        compareCrt(BiotronikExpectedTasksTestCase9.BiotronikTestCase9List, "Biotronik9", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase10() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 10);
        fileName = new String[]{"Biotronik Implant CRT 93% LV 93%", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant added EOS added 100% CRT and LV"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        sendingIdcoFile.pasteFile(pathToOldHl7, pathToInput);
        originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.checkIfFilesGotSend(originalPaths);
        compareCrt(BiotronikExpectedTasksTestCase10.BiotronikTestCase10List, "Biotronik10", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

}

