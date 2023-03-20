package AbbottTestCasesExpectedTasks;

import AbbottTestCasesExpectedTasks.sample.AbbotExpectedTaskCreator;
import AbbottTestCasesExpectedTasks.sample.Color;
import AbbottTestCasesExpectedTasks.sample.Constants;
import selenium.Task;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase7 {

    public static final List<Task> AbbottTestCase7List = new ArrayList<>();

    @PostConstruct
    private void initTasks() {
        createAbbottEosTask();
        createAbbottEriTask();
        createAbbottRedCRT84Task();
    }

    private static List<Task> getTasks(String taskDescription) {
        AbbotExpectedTaskCreator abbotExpectedTaskCreator = new AbbotExpectedTaskCreator("2022-03-24T22:10:25.000Z", Color.DANGER, taskDescription);
        AbbottTestCase7List.addAll(abbotExpectedTaskCreator.createAbbottGeneralTask());
        return AbbottTestCase7List;
    }

    public static List<Task> createAbbottRedCRT84Task() {
        return AbbottExpectedTasksTestCase6.createAbbottRedCRT84Task();
    }

    public static List<Task> createAbbottEriTask() {
        return getTasks(Constants.TASK_DESCRIPTION_ERI);
    }

    public static List<Task> createAbbottEosTask() {
        return getTasks(Constants.TASK_DESCRIPTION_EOS);
    }
}
