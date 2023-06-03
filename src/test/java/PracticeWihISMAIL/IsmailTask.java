package PracticeWihISMAIL;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsmailTask {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();




        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote--allow--origins=*");
        ChromeDriver driver=new ChromeDriver();  // the driver
        Thread.sleep(2000);
        driver.manage().window().maximize();

          Thread.sleep(2000);

        driver.navigate().to("https://www.megamillions.com/");
        //a[@class='bigWinViewAll']
        Thread.sleep(2000);
        WebElement viewWinners= driver.findElement(By.xpath("//a[@class='bigWinViewAll']"));
        viewWinners.click();

        Thread.sleep(2000);

        //a[.='Check Your Numbers']
        WebElement checkNumbers=driver.findElement(By.xpath("//*[@id=\"side_nav\"]/li[3]"));
        checkNumbers.click();

        Thread.sleep(2000);


        WebElement b1=driver.findElement(By.xpath("//input[@id='numCheck1']"));
        b1.sendKeys("12");




        WebElement b2=driver.findElement(By.xpath("//input[@id='numCheck2']"));
        b2.sendKeys("11");



        WebElement b3=driver.findElement(By.xpath("//input[@id='numCheck3']"));
        b3.sendKeys("21");


        WebElement b4=driver.findElement(By.xpath("//input[@id='numCheck4']"));
        b4.sendKeys("28");



        WebElement b5=driver.findElement(By.xpath("//input[@id='numCheck5']"));
        b5.sendKeys("32");



        WebElement b6=driver.findElement(By.xpath("//input[@id='numCheckMB']"));
        b6.sendKeys("16");



        //button[@id='findNumbers']
        WebElement click=driver.findElement(By.xpath("//button[@id='findNumbers']"));
        click.click();



        Thread.sleep(2000);


        driver.quit();










    }
}
