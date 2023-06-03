package PracticeWihISMAIL;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Task2YoutoubInterview {

    public static void main(String[] args) throws InterruptedException {


        //  THE SETUP
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote--allow--origins=*");
        ChromeDriver driver=new ChromeDriver();  // the driver
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");



        //input[@id='search']
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='search']"));
        searchBox.sendKeys("mister beast day 94");
        searchBox.sendKeys(Keys.ENTER);



         Thread.sleep(2000);

        List<WebElement> videos=driver.findElements(By.xpath("//div[@id='title-wrapper']"));

        for(WebElement each: videos){

            if(each.getText().equals("I Survived 50 Hours In Antarctica"));{
                each.click();
            }

        }

        Thread.sleep(30000);
        WebElement skipAd=driver.findElement(By.cssSelector(".ytp-ad-skip-button-icon"));
        skipAd.click();
        //div[@id='ad-text:h']




















    }
}
