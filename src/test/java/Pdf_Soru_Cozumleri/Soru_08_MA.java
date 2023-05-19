package Pdf_Soru_Cozumleri;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru_08_MA {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        /*
        Test Case 2: Login User with incorrect email and password
        1- Launch the website https://automationexercise.com/
        2. Verify that home page is visible successfully
        3. Click on 'Signup / Login' button
        4. Verify 'Login to your account' is visible
        5. Enter incorrect email address and password
        6. Click 'login' button
        7. Verify error 'Your email or password is incorrect!' is visible
        */


       //Test Örneği 2: Kullanıcıyı yanlış e-posta ve parola ile Oturum Açın
       //1- https://automationexercise.com/ web sitesini başlatın
        driver.get("https://automationexercise.com/");
        Thread.sleep(2000);


       //2. Ana sayfanın başarıyla göründüğünü doğrulayın
        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Anasayfa görüntüleme testi PASSED");
        }else {
            System.out.println("Anasayfa görüntüleme testi FAİLED");
        }

       //3. 'Kaydol / Giriş Yap' düğmesine tıklayın
        driver.findElement(By.xpath("//*[@href='/login']")).click();
        Thread.sleep(1000);

       //4. "Hesabınıza giriş yapın"ın görünür olduğunu doğrulayın
        String girisYazisi = "Login to your account";
        String hesapGirisYazisi = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).getText();

        System.out.println("Login yap yazısı = "+hesapGirisYazisi);
        if (hesapGirisYazisi.contains(girisYazisi)){
            System.out.println("Login to your account Testi PASSED");
        }else {
            System.out.println("Login to your account Testi FAİLED");
        }
        Thread.sleep(1000);

       //5. Yanlış e-posta adresi ve şifre girin
        driver.findElement(By.xpath("(//*[@type='email'])[1]")).sendKeys("selcuk88@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123456");
        Thread.sleep(1000);

       //6. 'Giriş' düğmesine tıklayın
        driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
        Thread.sleep(1000);

       //7. 'E-postanız veya şifreniz yanlış!' hatasını doğrulayın. görünür

        String yalnisGirinceOlmasiGerekenMesaj = "Your email or password is incorrect!";
        String yalnisGirisMesaji=driver.findElement(By.xpath("//*[text()='Your email or password is incorrect!']")).getText();
        if (yalnisGirisMesaji.contains(yalnisGirinceOlmasiGerekenMesaj)){
            System.out.println("Yalnış Email yada şifre girdiniz Testi PASSED");
        }else {
            System.out.println("Yalnış Email yada şifre girdiniz Testi FAİLED");
        }

        Thread.sleep(1000);




        driver.quit();
    }
}
