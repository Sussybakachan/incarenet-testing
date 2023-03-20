package AbbottTestCasesExpectedTasks.sample;

import selenium.Task;

import java.util.ArrayList;
import java.util.List;

import static AbbottTestCasesExpectedTasks.sample.Constants.PDF;
import static AbbottTestCasesExpectedTasks.sample.Constants.TASK_DESCRIPTION_CRT_MOS_84;

public class AbbotExpectedTaskCreator {

    private Task defaultTask;
    private String taskDescription = TASK_DESCRIPTION_CRT_MOS_84;
    private Color color = Color.WARNING;
    private String startDate = "2022-02-28T00:11:44.000Z";

    public AbbotExpectedTaskCreator(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public AbbotExpectedTaskCreator(Color color) {
        this.color = color;
    }

    public AbbotExpectedTaskCreator(Color color, String taskDescription) {
        this.color = color;
        this.taskDescription = taskDescription;
    }

    public AbbotExpectedTaskCreator(String startDate, Color color, String taskDescription) {
        this.startDate = startDate;
        this.color = color;
        this.taskDescription = taskDescription;
    }

    public AbbotExpectedTaskCreator() {
    }

    public Task getDefaultTask() {
        Task task = new Task();
        task.setColor(getColor().getColorStr());
        task.setStartDate(getStartDate());
        task.setTaskDescription(getTaskDescription());
        task.setPdf(PDF);
        this.defaultTask = task;
        return defaultTask;
    }

    public void setDefaultTask(Task defaultTask) {
        this.defaultTask = defaultTask;
    }

    public List<Task> createAbbottGeneralTask() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(getDefaultTask());
        return tasks;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
