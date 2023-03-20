package AbbottTestCasesExpectedTasks;

import AbbottTestCasesExpectedTasks.sample.AbbotExpectedTaskCreator;
import AbbottTestCasesExpectedTasks.sample.Color;
import selenium.Task;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase9 {
    public static final List<Task> AbbottTestCase9List = new ArrayList<>();

    @PostConstruct
    private void initTasks() {
        createAbbottGeneralRedTask();
    }

    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static List<Task> createAbbottGeneralRedTask() {
        AbbotExpectedTaskCreator abbotExpectedTaskCreator = new AbbotExpectedTaskCreator(Color.DANGER);
        AbbottTestCase9List.addAll(abbotExpectedTaskCreator.createAbbottGeneralTask());
        return AbbottTestCase9List;
    }
}
