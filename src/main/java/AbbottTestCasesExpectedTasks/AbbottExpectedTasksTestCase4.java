package AbbottTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase4 {
    public static List<Task> AbbottTestCase4List = new ArrayList<>();
    static Task AbbottNoTask = new Task();

    public AbbottExpectedTasksTestCase4() {
        createAbbottNoTask();
    }

    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static List<Task> createAbbottNoTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottNoTask.setIntentioanllyEmpty(true);
        AbbottTestCase4List.add(AbbottNoTask);
        return AbbottTestCase4List;
    }
}
