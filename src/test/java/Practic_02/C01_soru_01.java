package Practic_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_soru_01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String ht ="https://www.";
        driver.get(ht+"google.com");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Thread.sleep(1000);

        driver.navigate().to(ht+"amazon.com");
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);

        System.out.println(driver.getTitle());
        Thread.sleep(1000);


        String amazonHandle = driver.getWindowHandle();
        System.out.println("1.Sayfamızın handel kimliği...: "+driver.getWindowHandle());
        Thread.sleep(1000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(ht+"wisequarter.com");
        System.out.println("2.Sayfamızın handel kimliği...: "+driver.getWindowHandle());
        System.out.println("Sayfalarımızın handels kimlikleri...: "+driver.getWindowHandles());
        System.out.println(driver.getTitle());
        Thread.sleep(1000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(ht+"youtube.com");
        System.out.println("3.Sayfamızın handel kimliği...: "+driver.getWindowHandle());
        System.out.println("Sayfalarımızın handels kimlikleri...: "+driver.getWindowHandles());
        System.out.println(driver.getTitle());
        Thread.sleep(1000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(ht+"haberler.com");
        System.out.println("4.Sayfamızın handel kimliği...: "+driver.getWindowHandle());
        System.out.println("Sayfalarımızın handels kimlikleri...: "+driver.getWindowHandles());
        System.out.println(driver.getTitle());
        Thread.sleep(1000);

        driver.switchTo().window(amazonHandle);
        System.out.println(driver.getTitle());
        Thread.sleep(1000);

        driver.quit();


    }
}
