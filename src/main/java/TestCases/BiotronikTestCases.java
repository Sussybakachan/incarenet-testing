package TestCases;

import BiotronikTestCasesExpectedTasks.*;

import static SeleniumThresholds.Deselect.deselectAll;
import static SeleniumThresholds.ThresholdCheckMethod.thresholdCheck;
import static selenium.CompareTasksInCardio.choosepatient;
import static selenium.CompareTasksInCardio.compareCrt;
import static selenium.DeletingTasks.deleteTask;
import static selenium.PasteFile.pasteFile;

public class BiotronikTestCases {
    //Testcase1
    GeneratedTasks g = new GeneratedTasks();
    String rootDir= System.getProperty("user.dir");
//TODO need to make it ubuntu path
    String fileDirectory = rootDir + "/src/main/resources/Biotronik/";
    String FfInputPath = rootDir + "/input/";
    String[] fileName;

    public BiotronikTestCases() throws Exception {
        biotronikTestCase1();
        biotronikTestCase2();
        biotronikTestCase3();
        biotronikTestCase5();
        biotronikTestCase6();
        biotronikTestCase7();
        biotronikTestCase8();
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
        compareCrt(BiotronikExpectedTasksTestCase1.BiotronikTestCase1List, "Biotronik1", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
}
    public void biotronikTestCase2() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 2);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase2.BiotronikTestCase2List, "Biotronik2", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase3() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 3);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase3.BiotronikTestCase3List, "Biotronik3", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase4() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 4);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase4.BiotronikTestCase4List, "Biotronik4", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase5() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 5);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase5.BiotronikTestCase5List, "Biotronik5", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase6() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 6);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase6.BiotronikTestCase6List, "Biotronik6", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase7() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 7);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%", };
        for (int i = 0; i < fileName.length; i++) {
            String pathToOldHl7 = fileDirectory + fileName[i] + ".hl7";
            String pathToInput = FfInputPath + fileName[i] + ".hl7";
            pasteFile(pathToOldHl7, pathToInput);
        };
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase7.BiotronikTestCase7List, "Biotronik7", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

    public void biotronikTestCase8() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Biotronik", 8);
        fileName = new String[]{"Biotronik Implant added EOS added 100% CRT and LV", "Biotronik Implant added ERI added 100% CRT and LV", "Biotronik Implant CRT 93% LV 93%", "Biotronik Implant CRT 97% LV 97%"};
        String pathToOldHl7 = fileDirectory + fileName[0]  + ".hl7";
        String pathToInput = FfInputPath + fileName[0] + ".hl7";
        pasteFile(pathToOldHl7, pathToInput);
        Thread.sleep(10000);
        compareCrt(BiotronikExpectedTasksTestCase8.BiotronikTestCase8List, "Biotronik8", g.getGeneratedTasks());
        deleteTask();
        deselectAll();
    }

}

