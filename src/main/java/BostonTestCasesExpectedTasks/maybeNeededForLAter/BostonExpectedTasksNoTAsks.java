package BostonTestCasesExpectedTasks.maybeNeededForLAter;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class BostonExpectedTasksNoTAsks {

    public static List<Task> BostonEmptyTestCase = new ArrayList<>();
    static Task BostonNoTask = new Task();

    public BostonExpectedTasksNoTAsks() {
        createBostonNoTask();
    }



    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static List<Task> createBostonNoTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        BostonNoTask.setIntentioanllyEmpty(true);
        BostonEmptyTestCase.add(BostonNoTask);
        return BostonEmptyTestCase;
    }
}
