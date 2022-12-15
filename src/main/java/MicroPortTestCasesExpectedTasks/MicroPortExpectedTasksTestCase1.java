package MicroPortTestCasesExpectedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MicroPortExpectedTasksTestCase1 {
    public static List<Task> MicroPortTestCase1List = new ArrayList<>();
    static Task MicroPortNoTask = new Task();

    public MicroPortExpectedTasksTestCase1(){
        createAbbottNoTask();
    }

    public static List<Task> createAbbottNoTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MicroPortNoTask.setIntentioanllyEmpty(true);
        MicroPortTestCase1List.add(MicroPortNoTask);
        return MicroPortTestCase1List;
    }
}
