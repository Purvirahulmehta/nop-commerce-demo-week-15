package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterPageTest {
    @Given("^I am on homePage$")
    public void iAmOnHomePage() {
    }

    @Then("^I should see \"([^\"]*)\" text$")
    public void iShouldSeeText(String text)  {
        Assert.assertEquals("Page not found",text,new RegisterPage().getRegisterText());

    }
    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegistedButton();
    }


    @And("^I click on female button$")
    public void iClickOnFemaleButton() {
        new RegisterPage().clickOnFemaleButton();
    }

    @And("^I enter FirstName \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().enterFirstName(firstName);

    }

    @And("^I enter LastName\"([^\"]*)\"$")
    public void iEnterLastName(String lastName) {
        new RegisterPage().enterLastName(lastName);

    }

    @And("^I select\"([^\"]*)\" from Day$")
    public void iSelectFromDay(String day)  {
        new RegisterPage().setDayOfBirth(day);

    }

    @And("^I select\"([^\"]*)\" from Month$")
    public void iSelectFromMonth(String month){
      new RegisterPage().setMonthOfBirth(month);
    }

    @And("^I select\"([^\"]*)\" from Year$")
    public void iSelectFromYear(String year)  {
       new RegisterPage().setYearOfBirth(year);
    }

    @And("^I enter email\"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new RegisterPage().enterEmail(email);
    }

    @And("^I enter password\"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new RegisterPage().enterPassword(password);

    }

    @And("^I enter confirmpassword\"([^\"]*)\"$")
    public void iEnterConfirmpassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);

    }

       @Then("^I should see the message Your registration completed$")
    public void iShouldSeeTheMessageYourRegistrationCompleted() {
        Assert.assertEquals("Page not found","Your registration completed",new RegisterPage().getRegistrationCompletedText());
    }



    @And("^I should see error message \"([^\"]*)\" in firstName field$")
    public void iShouldSeeErrorMessageInFirstNameField(String notfirstname)  {
      Assert.assertEquals("Page not found",notfirstname,new RegisterPage().getFirstNameError());
    }

    @And("^I should see  error message\"([^\"]*)\" in lastName field$")
    public void iShouldSeeErrorMessageInLastNameField(String notlastname)  {
        Assert.assertEquals("Page not found",notlastname,new RegisterPage().getLastNameError());
    
    }

    @And("^I should see error message\"([^\"]*)\" in email field$")
    public void iShouldSeeErrorMessageInEmailField(String notemail)  {
    Assert.assertEquals("Page not found",notemail,new RegisterPage().getEmailError());      
    }

    @And("^I should see error message\"([^\"]*)\" in password field$")
    public void iShouldSeeErrorMessageInPasswordField(String notpassword){
        Assert.assertEquals("Page not found",notpassword,new RegisterPage().getPasswordError());
       
    }

    @And("^I should see error message\"([^\"]*)\" in confirm password field$")
    public void iShouldSeeErrorMessageInConfirmPasswordField(String notconfirmpassword) {
        Assert.assertEquals("Page not found",notconfirmpassword,new RegisterPage().getConfirmPasswordError());
       
    }

   @When("^I click on RegisterLink$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }



}
