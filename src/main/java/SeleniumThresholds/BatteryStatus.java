package SeleniumThresholds;


import org.openqa.selenium.By;
import static selenium.CompareTasksInCardio.*;


public class BatteryStatus {
 public static void activateBatteryStatus(){
  boolean isChecked = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[1]/span/span[1]/input")).isSelected();
  System.out.println("Die Checkbox ist gechecked: "+ isChecked);
  if (!isChecked) {
   driver.findElement(By.xpath("//input[@value='']")).click();
  }
 }
 public static void deactivateBatteryStatus(){

 }

}
