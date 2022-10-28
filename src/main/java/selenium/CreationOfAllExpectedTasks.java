package selenium;

import static ExpectedTasks.MicroPortExpectedTasks.createMicroPortWhiteTask;
import static selenium.ExpectedTasks.createAbbottTestExpectedTask;
import static BiotronikTestCasesExpertedTasks.BiotronikExpectedTasksTestCase2.*;
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
    }

}
