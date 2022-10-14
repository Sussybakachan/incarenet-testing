package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

import static selenium.CollectTasks.*;


public class CompareTasksInCardio {

    public static WebDriver driver;
    static Actions action;


    static JavascriptExecutor js;

    public static void loginP() throws InterruptedException, IOException {
        ReadingConfig rc = new ReadingConfig();
        driver.findElement(By.id("usernameField")).sendKeys(rc.loadProperty().getProperty("USERNAME"));
        Thread.sleep(2000);
        driver.findElement(By.id("passwordField")).sendKeys(rc.loadProperty().getProperty("PASSWORD"));
        Thread.sleep(2000);
        driver.findElement(By.id("doLoginBtn")).click();
        Thread.sleep(8000);
    }

    public static void inCardioDash() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement menu = driver.findElement(By.name("drop-services"));
        WebElement subMenu = driver.findElement(By.name("appMenu"));
        WebElement subSubMenu = driver.findElement(By.xpath("//*[@id=\"bs3TopMenu\"]/ul/li[6]/ul/li[11]/ul/li[4]/a"));

        actions.moveToElement(menu).moveToElement(subMenu).moveToElement(subSubMenu).click().build().perform();
        Thread.sleep(8000);

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//table/tbody/tr/td[2]/div/div/input")).sendKeys("sel-abbott");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@value='Sel-Abbott']")).click();
        Thread.sleep(2000);
        compareCrt();
        //Testing checkboxes
      /*  driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div[6]/div")).click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/table/tbody/tr[9]/td[4]/div/button/span")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/p")).click();
        Thread.sleep(2000);*/


       /* activateBatteryStatus();
        Thread.sleep(2000);
        deactivateBatteryStatus();
        Thread.sleep(2000); */
        // activatedEriEosANDActivatedBatteryStatus();
        //  Thread.sleep(2000);
        // deactivateERIEOS();
    }

   /* public static void thresholdCheck() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='root']/div/div[2]//div[6]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table/tbody/tr[9]/td[4]/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]/div/span/span/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]/div/span/span/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]/div/span/span/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[4]/div/span/span/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/div/div[2]/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[2]/div[2]/form/div[2]/div/button")).click();
        Thread.sleep(2000);

        System.out.println("Threshold Value modified");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]")).click();
        Thread.sleep(2000);

    }*/
//ist wichtig

    public static void comparison() throws InterruptedException {

    }
//TODO Uhrsymbol bei überschrittener Zeit wird bei dem Test nicht beachtet, muss aber beachtet werden
static void compareCrt() throws InterruptedException {

        System.out.println("Funktionanfang");
    int passedCounter = 0;
    CollectTasks collectTasks = new CollectTasks();
    for (int i = 0; i < collectedTasks.size(); i++) {
        System.out.println("collected Tasks in der compareCrt Methode: "+ collectedTasks);
        if (ExpectedTasks.expectedTask.equals(collectedTasks.get(i))) {
            System.out.println("Die Task ist korrekt");
            passedCounter++;

        } else if (passedCounter < 1) {
            //TODO beschreiben, welches expected Array (nicht) gefunden wurde
            //TODO wenn passedCounter größer als 1: Task wurde mehrfach gefunden
            System.out.println("Die Task wurde nicht erstellt");
            System.out.println("Funktionende");
        }
    }}

}




