import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeXPATHLocatorsGoogle {


    public static void main(String[] args) throws InterruptedException {


          WebDriverManager.chromedriver().setup();


          ChromeOptions options=new ChromeOptions();
          options.addArguments("--remote--allow--origins=*");


          ChromeDriver driver = new ChromeDriver(options);
          driver.manage().window().maximize();
          driver.get("https://www.google.com/");

          Thread.sleep(2000);


          WebElement search=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
          search.sendKeys("koora live");


          Thread.sleep(2000);

         WebElement searchClick=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[7]/center/input[1]"));
         searchClick.click();


        Thread.sleep(2000);

    ////*[@id="rso"]/div[1]/div/div/div[1]/div/a/h3/span
        WebElement enteringKora=driver.findElement(By.xpath("[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/h3/span"));
        enteringKora.click();


    }
}
