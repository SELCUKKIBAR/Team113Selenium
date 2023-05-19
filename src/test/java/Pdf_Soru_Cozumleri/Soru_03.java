package Pdf_Soru_Cozumleri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru_03 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        1. Yeni bir Class olusturalim.C06_ManageWindow
        2. Amazon soyfasina gidelim. https://www.amazon.com/
        3. Sayfanin konumunu ve boyutlarini yazdirin

        4. Sayfayi simge durumuna getirin

        5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        7. Sayfayi fullscreen yapin
        8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        9. Sayfayi kapatin
         */

        driver.get("https://www.amazon.com/");//2
        System.out.println("yarım ekran boyutu"+driver.manage().window().getSize());//3
        System.out.println("yarım ekran pozisyonlari"+driver.manage().window().getPosition());//3

        driver.manage().window().minimize();//4
        System.out.println("Webbrowser minimize oldu...");
        Thread.sleep(1000);

        driver.manage().window().maximize();//5
        System.out.println("tam ekran boyutu"+driver.manage().window().getSize());//6
        System.out.println("tam ekran pozisyonları"+driver.manage().window().getPosition());//6

        driver.manage().window().fullscreen();//7
        System.out.println("full screen boyutu"+driver.manage().window().getSize());//8
        System.out.println("full screen boyutu"+driver.manage().window().getPosition());//8

        driver.quit();

    }
}
