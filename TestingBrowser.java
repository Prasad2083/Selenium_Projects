import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestingBrowser {


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new ChromeDriver();

       // WebDriver driver = new FirefoxDriver();
        driver.manage().window().fullscreen();

        WebDriverWait webDriverWait = new WebDriverWait(driver,10);// Explicit Wait !!!
        //Can work for both the waits depends on the exception we got after execution//
        driver.get("https://www.gmail.com/");
        driver.findElement(By.id("identifierId")).sendKeys("varaaws2020@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div")).click();
       // webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"view_container\"]" +
               // "/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]"))).getText();
        //System.out.println( driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]")).getText());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit Wait!!
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("MyPassword");
        driver.close();


    }
}
