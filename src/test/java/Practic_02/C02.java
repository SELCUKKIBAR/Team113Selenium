package Practic_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1 ) http://babayigit.net/relativelocators/relative.html adresine gidin
        driver.get("http://babayigit.net/relativelocators/relative.html");
        Thread.sleep(1000);

        //2 ) Teacher  3 farkli relative locator ile locate edin
        WebElement dr = driver.findElement(By.id("dr_thumb"));
        WebElement nurse = driver.findElement(RelativeLocator.with(By.tagName("img")).below(dr));


        if (nurse.getAttribute("id").equals("nurs_thumb")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAİLED");
        }

        Thread.sleep(1000);
        //3 ) Relative locator'larin dogru calistigini test edin

        Thread.sleep(1000);



        driver.quit();

    }
}
