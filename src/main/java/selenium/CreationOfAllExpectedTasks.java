package selenium;

import static ExpectedTasks.MicroPortExpectedTasks.createMicroPortWhiteTask;
import static selenium.ExpectedTasks.createAbbottTestExpectedTask;

public class CreationOfAllExpectedTasks {
    public static void createExpectedTasks(){
        createMicroPortWhiteTask();
        createAbbottTestExpectedTask();
    }
}
