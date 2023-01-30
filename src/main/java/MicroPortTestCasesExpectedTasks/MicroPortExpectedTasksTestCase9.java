package MicroPortTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MicroPortExpectedTasksTestCase9 {
    public static List<Task> MicroPortTestCase9List = new ArrayList<>();
    static Task MicroPortNoTask = new Task();

    public MicroPortExpectedTasksTestCase9(){
        createAbbottNoTask();
    }

    public static List<Task> createAbbottNoTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MicroPortNoTask.setIntentioanllyEmpty(true);
        MicroPortTestCase9List.add(MicroPortNoTask);
        return MicroPortTestCase9List;
    }
}

