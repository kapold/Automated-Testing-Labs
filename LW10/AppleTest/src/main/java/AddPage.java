import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='rc-dimension-selector-row form-selector']")
    private WebElement iphone14Button;

    @FindBy(xpath = "//li[@class='colornav-item']")
    private WebElement colorButton;

    @FindBy(xpath = "//input[@class='form-selector-input'][@value='128gb']")
    private WebElement storageButton;

    @FindBy(xpath = "//input[@id='noTradeIn']")
    private WebElement tradeInButton;

    @FindBy(xpath = "//input[@class='form-selector-input'][@value='fullprice']")
    private WebElement buyButton;

    @FindBy(xpath = "//input[@class='form-selector-input'][@value='UNLOCKED/US']")
    private WebElement carrierButton;

    @FindBy(xpath = "//input[@id='applecareplus_58_noapplecare']")
    private WebElement appleCareButton;

    @FindBy(xpath = "//button[@class='button button-block'][@value='add-to-cart']")
    private WebElement addToBagButton;

    @FindBy(xpath = "//button[@class='button button-block button-super'][@value='proceed']")
    private WebElement reviewBagButton;

    public AddPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectIPhone() throws InterruptedException {
        Thread.sleep(2000);
        iphone14Button.click();
    }

    public void selectColor() throws InterruptedException {
        Thread.sleep(2000);
        colorButton.click();
    }

    public void selectStorage() throws InterruptedException {
        Thread.sleep(2000);
        storageButton.click();
    }

    public void selectTradeIn() throws InterruptedException {
        Thread.sleep(2000);
        tradeInButton.click();
    }

    public void selectBuy() throws InterruptedException {
        Thread.sleep(2000);
        buyButton.click();
    }

    public void selectCarrier() throws InterruptedException {
        Thread.sleep(2000);
        carrierButton.click();
    }

    public void selectAppleCare() throws InterruptedException {
        Thread.sleep(2000);
        appleCareButton.click();
    }

    public void addToBag() throws InterruptedException {
        Thread.sleep(2000);
        addToBagButton.click();
    }

    public BagPage reviewBag(){
        reviewBagButton.click();
        return new BagPage(driver);
    }
}
