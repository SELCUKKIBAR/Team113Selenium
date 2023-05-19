package Pdf_Soru_Cozumleri;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru_04 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1. Yeni bir Class olusturalim.C07_ManageWindowSet
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın konumu...: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutlari...: "+driver.manage().window().getSize());

        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(100,100));
        System.out.println("Sayfanın konumu 100*100 yapıldı..");
        driver.manage().window().setSize(new Dimension(1400,100));
        System.out.println("Sayfanin boyutu 1400*100 yapidi");

        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanın konumu...: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutlari...: "+driver.manage().window().getSize());


        //6. Sayfayi kapatin
        Thread.sleep(1000);
        driver.quit();


    }
}
