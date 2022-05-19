package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

public class ComputerPageTest {
    @When("^I click on computer link$")
    public void iClickOnComputerLink() {
        new HomePage().clickOnComputers();

    }

    @Then("^I should be see \"([^\"]*)\" text$")
    public void iShouldBeSeeText(String Computer) {
        Assert.assertEquals("Page not found",Computer,new ComputerPage().verifyComputersText());
    }

    @And("^I click on desktop link$")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktopLink();
         }

    @And("^I click on Computer tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputers();
    }

    @And("^I click Desktops link$")
    public void iClickDesktopsLink() {
        new ComputerPage().clickOnDesktopLink();
    }

    @And("^I click on product name \"([^\"]*)\"$")
    public void iClickOnProductName(String buildyourowncomputer)  {
        new BuildYourOwnComputerPage().clickOnBuildYourOwnComputer();
    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectOnProcessorDropDown(processor);

    }

    @And("^I select RAM \"([^\"]*)\"$")
    public void iSelectRAM(String ram)  {
        new BuildYourOwnComputerPage().selectOnRam(ram);

    }

    @And("^I select HDD \"([^\"]*)\"$")
    public void iSelectHDD(String hdd)  {
        new BuildYourOwnComputerPage().getHdd(hdd);

    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String os)  {
        new BuildYourOwnComputerPage().getOsRadio(os);

    }

    @And("^I select Software \"([^\"]*)\"$")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().clickOnSoftwareCheckBox(software);

    }

    @And("^I click on \"([^\"]*)\" Button$")
    public void iClickOnButton(String arg0)  {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();

    }

       @Then("^I should see \"([^\"]*)\"desktops text$")
    public void iShouldSeeDesktopsText(String desktop)  {
        Assert.assertEquals("Page not found",desktop,new DesktopsPage().verifyDesktopsText());

    }

    @Then("^I should see the message \"([^\"]*)\"$")
    public void iShouldSeeTheMessage(String message)  {
        Assert.assertEquals("Page not found",message,new BuildYourOwnComputerPage().verifyProductAddedMessage());


    }
}
