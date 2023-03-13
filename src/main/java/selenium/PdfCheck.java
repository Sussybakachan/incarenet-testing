package selenium;



import com.testautomationguru.utility.PDFUtil;
import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Base64;

import static selenium.ChromeWebDriver.driver;


public class PdfCheck {


    public static boolean pdfCheck(String testcase) throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[8]/ol/li"));
        Thread.sleep(2000);

        int f = list.size();
        int m = 1;

        try {

            if (testcase.contains("Biotronik")){
                m=2;
            }
            for (int i = m; i <= m; i++) {
                driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[8]/ol/li[" + i + "]/a")).click();
                Thread.sleep(3000);
                String src = driver.findElement(By.xpath("/html/body/div[4]/div[3]/iframe")).getAttribute("src");
                System.out.println(src);

                String[] arrOfStr = src.split(",");
                String text = arrOfStr[1];
                System.out.println(text);

                byte[] decoded = Base64.getDecoder().decode(text);
                File file = new File("./test.pdf");
                OutputStream out = new FileOutputStream(file);
                out.write(decoded);
                out.close();

                driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button")).click();
                Thread.sleep(2000);
            }

            String expectedPdf = "./src/main/java/ExpectedTasks/expected.pdf";
            String actualPdf = "./test.pdf";

            PDFUtil pdfUtil = new PDFUtil();

            boolean compare = pdfUtil.compare(actualPdf, expectedPdf);

            System.out.println(" PDFs similarity " + compare);

            File that = new File(actualPdf);
            that.delete();


            if (!compare) {
                return false;
            } else {
                return true;
            }

        } catch (Exception e) {
            //TODO add testcase to failed testcase if no pdf was found and a task should have been created.
            return false;
        }
    }
}