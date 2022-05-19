package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ErrorMessage extends Utility {
    private static final Logger log = LogManager.getLogger(ErrorMessage.class.getName());
    public ErrorMessage() {
        PageFactory.initElements(driver, this);
    }
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

