package level2;


import BrowsersUtil.BrowsersUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class P2Level2 {



  @Test
  public void Tc_01_action() throws InterruptedException {
      WebDriverManager.chromedriver().setup();
      //
      ChromeOptions options=new ChromeOptions();
      options.addArguments("--remote--allow--origins=*");
      //
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      Actions action=new Actions(driver);
      //
      driver.get("https://www.hilton.com/en/brands/hilton-hotels/?WT.mc_id=zlada0ww1hi2psh3ggl4advcrb5dkt6multibr7_153670571_1003528&gclid=Cj0KCQjwmtGjBhDhARIsAEqfDEc15PuOZ85_-yVw3vz2bwsBV-XeunLvEKzIfO-fsC302KXktEVWgPEaAsrzEALw_wcB&gclsrc=aw.ds");


     driver.findElement(By.xpath("//div[@class='relative']//input[@role='combobox']")).sendKeys("Chicago IL");
     driver.findElement(By.xpath("//button[@data-osc-product='search-form-dates']")).click();
     Thread.sleep(500);
     WebElement dateFrom= driver.findElement(By.xpath("//span[.='Choose Thursday, June 1, 2023 as your Check-in date.']"));
     action.click(dateFrom).perform();
     Thread.sleep(500);
    // WebElement ToDate=driver.findElement(By.xpath("//span[.='Choose Monday, June 5, 2023 as your Check-in date.']"));
     //action.click(ToDate).perform();
     Thread.sleep(1000);
     WebElement closeDate=driver.findElement(By.xpath("//button[@type='button']//span[.='Close Modal']//.."));
     action.moveToElement(closeDate).click(closeDate).perform();
     Thread.sleep(2000);

      driver.findElement(By.xpath("//button[.='Find a Hotel']")).click();
      WebElement PricesSort=driver.findElement(By.xpath("//select[@id='selectSortBy']"));


      List<WebElement>  hotelPrices=driver.findElements(By.xpath("//ul[@data-testid='hotelsList']//p[@data-testid='priceInfo']"));
      List<WebElement>  hotelNames=driver.findElements(By.xpath("//ul[@data-testid='hotelsList']//h3"));

      Map<String,Integer> hotelAndPrice=new TreeMap<>();

      for (int i = 0; i < hotelNames.size(); i++) {
         // Thread.sleep(1000);
          if(BrowsersUtil.getText(hotelPrices.get(i)).equals("Sold Out")){
              hotelAndPrice.put(BrowsersUtil.getText(hotelNames.get(i))+"===> sold out* ", 00);
          }else {
          Integer price=Integer.parseInt(BrowsersUtil.getText(hotelPrices.get(i)).replace("$",""));
          hotelAndPrice.put(BrowsersUtil.getText(hotelNames.get(i)), price);}
          //Thread.sleep(1000);
          //action.scrollByAmount(100,100).perform();
      }
      System.out.println(hotelAndPrice);
      System.out.println(hotelAndPrice.size());









       //   ====> price // value  POINTS_ASCENDING  and text ==>  Price: high-low
      //select[@id='selectCurrencyConverter']  or try  #selectCurrencyConverter


//       driver.findElement(By.xpath(" //input[@name='username']")).sendKeys("hicham96");
//       Thread.sleep(1000);
//       driver.findElement(By.cssSelector("#personal-password")).sendKeys("Hicham");
//      // #personal-password
//       Thread.sleep(1000);
//       driver.findElement(By.xpath(" //button[@title='Log in to Huntington Online Banking']")).click();
//      //button[@title='Log in to Huntington Online Banking']


  }






}
