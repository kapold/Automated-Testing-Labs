import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private static final String HOMEPAGE_URL = "https://www.apple.com/";
    WebDriver driver;

    @FindBy(xpath = "//a[@class='icon icon-after icon-chevronright'][text()='Buy']")
    private WebElement buyButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public AddPage addIphone(){
        buyButton.click();
        return new AddPage(driver);
    }
}
