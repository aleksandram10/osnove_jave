package SELENIUM_vezbanje.p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class Zadatak3 {
//Napisati program koji ucitava stranicu https://www.file.io/ aploaduje fajl
//(ZA vezbanje)
//Probajte upload razlicitih fajlova, npr:
//fajl velciine 20mb => mozete da ga napravite tako sto zipujete grupu nekih fajlova, slika …

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.file.io/");
        driver.manage().window().maximize();

        File slika = new File("src/main/resources/istockphoto-1145618475-612x612.jpg");

        driver.findElement(By.id("upload-button")).sendKeys(slika.getAbsolutePath());

        Thread.sleep(2000);
        driver.quit();
    }
}
