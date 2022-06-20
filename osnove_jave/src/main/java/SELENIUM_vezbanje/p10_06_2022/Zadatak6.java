package SELENIUM_vezbanje.p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak6 {
    //apisati program koji ucitava stranicu Zadatak6.html
    //I na stranici dodaje 5 poruka “IT Bootcamp”
    //Potrebno  je u svakoj iteraciji kliknuti na dugme Show in
    //Sacekati da se novi element pojavi pre nego sto se doda sledeci

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        String url = "file:///C:/Users/Toshiba_NB/Downloads/Zadatak6%20(2).html";
        driver.manage().window().maximize();
        driver.get(url);

        for(int i=0;i<5;i++){
            driver.findElement(By.id("showInBtn")).click();

            driver.findElement(By.id("id-"+i));

        }






        driver.quit();
    }


    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);

        } catch (Exception e) {
            elementExist = false;
        }
        return elementExist;
    }


}
