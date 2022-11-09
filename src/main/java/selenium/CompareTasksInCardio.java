package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import static selenium.CollectTasks.*;
import static selenium.ExpectedTasks.abbottCrt;


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

    public static void inCardioDash() throws Exception {
        Thread.sleep(6000);
        List<WebElement> p = driver.findElements(By.xpath("/html/body/div[4]/div[1]/div/div[1]/ul/li[@class='KoNavItem']"));

        int pp = p.size();
        System.out.println(pp);
        for (int i = 1; i<= p.size()+1; i++){
           String f = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/ul/li["+ i + "]/a")).getAttribute("name");

           // taskObject.setColor(driver.findElement(By.xpath(xpathTAble + i + "]/td[" + TaskElements.COLOr.ordinal() + "]")).getAttribute("value"));
            System.out.println(f);
            if (Objects.equals(f, "incardio-dashboard")){
                System.out.println(Objects.equals(f, "incardio-dashboard"));
                driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/ul/li["+ i + "]/a")).click();
                break;
            }
        }
        Thread.sleep(8000);
/*
        Actions actions = new Actions(driver);
        WebElement menu = driver.findElement(By.name("drop-services"));
        WebElement subMenu = driver.findElement(By.name("appMenu"));
        WebElement subSubMenu = driver.findElement(By.xpath("//*[@id=\"bs3TopMenu\"]/ul/li[6]/ul/li[11]/ul/li[4]/a"));


        actions.moveToElement(menu).moveToElement(subMenu).moveToElement(subSubMenu).click().build().perform();
        Thread.sleep(8000);

        choosepatient("Sel-MicroPort");
        compareCrt(microPortExpectedList);
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

    public static void thresholdCheck() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div/table/tbody/tr[2]")).click();       //showImplantTemplate
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='root']/div/div[2]//div[6]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//table/tbody/tr[9]/td[4]/div/button")).click();       //showImplantTemplate
        Thread.sleep(2000);
        deselectAll();
        Thread.sleep(2000);



        driver.findElement(By.xpath("//div/div/div[2]/div/button")).click();        //saveAndBack
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[2]/div[2]/form/div[2]/div/button")).click();      //save
        Thread.sleep(2000);

        System.out.println("Threshold Value modified");





        /*driver.findElement(By.xpath("//div[@id='root']/div/div[2]//div[6]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table/tbody/tr[9]/td[4]/div/button")).click();       //showImplantTemplate
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]/div/span/span/input")).click();      //CRTFinding
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]/div/span/span/input")).click();      //showImplantTemplate
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]/div/span/span/input")).click();      //CRTCriticalFinding
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]/div/span/span/input")).click();     //showImplantTemplate
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/div/div[2]/div/button")).click();        //saveAndBack
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[2]/div[2]/form/div[2]/div/button")).click();      //save
        Thread.sleep(2000);

        System.out.println("Threshold Value modified");

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]")).click();     //showImplantTemplate
        Thread.sleep(2000);*/

    }
//ist wichtig

  //  public static void comparison() throws InterruptedException {}
  static int successfulTAsks = 0;
    //TODO Uhrsymbol bei überschrittener Zeit und Handsymbol wird bei dem Test nicht beachtet, muss aber beachtet werden, eventuell gibt es noch weitere Ausprägungen
    static void compareCrt(List<Task> listname) throws Exception {

        CollectTasks collectTasks = new CollectTasks();
        if (listname.get(0).isIntentioanllyEmpty()&& collectedTasks.size() == 0){
            System.out.println("Die Task wurde gewollt und erfolgreich NICHT erstellt.");

        }else if (listname.get(0).isIntentioanllyEmpty()&& collectedTasks.size()>0)  {
            System.out.println("Eine oder mehrere Tasks wurden ungewollt erstellt");
            return;
        }

            System.out.println("the list size is: " + listname.size());
            if(listname.size()<1){
                throw new Exception("Some expected Task List did not get created");
            }
            System.out.println("Funktionanfang");
        for (int i = 0; i < collectedTasks.size(); i++) {
            successfulTAsks ++;
            int passedCounter = 0;
            for (int j = 0; j < listname.size(); j++) {
                System.out.println("j: " + j + " i: " + i);
                //System.out.println("collected Tasks in der compareCrt Methode: " + collectedTasks);
                if (listname.get(j).equals(collectedTasks.get(i)) && PatternTest.useRegex(String.valueOf(collectedTasks.get(j).getReceiveDate())) && PatternTest.useRegex(String.valueOf(collectedTasks.get(j).getTargetDate()))) {
                    System.out.println("Die Task ist korrekt " +"\n" + "\n" + collectedTasks.get(i).getTaskDescription() + "\n"+ "\n"+ " und "+ "\n"+ "\n"+ listname.get(j).getTaskDescription());
                    passedCounter++;
                    System.out.println(passedCounter);
                    System.out.println("Amount of succsseful Tasks "+ successfulTAsks);
                } else if (passedCounter < 1 && j== listname.size()-1) {
                    //TODO beschreiben, welches expected Array (nicht) gefunden wurde und welches Attribut nicht übereinstimmt
                    //TODO wenn passedCounter größer als 1: Task wurde mehrfach gefunden
                    System.out.println("Die Task wurde nicht gefunden, da "+ collectedTasks.get(i).getTaskDescription() + "nicht in der Expected Liste vorhanden ist");
                    System.out.println("Funktionende");
                }
            }
        }
    }


    public static void choosepatient(String p) throws InterruptedException {
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//table/tbody/tr/td[2]/div/div/input")).sendKeys(p);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@value="+"'"+ p +"'"+ "]")).click();
        Thread.sleep(2000);
    }
}




