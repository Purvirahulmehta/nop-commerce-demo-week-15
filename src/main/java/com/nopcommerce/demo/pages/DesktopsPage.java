package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    // - Desktops text, Sortby, Display, selectProductList Locators and it's actions
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortBy;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement display;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement selectProductList;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildyourowncomputer;

    public String verifyDesktopsText() {
        log.info("getting desktops Text : " + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }

    public void clickOnSortby(String text) {
        selectByValueFromDropDown(sortBy, text);
        log.info("SelectingSortby" + text + " from dropdown " + sortBy.toString());
    }

    public void clickOnDisplay(String text) {
        selectByValueFromDropDown(display, text);
        log.info("Selecting Display" + text + " from dropdown " + display.toString());
    }

    public void clickOnProductList() {
        clickOnElement(selectProductList);
        log.info("Clicking on ProductList" + selectProductList.toString());
    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildyourowncomputer);
        log.info("Clicking on BuildYourOwnComputer" + buildyourowncomputer.toString());
    }

}
