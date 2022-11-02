package AbbottTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class AbbottTestCaseNoTask {
    static Task AbbottNoTask = new Task();

    public static List<Task> AbbottEmptyTestCase = new ArrayList<>();



    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static List<Task> createAbbottNoTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        AbbottNoTask.setIntentioanllyEmpty(true);
        AbbottEmptyTestCase.add(AbbottNoTask);
        return AbbottEmptyTestCase;
    }
}
