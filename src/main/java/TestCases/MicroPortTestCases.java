package TestCases;

import MicroPortTestCasesExpectedTasks.*;

import static SeleniumThresholds.ThresholdCheckMethod.thresholdCheck;
import static selenium.CompareTasksInCardio.choosepatient;
import static selenium.CompareTasksInCardio.compareCrt;
import static selenium.DeletingTasks.deleteTask;
import static selenium.PasteFile.pasteFile;

public class MicroPortTestCases {
    //Testcase1
    String rootDir= System.getProperty("user.dir");
//TODO need to make it ubuntu path
    String fileDirectory = rootDir + "/src/main/resources/MicroPort/";
    String FfInputPath = rootDir + "/input/";
    String[] fileName;

    public MicroPortTestCases() throws Exception {
        microportTestCase1();
    }
    public void microportTestCase1() throws Exception {
        //Set Template needs to be done before
        choosepatient("Sel-Microport");
        thresholdCheck("Microport", 1);
        fileName = new String[]{"added EOS, added ERI, [A9] Ventrikuläre Elektrodenimped"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        compareCrt(MicroPortExpectedTasksTestCase1.MicroPortTestCase1List);
        deleteTask();
}
    public void microportTestCase2() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Microport", 2)
        fileName = new String[]{"added ERI", "added EOS"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(MicroPortExpectedTasksTestCase2.MicroPortTestCase2List);
        deleteTask();
    }

    public void microportTestCase3() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Microport", 3)
        fileName = new String[]{"4 9 10 13 14 60 24 A30"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(MicroPortExpectedTasksTestCase3.MicroPortTestCase3List);
        deleteTask();
    }

    public void microportTestCase4() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Microport", 4)
        fileName = new String[]{"4 9 10 13 14 60 24 A30"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(MicroPortExpectedTasksTestCase4.MicroPortTestCase4List);
        deleteTask();
    }

    public void microportTestCase5() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Microport", 5)
        fileName = new String[]{"4 9 10 13 14 60 24 A30"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(MicroPortExpectedTasksTestCase5.MicroPortTestCase5List);
        deleteTask();
    }

    public void microportTestCase6() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Microport", 6)
        fileName = new String[]{"added EOS", "added ERI"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(MicroPortExpectedTasksTestCase6.MicroPortTestCase6List);
        deleteTask();
    }

    public void microportTestCase7() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Microport", 7)
        fileName = new String[]{"added EOS", "added ERI"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(MicroPortExpectedTasksTestCase7.MicroPortTestCase7List);
        deleteTask();
    }

}

