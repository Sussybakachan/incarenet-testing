package selenium;

import dsutilities.LoggerLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static selenium.CompareTasksInCardio.driver;
import static selenium.CompareTasksInCardio.successfulTestCases;

public class DeletingTasks {
    static Actions action;




    static JavascriptExecutor js;

    public static void deleteTask() throws InterruptedException {
        try{
            int deletedTaskAmount = 0;
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            js = (JavascriptExecutor) driver;
            action = new Actions(driver);
            Thread.sleep(5000);
            List<WebElement> l = driver.findElements(By.xpath("//table/tbody[@class]/tr[@index]"));
            int s = l.size();
            Thread.sleep(2000);
            if (s==0) {
                System.out.println("No Tasks Found");
            } else {
                Thread.sleep(2000);
                js.executeScript("window.scrollBy(0,115)");
                Thread.sleep(4000);
                for (int i = 2; i < s + 2; i++) {
                    Thread.sleep(4000);
                    try {
                        js.executeScript("window.scrollBy(-300,0)");
                        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[7]/div/div/div/div")).click();
                        Thread.sleep(3000);
                    } catch (Exception e) {
                        js.executeScript("window.scrollBy(-100,0)");
                        Thread.sleep(4000);
                        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[7]/div/div/div/div")).click();
                        Thread.sleep(3000);
                    }
                    checkKeineMaßnahmen(wait, i);
                    saveMeasurements(wait, i);
                    Thread.sleep(7000);
                    try {
                        // driver.findElement(By.id("doneButton")).click();
                        System.out.println("first try done button");
                        js.executeScript("window.scrollBy(100,0)");
                        Thread.sleep(2000);
                        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[11]/div/button[1]")).click(); //doneButton
                        //driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[11]/div/button[1]")).click(); //doneButton
                        Thread.sleep(4000);
                        deletedTaskAmount++;
                        System.out.println(deletedTaskAmount + " Tasks out of " + s + " deleted");
                    } catch (Exception e) {
                        try {
                            System.out.println("second try done button");
                            js.executeScript("window.scrollBy(100,0)");
                            // driver.findElement(By.id("doneButton")).click();
                            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[11]/div/button[1]")).click(); //doneButton
                            Thread.sleep(4000);
                            deletedTaskAmount++;
                            System.out.println(deletedTaskAmount + " Tasks out of " + s + " deleted");
                        } catch (Exception p) {
                            System.out.println("third try done button (switch tabs)");
                            driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[6]/div[1]")).click();
                            Thread.sleep(5000);
                            driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div")).click();
                            Thread.sleep(5000);
                            WebElement element3 = wait.until(
                                    ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[11]/div/button[1]")));
                            element3.click();
                            deletedTaskAmount++;
                            System.out.println(deletedTaskAmount + " Tasks out of " + s + " deleted");
                        }
                    }

                }
                Thread.sleep(2000);
                js.executeScript("window.scrollBy(0,-115)");
                Thread.sleep(4000);
                driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/thead/tr/th[1]/span/span[1]/input")).click();
                Thread.sleep(4000);
                js.executeScript("window.scrollBy(115,0)");
                Thread.sleep(4000);
                driver.findElement(By.id("archiveTasksButton")).click();
                Thread.sleep(2000);
                driver.findElement(By.id("confirmButton")).click();

                Thread.sleep(5000);

            }
        } catch (Exception e) {
            LoggingDataModif loggingDataModif = new LoggingDataModif();
            LoggerLoader.fatal("Some Error occurred while trying to delete the Tasks: " + e);
            LoggerLoader.info("Following Testcase(s) were successful: \n " + successfulTestCases);
            LoggerLoader.info("Following Testcase(s) failed:\n" + loggingDataModif.editFailedTaskLogging());
            driver.close();

        }
    }

    private static void saveMeasurements(WebDriverWait wait, int i) throws InterruptedException {
        boolean pressedSuccessfully = false;

        try{
            System.out.println("first try saveMeasurement");
            WebElement element = driver.findElement(By.id("saveMeasurement"));
            JavascriptExecutor js= (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
            pressedSuccessfully = true;
        } catch (Exception e) {
            try{
                System.out.println("second try saveMeasurement");
                js.executeScript("window.scrollBy(0,115)");
                Thread.sleep(4000);
                driver.findElement(By.id("saveMeasurement")).click();
                pressedSuccessfully = true;
            } catch (Exception r){
                while(!pressedSuccessfully){
                try{
                    System.out.println("third try save Measurement");
                    driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[6]/div[1]")).click();
                    Thread.sleep(5000);
                    driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div")).click();
                    Thread.sleep(5000);
                    js.executeScript("window.scrollBy(0,115)");
                    Thread.sleep(5000);
                    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[7]/div/div/div/div")).click();
                    Thread.sleep(5000);
                    driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/label/span[1]/span[1]/input")).click();
                    Thread.sleep(5000);
                    List<WebElement> p = driver.findElements(By.id("saveMeasurement"));
                    System.out.println(p.get(0) + " <- the element");
                    if (p.size()>0){
                        System.out.println("Save measurement button checkbox is visible");
                    }
                    boolean enabled = driver.findElement(By.id("saveMeasurement")).isEnabled();
                    if(enabled){
                        System.out.println("Save measurement button is enabled");
                    }
                    boolean displayed = driver.findElement(By.id("saveMeasurement")).isDisplayed();
                    if (displayed){
                        System.out.println("Save measurement button is displayed");
                    }

                    Thread.sleep(4000);
                    WebElement element = driver.findElement(By.id("saveMeasurement"));
                    JavascriptExecutor js= (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].click();", element);


                    /* driver.findElement(By.id("saveMeasurement")).click();
                    */
                    /*
                    WebElement element = wait.until(
                            ExpectedConditions.elementToBeClickable(By.id("saveMeasurement")));
                    element.click(); */
                        System.out.println("third try: save button clicked");
                    Thread.sleep(5000);
                        pressedSuccessfully = true;
                } catch (Exception x){
                    Thread.sleep(2000);
                }





                    }
            }

        }
    }

    private static void checkKeineMaßnahmen(WebDriverWait wait, int i) throws InterruptedException {
       boolean pressedSuccessfully = false;

        try {
            System.out.println("first try input field");
            WebElement foo = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(driver -> driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/label/span[1]/span[1]/input")));
            foo.click();
          /*  WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div[2]/label/span[1]/span[1]/input")));
           element.click(); */
            //driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/label/span[1]/span[1]/input")).click();
            Thread.sleep(5000);
            System.out.println("first try end");
            pressedSuccessfully = true;
        }catch (Exception e){
            try{
                System.out.println("second try input field");
                js.executeScript("window.scrollBy(-100,0)");
                driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[7]/div/div/div/div")).click();
                WebElement element = wait.until(
                        ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div[2]/label/span[1]/span[1]/input")));
                element.click();
                //driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/label/span[1]/span[1]/input")).click();
                Thread.sleep(5000);
                System.out.println("second try input field last line");
                pressedSuccessfully = true;
            }
            catch (Exception f){
                while(!pressedSuccessfully){
                try{
                    System.out.println("third try input field (switch tabs)");
                    driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[6]/div[1]")).click();
                    Thread.sleep(5000);
                    driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div")).click();
                    Thread.sleep(5000);
                    js.executeScript("window.scrollBy(0,115)");
                    Thread.sleep(5000);
                    js.executeScript("window.scrollBy(-300,0)");
                    Thread.sleep(5000);
                    js.executeScript("window.scrollBy(-100,0)");
                    Thread.sleep(5000);
                    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[7]/div/div/div/div")).click();
                    Thread.sleep(5000);
                    js.executeScript("window.scrollBy(-100,0)");
                    Thread.sleep(5000);
                    List<WebElement> p = driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/label/span[1]/span[1]/input"));
                    System.out.println(p.get(0) + " <- the element");
                    if (p.size()>0){
                        System.out.println("input checkbox is visible");
                    }
                    boolean enabled = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/label/span[1]/span[1]/input")).isEnabled();
if(enabled){
    System.out.println("input is enabled");
}
boolean displayed = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/label/span[1]/span[1]/input")).isDisplayed();
if (displayed){
    System.out.println("input is displayed");
}
                    Thread.sleep(2000);
                    driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/label/span[1]/span[1]/input")).click();
                    System.out.println("third try input field successful");
                    pressedSuccessfully= true;
                } catch (Exception j){
                    Thread.sleep(2000);
                    System.out.println("third try inputfield retying");
                }
                }
        }
    } }
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