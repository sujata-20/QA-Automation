import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/sujatamohapatra/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkBox = driver.findElement(By.id("checkbox-1"));
        checkBox.click();
        Thread.sleep(1000);

        WebElement checkBox2 = driver.findElement(By.cssSelector("Input[value='checkbox-2']"));
        checkBox2.click();
        Thread.sleep(1000);

        WebElement checkBox3 = driver.findElement(By.xpath("//*[@id='checkbox-3']"));
        checkBox3.click();
        Thread.sleep(1000);



        driver.quit();
    }
}
