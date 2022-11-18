package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private static final String HOMEPAGE_URL = "https://www.apple.com/";
    private final WebDriver driver;

    public static boolean isSearched = false;

    @FindBy(xpath = "//a[@id='ac-gn-link-search']")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@id='ac-gn-searchform-input']")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@class='as-pinwheel15-section as-pinwheel15-smalltile as-pinwheel15-smalltileleft as-pinwheel15-tile3 as-util-relatedlink relatedlink']")
    private WebElement accessoryButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public void enterSearchText(String searchText) {
        searchInput.sendKeys(searchText);
        searchInput.submit();
    }

    public void enterAccessory() {
        accessoryButton.click();
        isSearched = true;
    }

    public void searchClick() {
        searchButton.click();
    }
}
