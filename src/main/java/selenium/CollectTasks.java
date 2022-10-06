package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static selenium.CompareTasksInCardio.driver;

public class CollectTasks {
    String xpathTAble = "//table/tbody[@class]/tr[@index=";

    List<String> collectedTasks;

    CollectTasks() throws InterruptedException {
        this.getTasks();
    }

    void getTasks() throws InterruptedException {
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
            for (int j = 2; j < 12; j++) {
                System.out.println("Test 2");
                if (j < 6) {
                    String c = driver.findElement(By.xpath(xpathTAble + i + "]/td[" + j + "]")).getAttribute("value");
                    System.out.println("Test 3");
                    // taskObject.setStartDate(date);
                    this.collectedTasks.add(c);
                    //tasks.add(taskObject);
                    System.out.println("Test 4");
                   System.out.println("die ersten collected tds von collectedTAsks: "+ this.collectedTasks);
                    continue;

                }
                String c = driver.findElement(By.xpath("//table/tbody[@class]/tr[@index=" + i + "]/td[" + j + "]")).getText();
                c = c.replace("\n", "").replace("\r", "");
                this.collectedTasks.add(c);

            }
            //Zuweisen der Elemtente des collectedTasks Array zu einem object Array?
            task.add(collectedTasks);
            for (int p = 0; p < collectedTasks.size(); p++ ){
                taskObject.setValue(collectedTasks.get(p));
            }


        }

    }
}

