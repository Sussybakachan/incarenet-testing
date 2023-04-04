package patientHistoryTest;

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

public class ReadHistoryTable {

    public static List<String> filteredData = new ArrayList<>();
    public static void readHistoryTable() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        //parse the table with list of actions in the history table

        List<WebElement> actions = driver.findElements(By.xpath("//*[@class = \"row history-table-row\"]"));

        int numberOfActions = actions.size();
        System.out.println("numberOfActions" + numberOfActions);

        if (numberOfActions == 0) {

            LoggerLoader.info("There are no tasks and activities detected");

        }

        LoggerLoader.info(numberOfActions + " rows including Date, Tasks and activities got detected");


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
    }


}
