import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlingPopupsandTabs {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.hdfcbank.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*Set<String> windowhandle= driver.getWindowHandles();
        Iterator<String> iterator = windowhandle.iterator();
        System.out.println(iterator.next());*/

        driver.findElement(By.className("//*[@id=\"main\"]/div[2]/div[13]/div[1]/div/div/div[2]/div[2]/div[3]/div/div/div/div/div/a")).click();



    }
}
