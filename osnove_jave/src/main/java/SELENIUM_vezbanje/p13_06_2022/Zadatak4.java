package SELENIUM_vezbanje.p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadatak4 {
    //Napisati program koji ucitava stranicu https://s.bootsnipp.com/iframe/klDWV i
    // ceka da se ucita progress bar na 100% a zatim ispisuje tekst u konzoli “Stranica ucitana”

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://s.bootsnipp.com/iframe/klDWV");
        driver.manage().window().maximize();


        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("precent"),"100"));
        System.out.println("Stranica ucitana");


        driver.quit();
    }


}
