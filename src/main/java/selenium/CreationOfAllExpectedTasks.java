package selenium;

import AbbottTestCasesExpectedTasks.*;
import BiotronikTestCasesExpertedTasks.*;
import BostonTestCasesExpertedTasks.BostonExpectedTasksTestCase1;
import BostonTestCasesExpertedTasks.*;

import static AbbottTestCasesExpectedTasks.AbbottExpectedTasksTestCase1.createAbbottGeneralYellowTask;
import static BiotronikTestCasesExpertedTasks.BiotronikExpectedTasksTestCase2.*;
import static ExpectedTasks.MicroPortExpectedTasks.createMicroPortWhiteTask;
import static selenium.ExpectedTasks.createAbbottTestExpectedTask;

public class CreationOfAllExpectedTasks {
    public static void createExpectedTasks() {
        createMicroPortWhiteTask();
        createAbbottTestExpectedTask();
    }

    public static void createBiotronikExpectedTasks() {
        AbbottExpectedTasksTestCase2 abbottExpectedTasksTestCase2 = new AbbottExpectedTasksTestCase2();
        AbbottExpectedTasksTestCase3 abbottExpectedTasksTestCase3 = new AbbottExpectedTasksTestCase3();
        AbbottExpectedTasksTestCase4 abbottExpectedTasksTestCase4 = new AbbottExpectedTasksTestCase4();
        AbbottExpectedTasksTestCase5 abbottExpectedTasksTestCase5 = new AbbottExpectedTasksTestCase5();
        AbbottExpectedTasksTestCase6 abbottExpectedTasksTestCase6 = new AbbottExpectedTasksTestCase6();
        AbbottExpectedTasksTestCase7 abbottExpectedTasksTestCase7 = new AbbottExpectedTasksTestCase7();
        AbbottExpectedTasksTestCase8 abbottExpectedTasksTestCase8 = new AbbottExpectedTasksTestCase8();
        AbbottExpectedTasksTestCase9 abbottExpectedTasksTestCase9 = new AbbottExpectedTasksTestCase9();
        createBiotronikERIAlarmTask();
        createBiotronikEOSAlarmTask();
        createBiotronikEOSTask();
        createBiotronikERITask();
        createBiotronik93CrtTask();
        createBiotronik93LvTask();
        createBiotronik93generalTask();
        createAbbottTestExpectedTask();
        createAbbottGeneralYellowTask();
        BiotronikExpectedTasksTestCase3 biotronikExpectedTasksTestCase3 = new BiotronikExpectedTasksTestCase3();
        BiotronikExpectedTasksTestCase4 biotronikExpectedTasksTestCase4 = new BiotronikExpectedTasksTestCase4();
        BiotronikExpectedTasksTestCase5 biotronikExpectedTasksTestCase5 = new BiotronikExpectedTasksTestCase5();
        BiotronikExpectedTasksTestCase6 biotronikExpectedTasksTestCase6 = new BiotronikExpectedTasksTestCase6();
        BiotronikExpectedTasksTestCase7 biotronikExpectedTasksTestCase7 = new BiotronikExpectedTasksTestCase7();
        BiotronikExpectedTasksTestCase8 biotronikExpectedTasksTestCase8 = new BiotronikExpectedTasksTestCase8();
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
