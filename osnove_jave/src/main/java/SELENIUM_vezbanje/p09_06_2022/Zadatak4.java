package SELENIUM_vezbanje.p09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak4 {
    //Napisti proram koji :
    //Ucitava stranicu https://s.bootsnipp.com/iframe/oV91g
    //Hvatamo sve page-eve iz paginacije tabele
    //Zatim petljom prolazimo kroz paginaciju tako sto kliknemo na svaki broj
    //Izmedju iteracija napravite pauzu od 1s
    //Zatvorite pretrazivac

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url="https://s.bootsnipp.com/iframe/oV91g";
        driver.manage().window().maximize();
        driver.get(url);

        List<WebElement> paginacija=driver
                .findElements(By.xpath("//li/a[contains(@class,'page_link')]"));

        for(int i=0;i<paginacija.size();i++){
            paginacija.get(i).click();
            Thread.sleep(2000);
        }



        driver.quit();

    }
}
