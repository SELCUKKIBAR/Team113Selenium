package Selcuk_Day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locator {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");

        //2- Arama kutusuna “city bike” yazip aratin
        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusuElementi.click();
        aramaKutusuElementi.sendKeys("city bike"+ Keys.ENTER);// “city bike”  yaz ve enter a bas

        //3- Görüntülenen sonuçların sayısını yazdırın
        WebElement aramaSonucElementi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucElementi.getText());

        //4- Listeden ilk urunun resmine tıklayın.
        List<WebElement> urunResimleriListesi = driver.findElements(By.className("s-image"));
        urunResimleriListesi.get(0).click();





        Thread.sleep(2000);
        driver.close();
    }
}
