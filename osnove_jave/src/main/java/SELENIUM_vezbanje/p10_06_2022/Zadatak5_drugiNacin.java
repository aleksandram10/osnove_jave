package SELENIUM_vezbanje.p10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak5_drugiNacin {

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

        if (elementExist(driver,By.className("modal-body"))){
            System.out.println("Dijalog postoji.");
        }else{
            System.out.println("Dijalog ne postoji.");
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