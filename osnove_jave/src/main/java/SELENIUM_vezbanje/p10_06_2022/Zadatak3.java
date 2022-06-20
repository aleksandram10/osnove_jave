package SELENIUM_vezbanje.p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Zadatak3 {
    //Napisati program koji:
    //Ucitava stranicu  https://www.ebay.com/
    //Zatim iz selekta za kategoriju povlaci sve opcije. Koristan link
    //Zatim bira random element iz niza opcija koristeci Random.
    // Vodite racuna da random element bude u opsegu broja elemenata niza. Random podsetnik
    //Selektuje random kategoriju izabranu u koraku iznad
    //Zatvara pretrazivac

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.ebay.com/";
        driver.manage().window().maximize();
        driver.get(url);

        Select select = new Select(driver.findElement(By.id("gh-cat")));
        List<WebElement> options = select.getOptions();

        Random random = new Random();
        int element = random.nextInt(options.size());

        select.selectByIndex(element);

        Thread.sleep(2000);

        element = random.nextInt(options.size());
        String tekst = options.get(element).getText();
        select.selectByVisibleText(tekst);

        Thread.sleep(2000);

        driver.quit();
    }
}
