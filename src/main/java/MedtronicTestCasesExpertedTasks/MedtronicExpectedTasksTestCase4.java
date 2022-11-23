package MedtronicTestCasesExpertedTasks;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

public class MedtronicExpectedTasksTestCase4 {
    public static List<Task> MedtronicTestCase4List = new ArrayList<>();
    static Task MedtronicNoTask = new Task();

    public MedtronicExpectedTasksTestCase4() {
        createMedtronicNoTask();
    }

    //instead of calling all the create methods in one big create methode we could create
    //new objects of the classes
    //I don't know if that makes a difference
    public static List<Task> createMedtronicNoTask() {

        //setCheckbox beinhaltet möglicherweise was anderes als ""
        MedtronicNoTask.setIntentioanllyEmpty(true);
        MedtronicTestCase4List.add(MedtronicNoTask);
        return MedtronicTestCase4List;
    }
}
