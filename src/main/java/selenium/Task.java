package selenium;

//TODO Datefomrat muss angepasst werden

import java.util.Objects;

public class Task {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(getCheckBox(), task.getCheckBox()) && Objects.equals(getColor(), task.getColor()) && Objects.equals(getStartDate(), task.getStartDate()) && Objects.equals(getReceiveDate(), task.getReceiveDate()) && Objects.equals(getTargetDate(), task.getTargetDate()) && Objects.equals(getTaskDescription(), task.getTaskDescription()) && Objects.equals(getMeasurements(), task.getMeasurements()) && Objects.equals(getPdf(), task.getPdf()) && Objects.equals(getEmployee(), task.getEmployee()) && Objects.equals(getFurtherInformation(), task.getFurtherInformation()) && Objects.equals(getAction(), task.getAction());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCheckBox(), getColor(), getStartDate(), getReceiveDate(), getTargetDate(), getTaskDescription(), getMeasurements(), getPdf(), getEmployee(), getFurtherInformation(), getAction());
    }

    private String checkBox;

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getMeasurements() {
        return measurements;
    }

    public void setMeasurements(String measurements) {
        this.measurements = measurements;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getFurtherInformation() {
        return furtherInformation;
    }

    public void setFurtherInformation(String furtherInformation) {
        this.furtherInformation = furtherInformation;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    private String startDate;

    private String receiveDate;

    private String targetDate;

    private String taskDescription;

    private String measurements;

    private String pdf;

    private String employee;

    private String furtherInformation;

    private String action;


    public String getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(String checkBox) {
        this.checkBox = checkBox;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
