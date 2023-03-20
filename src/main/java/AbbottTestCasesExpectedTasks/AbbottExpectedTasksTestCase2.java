package AbbottTestCasesExpectedTasks;

import AbbottTestCasesExpectedTasks.sample.AbbotExpectedTaskCreator;
import AbbottTestCasesExpectedTasks.sample.Color;
import selenium.Task;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase2 {

    public static final List<Task> AbbottTestCase2List = new ArrayList<>();

    @PostConstruct
    private void initTask() {
        createAbbottGeneralWhiteTask();
    }


    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static List<Task> createAbbottGeneralWhiteTask() {
        AbbotExpectedTaskCreator abbotExpectedTaskCreator = new AbbotExpectedTaskCreator();
        Task defaultTask = abbotExpectedTaskCreator.getDefaultTask();
        defaultTask.setColor(Color.NORMAL.getColorStr());
        abbotExpectedTaskCreator.setDefaultTask(defaultTask);
        AbbottTestCase2List.addAll(abbotExpectedTaskCreator.createAbbottGeneralTask());
        return AbbottTestCase2List;
    }
}
