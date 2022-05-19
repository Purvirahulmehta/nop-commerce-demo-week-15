package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktopsLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]")
    WebElement notebooksLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/h2[1]/a[1]")
    WebElement softwareLink;

    public String verifyComputersText() {
       log.info("getting ComputersText  from " + computersText.toString());
        return getTextFromElement(computersText);
    }

    public void clickOnDesktopLink() {
        clickOnElement(desktopsLink);
        log.info("Clicking on DesktopLink" + desktopsLink.toString());
    }

    public void clickOnNotebooksLink() {
        clickOnElement(notebooksLink);
        log.info("Clicking on NotebooksLink" + notebooksLink.toString());
    }

    public void clickOnSoftwareLink() {
        clickOnElement(softwareLink);
        log.info("Clicking on SoftwareLink" + softwareLink.toString());
    }
}
