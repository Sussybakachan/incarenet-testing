package TestCases;

import BiotronikTestCasesExpectedTasks.*;

import static SeleniumThresholds.ThresholdCheckMethod.thresholdCheck;
import static selenium.CompareTasksInCardio.choosepatient;
import static selenium.CompareTasksInCardio.compareCrt;
import static selenium.DeletingTasks.deleteTask;
import static selenium.PasteFile.pasteFile;

public class BiotronikTestCases {
    //Testcase1
    String rootDir= System.getProperty("user.dir");
//TODO need to make it ubuntu path
    String fileDirectory = rootDir + "/src/main/resources/Biotronik/";
    String FfInputPath = rootDir + "/input/";
    String[] fileName;

    public BiotronikTestCases() throws Exception {
        biotronikTestCase1();
    }
    public void biotronikTestCase1() throws Exception {
        //Set Template needs to be done before
        choosepatient("Sel-Biotronik");
        thresholdCheck("Biotronik", 1);
        fileName = new String[]{"Biotronik Implant CRT 97% LV 97%"};
        String pathToOldHl7 = fileDirectory + fileName[0] + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
       pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase1.BiotronikTestCase1List);
        deleteTask();
}
    public void BiotronikTestCase2() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Biotronik", 2)
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase2.BiotronikTestCase2List);
        deleteTask();
    }

    public void BiotronikTestCase3() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Biotronik", 3)
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase3.BiotronikTestCase3List);
        deleteTask();
    }

    public void BiotronikTestCase4() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Biotronik", 4)
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase4.BiotronikTestCase4List);
        deleteTask();
    }

    public void BiotronikTestCase5() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Biotronik", 5)
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase5.BiotronikTestCase5List);
        deleteTask();
    }

    public void BiotronikTestCase6() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Biotronik", 6)
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase6.BiotronikTestCase6List);
        deleteTask();
    }

    public void BiotronikTestCase7() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Biotronik", 7)
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%", };
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase7.BiotronikTestCase7List);
        deleteTask();
    }

    public void BiotronikTestCase8() throws Exception {
        //Set Template needs to be done before
        //thresholdCheck("Biotronik", 8)
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        String pathToOldHl7 = fileDirectory + fileName[0]  + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase8.BiotronikTestCase8List);
        deleteTask();
    }

}

