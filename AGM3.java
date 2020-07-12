import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AGM3 {
    static int ttlres=0;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://timesofindia.indiatimes.com/poll.cms");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.id("mathq2"));
        String captcha=element.getText();
        char[]chars=captcha.toCharArray();

        for (int i=0;i<chars.length;i++){
            System.out.println(i+" "+chars[i]);
        }

       int num1=Integer.parseInt(String.valueOf(chars[0]));
       int num2=Integer.parseInt(String.valueOf(chars[4]));

       String operator= String.valueOf(chars[2]);

       if (operator.equals("+")){
           ttlres= num1+num2;
       }
       if (operator.equals("-")){
           ttlres=num1-num2;
       }
       if (operator.equals("*")){
           ttlres=num1*num2;
       }
       driver.findElement(By.id("mathuserans2")).sendKeys(String.valueOf(ttlres));




    }



}
