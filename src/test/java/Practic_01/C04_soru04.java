package Practic_01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_soru04 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        System.out.println("TESTE HOŞGELDİNİZ");


         /*
        Navigate to website https://testpages.herokuapp.com/styled/index.html
        Under the ORIGINAL CONTENTS
        click on Alerts
        print the URL
        navigate back
        print the URL
        Click on Basic Ajax
        print the URL
        enter value 20 and ENTER
        and then verify Submitted Values is displayed open page
        close driver
        */

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.xpath("//*[@id='alerts']")).click();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.xpath("//*[@id='basicajax']")).click();
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.xpath("//*[@id='lteq30']")).sendKeys("20"+ Keys.ENTER);

        String expected = "Submitted Values";

        String actualResult = driver.findElement(By.xpath("//*[text()='Submitted Values']")).getText();

        if (expected.equals(actualResult)){
            System.out.println("Submitted Values test PASSED");
        }else {
            System.out.println("Submitted Values test FAİLED");
        }



        Thread.sleep(2000);
        driver.quit();

    }
}
