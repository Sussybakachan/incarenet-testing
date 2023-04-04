package patientHistoryTest;

import dsutilities.LoggerLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static selenium.ChromeWebDriver.driver;

public class ReadTable {

    public static List<String> taskTableData = new ArrayList<>();
    public static void readTable() {

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
    }

}
