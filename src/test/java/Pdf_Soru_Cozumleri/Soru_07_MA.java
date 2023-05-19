package Pdf_Soru_Cozumleri;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru_07_MA {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



       //Test Case 1: Verify the Login Functionality
       //1- Launch the website https://automationexercise.com/
        driver.get("https://automationexercise.com/");


       //2- Click on the "Login" button on the top right corner of the page
        driver.findElement(By.xpath("//*[@href='/login']")).click();

       //3- Enter a valid email address and password in the respective fields
        driver.findElement(By.xpath("(//*[@type='email'])[1]")).sendKeys("selcukkibar88@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("1234567890");
        Thread.sleep(2000);
       //4- Click on the "Sign in" button
        driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
        Thread.sleep(2000);
       //5- Verify that the user is logged in by checking if the "My account" page is displayed
        String login = "My account";
        String sayfaKodu = driver.getPageSource();
        if (sayfaKodu.contains(login)){
            System.out.println("My account testi PESSED");
        }else {
            System.out.println("My account testi FAİLED");
        }

        String text = driver.findElement(By.xpath("//a[text()=' Logged in as ']")).getText();
        System.out.println("Hesabınıza giriş yaptınız...: "+text);

        //6- Logout of the website
        Thread.sleep(2000);
        driver.quit();






    }
}
