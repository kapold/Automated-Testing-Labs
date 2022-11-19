import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BagPage {
    WebDriver driver;

    @FindBy(xpath = "//button[@class='rs-iteminfo-remove as-buttonlink'][text()='Remove']")
    private WebElement removeButton;

    public BagPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void removeFromBag() throws InterruptedException{
        Thread.sleep(2000);
        removeButton.click();
    }
}
