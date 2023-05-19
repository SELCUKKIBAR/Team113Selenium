package Selcuk_Day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_xpath {
    public static void main(String[] args) throws InterruptedException {

        /*1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         */

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addElemet = driver.findElement(By.xpath("//*[text()='Add Element']"));
        addElemet.click();
        Thread.sleep(1000);

        WebElement deleteElement = driver.findElement(By.xpath("//*[text()=‘Delete’]"));

        if (deleteElement.isDisplayed()){
            System.out.println("Delete tuşu buton testi PASSED");
        }else {
            System.out.println("Delete tuşu buton testi FAİLED");
        }

        deleteElement.click();
        Thread.sleep(1000);

        WebElement addRemoveElementi = driver.findElement(By.xpath("//h3"));

        Thread.sleep(1000);
        driver.quit();

    }
}
