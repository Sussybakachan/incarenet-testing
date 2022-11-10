package SeleniumThresholds;

import org.openqa.selenium.By;

import static SeleniumThresholds.Deselect.deselectAll;
import static selenium.CompareTasksInCardio.driver;

public class ThresholdCheckMethod {
    public static void thresholdCheck() throws InterruptedException {

        Thread.sleep(5000);
        deselectAll();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div/table/tbody/tr[2]")).click();       //showImplantTemplate
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='root']/div/div[2]//div[6]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table/tbody/tr[9]/td[4]/div/button")).click();       //showImplantTemplate
        Thread.sleep(2000);
        //deselectAll();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/div/div[2]/div/button")).click();        //saveAndBack
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[2]/div[2]/form/div[2]/div/button")).click();      //save
        Thread.sleep(2000);
        //go to the task tab
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]")).click();
        Thread.sleep(3000);

        System.out.println("Threshold Value modified");

    }
}
