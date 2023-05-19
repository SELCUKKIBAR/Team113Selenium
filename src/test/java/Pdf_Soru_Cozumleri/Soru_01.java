package Pdf_Soru_Cozumleri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru_01 {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*

        1. Yeni bir package olusturalim : day01
        2. Yeni bir class olusturalim : C03_GetMethods
        3. Amazon sayfasina gidelim. https://www.amazon.com/
        4. Sayfa basligini(title) yazdirin
        5. Sayfa basliginin “Amazon” icerdigini test edin
        6. Sayfa adresini(url) yazdirin
        7. Sayfa url’inin “amazon” icerdigini test edin.
        8. Sayfa handle degerini yazdirin
        9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        10. Sayfayi kapatin.

         */

        driver.get("https://www.amazon.com/"); //3.

        System.out.println(driver.getTitle()); //4.

        String expectedTitleResult = driver.getTitle();
        String actualTitleResult = "Amazon";

        if (expectedTitleResult.contains(actualTitleResult)){
            System.out.println("expectedTitleResult Testi PASSED");
        }else {
            System.out.println("expectedTitleResult Testi FAİLED");
        }

        System.out.println(driver.getCurrentUrl());

        String actualTitleResult_1 = "amazon";

        if (driver.getCurrentUrl().contains(actualTitleResult_1)){
            System.out.println("getCurrentUrl amazon Testi PASSED");

        }else {
            System.out.println("getCurrentUrl amazon Testi FAİLED");
        }
        System.out.println(driver.getWindowHandle());


        String pageSource = driver.getPageSource();
        String kelime = "alisveris";

        if (pageSource.contains(kelime)){
            System.out.println("alisveris kelimesi testi PASSED");
        }else {
            System.out.println("alisveris kelimesi testi FAİLED");
        }

        driver.quit();



    }
}
