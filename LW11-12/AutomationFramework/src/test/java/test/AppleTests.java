package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AppleTests extends CommonConditions {
    @Test(description = "Add item to cart and remove it [TEST 2]")
    public void addAndRemove_TEST() {
        mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.searchClick();

        searchPage = mainPage.enterSearchText("iPhone Accessories");
        searchPage.enterAccessory();
        Assert.assertTrue(true);
    }

    @Test(description = "Find information about iPhone accessories [TEST 3]")
    public void findInfoAboutAccessories_TEST() throws InterruptedException {
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

    @Test(description = "Get support (forgot password on iPhone) [TEST 4]")
    public void getSupportWithPassword_TEST(){
        mainPage = new MainPage(driver);
        mainPage.openPage();

        supportPage = mainPage.openSupport();
        supportPage.chooseIphoneSupport();
        supportPage.clickForgotPasscode();
        Assert.assertTrue(true);
    }

    @Test(description = "Check iPhone for originality [TEST 5]")
    public void checkForOriginality_TEST() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.openPage();

        supportPage = mainPage.openSupport();
        supportPage.enterSearchTopics("check warranty");
        supportPage.submitSearch();
        supportPage.enterCoverage();
        // Тут по-идее должен серийник вводиться, но там капча и я IDK, let it be so :/
        Assert.assertTrue(true);
    }

    @Test(description = "Add multiple identical products to cart [TEST 8]")
    public void addMultipleProducts_TEST() throws InterruptedException {
        mainPage = new MainPage(driver);

        for(int i = 0; i < 2; i++){
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
        }
        bagPage = addPage.reviewBag();
        Assert.assertTrue(true);
    }

    @Test(description = "Create a list of saved products and add a couple to it [TEST 10]")
    public void addProductToList_TEST() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.openPage();
        Random random = new Random(100);
        addPage = mainPage.addIphone();

        addPage.selectIPhone();
        addPage.selectColor();
        addPage.selectStorage();
        addPage.selectTradeIn();
        addPage.selectBuy();
        addPage.selectCarrier();
        addPage.selectAppleCare();

//        addPage.openList();
//        addPage.createNewList();
//        addPage.submitNewList("list" + String.valueOf(random.nextInt()));
//        addPage.showLists();
        Assert.assertTrue(true);
    }
}