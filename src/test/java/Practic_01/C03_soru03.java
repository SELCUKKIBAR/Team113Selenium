package Practic_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_soru03 {
    public static void main(String[] args) {


        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        System.out.println("TESTE HOŞGELDİNİZ");

        /* ...Exercise3...
        Navigate to  https://testpages.herokuapp.com/styled/index.html
        Click on  Calculater under Micro Apps
        Type any number in the first input
        Type any number in the second input
        Click on Calculate
        Get the result
        Print the result
      */

        driver.navigate().to("https://testpages.herokuapp.com/");

       WebElement cal= driver.findElement(By.xpath("//*[@id='calculatetest']"));
       cal.click();


        WebElement num1 = driver.findElement(By.xpath("//*[@id='number1']"));
        num1.click();
        num1.sendKeys("20");



       WebElement num2 = driver.findElement(By.xpath("//*[@id='number2']"));
       num2.click();
       num2.sendKeys("30");


        WebElement tikla = driver.findElement(By.xpath("//*[@id='calculate']"));
        tikla.click();

        String sonuc = driver.findElement(By.id("answer")).getText();
        System.out.println(sonuc);
        System.out.println("İşlemin Sonucu...: "+ sonuc);

        driver.quit();






    }
}
