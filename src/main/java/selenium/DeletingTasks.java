package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static selenium.CompareTasksInCardio.*;

public class DeletingTasks { static Actions action;


    static JavascriptExecutor js;

    public static void deleteTask() throws InterruptedException {
        js = (JavascriptExecutor) driver;
        action = new Actions(driver);
        Thread.sleep(5000);
        List<WebElement> l = driver.findElements(By.xpath("//table/tbody[@class]/tr[@index]"));
        int s = l.size();

for (int i=2; i<s+2; i++ ){
    Thread.sleep(5000);
    js.executeScript("window.scrollBy(0,500)");
    Thread.sleep(4000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr["+ i +"]/td[7]/div/div/div/div")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/label/span[1]/span[1]/input")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("saveMeasurement")).click();
    Thread.sleep(2000);
    js.executeScript("window.scrollBy(0,-500)");
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr["+ i +"]/td[11]/div/button")).click();
    Thread.sleep(2000);
    js.executeScript("window.scrollBy(0,-500)");
}
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[1]/span/span[1]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("archiveTasksButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
    }
}
