package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLogInLink();
    }

    @Then("^I should see Message \"([^\"]*)\"$")
    public void iShouldSeeMessage(String welcomeMessage)  {
        Assert.assertEquals(" ","Welcome, Please Sign In!",new LoginPage().getWelcomeMessage());

    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email){

        new LoginPage().enterEmailField(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {

        new LoginPage().enterPasswordField(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {

        new LoginPage().clickOnLogInButton();
    }

    @Then("^I should see error message$")
    public void iShouldSeeErrorMessage() {
        new LoginPage().getErrorMessage();

    }

     @And("^I click on logOut link$")
    public void iClickOnLogOutLink() {
        new LoginPage().clickOnLogOut();
    }

    @Then("^I should see login$")
    public void iShouldSeeLogin() {
        Assert.assertEquals("Failed to logout","Log in" ,new HomePage().getLogInLinkText());

    }

    @Then("^I should see LogOut$")
    public void iShouldSeeLogOut() {
        new RegisterPage().clickOnLogOutLink();
    }
}
