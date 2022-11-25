package TestCases;

import selenium.CollectTasks;
import selenium.Task;

import java.util.List;

public class GeneratedTasks {
    public List<Task> getGeneratedTasks() throws InterruptedException {
        CollectTasks collectTasks = new CollectTasks();
        return collectTasks.getTasks();
    }
}
