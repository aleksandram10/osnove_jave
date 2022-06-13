package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        List<WebElement> zatvaranja = driver.findElements(By.xpath("//button[@class='close']"));

        for (int i = zatvaranja.size(); i >0; i--) {

          driver.findElement(By.xpath("//button[@class='close']")).click();

            boolean elementExist = true;
            try {
                driver.findElement(By.xpath("//button[class='close'][last()]"));
                System.out.println(elementExist);
            } catch (Exception e) {
                elementExist = false;
            }
            System.out.println(elementExist);

        }


        driver.quit();
    }


}
