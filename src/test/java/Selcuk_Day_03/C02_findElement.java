package Selcuk_Day_03;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C02_findElement {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.drive","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://automationexercise.com/");
        List<WebElement> catagoryElemanListesi = driver.findElements(By.className("panel-title"));

        int expectedSize = 3;
        int actualSize = catagoryElemanListesi.size();

        if (actualSize == expectedSize){
            System.out.println("Catagori testi PASSED");
        }else {
            System.out.println("Catagori testi FAİLED");
        }

        for (WebElement each:catagoryElemanListesi
        ) {
            System.out.println(each.getText()+" ");
        }


        driver.quit();


    }
}
