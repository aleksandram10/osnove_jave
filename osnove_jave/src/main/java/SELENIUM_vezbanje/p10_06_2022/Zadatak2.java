package SELENIUM_vezbanje.p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak2 {
    // Zadatak (dok ne stignemo do ovog zadatka izguglajte kako da selektujete vrednost u select elementu)
    //Napisati program koji ucitava stranicu https://www.ebay.com/ i bira kategoriju “Crafts”

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.ebay.com/";
        driver.manage().window().maximize();
        driver.get(url);

        Select select = new Select(driver.findElement(By.id("gh-cat")));

        select.selectByVisibleText("Crafts");
        Thread.sleep(2000);

        select.selectByIndex(5);
        Thread.sleep(2000);

        select.selectByValue("625");
        Thread.sleep(2000);


        driver.quit();
    }
}
