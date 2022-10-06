import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Testing {

    static WebDriver driver;
    static Actions action;


    static JavascriptExecutor js;

    public static void main(String[] args) throws InterruptedException, IOException {
        //to run the project it's important to have added Selenium drivers
        //you have to change the path to the location of your chromeDrivers and the path where your IDCO files is located.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dboiko\\Desktop\\Last-Test\\Chromedriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://dcm1al4fpj.hub.doc-cirrus.com");
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;
        action= new Actions(driver);

        PasteFile.pasteFile ("/home/fernand/Documents/sdx/abott/Abbott Implant CRT 84%.hl7", "/home/fernand/IdeaProjects/sdx-file-forwarder/file/Abbott Implant CRT 84%.hl7");

        loginP();
        inCardioDash();
        thresholdCheck();
        comparison();
    }



    public static void loginP() throws InterruptedException {
        driver.findElement(By.id("usernameField")).sendKeys("fmushinzimana");
        Thread.sleep(2000);
        driver.findElement(By.id("passwordField")).sendKeys("BoNiTo97.");
        Thread.sleep(2000);
        driver.findElement(By.id("doLoginBtn")).click();
        Thread.sleep(8000);
    }

    public static void inCardioDash() throws InterruptedException {
        Actions actions= new Actions(driver);
        WebElement menu =  driver.findElement(By.name("drop-services"));
        WebElement subMenu =  driver.findElement(By.name("appMenu"));
        WebElement subSubMenu =  driver.findElement(By.xpath("//*[@id=\"bs3TopMenu\"]/ul/li[6]/ul/li[11]/ul/li[4]/a"));

        actions.moveToElement(menu).moveToElement(subMenu).moveToElement(subSubMenu).click().build().perform();
        Thread.sleep(8000);

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//table/tbody/tr/td[2]/div/div/input")).sendKeys("sel-abbott");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@value='Sel-Abbott']")).click();
        Thread.sleep(2000);
    }

    public static void thresholdCheck() throws InterruptedException {
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

    }

    public static void comparison() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]")).click();
        Thread.sleep(2000);

        List<WebElement> l=driver.findElements(By.xpath("//table/tbody[@class]/tr[@index]"));
        int s= l.size();
        List <WebElement> m=driver.findElements(By.xpath("//table/tbody[@class]/tr[@index]/td")) ;
        int t= m.size();
        if (s==1 && t==1){
            System.out.println("There are no tasks");
            s = 0;
            t= 0;
        } else {
            System.out.println(s +" Tasks got detected");
            System.out.println("The amount of columns are "+ t);
        }

        List task= new ArrayList<>();

        for (int i=0; i<s ; i++) {
            List<String> where = new ArrayList<String>();
            for (int j = 2; j < 12; j++) {

                if (j < 6) {
                    String c = driver.findElement(By.xpath("//table/tbody[@class]/tr[@index=" + i + "]/td[" + j + "]")).getAttribute("value");
                    where.add(c);
                    continue;
                }
                String c = driver.findElement(By.xpath("//table/tbody[@class]/tr[@index=" + i + "]/td[" + j + "]")).getText();
                where.add(c);
            }

            System.out.println(where);
            task.add(where);
        }

        System.out.println(task);

    }



}

