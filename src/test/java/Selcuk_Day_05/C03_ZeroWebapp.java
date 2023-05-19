package Selcuk_Day_05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ZeroWebapp {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com ");
        Thread.sleep(1000);

        //2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();
        Thread.sleep(1000);

        //3. Login alanine "username" yazdirin
        WebElement loginKutusu = driver.findElement(By.id("user_login"));
        loginKutusu.sendKeys("username");
        Thread.sleep(1000);

        //4. Password alanina "password" yazdirin
        WebElement passwordKutusu = driver.findElement(By.id("user_password"));
        passwordKutusu.sendKeys("password");
        Thread.sleep(1000);

        //5. Sign in buttonuna tiklayin
        driver.findElement(By.name("submit")).click();
        Thread.sleep(1000);

        //6. Back tusu ile sayfaya donun
        driver.navigate().back();
        Thread.sleep(1000);

        //7. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.id("pay_bills_link")).click();
        Thread.sleep(1000);

        //8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amountKutusu = driver.findElement(By.id("sp_amount"));
        amountKutusu.sendKeys("200");
        Thread.sleep(1000);

        //9. tarih kismina "2020-09-10" yazdirin
        WebElement date = driver.findElement(By.id("sp_date"));
        date.sendKeys("2020-09-10");
        Thread.sleep(1000);

        //10. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();
        Thread.sleep(1000);


        //11. "The payment was successfully submitted." mesajinin ciktigini test edin
        WebElement submittedYaziElementi= driver.findElement(By.id("alert_content"));
        Thread.sleep(1000);

        if (submittedYaziElementi.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAİLED");
        }
        Thread.sleep(1000);
        driver.close();
    }
}
