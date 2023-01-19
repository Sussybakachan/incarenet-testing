package selenium;

import dsutilities.LoggerLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static selenium.PdfCheck.pdfCheck;


public class CompareTasksInCardio {

    public static WebDriver driver;
    static Actions action;

    static List<FailedTasks> listOfFailedTasksAndReason = new ArrayList<>();
    public static List<String> successfulTestCases = new ArrayList<>();

    static JavascriptExecutor js;
    //  public static void comparison() throws InterruptedException {}
    static int successfulTAsks = 0;


    public static void loginP() throws InterruptedException, IOException {
        try{
            ReadingConfig rc = new ReadingConfig();
            driver.findElement(By.id("usernameField")).sendKeys(rc.loadProperty().getProperty("USERNAME"));
            Thread.sleep(2000);
            driver.findElement(By.id("passwordField")).sendKeys(rc.loadProperty().getProperty("PASSWORD"));
            Thread.sleep(2000);
            driver.findElement(By.id("doLoginBtn")).click();
            Thread.sleep(8000);
        } catch (Exception e) {
            LoggerLoader.fatal("Login failed:\n Check config.properties or see if the server is unavailable");
        }
    }
//ist wichtig

    public static void inCardioDash() throws Exception {
        Thread.sleep(8000);
        List<WebElement> p = driver.findElements(By.xpath("/html/body/div[4]/div[1]/div/div[1]/ul/li[@class='KoNavItem']"));

        int pp = p.size();
        System.out.println(pp);

        for (int i = 1; i <= p.size() + 1; i++) {
            String f = null;
            try {
                f = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/ul/li[" + i + "]/a")).getAttribute("name");
            } catch (Exception e) {
                LoggerLoader.fatal("Login failed:\nCheck config.properties or see if the server is unavailable");
            }
            // taskObject.setColor(driver.findElement(By.xpath(xpathTAble + i + "]/td[" + TaskElements.COLOr.ordinal() + "]")).getAttribute("value"));
            System.out.println(f);

            if (Objects.equals(f, "incardio-dashboard")) {
                System.out.println(Objects.equals(f, "incardio-dashboard"));
                driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/ul/li[" + i + "]/a")).click();
                break;
            } else if (i == p.size()) {
                LoggerLoader.fatal("inCARDIO-Dashboard Tab could not be found. Check if the sol is available");
                throw new Exception();
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

    //TODO Uhrsymbol bei überschrittener Zeit und Handsymbol wird bei dem Test nicht beachtet, muss aber beachtet werden, eventuell gibt es noch weitere Ausprägungen
    public static void compareCrt(List<Task> listname, String testcase, List<Task> collectTasks) throws Exception {
        List<Task> duplicateElements = new ArrayList<>();
        List<Task> foundExpectedTasks = new ArrayList<>();
        List<Task> notFoundTasks = new ArrayList<>();
        List<Task> notFoundCreatedTasks = new ArrayList<>();
        FailedTasks b = new FailedTasks();
        b.setManufacturerTestCase(testcase);
        int amountOfSurplusTasks = 0;
        int amountOfMissingTasks = 0;
        boolean hasSurplusTasks = false;
        boolean hasMissingTasks = false;
        boolean hasNoPdf = false;
        int expectedTaskFoundCounter = 0;
        System.out.println(testcase);

        if (!listname.get(0).isIntentioanllyEmpty() && !pdfCheck()) {
            hasNoPdf = true;
            LoggerLoader.error("No PDF was found or the content was not expected");
        }
        if (!listname.get(0).isIntentioanllyEmpty() && collectTasks.size() == 0) {
            System.out.println("Es wurde keine Task erstellt");
            b.setReasonForFailure("Es wurde keine Task erstellt");
            listOfFailedTasksAndReason.add(b);
            return;
        }

        if (!listname.get(0).isIntentioanllyEmpty() && collectTasks.size() > listname.size()) {
            amountOfSurplusTasks = collectTasks.size() - listname.size();
            hasSurplusTasks = true;
        }

        if (!listname.get(0).isIntentioanllyEmpty() && collectTasks.size() < listname.size()) {
            amountOfMissingTasks = listname.size() - collectTasks.size();
            hasMissingTasks = true;
            LoggerLoader.error( amountOfMissingTasks + " less tasks got created than expected.");
        }

        if (listname.get(0).isIntentioanllyEmpty() && collectTasks.size() == 0) {
            System.out.println("Die Task wurde gewollt und erfolgreich NICHT erstellt.");
            successfulTestCases.add(testcase);
            return;
        } else if (listname.get(0).isIntentioanllyEmpty() && collectTasks.size() > 0) {
            System.out.println("Eine oder mehrere Tasks wurden ungewollt erstellt");
            b.setReasonForFailure("Eine oder mehrere Tasks wurden ungewollt erstellt");
            listOfFailedTasksAndReason.add(b);
            return;
        }

        System.out.println("the list size is: " + listname.size());
        if (listname.size() < 1) {
            LoggerLoader.fatal("Some expected Task List did not get created: " + testcase);
            throw new Exception("Some expected Task List did not get created");
        }
        System.out.println("Funktionanfang");
        for (int i = 0; i < listname.size(); i++) {
            successfulTAsks++;
            int passedCounter = 0;
            for (int j = 0; j < collectTasks.size(); j++) {
                System.out.println("j: " + j + " i: " + i);
                //System.out.println("collected Tasks in der compareCrt Methode: " + collectTasks);
                if (collectTasks.get(j).equals(listname.get(i)) && PatternTest.useRegex(String.valueOf(collectTasks.get(j).getReceiveDate())) && PatternTest.useRegex(String.valueOf(collectTasks.get(j).getTargetDate()))) {
                    System.out.println("Die Task ist korrekt " + "\n" + "\n" + listname.get(i) + "\n" + "\n" + " und " + "\n" + "\n" + collectTasks.get(j));
                    passedCounter++;
                    System.out.println(passedCounter);
                    System.out.println("Amount of successful tasks " + successfulTAsks);
                    foundExpectedTasks.add(listname.get(i));


                } else if (passedCounter < 1 && j == collectTasks.size() - 1) {
                    //TODO beschreiben, welches expected Array (nicht) gefunden wurde und welches Attribut nicht übereinstimmt
                    //TODO wenn passedCounter größer als 1: Task wurde mehrfach gefunden
                    notFoundTasks.add(listname.get(i));
                    System.out.println("Die Task wurde nicht gefunden, da " + listname.get(i) + "nicht in der collected Liste vorhanden ist");
                    System.out.println("Funktionende");
                }
            }

        }
        if (notFoundTasks.size() > 0 || hasSurplusTasks) {
            List<String> failMessageArray = new ArrayList<>();
            if (hasSurplusTasks){
                b.setReasonForFailure(amountOfSurplusTasks + " more task(s) got created than expected" +  "\n" +
                        createSpecificFailedTestMessage(listname, collectTasks,notFoundTasks, notFoundCreatedTasks,amountOfMissingTasks,foundExpectedTasks,duplicateElements,failMessageArray, hasNoPdf) +
                        "\n");
                listOfFailedTasksAndReason.add(b);
            }
            if (hasMissingTasks){
                b.setReasonForFailure(amountOfMissingTasks + " more task(s) were expected" + "\n" + createSpecificFailedTestMessage(listname, collectTasks,notFoundTasks, notFoundCreatedTasks,amountOfMissingTasks,foundExpectedTasks,duplicateElements,failMessageArray, hasNoPdf) +
                        "\n");
                listOfFailedTasksAndReason.add(b);
            }
            if (!hasSurplusTasks && !hasMissingTasks) {
                b.setReasonForFailure(createSpecificFailedTestMessage(listname, collectTasks, notFoundTasks, notFoundCreatedTasks, amountOfMissingTasks, foundExpectedTasks, duplicateElements, failMessageArray, hasNoPdf) +
                        "\n");
                listOfFailedTasksAndReason.add(b);
            }

        } else if (hasNoPdf){
            List<String> failMessageArray = new ArrayList<>();
            b.setReasonForFailure(amountOfMissingTasks + " more task(s) were expected" + "\n" + createSpecificFailedTestMessage(listname, collectTasks,notFoundTasks, notFoundCreatedTasks,amountOfMissingTasks,foundExpectedTasks,duplicateElements,failMessageArray, hasNoPdf) +
                    "\n");
            listOfFailedTasksAndReason.add(b);
        }
        else {
            successfulTestCases.add(testcase);
        }
    }

    private static List<String> createSpecificFailedTestMessage(List<Task> listname, List<Task> collectTasks, List<Task> notFoundTasks, List<Task> notFoundCreatedTasks, int amountOfMissingTasks,List<Task> foundExpectedTasks, List<Task> duplicateElements, List<String> failMessageArray, boolean hasNoPdf) {
        if(!getAdditionalNotDoubleTasks(listname, collectTasks, notFoundCreatedTasks, amountOfMissingTasks).equals("")){
            failMessageArray.add("\n"+"FOLLOWING TASKS ARE NOT DUPLICATE AND ARE NOT EXPECTED: " + "\n" + getAdditionalNotDoubleTasks(listname, collectTasks, notFoundCreatedTasks, amountOfMissingTasks)+ "\n");
        }
        if(!lookForDuplicateTasks(foundExpectedTasks, duplicateElements).equals("")){
            failMessageArray.add("\n"+"FOLLOWING TASKS GOT FOUND MORE THAN ONCE: " + "\n" + lookForDuplicateTasks(foundExpectedTasks, duplicateElements)+ "\n");
        }
        if(!notFoundTasks.isEmpty()){
            failMessageArray.add("\n" + "FOLLOWING EXPECTED TASKS DID NOT GET FOUND: " + notFoundTasks);
        }
        if (hasNoPdf){
            failMessageArray.add("\n" + "No PDF was found or the content was not expected ");
        }
        return failMessageArray;
    }

    private static String lookForDuplicateTasks(List<Task> foundExpectedTasks, List<Task> duplicateElements) {
        String duplicateElementsAsString = "";
        for (int i = 0; i < foundExpectedTasks.size(); i++) {
            for (int j = i + 1 ; j < foundExpectedTasks.size(); j++) {
                if (foundExpectedTasks.get(i).equals(foundExpectedTasks.get(j))) {
                    duplicateElements.add(foundExpectedTasks.get(i));
                }
            }
        }
        for (Task d :
                duplicateElements) {
            duplicateElementsAsString = String.valueOf(d);
        }
        return duplicateElementsAsString;
    }

    private static String getAdditionalNotDoubleTasks(List<Task> listname, List<Task> collectTasks, List<Task> notFoundCreatedTasks, int amountOfMissingTasks) {
        String notFoundCreatedTasksAsString = "";
        for (int i = 0; i < collectTasks.size(); i++) {
            int passedCounter = 0;
            for (int j = 0; j < listname.size(); j++) {
                System.out.println("j: " + j + " i: " + i);
                if (listname.get(j).equals(collectTasks.get(i)) && PatternTest.useRegex(String.valueOf(collectTasks.get(j).getReceiveDate())) && PatternTest.useRegex(String.valueOf(collectTasks.get(j).getTargetDate()))) {
                    passedCounter++;
                    System.out.println(passedCounter);
                } else if (passedCounter < 1 && j == listname.size() - 1) {
                    //TODO beschreiben, welches expected Array (nicht) gefunden wurde und welches Attribut nicht übereinstimmt
                    //TODO wenn passedCounter größer als 1: Task wurde mehrfach gefunden
                    // notFoundTasks.add(listname.get(i));
                    notFoundCreatedTasks.add(collectTasks.get(i));
                    for (Task s :
                            notFoundCreatedTasks) {
                        notFoundCreatedTasksAsString = String.valueOf(s);
                    }
                    System.out.println("Following tasks could not have been assigned to a expected Task: " + collectTasks.get(i));
                    System.out.println("Funktionende");
                }
            }

        }
        return (notFoundCreatedTasksAsString);
    }

    public static void choosepatient(String p) throws InterruptedException {
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table/tbody/tr/td[2]/div/div/input")).sendKeys(p);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@value=" + "'" + p + "'" + "]")).click();
        Thread.sleep(2000);
    }
}




