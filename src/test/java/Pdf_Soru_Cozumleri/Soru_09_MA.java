package Pdf_Soru_Cozumleri;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru_09_MA {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Test Durumu 3: Kullanıcı Oturumunu Kapat
        //1. Tarayıcıyı başlatın
        //2. 'http://automationexercise.com' url'sine gidin
        driver.get("http://automationexercise.com");

        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Anasayfa görüntüleme testi PASSED");
        }else {
            System.out.println("Anasayfa görüntüleme testi FAİLED");
        }
        //4. 'Kaydol / Oturum Aç' düğmesine tıklayın
        driver.findElement(By.xpath("//*[@href='/login']")).click();
        Thread.sleep(1000);

        //5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın
        String girisYazisi = "Login to your account";
        String hesapGirisYazisi = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).getText();

        System.out.println("Login yap yazısı = "+hesapGirisYazisi);
        if (hesapGirisYazisi.contains(girisYazisi)){
            System.out.println("Login to your account Testi PASSED");
        }else {
            System.out.println("Login to your account Testi FAİLED");
        }
        Thread.sleep(1000);

        //6. Doğru e-posta adresini ve şifreyi girin
        driver.findElement(By.xpath("(//*[@type='email'])[1]")).sendKeys("selcukkibar88@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("1234567890");
        Thread.sleep(1000);

        //7. 'Giriş' düğmesine tıklayın
        driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
        Thread.sleep(1000);

        //8. "Kullanıcı adı olarak oturum açıldı" ifadesinin göründüğünü doğrulayın

        String girisYapildi = "Logged in as";
        String olumluGiris = driver.getPageSource();


        if (olumluGiris.contains(girisYapildi)){
            System.out.println("Giriş Kontrol Testi PASSED");
        }else {
            System.out.println("Giriş Kontrol Testi FAİLED");
        }
        Thread.sleep(1000);

        //9. "Çıkış" düğmesini tıklayın
        driver.findElement(By.xpath("//a[@href='/logout']")).click();
        Thread.sleep(1000);

        //10. Kullanıcının oturum açma sayfasına yönlendirildiğini doğrulayın
        String girisYonlendirme = "Login to your account";
        String girisYonlendirmeMeesaji = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).getText();

        System.out.println("Login yap yazısı = "+girisYonlendirmeMeesaji);
        if (girisYonlendirmeMeesaji.contains(girisYonlendirme)){
            System.out.println("Login to your account Testi PASSED");
        }else {
            System.out.println("Login to your account Testi FAİLED");
        }
        Thread.sleep(1000);

        driver.quit();
    }
}
