package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddPage extends AbstractPage{
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

//    @FindBy(xpath = "//button[@class='rf-saveditem-button']")
//    private WebElement listButton;
    // TODO: not interactable

//    @FindBy(xpath = "//input[@id='newlist']")
//    private WebElement newListButton;
//
//    @FindBy(xpath = "//input[@class='form-textbox-input rf-addtolist-createnew-textbox'][@name='newListName']")
//    private WebElement listNameInput;
//
//    @FindBy(xpath = "//button[@class='form-button']")
//    private WebElement submitListButton;
//
//    @FindBy(xpath = "//a[@class='rf-saveditem-link more'][text()='\n" +
//            "                            See list\n" +
//            "                        ']")
//    private WebElement showListsLink;

    @Override
    protected AbstractPage openPage() {
        return null;
    }

    public AddPage(WebDriver driver){
        super(driver);
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

//    public void openList(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("rf-saveditem-button")));
//        wait.until(ExpectedConditions.elementToBeClickable(By.className("rf-saveditem-button")));
//        listButton.click();
//    }

//    public void createNewList(){
//        newListButton.click();
//    }
//
//    public void submitNewList(String listName) throws InterruptedException {
//        listNameInput.sendKeys(listName);
//        Thread.sleep(1000);
//        submitListButton.click();
//    }
//
//    public void showLists(){
//        showListsLink.click();
//    }
}
