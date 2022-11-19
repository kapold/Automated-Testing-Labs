import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppleTest {
    private WebDriver driver;
    private MainPage mainPage;
    private AddPage addPage;
    private BagPage bagPage;

    @BeforeMethod
    public void driverSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void AccessoriesInfoTest() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.openPage();

        addPage = mainPage.addIphone();
        addPage.selectIPhone();
        addPage.selectColor();
        addPage.selectStorage();
        addPage.selectTradeIn();
        addPage.selectBuy();
        addPage.selectCarrier();
        addPage.selectAppleCare();
        addPage.addToBag();

        bagPage = addPage.reviewBag();
        bagPage.removeFromBag();
        Assert.assertTrue(true);
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
        driver = null;
    }
}
