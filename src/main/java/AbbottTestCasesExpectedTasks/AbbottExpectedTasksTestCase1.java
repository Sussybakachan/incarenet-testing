package AbbottTestCasesExpectedTasks;

import AbbottTestCasesExpectedTasks.sample.AbbotExpectedTaskCreator;
import selenium.Task;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase1 {
    public static final List<Task> AbbottTestCase1List = new ArrayList<>();

    @PostConstruct
    private void initTask() {
        createAbbottGeneralYellowTask();
    }


    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static List<Task> createAbbottGeneralYellowTask() {
        AbbotExpectedTaskCreator abbotExpectedTaskCreator = new AbbotExpectedTaskCreator();
        AbbottTestCase1List.addAll(abbotExpectedTaskCreator.createAbbottGeneralTask());
        return AbbottTestCase1List;
    }

}

