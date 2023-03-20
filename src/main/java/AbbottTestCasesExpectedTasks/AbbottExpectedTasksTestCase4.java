package AbbottTestCasesExpectedTasks;

import selenium.Task;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase4 {
    public static final List<Task> AbbottTestCase4List = new ArrayList<>();

    @PostConstruct
    private void initTask(){
        createAbbottNoTask();
    }

    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static List<Task> createAbbottNoTask() {
        Task abbottNoTask = new Task();
        abbottNoTask.setIntentioanllyEmpty(true);
        AbbottTestCase4List.add(abbottNoTask);
        return AbbottTestCase4List;
    }
}
