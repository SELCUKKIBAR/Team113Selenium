package Pdf_Soru_Cozumleri;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru_06_MA {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //1-http://demo.guru99.com/test/guru99home/ adresine gidin
        driver.get("http://demo.guru99.com/test/guru99home/");
        Thread.sleep(1000);

        //2-Sayfadaki iframe sayısını bulun.
        int iFrameCount = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Toplam iframe sayısı....: "+iFrameCount);

        //3-Youtube videosu içeren ilk iframe butonuna tıklayın.
        driver.findElement(By.xpath("//*[@src='https://www.youtube.com/embed/RbSlW8jZFe8']")).click();
        Thread.sleep(3000);

        //4-İlk iframe'den çıkın ve ana sayfaya dönün.
        driver.switchTo().defaultContent();
        Thread.sleep(1000);

        //5-"JMeter Made Easy" yazısının bulunduğu ikinci iframe düğmesine tıklayın
        //ve https://www.guru99.com/live-Selenium-project.html sayfasına gidin.
       driver.navigate().to("https://www.guru99.com/live-Selenium-project.html"); // 5 madeyi anlamadım....

        Thread.sleep(2000);
        driver.quit();



    }
}
