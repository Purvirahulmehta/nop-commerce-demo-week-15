package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());
    public BuildYourOwnComputerPage() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildyourowncompterText;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildYourOwnComputerLink;
    @CacheLookup
    @FindBy(xpath = "//select[@name='product_attribute_1']")
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='product_attribute_2']")
    WebElement ramdropdown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hdd320;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hdd400;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement getHdd320;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement operatingSystemVista;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement operatingSystemPremium;
     @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareMSOfficeBox;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement TotalCommander1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement AcrobatReader1;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCardButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAddedToCartMessage;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeButton;


    public String verifyBuildYourOwnComputerText() {
        log.info("getting build your computer text: " + buildyourowncompterText.toString());
        return getTextFromElement(buildyourowncompterText);

    }
    public void clickOnBuildYourOwnComputer(){
        clickOnElement(buildYourOwnComputerLink);
        log.info("Clicking on BuildYourOwnComputer : " + buildYourOwnComputerLink.toString());

    }
    public String verifyProductAddedMsg(){
        log.info("getting Product Added text from: " + productAddedToCartMessage.toString());
        return getTextFromElement(productAddedToCartMessage);
    }

    public void selectOnProcessorDropDown(String processor) {
        selectByVisibleTextFromDropDown(processorDropDown, processor);
        log.info("Selecting Processor: " +  processorDropDown.toString());
    }

    public void selectOnRam(String ram) {
        selectByVisibleTextFromDropDown(ramdropdown, ram);
        log.info("Selecting Ram: " +  ramdropdown.toString());
    }
    public void selectHdd320() {
        clickOnElement(hdd320);
        log.info("Clicking on Hdd320: " + hdd320.toString());
    }

    public void selectHdd400() {
        clickOnElement(hdd400);
        log.info("Clicking on Hdd400: " + hdd400.toString());
    }

    public void selectOperatingSystemvista() {
        clickOnElement(operatingSystemVista);
        log.info("Clicking on OperatingSystemvista: " + operatingSystemVista.toString());
    }

    public void selectOperatingSystemPremium() {
        clickOnElement(operatingSystemPremium);
        log.info("Clicking on OperatingSystem Premium: " + operatingSystemPremium.toString());
    }

    public void selectSoftwareMSOffice() {
        clickOnElement(softwareMSOfficeBox);
        log.info("Clicking on SoftwareMSOffice: " + softwareMSOfficeBox.toString());
    }

    public void selectTotalCommander1() {
        clickOnElement(TotalCommander1);
        log.info("Clicking on SoftwareTotalComm: " + TotalCommander1.toString());
    }


    public String verifyProductAddedMessage() {
        log.info("getting ProductAdded Message from: " + productAddedToCartMessage.toString());
        return getTextFromElement(productAddedToCartMessage);
    }

    public void clickOnClose() {
        clickOnElement(closeButton);
        log.info("Clicking on Close: " + closeButton.toString());
    }

    public void getHdd(String Hddtext) {
        if (Hddtext == "320GB") {
            clickOnElement(hdd320);
            log.info("Clicking on Hdd: " + hdd320.toString());
        } else {
             clickOnElement(hdd400);
            log.info("Clicking on Hdd: " + hdd400.toString());
        }
    }

    public void getOsRadio(String radio) {
        if (radio == "VistaHome") {
            clickOnElement(operatingSystemVista);
            log.info("Clicking on getOsRadio: " + operatingSystemVista.toString());
        } else {
            clickOnElement(operatingSystemPremium);
            log.info("Clicking on getOsRadio: " + operatingSystemPremium.toString());

        }
    }

    public void clickOnSoftwareCheckBox(String software) {
        if (software == "MicrosoftOffice") {
            clickOnElement(softwareMSOfficeBox);
            log.info("Clicking on SoftwareCheckBox: " + softwareMSOfficeBox.toString());

        }
        if (software == "TotalCommander") {
             clickOnElement(TotalCommander1);
            log.info("Clicking on SoftwareCheckBox: " + TotalCommander1.toString());
        }
        if (software == "AcrobatReader") {
            clickOnElement(AcrobatReader1);
            log.info("Clicking on SoftwareCheckBox: " + AcrobatReader1.toString());
        }
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCardButton);
        log.info("Clicking on AddToCartButton" + addToCardButton.toString());
    }

}
