package AbbottTestCasesExpectedTasks;

import AbbottTestCasesExpectedTasks.sample.AbbotExpectedTaskCreator;
import selenium.Task;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import static AbbottTestCasesExpectedTasks.sample.Constants.*;

public class AbbottExpectedTasksTestCase3 {

    public static final List<Task> AbbottTestCase3List = new ArrayList<>();


    @PostConstruct
    private void initTasks() {
        createAbbottYellowCRT84Task();
        createAbbottGeneralYellowTask96();
        createAbbottGeneralYellowTaskEOS();
        createAbbottGeneralYellowTaskERI();
        createAbbottGeneralYellowTask84();
    }


    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static List<Task> createAbbottYellowCRT84Task() {
        return getTasks(TASK_DESCRIPTION_CRT_84);
    }

    public static List<Task> createAbbottGeneralYellowTask84() {
        AbbotExpectedTaskCreator abbotExpectedTaskCreator = new AbbotExpectedTaskCreator();
        AbbottTestCase3List.addAll(abbotExpectedTaskCreator.createAbbottGeneralTask());
        return AbbottTestCase3List;
    }

    public static List<Task> createAbbottGeneralYellowTask96() {
        return getTasks(TASK_DESCRIPTION_CRT_MOS_96);
    }

    public static List<Task> createAbbottGeneralYellowTaskEOS() {
        return getTasks(TASK_DESCRIPTION_EOS_100);
    }

    public static List<Task> createAbbottGeneralYellowTaskERI() {
        return getTasks(TASK_DESCRIPTION_ERI_100);
    }

    private static List<Task> getTasks(String taskDescription) {
        AbbotExpectedTaskCreator abbotExpectedTaskCreator = new AbbotExpectedTaskCreator(taskDescription);
        AbbottTestCase3List.addAll(abbotExpectedTaskCreator.createAbbottGeneralTask());
        return AbbottTestCase3List;
    }

}
