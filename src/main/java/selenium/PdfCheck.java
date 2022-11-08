package selenium;

import org.openqa.selenium.By;
import static selenium.CompareTasksInCardio.driver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class PdfCheck {

    public static void pdfCheck() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]")).click();
        Thread.sleep(2000);


        List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[8]/ol/li"));
        Thread.sleep(2000);


        int f = list.size();
        System.out.println(f);
        for (int i = 1; i<= 1; i++){
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[8]/ol/li["+ i + "]/a")).click();
            Thread.sleep(4000);
            WebElement have = driver.findElement(By.xpath("/html/body/embed[0]"));
            System.out.println(have);

//            if (Objects.equals(d, "Dies ist eine")){
//                System.out.println(Objects.equals(d, "Dies ist eine"));
//                break;
//            }

            driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button")).click();
            Thread.sleep(2000);
        }

    }


}
