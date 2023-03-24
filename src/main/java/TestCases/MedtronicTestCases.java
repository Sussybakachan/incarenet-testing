package TestCases;

import MedtronicTestCasesExpectedTasks.*;
import selenium.PasteFile;

import java.util.ArrayList;
import java.util.List;

import static SeleniumThresholds.Deselect.deselectAll;
import static SeleniumThresholds.ThresholdCheckMethod.thresholdCheck;
import static selenium.CompareTasksInCardio.choosepatient;
import static selenium.CompareTasksInCardio.compareCrt;
import static selenium.DeletingTasks.deleteTask;

public class MedtronicTestCases {
    //Testcase1
    String rootDir= System.getProperty("user.dir");
//TODO need to make it ubuntu path
    GeneratedTasks g = new GeneratedTasks();
    String fileDirectory = rootDir + "/resources/Selenium-IDCO-Files/Medtronic/";
    String FfInputPath = rootDir + "/input/";
    PasteFile sendingIdcoFile = new PasteFile();
    String[] fileName;

    public MedtronicTestCases() throws Exception {
        choosepatient("Sel-Medtronic");
        medtronicTestCase1();
        medtronicTestCase2();
        medtronicTestCase3();
        medtronicTestCase4();
        medtronicTestCase5();
        medtronicTestCase6();
        medtronicTestCase7();
        medtronicTestCase8();
        medtronicTestCase9();
        medtronicTestCase10();
    }
    public void medtronicTestCase1() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Medtronic", 1);
        fileName = new String[]{"Medtronic Implant CRT 98.07% LV 98.07%"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(MedtronicExpectedTasksTestCase1.MedtronicTestCase1List, "Medtronic1", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
}
    public void medtronicTestCase2() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Medtronic", 2);
        fileName = new String[]{"Medtronic Implant CRT 98.07% LV 98.07%", "Medtronic Implant LV 76.95% 76.95% CRT", "Medtronic Implant added EOS and added LV 100%", "Medtronic Implant added ERI and added LV 100%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(MedtronicExpectedTasksTestCase2.MedtronicTestCase2List, "Medtronic2", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void medtronicTestCase3() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Medtronic", 3);
        fileName = new String[]{"Medtronic Implant CRT 98.07% LV 98.07%", "Medtronic Implant LV 76.95% 76.95% CRT", "Medtronic Implant added EOS and added LV 100%", "Medtronic Implant added ERI and added LV 100%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(MedtronicExpectedTasksTestCase3.MedtronicTestCase3List, "Medtronic3", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void medtronicTestCase4() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Medtronic", 4);
        fileName = new String[]{"Medtronic Implant added EOS and added LV 100%", "Medtronic Implant added ERI and added LV 100%", "Medtronic Implant CRT 98.07% LV 98.07%", "Medtronic Implant LV 76.95% 76.95% CRT"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String a = fileName[i];
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(MedtronicExpectedTasksTestCase4.MedtronicTestCase4List, "Medtronic4", g.getGeneratedTasks());
        deselectAll();
    }

    public void medtronicTestCase5() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Medtronic", 5);
        fileName = new String[]{"Medtronic Implant added EOS and added LV 100%", "Medtronic Implant added ERI and added LV 100%", "Medtronic Implant CRT 98.07% LV 98.07%", "Medtronic Implant LV 76.95% 76.95% CRT"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(MedtronicExpectedTasksTestCase5.MedtronicTestCase5List, "Medtronic5", g.getGeneratedTasks());
        deselectAll();
    }

    public void medtronicTestCase6() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Medtronic", 6);
        fileName = new String[]{"Medtronic Implant added EOS and added LV 100%", "Medtronic Implant added ERI and added LV 100%", "Medtronic Implant CRT 98.07% LV 98.07%", "Medtronic Implant LV 76.95% 76.95% CRT"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(MedtronicExpectedTasksTestCase6.MedtronicTestCase6List, "Medtronic6", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void medtronicTestCase7() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Medtronic", 7);
        fileName = new String[]{"Medtronic Implant LV 76.95% 76.95% CRT", "Medtronic Implant added EOS and added LV 100%", "Medtronic Implant added ERI and added LV 100%"};
        List<String> originalPaths = new ArrayList<String>();
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        };
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(MedtronicExpectedTasksTestCase7.MedtronicTestCase7List, "Medtronic7", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void medtronicTestCase8() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Medtronic", 8);
        fileName = new String[]{"Medtronic Implant CRT 98.07% LV 98.07%"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory + fileName[0]  + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(MedtronicExpectedTasksTestCase8.MedtronicTestCase8List, "Medtronic8", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void medtronicTestCase9() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Medtronic", 9);
        fileName = new String[]{"Medtronic Implant CRT 98.07% LV 98.07%"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(MedtronicExpectedTasksTestCase9.MedtronicTestCase9List, "Medtronic9", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void medtronicTestCase10() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Medtronic", 10);
        fileName = new String[]{"Medtronic Implant CRT 98.07% LV 98.07%"};
        List<String> originalPaths = new ArrayList<String>();
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        sendingIdcoFile.copyFile(pathToOldHl7, pathToInput);
            originalPaths.add(pathToOldHl7);
        Thread.sleep(3000);
        sendingIdcoFile.waitUntilFilesGotProcessed(originalPaths);
        compareCrt(MedtronicExpectedTasksTestCase10.MedtronicTestCase10List, "Medtronic10", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

}

