package SELENIUM_vezbanje.p09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Zadatak3 {
    //Napisati program koji ima:
    //Niz stranica (niz stringova) koje treba da ucita. Niz je:
    //https://google.com/
    //https://youtube.com/
    //https://www.ebay.com/
    //https://www.kupujemprodajem.com/
    //Program petljom prolazi kroz niz stranica i svaku stranicu ucitava preko get ili navigate
    // i od svake stranice na ekranu ispisuje naslov stranice. Kako od stranice procitati naslov imate na ovom linku
    //U prevodu u konzoli treba da se ispisu:
    //Google
    //YouTube
    //Electronics, Cars, Fashion, Collectibles & More | eBay
    //KupujemProdajem
    //Zatvara pretrazivac

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url1 = "https://google.com/";
        String url2 = "https://youtube.com/";
        String url3 = "https://www.ebay.com/";
        String url4 = "https://www.kupujemprodajem.com/";

        driver.manage().window().maximize();

        ArrayList<String> pages = new ArrayList<>();

        pages.add(url1);
        pages.add(url2);
        pages.add(url3);
        pages.add(url4);

        for (int i = 0; i < pages.size(); i++) {
            driver.navigate().to(pages.get(i));

            //driver.findElement(By.xpath("//head/title"))

            System.out.println("Naziv stranice je " + driver.getTitle());
            Thread.sleep(5000);

        }
        driver.quit();
    }
}