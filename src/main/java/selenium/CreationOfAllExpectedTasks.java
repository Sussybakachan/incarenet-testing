package selenium;

import BiotronikTestCasesExpertedTasks.*;
import BostonTestCasesExpertedTasks.BostonExpectedTasksTestCase1;
import BostonTestCasesExpertedTasks.*;

import static AbbottTestCasesExpectedTasks.AbbottExpectedTasksTestCase1.createAbbottGeneralYellowTask;
import static AbbottTestCasesExpectedTasks.AbbottTestCaseNoTask.createAbbottNoTask;
import static BiotronikTestCasesExpertedTasks.BiotronikExpectedTasksTestCase2.*;
import static ExpectedTasks.MicroPortExpectedTasks.createMicroPortWhiteTask;
import static selenium.ExpectedTasks.createAbbottTestExpectedTask;

public class CreationOfAllExpectedTasks {
    public static void createExpectedTasks() {
        createMicroPortWhiteTask();
        createAbbottTestExpectedTask();
    }

    public static void createBiotronikExpectedTasks() {
        createBiotronikERIAlarmTask();
        createBiotronikEOSAlarmTask();
        createBiotronikEOSTask();
        createBiotronikERITask();
        createBiotronik93CrtTask();
        createBiotronik93LvTask();
        createBiotronik93generalTask();
        createAbbottTestExpectedTask();
        createAbbottGeneralYellowTask();
        createAbbottNoTask();
        BiotronikExpectedTasksTestCase3 biotronikExpectedTasksTestCase3 = new BiotronikExpectedTasksTestCase3();
        BiotronikExpectedTasksTestCase4 biotronikExpectedTasksTestCase4 = new BiotronikExpectedTasksTestCase4();
        BiotronikExpectedTasksTestCase5 biotronikExpectedTasksTestCase5 = new BiotronikExpectedTasksTestCase5();
        BiotronikExpectedTasksTestCase6 biotronikExpectedTasksTestCase6 = new BiotronikExpectedTasksTestCase6();
        BiotronikExpectedTasksTestCase7 biotronikExpectedTasksTestCase7 = new BiotronikExpectedTasksTestCase7();
        BostonExpectedTasksTestCase1 bostonExpectedTasksTestCase1 = new BostonExpectedTasksTestCase1();
        BostonExpectedTasksTestCase2 bostonExpectedTasksTestCase2  = new BostonExpectedTasksTestCase2();
        BostonExpectedTasksTestCase3 bostonExpectedTasksTestCase3  = new BostonExpectedTasksTestCase3();
        BostonExpectedTasksTestCase4 bostonExpectedTasksTestCase4 = new BostonExpectedTasksTestCase4();
        BostonExpectedTasksTestCase5 bostonExpectedTasksTestCase5 = new BostonExpectedTasksTestCase5();
        BostonExpectedTasksTestCase6 bostonExpectedTasksTestCase6 = new BostonExpectedTasksTestCase6();
        BostonExpectedTasksTestCase7 bostonExpectedTasksTestCase7 = new BostonExpectedTasksTestCase7();
        BostonExpectedTasksTestCase8 bostonExpectedTasksTestCase8 = new BostonExpectedTasksTestCase8();
    }

}
