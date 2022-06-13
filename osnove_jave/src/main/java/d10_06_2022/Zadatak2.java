package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Zadatak2 {
    //2.Zadatak
    //Napisati program koji ucitava stranicu https://geodata.solutions/
    //Bira proizvoljan Country, State i City
    //Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
    //I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
    //Izabrerit Country, State i City tako da imate podatke da selektujete!

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://geodata.solutions/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Select select = new Select(driver.findElement(By.name("country")));
        List<WebElement> countries= select.getOptions();

        Random random= new Random();

        int randomIndeks = random.nextInt(countries.size());
        select.selectByIndex(randomIndeks);

        Thread.sleep(5000);

        Select select2 = new Select(driver.findElement(By.name("state")));
        List<WebElement> states= select2.getOptions();

        select2.selectByIndex(random.nextInt(states.size()));
        Thread.sleep(5000);

        Select select3 = new Select(driver.findElement(By.name("city")));
        List<WebElement> city= select2.getOptions();

        select3.selectByIndex(random.nextInt(city.size()));
        Thread.sleep(5000);



        driver.quit();
    }
}
