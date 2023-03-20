package AbbottTestCasesExpectedTasks;

import AbbottTestCasesExpectedTasks.sample.AbbotExpectedTaskCreator;
import AbbottTestCasesExpectedTasks.sample.Color;
import selenium.Task;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import static AbbottTestCasesExpectedTasks.sample.Constants.*;

public class AbbottExpectedTasksTestCase6 {
    public static final List<Task> AbbottTestCase6List = new ArrayList<>();

    @PostConstruct
    private void initTasks() {
        createAbbottRedCRT84Task();
        createAbbottYellowCRT96Task();
        createAbbottEosTask();
        createAbbottEriTask();
    }


    private static List<Task> getTasks(Color color, String taskDescription) {
        AbbotExpectedTaskCreator abbotExpectedTaskCreator = new AbbotExpectedTaskCreator(color, taskDescription);
        AbbottTestCase6List.addAll(abbotExpectedTaskCreator.createAbbottGeneralTask());
        return AbbottTestCase6List;
    }


    public static List<Task> createAbbottRedCRT84Task() {
        return getTasks(Color.DANGER, TASK_DESCRIPTION_CRT_84);
    }

    public static List<Task> createAbbottEriTask() {
        return getTasks(Color.DANGER, TASK_DESCRIPTION_ERI);
    }

    public static List<Task> createAbbottEosTask() {
        return getTasks(Color.DANGER, TASK_DESCRIPTION_EOS);
    }

    public static List<Task> createAbbottYellowCRT96Task() {
        return getTasks(Color.WARNING, TASK_DESCRIPTION_CRT_96);
    }
}
