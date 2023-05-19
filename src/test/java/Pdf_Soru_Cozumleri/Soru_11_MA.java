package Pdf_Soru_Cozumleri;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru_11_MA {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Test Senaryosu 5: Bize Ulaşın Formu
        //1. Tarayıcıyı başlatın
        //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");

        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Anasayfa görüntüleme testi PASSED");
        }else {
            System.out.println("Anasayfa görüntüleme testi FAİLED");
        }
        Thread.sleep(1000);

        //4. 'Bize Ulaşın' düğmesine tıklayın
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")).click();

        //5. "İLETİŞİME GEÇİN"in görünür olduğunu doğrulayın
        String dogrulamaMesaji = "TEMASTA OLMAK";
        String sayfaDogrulama = driver.getPageSource();

        if (sayfaDogrulama.contains(dogrulamaMesaji)){
            System.out.println("İletişime Geçin sayfası testi PASSED");
        }else {
            System.out.println("İletişime Geçin sayfası testi FAİLED");
        }

        //6. Adı, e-postayı, konuyu ve mesajı girin
        driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Selçuk");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@data-qa='email']")).sendKeys("selcukkibar88@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@data-qa='subject']")).sendKeys("Test");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@data-qa='message']")).sendKeys("Bu mesaj deneme amaçlı yazılmıştır...");
        Thread.sleep(1000);

        //7. Dosya yükleyin
        //driver.findElement(By.xpath("//input[@type='file']")).click();


        //8. 'Gönder' düğmesini tıklayın
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //9. Tamam düğmesine tıklayın

        //10. Başarı mesajını doğrulayın 'Başarı! Bilgileriniz başarıyla gönderildi.' dır-dir görünür
        //11. 'Ana Sayfa' düğmesine tıklayın ve ana sayfaya başarıyla geldiğini doğrulayın

        driver.quit();
    }
}
