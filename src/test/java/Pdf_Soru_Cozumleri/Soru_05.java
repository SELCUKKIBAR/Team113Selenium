package Pdf_Soru_Cozumleri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru_05 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //WebDriver Method’lari
        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        //        (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        driver.get("https://www.facebook.com/");
        String expectedTitle = "Facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Testi PASSED");
        }else {
            System.out.println("Title Testi FAİLED");
            System.out.println("Doğru Title... "+ expectedTitle);
        }


        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
        //    “actual” URL’i yazdirin.

        String expectedUrl = "https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();



        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url testi FAİLED");
            System.out.println("ActualURL.... "+actualUrl);
        }
        Thread.sleep(1000);

        //4.https://www.walmart.com/ sayfasina gidin.

        driver.navigate().to("https://www.walmart.com/");
        Thread.sleep(1000);

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        String expectedWalmartTitle = "Walmart.com";
        String actualWalmartTitle = driver.getTitle();

        if (actualWalmartTitle.contains(expectedWalmartTitle)){
            System.out.println("Walmart title testi PASSED");
        }else {
            System.out.println("Walmart title testi FAİLED");
        }

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        Thread.sleep(1000);
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(1000);
        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //9.Browser’i kapatin
        driver.close();

    }
}
