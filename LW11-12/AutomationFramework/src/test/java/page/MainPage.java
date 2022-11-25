package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage{
    private static final String HOMEPAGE_URL = "https://www.apple.com/";
    @FindBy(xpath = "//a[@class='icon icon-after icon-chevronright'][text()='Buy']")
    private WebElement buyButton;

    @FindBy(xpath = "//a[@id='ac-gn-link-search']")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@id='ac-gn-searchform-input']")
    private WebElement searchInput;

    @FindBy(xpath = "//a[@class='ac-gn-link ac-gn-link-support']")
    private WebElement supportButton;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    // TEST 3
    public AddPage addIphone(){
        buyButton.click();
        return new AddPage(driver);
    }

    // TEST 2
    public void searchClick() {
        searchButton.click();
    }

    public SearchPage enterSearchText(String searchText) {
        searchInput.sendKeys(searchText);
        searchInput.submit();
        return new SearchPage(driver);
    }

    // TEST 4
    public SupportPage openSupport(){
        supportButton.click();
        return new SupportPage(driver);
    }
}