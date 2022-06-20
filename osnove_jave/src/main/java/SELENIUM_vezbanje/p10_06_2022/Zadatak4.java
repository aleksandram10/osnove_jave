package SELENIUM_vezbanje.p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak4 {
//Ucitava stranicu https://demoqa.com/login
//Loginuje se sa usename itbootcamp i lozinkom ITBootcamp2021!
//Zatim ceka 5sekundi da se korisnik uloguje
//Proverava da li se korisnik ulogovao, tako sto se proverava postojanje dugmeta Logout.
// Ispisati odgovarajucu poruku u konzoli za rezultat loginovanja.
//Klikce na dugme za logout
//Gasi stranicu
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        String url = "https://demoqa.com/login";
        driver.manage().window().maximize();
        driver.get(url);

        driver.findElement(By.id("userName"))
                        .sendKeys("itbootcamp");

        driver.findElement(By.id("password"))
                        .sendKeys("ITBootcamp2021!");

        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(5000);



        boolean elementExist=true;
        try{
            driver.findElement(By.xpath("//button[text()='Log out']"));

        }catch(Exception e){
            elementExist=false;
        }
        System.out.println(elementExist);

        driver.findElement(By.xpath("//button[text()='Log out']")).click();
        Thread.sleep(5000);

        driver.quit();
    }
}
