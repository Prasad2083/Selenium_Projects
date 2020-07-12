import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LinksAGM {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.way2automation.com/");
       //WebElement links= driver.findElement(By.id("___$_21 ___$_21"));
        List<WebElement> list=driver.findElements(By.tagName("a"));
        System.out.println(list.size());

        for (int link=0;link<list.size();link++){

            System.out.println(list.get(link).getText()+" "+list.get(link).getAttribute("href"));
        }
    }
}
