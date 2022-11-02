package selenium;

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


    }

}
