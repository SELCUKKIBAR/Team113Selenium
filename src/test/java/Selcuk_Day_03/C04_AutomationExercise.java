package Selcuk_Day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_AutomationExercise {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.drive","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://automationexercise.com/");

        List<WebElement>sayfadakiLinkSayisi = driver.findElements(By.tagName("a"));

        int expectedLinkSayisi = 147;
        int actualLinkSayisi = sayfadakiLinkSayisi.size();

        if (expectedLinkSayisi == actualLinkSayisi){
            System.out.println("Link Testi PASSED");
        }else {
            System.out.println("Link Testi FAİLED");
        }

        WebElement productsLinkelementi = driver.findElement(By.partialLinkText("Products"));
        productsLinkelementi.click();


        WebElement specialOfferElementi = driver.findElement(By.id("sale_image"));

        if (specialOfferElementi.isDisplayed()){
            System.out.println("special offer testi PASSEd ");
        }else {
            System.out.println("special offer testi FAİLED ");
        }




        driver.quit();

    }
}
