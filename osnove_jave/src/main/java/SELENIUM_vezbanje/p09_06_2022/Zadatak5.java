package SELENIUM_vezbanje.p09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Zadatak5 {
    //Napisti program koji:
    //Ucitava stranicu https://s.bootsnipp.com/iframe/z80en
    //Hvata sve elemente prve kolone i stampa tekst svakog elementa.
    // Kako da od nekog elementa procitamo tekst imate na sledecem linku
    //Ceka 1s
    //Hvata sve element prvog reda i stampa tekst svakog elementa
    //Ceka 5s
    //Zatvara pretrazivac

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://s.bootsnipp.com/iframe/z80en";
        driver.manage().window().maximize();
        driver.get(url);

        List<WebElement> columns = driver.findElements
                (By.xpath("//div[contains(@class,'tab-pane fade show active')]/table/tbody/tr/td[1]"));

        for (int i = 0; i < columns.size(); i++) {
            System.out.println(columns.get(i).getText());
        }
        Thread.sleep(1000);
        List<WebElement> rows = driver.findElements
                (By.xpath("//div[contains(@class,'tab-pane fade show active')]/table/tbody/tr[1]/td"));

        for (int i = 0; i < rows.size(); i++) {
            System.out.println(rows.get(i).getText());
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
