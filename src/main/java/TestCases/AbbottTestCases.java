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

    GeneratedTasks g = new GeneratedTasks();
    private FileSender fileSender;

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

    // When an abbott IDCO file is sent, a corresponding task has been generated correctly.
    public void abbottTestCase1() throws Exception {
        try {
            //Set Template needs to be done before the actual test case
            thresholdCheck("Abbott", 1);
            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%.hl7"});
            //Thread.sleep is needed to make sure inCARDO has time to create the tasks
            Thread.sleep(5000);
            // XXX: compareCRT should be split in smaller functions and should be renamed
            compareCrt(AbbottExpectedTasksTestCase1.AbbottTestCase1List, "Abbott1", g.getGeneratedTasks());

        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the thresholds' template is deselected before the next test case is run.
            deselectAll();
        }
    }


    public void abbottTestCase2() throws Exception {

        try {
            //Set Template needs to be done before the actual test case
            thresholdCheck("Abbott", 2);
            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%.hl7"});
            //Thread.sleep is needed to make sure inCARDO has time to create the tasks
            Thread.sleep(5000);
            // XXX: compareCRT should be split in smaller functions and should be renamed
            compareCrt(AbbottExpectedTasksTestCase2.AbbottTestCase2List, "Abbott2", g.getGeneratedTasks());
        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the thresholds' template is deselected before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase3() throws Exception {
        try {
            //Set Template needs to be done before the actual test case
            thresholdCheck("Abbott", 3);
            this.fileSender.sendFile((new String[]{
                    "Abbott Implant CRT 84%.hl7",
                    "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7",
                    "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7",
                    "Abbott Implant CRT 96%.hl7"
            }));
            //Thread.sleep is needed to make sure inCARDO has time to create the tasks
            Thread.sleep(5000);
            // XXX: compareCRT should be split in smaller functions and should be renamed
            compareCrt(AbbottExpectedTasksTestCase3.AbbottTestCase3List, "Abbott3", g.getGeneratedTasks());

        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the thresholds' template is deselected before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase4() throws Exception {

        try {
            //Set Template needs to be done before the actual test case
            thresholdCheck("Abbott", 4);
            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%.hl7", "Abbott Implant CRT 96%.hl7", "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7", "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7"});
            //Thread.sleep is needed to make sure inCARDO has time to create the tasks
            Thread.sleep(5000);
            // XXX: compareCRT should be split in smaller functions and should be renamed
            compareCrt(AbbottExpectedTasksTestCase4.AbbottTestCase4List, "Abbott4", g.getGeneratedTasks());

        } finally {
            //no deleting needed since tasks are not expected to be generated
            // XXX: This is a hack to make sure that the thresholds' template is deselected before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase5() throws Exception {
        try {
            //Set Template needs to be done before the actual test case
            thresholdCheck("Abbott", 5);

            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%.hl7", "Abbott Implant CRT 96%.hl7", "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7", "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7"});
            //Thread.sleep is needed to make sure inCARDO has time to create the tasks
            Thread.sleep(5000);
            // XXX: compareCRT should be split in smaller functions and should be renamed
            compareCrt(AbbottExpectedTasksTestCase5.AbbottTestCase5List, "Abbott5", g.getGeneratedTasks());

        } finally {
            // XXX: This is a hack to make sure that the thresholds' template is deselected before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase6() throws Exception {
        try {
            //Set Template needs to be done before the actual test case
            thresholdCheck("Abbott", 6);

            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%.hl7", "Abbott Implant CRT 96%.hl7", "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7", "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7"});
            //Thread.sleep is needed to make sure inCARDO has time to create the tasks
            Thread.sleep(5000);
            // XXX: compareCRT should be split in smaller functions and should be renamed
            compareCrt(AbbottExpectedTasksTestCase6.AbbottTestCase6List, "Abbott6", g.getGeneratedTasks());
        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the thresholds' template is deselected before the next test case is run.
            deselectAll();
        }

        // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
        deselectAll();
    }

    public void abbottTestCase7() throws Exception {
        try {
            //Set Template needs to be done before the actual test case
            thresholdCheck("Abbott", 7);

            this.fileSender.sendFile(new String[]{"Abbott Implant manipulated Batt-stat ERI added 100% CRT", "Abbott Implant CRT 84%", "Abbott Implant manipulated Batt-stat EOS added 100% CRT"});
            //Thread.sleep is needed to make sure inCARDO has time to create the tasks
            Thread.sleep(5000);
            // XXX: compareCRT should be split in smaller functions and should be renamed
            compareCrt(AbbottExpectedTasksTestCase7.AbbottTestCase7List, "Abbott7", g.getGeneratedTasks());
        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the thresholds' template is deselected before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase8() throws Exception {
        try {
            //Set Template needs to be done before the actual test case
            thresholdCheck("Abbott", 8);

            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 96%"});
            //Thread.sleep is needed to make sure inCARDO has time to create the tasks
            Thread.sleep(5000);
            // XXX: compareCRT should be split in smaller functions and should be renamed
            compareCrt(AbbottExpectedTasksTestCase8.AbbottTestCase8List, "Abbott8", g.getGeneratedTasks());
        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the thresholds' template is deselected before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase9() throws Exception {

        try {
            //Set Template needs to be done before the actual test case
            thresholdCheck("Abbott", 9);

            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%"});
            //Thread.sleep is needed to make sure inCARDO has time to create the tasks
            Thread.sleep(5000);
            // XXX: compareCRT should be split in smaller functions and should be renamed
            compareCrt(AbbottExpectedTasksTestCase9.AbbottTestCase9List, "Abbott9", g.getGeneratedTasks());
        } finally {


            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the thresholds' template is deselected before the next test case is run.
            deselectAll();
        }
    }

    public void abbottTestCase10() throws Exception {
        //Set Template needs to be done before the actual test case
        try {
            thresholdCheck("Abbott", 10);

            this.fileSender.sendFile(new String[]{"Abbott Implant CRT 84%.hl7", "Abbott Implant CRT 96%.hl7", "Abbott Implant manipulated Batt-stat EOS added 100% CRT.hl7", "Abbott Implant manipulated Batt-stat ERI added 100% CRT.hl7"});
            //Thread.sleep is needed to make sure inCARDO has time to create the tasks
            Thread.sleep(5000);
            // XXX: compareCRT should be split in smaller functions and should be renamed
            compareCrt(AbbottExpectedTasksTestCase10.AbbottTestCase10List, "Abbott10", g.getGeneratedTasks());
        } finally {
            // XXX: This is a hack to make sure that the file is deleted before the next test case is run.
            deleteTask();
            // XXX: This is a hack to make sure that the thresholds' template is deselected before the next test case is run.
            deselectAll();
        }

    }
}

