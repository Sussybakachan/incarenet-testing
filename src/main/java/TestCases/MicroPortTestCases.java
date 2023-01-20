package TestCases;

import MicroPortTestCasesExpectedTasks.*;

import static SeleniumThresholds.Deselect.deselectAll;
import static SeleniumThresholds.ThresholdCheckMethod.thresholdCheck;
import static selenium.CompareTasksInCardio.choosepatient;
import static selenium.CompareTasksInCardio.compareCrt;
import static selenium.DeletingTasks.deleteTask;
import static selenium.PasteFile.pasteFile;
import static selenium.PdfCheck.pdfCheck;

public class MicroPortTestCases {
    //Testcase1
    GeneratedTasks g = new GeneratedTasks();
    String rootDir= System.getProperty("user.dir");
//TODO need to make it ubuntu path
    String fileDirectory = rootDir + "/src/main/resources/Selenium-IDCO-Files/MicroPort/";
    String FfInputPath = rootDir + "/input/";
    String[] fileName;

    public MicroPortTestCases() throws Exception {
        microportTestCase1();
        microportTestCase2();
        microportTestCase3();
        microportTestCase4();
        microportTestCase5();
        microportTestCase6();
        microportTestCase7();
    }
    public void microportTestCase1() throws Exception {
        //Set Template needs to be done before
        choosepatient("Sel-MicroPort");
        thresholdCheck("MicroPort", 1);
        fileName = new String[]{"added EOS", "added ERI", "[A9] Ventrikuläre Elektrodenimped"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".json";
            String pathToInput = FfInputPath + fileName[i] + ".json";
            pasteFile(pathToOldHl7, pathToInput);
        };
        compareCrt(MicroPortExpectedTasksTestCase1.MicroPortTestCase1List, "MicroPort1", g.getGeneratedTasks());
        deselectAll();
}
    public void microportTestCase2() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("MicroPort", 2);
        fileName = new String[]{"added ERI", "added EOS"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".json";
            String pathToInput = FfInputPath + fileName[i] + ".json";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(MicroPortExpectedTasksTestCase2.MicroPortTestCase2List, "MicroPort2", g.getGeneratedTasks());
        pdfCheck();
        deleteTask();
        deselectAll();
    }

    public void microportTestCase3() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("MicroPort", 3);
        fileName = new String[]{"4 9 10 13 14 60 24 A30"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".json";
        String pathToInput = FfInputPath + fileName[0] + ".json";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(MicroPortExpectedTasksTestCase3.MicroPortTestCase3List, "MicroPort3", g.getGeneratedTasks());
        pdfCheck();
        deleteTask();
        deselectAll();
    }

    public void microportTestCase4() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("MicroPort", 4);
        fileName = new String[]{"4 9 10 13 14 60 24 A30"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".json";
        String pathToInput = FfInputPath + fileName[0] + ".json";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(MicroPortExpectedTasksTestCase4.MicroPortTestCase4List, "MicroPort4", g.getGeneratedTasks());
        pdfCheck();
        deleteTask();
        deselectAll();
    }

    public void microportTestCase5() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("MicroPort", 5);
        fileName = new String[]{"4 9 10 13 14 60 24 A30"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".json";
        String pathToInput = FfInputPath + fileName[0] + ".json";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(MicroPortExpectedTasksTestCase5.MicroPortTestCase5List, "MicroPort5", g.getGeneratedTasks());
        pdfCheck();
        deleteTask();
        deselectAll();
    }

    public void microportTestCase6() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("MicroPort", 6);
        fileName = new String[]{"added EOS", "added ERI"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".json";
            String pathToInput = FfInputPath + fileName[i] + ".json";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(MicroPortExpectedTasksTestCase6.MicroPortTestCase6List, "MicroPort6", g.getGeneratedTasks());
        deselectAll();
    }

    public void microportTestCase7() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("MicroPort", 7);
        fileName = new String[]{"added EOS", "added ERI"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".json";
            String pathToInput = FfInputPath + fileName[i] + ".json";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(MicroPortExpectedTasksTestCase7.MicroPortTestCase7List, "MicroPort7", g.getGeneratedTasks());
        pdfCheck();
        deleteTask();
        deselectAll();
    }

}

