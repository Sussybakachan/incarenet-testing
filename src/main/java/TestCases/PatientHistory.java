package TestCases;

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

public class PatientHistory {

    public static List<String> taskTableData = new ArrayList<>();
    public static List<String> filteredData = new ArrayList<>();

    public static void patientHistory() {

        try {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]")).click();
        Thread.sleep(5000);
        readTable();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[1]/div[4]")).click();
        Thread.sleep(2000);
        readHistoryTable();
        Thread.sleep(2000);
        compareTaskHistory();
        Thread.sleep(2000);
        }
        catch (Exception e){
            LoggerLoader.info("the test didn't pass, means that the date, time and description in the patient History doesn't match with the task");
        }

    }

    public static void readHistoryTable() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"history-table\"]/div"));

        int rowsNumber = rows.size();

        if (rowsNumber == 1) {

            LoggerLoader.info("There are no tasks and activities detected");

        }

        LoggerLoader.info(rowsNumber + " rows including Date, Tasks and activities got detected");


        LocalDate targetDate = LocalDate.now(); //LocalDate.of(2023, 3, 27); if you want an exact date
        LocalTime currentTime = LocalTime.now();
        LocalTime minuteBefore = currentTime.minusMinutes(2);
        LocalTime minuteAfter = currentTime.plusMinutes(2);

        boolean hasMorePages = true;

        while (hasMorePages) {

            boolean foundEvents = false;

            for (int i = 2; i < rowsNumber; i++) {

                List<WebElement> cells = driver.findElements(By.xpath("//*[@id=\"history-table\"]/div[" + i + "]/div/div"));
                String dateTimeSecondString = cells.get(0).getText();
                String event = cells.get(1).getText();

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

            WebElement nextPage = driver.findElement(By.xpath("//div[12]/div[2]/button[2]"));

            if (nextPage.isEnabled()) {

                nextPage.click();

            }

        }

        LoggerLoader.info(filteredData.toString());
    }

    public static void readTable() {
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody[@class]/tr[@index]"));
        int s = rows.size();

        if (s == 0 ) {
            LoggerLoader.info("There are no tasks");
            s = 0;

        }

        LoggerLoader.info(s + " Tasks got detected");

        for (int i = 2; i < s + 2; i++) {


            List<WebElement> cells = driver.findElements(By.xpath("//div[2]/div/div/div/table/tbody/tr["+ i +"]/td"));
            String receiveDate = cells.get(3).getText();
            String description = cells.get(5).getText();

            String taskDeskription = description.replace("\n", ", ");

            taskTableData.add(receiveDate +" : "+ taskDeskription);

        }

        LoggerLoader.info(taskTableData.toString());
    }

    public static void compareTaskHistory() {

        if (taskTableData.equals(filteredData)){
            LoggerLoader.info("The Actions sent to Patient history are the same as the ones from the Task Tab ");
        }
        LoggerLoader.info("The Actions are not identical as the one from the Task Tab");
    }

}