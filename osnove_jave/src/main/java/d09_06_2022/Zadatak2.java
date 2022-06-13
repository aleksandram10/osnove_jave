package d09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak2 {
    //Napisati program koji vrsi dodavanje 5 reda u tabelu.
    //Maksimizirati prozor
    //Ucitati stranicu https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
    //Dodati 5 redova sa istim podacima.Jedan red u jednoj iteraciji
    //Klik na dugme Add New
    //Unesite name,departmant i phone (uvek iste vrednost)
    //Trazenje po name atributu
    //Kliknite na zeleno Add dugme.
    //PAZNJA: Pogledajte strukturu stranice i videcete da se u svakom redu poslednje kolone javljaju
    // dugmici edit, add, delete ali zbog prirode reda neki dugmici se vide a neki ne.
    //Morate da dohvatite uvek Add dugme iz poslednjeg reda tabele. Mozete koristeci index iz petlje,
    // a mozete koristeci i last() fukncionalnost za xpath. Koristan link last mehnizma
    //Cekanje od 0.5s
    //Na kraju programa ugasite pretrazivac.
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        String url = "https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php";
        driver.navigate().to(url);


        for(int i=1;i<6;i++) {
            driver.findElement(By.xpath("//button")).click();
            driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Aleksandra");
            driver.findElement(By.xpath("//input[@name='department']")).sendKeys("Markovic");
            driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("(062)220666");
            driver.findElement(By.xpath("//tbody/tr[last()]/td[last()]/a")).click();
        }

        Thread.sleep(5000);
        driver.quit();
    }
}
