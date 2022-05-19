package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {

        PageFactory.initElements(driver, this);
    }

    //    1.LoginPage - Email, password, Login Button and "Welcome, Please Sign In!" text Locators
//    and create appropriate methods for it.
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailLoginField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordLoginField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement logInButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomePleaseSignIn;
    public void clickOnLogOut(){
        clickOnElement(logout);
    }

    public void enterEmailField(String text) {
        sendTextToElement(emailLoginField, text);
        log.info("Enter Email: " + emailLoginField.toString());
    }

    public void enterPasswordField(String text) {
        sendTextToElement(passwordLoginField, text);
        log.info("Enter Pasword: " + passwordLoginField.toString());
    }

    public void clickOnLogInButton() {
        clickOnElement(logInButton);
        log.info("Click On Log In: " + logInButton.toString());
    }

    public String verifyLogInButton() {
        log.info("Verify the Text: " + logInButton.toString());
        return getTextFromElement(logInButton);
    }

    public String getWelcomeMessage() {
        log.info("Verify The Text: " + welcomePleaseSignIn.toString());
        return getTextFromElement(welcomePleaseSignIn);

    }

    public String getErrorMessage() {
        log.info("Verify the Text: " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

}
