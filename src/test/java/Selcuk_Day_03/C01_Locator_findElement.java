package Selcuk_Day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class C01_Locator_findElement {

    public static void main(String[] args) throws InterruptedException {

        //amazon anasayfa gidi narama kutusuna nuttela yazırın ve enter
        // tuşuna basarak arama yapınız...

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");

        //arama kutusuna nuttella yaz

       WebElement aramaKutusuElementi =  driver.findElement(By.id("twotabsearchtextbox"));

       aramaKutusuElementi.sendKeys("Nutella");

       aramaKutusuElementi.submit(); // submit() = enter tuşu




        Thread.sleep(5000);
        driver.quit();


    }
}
