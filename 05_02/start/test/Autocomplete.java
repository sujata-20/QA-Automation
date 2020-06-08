import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sujatamohapatra/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("20th St, New Orleans, LA");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        Thread.sleep(2000);


        driver.quit();
    }
}
