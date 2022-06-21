package SELENIUM_vezbanje.p13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Zadatak1 {
    //Napisati program koji:
    //Pre nego sto krenete u automatizaciju prvo sve korake uradite rucno
    //Implicitno cekanje za trazenje elemenata je maksimalno 10s
    //Implicitno cekanje za ucitavanje stranice je 5s
    //Ucitava stranicu https://docs.katalon.com/
    //Maksimizuje prozor
    //Od html elementa cita data-theme atribut.
    //Korisni linkovi za citanje vrednosti atributa link1 i link2
    //Proverava da li je sadrzaj u tom atributu light i ispisuje odgovarajuce poruke
    //Klikce na dugme za zamenu tema
    //Ponovo cita data-theme atribut html elementa i validira da u atributu stoji vrednost dark
    //Izvrsava kombinaciju tastera CTRL + K. Koristan link  za keyboard actions…kako izvrsavati
    // precice preko Actions objekta
    //Zatim od inputa za pretragu cita atribut type i proverava da je vrednost tog atributa search
    //Zatvara pretrazivac

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        String url = "https://docs.katalon.com/";
        driver.manage().window().maximize();
        driver.get(url);


        WebElement theme = driver.findElement(By.xpath("//html"));
        // System.out.println("Data theme is: " + theme.getAttribute("data-theme"));

        Thread.sleep(3000);

        if (theme.getAttribute("data-theme").equals("light")) {
            System.out.println("Data theme is light");
        } else {
            System.out.println("Data theme is not light");
        }

        driver.findElement(By.xpath("//button [contains(@class,'clean-btn toggleButton_rCf9')]")).click();

        if (theme.getAttribute("data-theme").equals("dark")) {
            System.out.println("Data theme is dark");
        } else {
            System.out.println("Data theme is not dark");
        }

        Thread.sleep(3000);


        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL)
                .sendKeys("k")
                .perform();

        Thread.sleep(3000);

        if((driver.findElement(By.id("docsearch-input")).getAttribute("type")).equals("search")){
            System.out.println("Ok");
        }else{
            System.out.println("Not ok");
        }


        driver.quit();

    }
}
