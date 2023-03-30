package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
        driver.findElement(By.xpath("//div[2]/div[1]/div[4]")).click();
        Thread.sleep(2000);
        readHistoryTable();
        Thread.sleep(2000);
        compareTaskHistory();
        }
        catch (Exception e){
            System.out.println("the test didn't pass, means that the date, time and description in the patient History doesn't match with the task");
        }

    }

    public static void readHistoryTable() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"history-table\"]/div"));

        int rowsNumber = rows.size();

        if (rowsNumber == 1) {

            System.out.println("There are no tasks and activities detected");

        }

        System.out.println(rowsNumber + " rows including Date, Tasks and activities got detected");


        LocalDate targetDate = LocalDate.now(); //LocalDate.of(2023, 3, 27); if you want an exact date
        int targetStartMinute = 31; //Minute fetched in method readTable
        int targetEndMinute = 32;

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
                    System.out.println("Error parsing date-time format: " + dateTimeSecondString);
                    break;
                }

                if (dateTime.toLocalDate().equals(targetDate)) {

                    int hour = dateTime.getMinute();

                    if (hour >= targetStartMinute && hour <= targetEndMinute) {

                        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
                        String dateTimeString = dateTime.format(newFormatter);

                        String events = event.replace(";", ",");

                        // Get the index of the first comma in the first string
                        int commaIndex = events.indexOf(",");

// Remove the first word and the comma from the first string
                        String taskDesc = events.substring(commaIndex + 2);

                        filteredData.add(dateTimeString + " : " + taskDesc);
                        foundEvents = true;

                    } else {
                        break;
                    }

                } else {
                    break;
                }

            }

            if (!foundEvents) {
                break;
            }

            WebElement nextPage = driver.findElement(By.xpath("//div[12]/div[2]/button[2]"));

            if (nextPage.isEnabled()) {

                nextPage.click();

            } else {

                hasMorePages = false;

            }

        }

        System.out.println(filteredData);
    }

    public static void readTable() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody[@class]/tr[@index]"));
        int s = rows.size();

        if (s == 0 ) {
            System.out.println("There are no tasks");
            s = 0;

        }

        System.out.println(s + " Tasks got detected");

        for (int i = 2; i < s + 2; i++) {


            List<WebElement> cells = driver.findElements(By.xpath("//div[2]/div/div/div/table/tbody/tr["+ i +"]/td"));
            String receiveDate = cells.get(3).getText();
            String description = cells.get(5).getText();

            LocalDateTime dateTime;

            dateTime = LocalDateTime.parse(receiveDate, formatter);

            int minutes = dateTime.getMinute();

            String taskDeskription = description.replace("\n", ", ");

            taskTableData.add(receiveDate +" : "+ taskDeskription);

        }

        System.out.println(taskTableData);
    }

    public static void compareTaskHistory() {

        if (taskTableData.equals(filteredData)){
            System.out.println("well done ");
        }
        System.out.println("check it out again");
    }

}