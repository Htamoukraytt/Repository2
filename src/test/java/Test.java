import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

    public static void main(String[] args) {

        //  THE SETUP
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote--allow--origins=*");
        ChromeDriver driver=new ChromeDriver();  // the driver

        // VERIZON
        driver.get("http://www.verizon.com"); // entering the target(webSite
        String actualTitle= driver.getTitle(),expectedTitle="Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String res1= actualTitle.equals(expectedTitle.trim())? "PASSED" : "FAILED";
        String res2= driver.getCurrentUrl().equals("https://www.verizon.com/")? "PASSED":"FAILED";
        System.out.println("VERIZON'S TITLE =====>"+ res1+"\n"+"VERIZON URL ==> " +res2);
        driver.close();  //close

        // YouTube
        ChromeDriver driver1=new ChromeDriver();
        driver1.get("https://www.youtube.com/"); // Driver Enter to YouTube
        String res3=driver1.getTitle().equals("YouTube")? "PASSED" : "FAILED";
        String res4=driver1.getCurrentUrl().equals("https://www.youtube.com/") ? "PASSED" : "FAILED";
        System.out.println("Youtube's Title ==> " + res3 +"\n"+"Youtube's Ural ==>" + res4);
        driver1.close();


        // https://www.consulat.ma/en
        ChromeDriver driver2=new ChromeDriver();
        driver2.get("https://www.consulat.ma/en"); // Driver Enter to Consulat de maroc
        String res5=driver2.getTitle().equals("Home page | Consular services")? "PASSED" : "FAILED" ;
        String res6=driver2.getCurrentUrl().equals("https://www.consulat.ma/en")? "PASSED" : "FAILED";
        System.out.println("Consulat's Title==>"+ res5+"\n"+"Consulat's ==> "+ res6);
        driver2.close();













    }
}
