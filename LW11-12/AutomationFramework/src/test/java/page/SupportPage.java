package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportPage extends AbstractPage{
    @FindBy(xpath = "//span[@class='as-imagegrid-item-title'][text()='iPhone ']")
    private WebElement supportIphoneButton;

    @FindBy(xpath = "//span[@class='icon-copy'][text()='Forgot passcode']")
    private WebElement forgotPasscodeButton;

    @FindBy(xpath = "//input[@id='as-search-input'][@placeholder='Search Support']")
    private WebElement searchTopicsInput;

    @FindBy(xpath = "//a[text()='checkcoverage.apple.com']")
    private WebElement checkLink;

    @FindBy(xpath = "//button[@aria-label='Submit']")
    private WebElement submitIcon;

    @Override
    protected AbstractPage openPage() {
        return null;
    }

    public SupportPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void chooseIphoneSupport(){
        supportIphoneButton.click();
    }

    public void clickForgotPasscode(){
        forgotPasscodeButton.click();
    }

    public void enterSearchTopics(String searchText) throws InterruptedException {
        searchTopicsInput.sendKeys(searchText);
        Thread.sleep(2000);
    }

    public void submitSearch(){
        submitIcon.click();
    }

    public void enterCoverage(){
        checkLink.click();
    }
}
