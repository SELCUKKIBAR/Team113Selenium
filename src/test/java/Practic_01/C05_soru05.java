package Practic_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_soru05 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("TESTE HOŞGELDİNİZ");



        //1-Driver oluşturalim
        //2-Java class'imiza chnomedriver. exetyi tanitalim
        //3-Driver'in tum ekranı kaplamasini sagu ayalim
        //4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        //Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.
        //5-Navigate to http://www.babayigit.net/murat/testpage.html
        //6-first name, surname, age, Your Job, Birth Palace, Last graduated school, Number of Children
        //  alanlarına gerekli bilgileri yazsın
        //7-Submit tuşuna bassın.
        //8- All information was entered correctly.. yazısının göründüğünü test etsin
        //9- Clear butonu ile tüm butonları temizlesin
        //10- Manuel olarak temizlendiğini görecek kadar beklesin
        //11- Sayfayı kapatsın
        //10-8. maddededeki Test sonucunu yazdırsın
        driver.navigate().to("http://www.babayigit.net/murat/testpage.html");
        driver.findElement(By.xpath("//*[@id='ad']")).sendKeys("Selçuk");
        driver.findElement(By.xpath("//*[@id='soyad']")).sendKeys("KİBAR");
        driver.findElement(By.xpath("//*[@id='yas']")).sendKeys("35");
        driver.findElement(By.xpath("//*[@id='meslek']")).sendKeys("Öğretmen");
        driver.findElement(By.xpath("//*[@id='dogum_yeri']")).sendKeys("ARTVİN");
        driver.findElement(By.xpath("//*[@id='mezun_okul']")).sendKeys("GAZİ");
        driver.findElement(By.xpath("//*[@id='cocuk_sayisi']")).sendKeys("1");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@type='submit']")).click();

        Thread.sleep(2000);

        String expected = "All information was entered correctly..";
        String mesaj = driver.findElement(By.xpath("//*[@id='uyari']")).getText();

        if (mesaj.contains(expected)){
            System.out.println("expected Test PASSED");
        }else {
            System.out.println("expected Test FAİLED");
        }

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@type='reset']")).click();

        Thread.sleep(2000);
        driver.quit();





    }
}
