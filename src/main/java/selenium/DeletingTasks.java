package selenium;

import dsutilities.LoggerLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static selenium.CompareTasksInCardio.driver;
import static selenium.CompareTasksInCardio.successfulTestCases;

public class DeletingTasks {
    static Actions action;


    static JavascriptExecutor js;

    public static void deleteTask() throws InterruptedException {
        try{
            js = (JavascriptExecutor) driver;
            action = new Actions(driver);
            Thread.sleep(5000);
            List<WebElement> l = driver.findElements(By.xpath("//table/tbody[@class]/tr[@index]"));
            int s = l.size();
            Thread.sleep(4000);
            js.executeScript("window.scrollBy(0,115)");
            Thread.sleep(4000);
            for (int i = 2; i < s + 2; i++) {
                Thread.sleep(4000);
                try{
                    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[7]/div/div/div/div")).click();
                    Thread.sleep(3000);
                }catch (Exception e){
                    js.executeScript("window.scrollBy(0,1)");
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[7]/div/div/div/div")).click();
                    Thread.sleep(3000);
                }
                try {
                    driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/label/span[1]/span[1]/input")).click();
                    Thread.sleep(5000);
                }catch (Exception e){
                    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[7]/div/div/div/div")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/label/span[1]/span[1]/input")).click();
                    Thread.sleep(5000);
                }
                try{
                    driver.findElement(By.id("saveMeasurement")).click();
                } catch (Exception e) {
                    js.executeScript("window.scrollBy(0,115)");
                    Thread.sleep(4000);
                    driver.findElement(By.id("saveMeasurement")).click();
                }
                Thread.sleep(7000);
                try{
                   // driver.findElement(By.id("doneButton")).click();
                    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[11]/div/button[1]")).click(); //doneButton
                    Thread.sleep(4000);
                } catch (Exception e){
                    js.executeScript("window.scrollBy(115,0)");
                   // driver.findElement(By.id("doneButton")).click();
                    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[11]/div/button[1]")).click(); //doneButton
                    Thread.sleep(4000);
                }

            }
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[1]/span/span[1]/input")).click();
            Thread.sleep(4000);
            driver.findElement(By.id("archiveTasksButton")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("confirmButton")).click();
            Thread.sleep(5000);
            js.executeScript("window.scrollBy(0,-115)");
            Thread.sleep(4000);
        } catch (Exception e) {
            LoggingDataModif loggingDataModif = new LoggingDataModif();
            LoggerLoader.fatal("Some Error occurred while trying to delete the Tasks: " + e);
            LoggerLoader.info("Following Testcase(s) were successful: \n " + successfulTestCases);
            LoggerLoader.info("Following Testcase(s) failed:\n" + loggingDataModif.editFailedTaskLogging());
            driver.close();

        }
    }
}

/*Thread.sleep(15000);
        driver.switchTo().parentFrame();
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[7]/div[1]/span/span[1]")).click();
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        Thread.sleep(5000);

        #popup closing


        */