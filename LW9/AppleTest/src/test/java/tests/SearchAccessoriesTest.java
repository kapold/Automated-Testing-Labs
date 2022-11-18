package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;

public class SearchAccessoriesTest {
    private WebDriver driver;
    MainPage mainPage;

    @BeforeMethod
    public void driverSetup() {
        driver = new ChromeDriver();
    }

    @Test
    public void AccessoriesInfoTest() {
        mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.searchClick();
        mainPage.enterSearchText("iPhone Accessories");
        mainPage.enterAccessory();
        Assert.assertTrue(MainPage.isSearched);
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
        driver = null;
    }
}
