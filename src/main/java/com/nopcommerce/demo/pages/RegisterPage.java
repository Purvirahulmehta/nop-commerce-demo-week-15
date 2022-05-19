package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement RegisterText;
       @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleRadio;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement selectDayOfBirth;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement selectMonthOfBirth;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement selectyearOfBirth;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButon;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement yourRegisterCompletedText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continuButton;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameError ;
    @CacheLookup@FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameError;
    @CacheLookup@FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;
    @CacheLookup@FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordError;
    @CacheLookup@FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordError;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;


    public String getRegisterText() {

        log.info("Verify the Text: " + registerButon.toString());
        return getTextFromElement(registerButon);
    }

    //        public void clickOnMaleButton() {
//            clickOnElement(maleRadio);
//        }
    public void clickOnFemaleButton() {
        clickOnElement(femaleRadio);
        log.info("Clicking on Female Button:" + femaleRadio.toString());
    }

    public void enterFirstName(String text) {
        sendTextToElement(firstName, text);
        log.info("Entering FirstName: " + firstName.toString());
    }

    public void enterLastName(String text) {
        sendTextToElement(lastName, text);
        log.info("Entering Last Name : " + lastName.toString());
    }

    public void setDayOfBirth(String text) {
        selectByValueFromDropDown(selectDayOfBirth, text);
        log.info("Select Day Of Birth: " + selectDayOfBirth.toString());
    }

    public void setMonthOfBirth(String text) {
        selectByValueFromDropDown(selectMonthOfBirth, text);
        log.info("Select the Month Of Birth: " + selectMonthOfBirth.toString());
    }

    public void setYearOfBirth(String text) {
        selectByValueFromDropDown(selectyearOfBirth, text);
        log.info("Select the Year of Birth: " + selectyearOfBirth.toString());
    }

    public void enterEmail(String text) {
        sendTextToElement(email, text);
        log.info("Enter Email: " + email.toString());
    }

    public void enterPassword(String text) {
        sendTextToElement(password, text);
        log.info("Enter Password: " + password.toString());
    }

    public void enterConfirmPassword(String text) {
        sendTextToElement(confirmPassword, text);
        log.info("Enter Confirm Password: " + confirmPassword.toString());
    }

    public void clickOnRegistedButton() {

        clickOnElement(registerButon);
        log.info("Click On RegisterButton: " + registerButon.toString());
    }

    public String getRegistrationCompletedText() {
        log.info("Verify the Text: " + yourRegisterCompletedText.toString());
        return getTextFromElement(yourRegisterCompletedText);

    }
    public void clickOnLogOutLink(){
        clickOnElement(logOutLink);
        log.info("Click On LogOutLink: " + logOutLink.toString());

    }

    public void clickOnCountinu() {
        clickOnElement(continuButton);
        log.info("Click On Countinu Button: " + continuButton.toString());

    }
    public String getFirstNameError(){
        log.info("getting FirstNameError text from "+firstNameError.toString());
        return getTextFromElement(firstNameError);
    }
    public String getLastNameError(){
        log.info("getting LastNameError text from "+lastNameError.toString());
        return getTextFromElement(lastNameError);
    }
    public String getEmailError(){
        log.info("getting EmailError text from "+emailError.toString());
        return getTextFromElement(emailError);
    }
    public String getPasswordError(){
        log.info("getting PasswordError text from "+passwordError.toString());
        return getTextFromElement(passwordError);
    }
    public String getConfirmPasswordError(){
        log.info("getting ConfirmPasswordError text from "+confirmPasswordError.toString());
        return getTextFromElement(confirmPasswordError);
    }


}
