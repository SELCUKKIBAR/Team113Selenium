package Practic_01;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_soru02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


         /*
     . .Exercise2...
        1-Driver oluşturalim
        2-Java class'imiza chnomedriver. exetyi tanitalim
        3-Driver'in tum ekranı kaplamasini sagu ayalim
        4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sqyfq Yüklenirse, beklemeyi bıraksın.
        5-"https://www.otto.de" adresine gidelim
        6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        8-Ardindan "https://wisequarter.com/" adresine gidip
        9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        10-Bir onceki web sayfamiza geri donelim
        11-Sayfayı yenileyelim
        12-Daha sonra web sgyfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */
        driver.get("https://www.otto.de");

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);

        if (actualUrl.contains("OTTO") &&actualTitle.contains("OTTO") ){
            System.out.println("Url and Title test   PASSED..");
        } else {
            System.out.println("Title and Url test FAİLED..");
        }
        Thread.sleep(1000);

        driver.navigate().to("https://wisequarter.com/");
        String actualTitle2 = driver.getTitle();
        System.out.println(actualTitle2);

        if (actualTitle2.contains("Quarter")){
            System.out.println("actualTitle test PASSED");
        }else {
            System.out.println("actualTitle test FAİLED");
        }
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);

        System.out.println("All in well");


        driver.quit();

    }
}
