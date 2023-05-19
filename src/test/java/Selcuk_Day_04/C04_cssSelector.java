package Selcuk_Day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_cssSelector {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        /*
        1- bir class olusturun
        2- https://www.amazon.com/ adresine gidin
        3- Browseri tam sayfa yapin
        4- Sayfayi “refresh” yapin
        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        6- Gift Cards sekmesine basin
        7- Birthday butonuna basin
        8- Best Seller bolumunden ilk urunu tiklayin
        9- Gift card details’den 25 $’i secin
        10-Urun ucretinin 25$ oldugunu test edin
        11-Sayfayi kapatin
         */

        driver.get("https://www.amazon.com/ "); // 2

        driver.manage().window().maximize();// 3

        driver.navigate().refresh(); // 4

        String expectedIcerik ="Spend less"; // 5
        String actualtitle = driver.getTitle();

        if (actualtitle.contains(expectedIcerik)){
            System.out.println("Tittle Testi PASSED");
        }else {
            System.out.println("Tittle Testi FAİLED");// 5
        }


        driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]")).click();//6


        driver.findElement(By.xpath("//img[@alt='Birthday']")).click();//7

        driver.findElement(By.xpath("(//div[@class='a-section a-spacing-mini a-spacing-top-micro acs-product-block__product-image'])[1]")).click(); //8

        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();

        WebElement ucretElementi = driver.findElement(By.cssSelector("span[class='a-color-price a-text-bold']"));

        String expectedDeger = "25$";
        String actualDeger = ucretElementi.getText();

        if (actualtitle.contains(expectedDeger)){
            System.out.println("Hediye kart testi PASSED");
        }else {
            System.out.println("Hediye kart testi FAİLED");
            System.out.println("Beklenen deger 25$, gerçekleşen değer..: "+actualDeger);
        }



        driver.quit();





    }
}
