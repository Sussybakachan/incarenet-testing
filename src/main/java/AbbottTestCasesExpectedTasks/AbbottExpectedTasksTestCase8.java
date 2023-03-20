package AbbottTestCasesExpectedTasks;

import AbbottTestCasesExpectedTasks.sample.AbbotExpectedTaskCreator;
import AbbottTestCasesExpectedTasks.sample.Color;
import AbbottTestCasesExpectedTasks.sample.Constants;
import selenium.Task;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class AbbottExpectedTasksTestCase8 {
    public static final List<Task> AbbottTestCase8List = new ArrayList<>();

    @PostConstruct
    private void initTasks() {
        createAbbottYellowCRT96Task();
    }

    public static List<Task> createAbbottYellowCRT96Task() {
        AbbotExpectedTaskCreator abbotExpectedTaskCreator = new AbbotExpectedTaskCreator("2022-03-24T22:10:25.000Z", Color.WARNING, Constants.TASK_DESCRIPTION_CRT_96);
        AbbottTestCase8List.addAll(abbotExpectedTaskCreator.createAbbottGeneralTask());
        return AbbottTestCase8List;
    }
}
