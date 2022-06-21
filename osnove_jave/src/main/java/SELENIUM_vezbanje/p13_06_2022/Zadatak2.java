package SELENIUM_vezbanje.p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;

public class Zadatak2 {
    //Napisati program testira upload funkcionalnost:
    // Koristan link https://www.guru99.com/upload-download-file-selenium-webdriver.html
    //Ucitava stranicu https://crop-circle.imageonline.co/#circlecropresult
    //Uploadujte sliku na sajt
    //Kliknite na dugme Crop Circle

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        File slika = new File("src/main/resources/istockphoto-1145618475-612x612.jpg");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crop-circle.imageonline.co/#circlecropresult");
        driver.manage().window().maximize();


        new Actions(driver)
                .scrollToElement(driver.findElement(By.id("photobutton")))
                .perform();

        driver.findElement(By.name("file")).sendKeys(slika.getAbsolutePath());


        driver.quit();
    }



}
