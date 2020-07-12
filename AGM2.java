import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AGM2 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://way2automation.com/way2auto_jquery/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("name")).sendKeys("VaraPrasad");
        //WebElement element= driver.findElement(By.id("load_box"));
        //element.findElement(By.className("button")).click();
        //driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]")).click();

        driver.findElement(By.xpath("//div[@id='load_box']//form//div//input")).click();


    }
}
