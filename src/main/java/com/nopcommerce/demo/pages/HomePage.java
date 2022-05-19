package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //    2.HomePage - All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, Remaining(My
//    account link and LogOut link )
//    and create appropriate methods for it.
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computersTab;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement elctronicsTab;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[3]/a[1]")
    WebElement apparelTab;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[4]/a[1]")
    WebElement digitalDownloadsTab;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement booksTab;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[6]/a[1]")
    WebElement jewelryTab;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
    WebElement giftcards;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement logInLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement nopcommerceLogo;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOut;


    public void clickOnComputers() {
        clickOnElement(computersTab);
        Reporter.log("Clicking on Computers" + computersTab.toString());
    }

    public void clickOnElectronics() {
        clickOnElement(elctronicsTab);
        Reporter.log("Clicking on Electronics" + elctronicsTab.toString());
    }

    public void clickOnApparel() {
        clickOnElement(apparelTab);
        Reporter.log("Clicking on Apparel" + apparelTab.toString());
    }

    public void clickOnDigitalDownloads() {
        clickOnElement(digitalDownloadsTab);
        Reporter.log("Clicking on DigitalDownloads" + digitalDownloadsTab.toString());
    }

    public void clickOnBooks() {
        clickOnElement(booksTab);
        Reporter.log("Clicking on newsletterbox" + booksTab.toString());
    }

    public void clickOnJewelry() {
        clickOnElement(jewelryTab);
        Reporter.log("Clicking on Jewelry" + jewelryTab.toString());
    }

    public void clickOnGiftCards() {
        clickOnElement(giftcards);
        Reporter.log("Clicking onGiftCards" + giftcards.toString());
    }

    public void clickOnLogInLink() {
        clickOnElement(logInLink);
        Reporter.log("Clicking on LogInLink" + logInLink.toString());
    }

    public String getLogInLinkText() {
        Reporter.log("Clicking on LogInLink" + logInLink.toString());
        return getTextFromElement(logInLink);

    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        Reporter.log("Clicking on RegisterLink" + registerLink.toString());
    }

    public String clickOnLogOutLink() {
        Reporter.log("getting LogOutLink text from " + logOut.toString());
        return getTextFromElement(logOut);
    }

}
