package selenium;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import static org.testng.Assert.assertTrue;
import static selenium.CompareTasksInCardio.driver;

import org.testng.annotations.Test;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedInputStream;


public class PdfCheck {

    public static void readPdfContent() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[8]/ol/li[1]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/button")).click();
        Thread.sleep(2000);






        //*[@id="root"]/div/div[2]/div[1]/div[2]

    }

    String pdfUrl ="https://cloud.google.com/docs/security/infrastructure/design/resources/google_infrastructure_whitepaper_fa.pdf";

    public void verifyTextFromPDF() {

        try {

            String pdfContent=getPdfContent(pdfUrl);

            assertTrue(pdfContent.contains("Secure low-level infrastructure"));

            assertTrue(pdfContent.contains("Security of physical premises"));

        } catch (IOException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }

    }

    public static String getPdfContent(String url) throws IOException {

        URL pdfURL=new URL(url);

        InputStream is=pdfURL.openStream();

        BufferedInputStream bis=new BufferedInputStream(is);

        PDDocument doc=PDDocument.load(bis);

        int pages=doc.getNumberOfPages();

        System.out.println("The total number of pages "+pages);

        PDFTextStripper strip=new PDFTextStripper();

        strip.setStartPage(1);

        strip.setEndPage(2);

        String stripText=strip.getText(doc);

        System.out.println(stripText);

        doc.close();

        return stripText;

    }
}
