import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingDropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       // driver.findElement(By.name("country")).sendKeys("Germany");
        WebElement element = driver.findElement(By.id("searchLanguage"));
        Select select = new Select(element);
        select.selectByValue("hi");
       List<WebElement> list=driver.findElements(By.tagName("option"));
        System.out.println(list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getAttribute("lang"));
        }




    }
}
