package selenium;

import BiotronikTestCasesExpertedTasks.*;

import static AbbottTestCasesExpectedTasks.AbbottTestCaseNoTask.createAbbottNoTask;
import static ExpectedTasks.MicroPortExpectedTasks.createMicroPortWhiteTask;
import static selenium.ExpectedTasks.createAbbottTestExpectedTask;
import static BiotronikTestCasesExpertedTasks.BiotronikExpectedTasksTestCase2.*;
import static AbbottTestCasesExpectedTasks.AbbottExpectedTasksTestCase1.*;

public class CreationOfAllExpectedTasks {
    public static void createExpectedTasks(){
        createMicroPortWhiteTask();
        createAbbottTestExpectedTask();
    }
    public static void createBiotronikExpectedTasks(){
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


    }

}
