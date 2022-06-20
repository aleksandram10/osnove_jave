package SELENIUM_vezbanje.p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak5 {
    //5.Zadatak
    //Ucitati stranicu https://demoqa.com/modal-dialogs
    //Kliknuti na dugme Large modal
    //Proverite da li se prikazao dijalog i ispisite u konzoli odgovarajuce poruke

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        String url = "https://demoqa.com/modal-dialogs";
        driver.manage().window().maximize();
        driver.get(url);

        driver.findElement(By.id("showLargeModal")).click();
        Thread.sleep(2000);


        try{
        driver.findElement(By.className("modal-body"));
            System.out.println("Dijalog postoji");}
        catch (Exception e){
            System.out.println("Dijalog ne postoji");
        }



        driver.quit();
    }
}
