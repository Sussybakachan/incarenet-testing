package TestCases;

import AbbottTestCasesExpectedTasks.AbbottExpectedTasksTestCase1;
import helpers.fileForwarder.FileForwarderSender;
import helpers.interfaces.FileSender;

import static SeleniumThresholds.Deselect.deselectAll;
import static SeleniumThresholds.ThresholdCheckMethod.thresholdCheck;
import static selenium.CompareTasksInCardio.choosepatient;
import static selenium.CompareTasksInCardio.compareCrt;
import static selenium.DeletingTasks.deleteTask;



public class AbbottTestCases {

    public record Options (
       FileSender fileSender
    ){};

    //Testcase1
    GeneratedTasks g = new GeneratedTasks();
    String rootDir = System.getProperty("user.dir");
    //TODO need to make it ubuntu path

    //TODO questrich at the end of fileDirectory
    String fileDirectory = rootDir + "/resources/Selenium-IDCO-Files/Abbott/";
    private FileSender fileSender;
    String[] fileNames;

    public AbbottTestCases(Options options) throws Exception {
        choosepatient("Sel-Abbott");

        this.fileSender = options.fileSender;

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

    // When an abott ico filee is sent, a corresponding task has been generated correctly.
    public void abbottTestCase1() throws Exception {
        try {
            thresholdCheck("Abbott", 1);

            this.fileSender.sendFile(new String[]{fileDirectory + "Abbott Implant CRT 84%.hl7"});

            // XXX: Should make a function that is more specific to what is needed in this test case.
            compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());

            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deselectAll();
        }
    }


//        sendingIdcoFile.checkUnsuccessfullySendFiles(FfInputPath, fileNames);
//        //getGeneratedTasks();
//        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());
//        deleteTask();
//        deselectAll();


    public void abbottTestCase2() throws Exception {
        thresholdCheck("Abbott", 2);
        this.fileSender.sendFile(new String[]{fileDirectory + "Abbott Implant CRT 84%.hl7"});

        // XXX: Should make a function that is more specific to what is needed in this test case.
        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());

        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deleteTask();
        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deselectAll();
    }

    public void abbottTestCase3() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 3);
        this.fileSender.sendFile(new String[]{fileDirectory + "Abbott Implant CRT 84%.hl7", "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7", "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7", "Abbott Implant CRT 96%.hl7"});

        // XXX: Should make a function that is more specific to what is needed in this test case.
        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());

        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deleteTask();
        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deselectAll();
    }

    public void abbottTestCase4() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 4);
        this.fileSender.sendFile(new String[]{fileDirectory + "Abbott Implant CRT 84%.hl7", "Abbott Implant CRT 96%.hl7", "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7", "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7"});

        // XXX: Should make a function that is more specific to what is needed in this test case.
        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());

        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deselectAll();
    }

    public void abbottTestCase5() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 5);

        this.fileSender.sendFile(new String[]{fileDirectory + "Abbott Implant CRT 84%.hl7", "Abbott Implant CRT 96%.hl7", "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7", "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7"});

        // XXX: Should make a function that is more specific to what is needed in this test case.
        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());

        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deselectAll();
    }

    public void abbottTestCase6() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 6);

        this.fileSender.sendFile(new String[]{fileDirectory + "Abbott Implant CRT 84%.hl7", "Abbott Implant CRT 96%.hl7", "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7", "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7"});

        // XXX: Should make a function that is more specific to what is needed in this test case.
        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());

        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deleteTask();
        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deselectAll();
    }

    public void abbottTestCase7() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 7);

        this.fileSender.sendFile(new String[]{fileDirectory + "Abbott Implant manipulated Batt-stat ERI added 100% CRT", "Abbott Implant CRT 84%", "Abbott Implant manipulated Batt-stat EOS added 100% CRT"});

        // XXX: Should make a function that is more specific to what is needed in this test case.
        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());

        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deleteTask();
        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deselectAll();
    }

    public void abbottTestCase8() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 8);

        this.fileSender.sendFile(new String[]{fileDirectory + "Abbott Implant CRT 96%"});

        // XXX: Should make a function that is more specific to what is needed in this test case.
        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());

        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deleteTask();
        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deselectAll();
    }

    public void abbottTestCase9() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 9);

        this.fileSender.sendFile(new String[]{fileDirectory + "Abbott Implant CRT 84%"});

        // XXX: Should make a function that is more specific to what is needed in this test case.
        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());

        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deleteTask();
        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deselectAll();
    }

    public void abbottTestCase10() throws Exception {
        //Set Template needs to be done before
        thresholdCheck("Abbott", 10);

        this.fileSender.sendFile(new String[]{fileDirectory + "Abbott Implant CRT 84%.hl7", "Abbott Implant CRT 96%.hl7", "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7", "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7"});

        // XXX: Should make a function that is more specific to what is needed in this test case.
        compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());

        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deleteTask();
        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deselectAll();
    }

}

