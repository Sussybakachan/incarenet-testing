package AbbottTestCasesExpectedTasks;

import AbbottTestCasesExpectedTasks.sample.AbbotExpectedTaskCreator;
import AbbottTestCasesExpectedTasks.sample.Color;
import AbbottTestCasesExpectedTasks.sample.Constants;
import selenium.Task;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase10 {

    public static final List<Task> AbbottTestCase10List = new ArrayList<>();
    private static String startDate = "2022-03-24T22:10:25.000Z";

    public AbbottExpectedTasksTestCase10() {
        createAbbottGeneralWhiteTask96();
        createAbbottGeneralWhiteTaskERI();
        createAbbottGeneralWhiteTaskEOS();
        createAbbottGeneralWhiteTask84();
    }

    @PostConstruct
    private void initTasks() {
        createAbbottGeneralWhiteTask96();
        createAbbottGeneralWhiteTaskERI();
        createAbbottGeneralWhiteTaskEOS();
        createAbbottGeneralWhiteTask84();
    }

    private static List<Task> getTasks(String startDate, String taskDescription) {
        AbbotExpectedTaskCreator abbotExpectedTaskCreator = new AbbotExpectedTaskCreator(startDate, Color.NORMAL, taskDescription);
        AbbottTestCase10List.addAll(abbotExpectedTaskCreator.createAbbottGeneralTask());
        return AbbottTestCase10List;
    }

    public static List<Task> createAbbottGeneralWhiteTask84() {
        return getTasks("2022-02-28T00:11:44.000Z", Constants.TASK_DESCRIPTION_CRT_MOS_84);
    }

    public static List<Task> createAbbottGeneralWhiteTask96() {
        return getTasks(startDate, Constants.TASK_DESCRIPTION_CRT_MOS_96);
    }

    public static List<Task> createAbbottGeneralWhiteTaskEOS() {
        return getTasks(startDate, Constants.TASK_DESCRIPTION_EOS_100);
    }

    public static List<Task> createAbbottGeneralWhiteTaskERI() {
        return getTasks(startDate, Constants.TASK_DESCRIPTION_ERI_100);
    }
}
