package level2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Safari {


  @Test
  public void SafariOpen(){
     // WebDriverManager.safaridriver().setup();   // built In no need only create driver and allow automation from Devops
      WebDriver driver= new SafariDriver();
      driver.manage().window().maximize();

      driver.get("https://www.google.com/");









  }





}
