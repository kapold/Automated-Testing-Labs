import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://theuselessweb.com/");

        WebElement searchBtn = driver.findElement(By.xpath("//*[@id=\"button\"]"));
        searchBtn.click();

        Thread.sleep(5000);
        driver.quit();
    }
}
