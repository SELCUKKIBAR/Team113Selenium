package Pdf_Soru_Cozumleri;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru_10_MA {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       //Test Durumu 4: Kullanıcıyı mevcut e-posta ile kaydedin
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

       //4. 'Kaydol / Giriş Yap' düğmesine tıklayın
        driver.findElement(By.xpath("//*[@href='/login']")).click();
        Thread.sleep(1000);

       //5. 'Yeni Kullanıcı Kaydı!'nı doğrulayın! görünür
        String yeniKullaniciMesaji = "New User Signup!";
        String yeniKullaniciMesajiDogrulama = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")).getText();

        System.out.println("Login yap yazısı = "+yeniKullaniciMesajiDogrulama);
        if (yeniKullaniciMesajiDogrulama.contains(yeniKullaniciMesaji)){
            System.out.println("Login to your account Testi PASSED");
        }else {
            System.out.println("Login to your account Testi FAİLED");
        }
        Thread.sleep(1000);


       //6. Adı ve kayıtlı e-posta adresini girin
        driver.findElement(By.xpath("//*[@data-qa='signup-name']")).sendKeys("Selçuk");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("selcukkibar88@gmail.com");
        Thread.sleep(1000);

       //7. 'Kaydol' düğmesini tıklayın
        driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
        Thread.sleep(1000);

       //8. 'E-posta Adresi zaten mevcut!' hatasını doğrulayın. görünür
        String mailVarHatasi = "Email Address already exist!";
        String mailVarHatasiGorme = driver.getPageSource();

        if (mailVarHatasiGorme.contains(mailVarHatasi)){
            System.out.println("Mail zaten var hatası görme testi PASSED");
        }else {
            System.out.println("Mail zaten var hatası görme testi FAİLED");
        }
        Thread.sleep(1000);

        driver.quit();

    }
}
