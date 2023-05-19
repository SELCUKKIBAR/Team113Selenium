package Selcuk_Day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.drive","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));

        System.out.println(aramaKutusuElementi.isDisplayed()); // aramaçubuğu görünüyormu
        System.out.println(aramaKutusuElementi.isEnabled()); // arama çubuna ulaşılabiliyormu

        System.out.println(aramaKutusuElementi.getText()); // web element üzerinde yazı varsa getirir

        aramaKutusuElementi.sendKeys("Nutella");
        Thread.sleep(1000);
        aramaKutusuElementi.clear(); // arama çubuğunu temizler

        System.out.println(aramaKutusuElementi.getSize()); //(904, 38)
        System.out.println(aramaKutusuElementi.getSize().height); // arama kutusu yüksekliği


        System.out.println(aramaKutusuElementi.getTagName());
        System.out.println(aramaKutusuElementi.getAttribute("class"));

        System.out.println(aramaKutusuElementi.getLocation());

        System.out.println(aramaKutusuElementi.getRect().getDimension());

        Thread.sleep(1000);
        driver.quit();

    }
}
