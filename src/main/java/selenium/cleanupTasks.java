package selenium;
import dsutilities.LoggerLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static selenium.ChromeWebDriver.driver;



public class cleanupTasks {


    public static void cleanupTasks( String p ) throws InterruptedException {
        Actions action = new Actions(driver);
        driver.switchTo().parentFrame();
        WebElement administration = driver.findElement(By.xpath("//*[@id=\"bs3TopMenu\"]/ul/li[5]/a"));
        WebElement sols = driver.findElement(By.xpath("//*[@id=\"bs3TopMenu\"]/ul/li[5]/ul/li[10]/a"));
        WebElement incardio =driver.findElement(By.xpath("//*[@id=\"bs3TopMenu\"]/ul/li[5]/ul/li[10]/ul/li[3]/a"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        action.moveToElement(administration).build().perform();
        wait.until(ExpectedConditions.visibilityOf(sols));
        action.moveToElement(sols).build().perform();
        wait.until(ExpectedConditions.visibilityOf(incardio));
        incardio.click();
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        WebElement wartung =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/header/div/div/div/button[6]"));
        wait.until(ExpectedConditions.visibilityOf(wartung));
        wartung.click();
        WebElement unhandled =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/button"));
        wait.until(ExpectedConditions.visibilityOf(wartung));
        unhandled.click();
        Thread.sleep(2000);
        List<WebElement> l = driver.findElements(By.xpath("/html/body/div[2]/div[3]/div/div[1]/table/tbody/tr"));
        int s = l.size();
        System.out.println(s);

        if ( s == 0 ) {
            LoggerLoader.info("in inCARDIO-Dashboard there is no Patient with tasks");
        } else {

            for (int i = 1; i <= s ; i++) {
                String patientWithTasks = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/table/tbody/tr[" + i + "]/th[1]")).getText();
                if (patientWithTasks.contains(p)) {
                    System.out.println(patientWithTasks.contains(p));
                    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/table/tbody/tr[" + i + "]/th[1]")).click();
                    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[3]/div[2]")).click();
                    break;
                }
            }
        }
        Thread.sleep(3000);
        //WebElement wartung =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/header/div/div/div/button[6]"));
        //WebElement wartung =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/header/div/div/div/button[6]"));
        //"/html/body/div[2]/div[3]/div/div[1]/table/tbody/tr[2]/th"


    }


}
