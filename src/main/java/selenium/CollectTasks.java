package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static selenium.CompareTasksInCardio.driver;

public class CollectTasks {
  static  Task taskObject = new Task();
    String xpathTAble = "//table/tbody[@class]/tr[@index=";

    public static List<Task> collectedTasks = new ArrayList<>();

    CollectTasks() throws InterruptedException {
        this.getTasks();
    }

    List<Task> getTasks() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]")).click();
        Thread.sleep(2000);

        List<WebElement> l = driver.findElements(By.xpath("//table/tbody[@class]/tr[@index]"));
        int s = l.size();
        List<WebElement> m = driver.findElements(By.xpath("//table/tbody[@class]/tr[@index]/td"));
        int t = m.size();
        if (s == 1 && t == 1) {
            System.out.println("There are no tasks");
            s = 0;
            t = 0;
        } else {
            System.out.println(s + " Tasks got detected");
            System.out.println("The amount of columns are " + t);
        }

        List task = new ArrayList<>();
        //List<String> collectedTasks = new ArrayList<String>();
        for (int i = 0; i < s; i++) {
            System.out.println("Test 1");
            Task taskObject = new Task();
            //ArrayList<Task> tasks = new ArrayList<>();
           /* for (int j = 2; j < 12; j++) {
                System.out.println("Test 2");
                if (j < 6) { */

            taskObject.setCheckBox(driver.findElement(By.xpath(xpathTAble + i + "]/td[" + TaskElements.CHECKBOX.ordinal() + "]")).getText());
            taskObject.setColor(driver.findElement(By.xpath(xpathTAble + i + "]/td[" + TaskElements.COLOr.ordinal() + "]")).getAttribute("value"));
            taskObject.setStartDate(driver.findElement(By.xpath(xpathTAble + i + "]/td[" + TaskElements.START_DATE.ordinal() + "]")).getAttribute("value"));
            taskObject.setReceiveDate(driver.findElement(By.xpath(xpathTAble + i + "]/td[" + TaskElements.RECEIVE_DATE.ordinal() + "]")).getAttribute("value"));
            taskObject.setTargetDate(driver.findElement(By.xpath(xpathTAble + i + "]/td[" + TaskElements.TARGET_DATE.ordinal() + "]")).getAttribute("value"));
            taskObject.setTaskDescription(driver.findElement(By.xpath(xpathTAble + i + "]/td[" + TaskElements.TASK_DESCRIPTION.ordinal() + "]")).getText());
            taskObject.setMeasurements(driver.findElement(By.xpath(xpathTAble + i + "]/td[" + TaskElements.MEASUREMENTS.ordinal() + "]")).getText());
            String removedLineBreaksPDF = driver.findElement(By.xpath(xpathTAble + i + "]/td[" + TaskElements.PDF.ordinal() + "]")).getText();
            removedLineBreaksPDF = removedLineBreaksPDF.replace("\n", "").replace("\r", "");
            taskObject.setPdf(removedLineBreaksPDF);
            taskObject.setEmployee(driver.findElement(By.xpath(xpathTAble + i + "]/td[" + TaskElements.EMPLOYEE.ordinal() + "]")).getText());
            taskObject.setFurtherInformation(driver.findElement(By.xpath(xpathTAble + i + "]/td[" + TaskElements.FURTHER_INFORMATION.ordinal() + "]")).getText());
            taskObject.setAction(driver.findElement(By.xpath(xpathTAble + i + "]/td[" + TaskElements.ACTION.ordinal() + "]")).getText());

            System.out.println("Test 3");
            // taskObject.setStartDate(date);
            collectedTasks.add(taskObject);
            //tasks.add(taskObject);
            System.out.println("Test 4");
            collectedTasks.forEach(System.out::println);


        } return collectedTasks;
        // String c = driver.findElement(By.xpath("//table/tbody[@class]/tr[@index=" + i + "]/td[" + j + "]")).getText();
        //TODO müsste ggf. die Absätze bei taskObject wegmachen wie unten

        // c = c.replace("\n", "").replace("\r", "");
        //   this.collectedTasks.add(c);

    }
    //Zuweisen der Elemtente des collectedTasks Array zu einem object Array?
    //   task.add(collectedTasks);
    //  for (int p = 0; p < collectedTasks.size(); p++ ){
    //      taskObject.setValue(collectedTasks.get(p));
}






