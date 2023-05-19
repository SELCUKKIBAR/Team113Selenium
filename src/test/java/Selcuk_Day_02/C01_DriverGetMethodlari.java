package Selcuk_Day_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class
 C01_DriverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        Thread.sleep(2000);

        driver.quit();

    }
}
