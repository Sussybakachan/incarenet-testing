package MicroPortTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MicroPortExpectedTasksTestCase6 {
    public static List<Task> MicroPortTestCase6List = new ArrayList<>();
    static Task MicroPortNoTask = new Task();

    public MicroPortExpectedTasksTestCase6(){
        createAbbottNoTask();
    }

    public static List<Task> createAbbottNoTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MicroPortNoTask.setIntentioanllyEmpty(true);
        MicroPortTestCase6List.add(MicroPortNoTask);
        return MicroPortTestCase6List;
    }
}
