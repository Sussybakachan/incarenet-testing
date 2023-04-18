package selenium;

import dsutilities.LoggerLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import static selenium.ChromeWebDriver.driver;

public class patientHistory {



    //XXX This is confusing. I see that patientHistory() is static.
    // It also takes no arguments. But the log entry here,
    // says that it needs to match with a task. That makes no sense.
    public static void testPatientHistory() {

        try {
        //visit Tasks Tab
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]")).click();
        Thread.sleep(5000);
        //readTable();
        Thread.sleep(2000);
        //visit History Tab
        driver.findElement(By.xpath("//div[2]/div[1]/div[4]")).click();
        Thread.sleep(2000);
        readHistoryTable();
        Thread.sleep(2000);
        //compareTaskHistory();
        Thread.sleep(2000);
        }
        catch (Exception e){
            LoggerLoader.info("the test didn't pass, means that the date, time and description in the patient History doesn't match with the task");
        }

    }


    private List<Action> readActionsFromPaginatedTable(LocalDateTime newerThan) {
        //Assuming that actions are sorted by received date in descending order
        List<Action> actions = new ArrayList<>();
        WebElement nextPageButton = null;
        do {
            if (nextPageButton != null) {
                nextPageButton.click();
            }
            actions.addAll(readActionsFromCurrentPage());
            //find Next button to visit the next page
            nextPageButton = driver.findElement(By.xpath("//div[12]/div[2]/button[2]"));

        } while (nextPageButton.isEnabled() && actions.get(actions.size() - 1).receivedDate.isAfter(newerThan));

        return actions;
    }
    private record Action( LocalDateTime receivedDate, String description) {}
    private Action parseAction(WebElement action) {

        List<WebElement> actionColumns = action.findElements(By.tagName("div"));
        String dateTimeSecondString = actionColumns.get(0).getText();
        String event = actionColumns.get(1).getText();
        LocalDateTime receivedDate = LocalDateTime.parse(dateTimeSecondString, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        return new Action(receivedDate, event);

    }

    private List<Action> readActionsFromCurrentPage() {
        List<WebElement> actionsOnPage = driver.findElements(By.xpath("//*[@class = \"row history-table-row\"]"));
        List<Action> actions = new ArrayList<>();
        for (WebElement action:actionsOnPage) {
            actions.add(parseAction(action));
        }
        return actions;
    }

    //This method filters the list of actions by a time(newerThan) range of two seconds before and after, gathered from read Task table and returns the filtered data as a list of strings.
    //This method is responsible for handling the logic of filtering the data and converting it into a more usable format.
    private List<String> filterActionsByDateTimeRange(List<Action> actions, LocalDateTime newerThan) {
        List<String> filteredActions = new ArrayList<>();
        for (Action action:actions) {
            if (action.receivedDate.isAfter(newerThan.minusSeconds(2)) && action.receivedDate.isBefore(newerThan.plusSeconds(2))) {
                filteredActions.add(action.description);
            }
        }
        return filteredActions;
    }





    public List<String> readHistoryTable(LocalDateTime newerThan) {


        List<Action> actions = readActionsFromPaginatedTable(newerThan);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        //parse the table with list of actions in the history table

        List<WebElement> actions = driver.findElements(By.xpath("//*[@class = \"row history-table-row\"]"));

        int numberOfActions = actions.size();
        System.out.println("numberOfActions" + numberOfActions);

        if (numberOfActions == 0) {

            LoggerLoader.info("There are no tasks and activities detected");

        }

        LoggerLoader.info(numberOfActions + " rows including Date, Tasks and activities got detected");

        //XXX What are we looking for here?

        LocalDate targetDate = LocalDate.now(); //LocalDate.of(2023, 3, 27); if you want an exact date
        LocalTime currentTime = LocalTime.now();
        LocalTime minuteBefore = currentTime.minusMinutes(2);
        LocalTime minuteAfter = currentTime.plusMinutes(2);

        boolean hasMorePages = true;

        while (hasMorePages) {

            boolean foundEvents = false;

            for (WebElement action:actions) {
                List<WebElement> actionColumns = action.findElements(By.tagName("div"));
                String dateTimeSecondString = actionColumns.get(0).getText();
                String event = actionColumns.get(1).getText();
                LocalDateTime dateTime;

                try {
                    dateTime = LocalDateTime.parse(dateTimeSecondString, formatter);
                } catch (DateTimeParseException e) {
                    LoggerLoader.info("Error parsing date-time format: " + dateTimeSecondString);
                    return;
                }

                if (dateTime.toLocalDate().equals(targetDate)) {

                    LocalTime time = dateTime.toLocalTime();
                    LocalDateTime startTime = LocalDateTime.of(dateTime.toLocalDate(), minuteBefore);
                    LocalDateTime endTime = LocalDateTime.of(dateTime.toLocalDate(), minuteAfter);

                    if (time.isAfter(startTime.toLocalTime()) && time.isBefore(endTime.toLocalTime())) {

                        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
                        String dateTimeString = dateTime.format(newFormatter);

                        String events = event.replace(";", ",");
                        int commaIndex = events.indexOf(",");
                        String taskDesc = events.substring(commaIndex + 2);

                        filteredData.add(dateTimeString + " : " + taskDesc);
                        foundEvents = true;

                    } else {
                        LoggerLoader.info("Time-actions that have been checked are out of the Range");
                        return;
                    }

                } else {
                    LoggerLoader.info("Date-actions that have been checked are out of the Range");
                    return;
                }

            }

            if (!foundEvents) {
                break;
            }

            //click Next button to visit the next page
            WebElement nextPage = driver.findElement(By.xpath("//div[12]/div[2]/button[2]"));

            if (nextPage.isEnabled()) {

                nextPage.click();

            }

        }

        LoggerLoader.info(filteredData.toString());

        return filteredData;
    }


    public List <String> readTable() {

        List<String> taskTableData = new ArrayList<>();

        //parse the table with list of tasks
        List<WebElement> tasks = driver.findElements(By.xpath("//table/tbody[@class]/tr[@index]"));
        int numberOfTasks = tasks.size();

        if (numberOfTasks == 0 ) {
            LoggerLoader.info("There are no tasks");
        }

        LoggerLoader.info(numberOfTasks + " Tasks got detected");

        //started on the second row because two first rows are table headers
        for (WebElement task:tasks) {
            List<WebElement> taskColumns = task.findElements(By.tagName("td"));
            String receiveDate = taskColumns.get(3).getText();
            String description = taskColumns.get(5).getText();

            String taskDeskription = description.replace("\n", ", ");

            taskTableData.add(receiveDate +" : "+ taskDeskription);
        }

        LoggerLoader.info(taskTableData.toString());

        return taskTableData;
    }


    /*public static void compareTaskHistory() {

        if (taskTableData.equals(filteredData)){
            LoggerLoader.info("The Actions sent to Patient history are the same as the ones from the Task Tab ");
        }
        LoggerLoader.info("The Actions are not identical as the one from the Task Tab");
    }*/




}