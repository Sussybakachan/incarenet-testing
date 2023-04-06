package TestCases;

import AbbottTestCasesExpectedTasks.*;
import helpers.interfaces.FileSender;

import static SeleniumThresholds.Deselect.deselectAll;
import static SeleniumThresholds.ThresholdCheckMethod.thresholdCheck;
import static selenium.CompareTasksInCardio.choosepatient;
import static selenium.CompareTasksInCardio.compareCrt;
import static selenium.DeletingTasks.deleteTask;


public class AbbottTestCases {

    public record Options(
            FileSender fileSender
    ) {
    }

    ;

    //Testcase1
    GeneratedTasks g = new GeneratedTasks();
    String rootDir = System.getProperty("user.dir");
    //TODO need to make it ubuntu path

    //TODO questrich at the end of sourceFileDirectory
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

            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%.hl7"});
            Thread.sleep(5000);
            // XXX: Should make a function that is more specific to what is needed in this test case.
            compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());

        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deselectAll();
        }
    }


    public void abbottTestCase2() throws Exception {

        try {
            thresholdCheck("Abbott", 2);
            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%.hl7"});
            // XXX: Should make a function that is more specific to what is needed in this test case.
            Thread.sleep(5000);
            compareCrt(AbbottExpectedTasksTestCase2.AbbottTestCase2List, "Abbott2", g.getGeneratedTasks());
        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase3() throws Exception {
        //Set Template needs to be done before
        try {
            thresholdCheck("Abbott", 3);
            //the sourceFileDirectory should be for all the files that are going to be sent
            this.fileSender.sendFile((new String[]{
                    "Abbott Implant CRT 84%.hl7",
                    "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7",
                    "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7",
                    "Abbott Implant CRT 96%.hl7"
            }));
            Thread.sleep(5000);
            // XXX: Should make a function that is more specific to what is needed in this test case.
            compareCrt(AbbottExpectedTasksTestCase3.AbbottTestCase3List, "Abbott3", g.getGeneratedTasks());

        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase4() throws Exception {

        try {
            //Set Template needs to be done before
            thresholdCheck("Abbott", 4);
            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%.hl7", "Abbott Implant CRT 96%.hl7", "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7", "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7"});
            Thread.sleep(5000);
            // XXX: Should make a function that is more specific to what is needed in this test case.
            compareCrt(AbbottExpectedTasksTestCase4.AbbottTestCase4List, "Abbott4", g.getGeneratedTasks());

        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase5() throws Exception {
        try {
            //Set Template needs to be done before
            thresholdCheck("Abbott", 5);

            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%.hl7", "Abbott Implant CRT 96%.hl7", "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7", "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7"});
            Thread.sleep(5000);
            // XXX: Should make a function that is more specific to what is needed in this test case.
            compareCrt(AbbottExpectedTasksTestCase5.AbbottTestCase5List, "Abbott5", g.getGeneratedTasks());

        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase6() throws Exception {
        try {
            //Set Template needs to be done before
            thresholdCheck("Abbott", 6);

            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%.hl7", "Abbott Implant CRT 96%.hl7", "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7", "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7"});
            Thread.sleep(5000);
            // XXX: Should make a function that is more specific to what is needed in this test case.
            compareCrt(AbbottExpectedTasksTestCase6.AbbottTestCase6List, "Abbott6", g.getGeneratedTasks());
        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deselectAll();
        }

        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deselectAll();
    }

    public void abbottTestCase7() throws Exception {
        try {
            //Set Template needs to be done before
            thresholdCheck("Abbott", 7);

            this.fileSender.sendFile(new String[]{"Abbott Implant manipulated Batt-stat ERI added 100% CRT", "Abbott Implant CRT 84%", "Abbott Implant manipulated Batt-stat EOS added 100% CRT"});
            Thread.sleep(5000);
            // XXX: Should make a function that is more specific to what is needed in this test case.
            compareCrt(AbbottExpectedTasksTestCase7.AbbottTestCase7List, "Abbott7", g.getGeneratedTasks());
        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase8() throws Exception {
        try {
            //Set Template needs to be done before
            thresholdCheck("Abbott", 8);

            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 96%"});
            Thread.sleep(5000);
            // XXX: Should make a function that is more specific to what is needed in this test case.
            compareCrt(AbbottExpectedTasksTestCase8.AbbottTestCase8List, "Abbott8", g.getGeneratedTasks());
        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase9() throws Exception {

        try {
            //Set Template needs to be done before
            thresholdCheck("Abbott", 9);

            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%"});
            Thread.sleep(5000);
            // XXX: Should make a function that is more specific to what is needed in this test case.
            compareCrt(AbbottExpectedTasksTestCase9.AbbottTestCase9List, "Abbott9", g.getGeneratedTasks());
        } finally {


            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase10() throws Exception {
        //Set Template needs to be done before
        try {
            thresholdCheck("Abbott", 10);

            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%.hl7", "Abbott Implant CRT 96%.hl7", "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7", "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7"});
            Thread.sleep(5000);
            // XXX: Should make a function that is more specific to what is needed in this test case.
            compareCrt(AbbottExpectedTasksTestCase10.AbbottTestCase10List, "Abbott10", g.getGeneratedTasks());
        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deselectAll();
        }

    }
}

