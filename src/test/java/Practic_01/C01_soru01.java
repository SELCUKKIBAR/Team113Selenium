package Practic_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_soru01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        /*....Exercise-1:...
         Create a new class with main method
         Set Path
         Create a chrome driver
         Maximize window
         Open google home page https://www.google.com
         On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
         Wait about 4 sn
         Navigate forward to amazon
         Refresh page
         Close/quit the browser
         And Last step print "All is well" on console

        */

        driver.get("https://www.google.com/");// google gider
        Thread.sleep(1000); // 1 sn bekler

        driver.navigate().to("https://www.amazon.com/");// amazona gider
        Thread.sleep(1000);//1n bekler

        driver.navigate().back();// goggle geri döner
        Thread.sleep(1000);

        driver.navigate().forward();//amazona geri döner
        Thread.sleep(1000);

        driver.navigate().refresh();// sayfayı yeniler
        Thread.sleep(1000);

        driver.quit();
        System.out.println("All is well");



    }


}
