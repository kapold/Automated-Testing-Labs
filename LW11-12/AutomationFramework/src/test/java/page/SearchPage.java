package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends AbstractPage {
    @FindBy(xpath = "//a[text()='iPhone 14 Clear Case with MagSafe']")
    private WebElement accessoryButton;

    @Override
    protected AbstractPage openPage() {
        return null;
    }

    public SearchPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterAccessory() {
        accessoryButton.click();
    }
}