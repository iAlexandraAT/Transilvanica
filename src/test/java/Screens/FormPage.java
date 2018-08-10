package Screens;

import Help.HelperMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormPage {
    WebDriver driver;
    HelperMethods functions = new HelperMethods(driver);


    @FindBy(how = How.XPATH, using = "//input[@value='100']")
    public WebElement lei100button;
    @FindBy(how = How.NAME, using = "LastName")
    public WebElement Nume;
    @FindBy(how = How.NAME, using = "FirstName")
    public WebElement Prenume;
    @FindBy(how = How.NAME, using = "Email")
    public WebElement email;
    @FindBy(how = How.NAME, using = "Phone")
    public WebElement telefon;
    @FindBy(how = How.NAME, using = "Address")
    public WebElement adresa;
    @FindBy(how = How.NAME, using = "City")
    public WebElement oras;
    @FindBy(how = How.NAME, using = "Zip")
    public WebElement codPostal;
    @FindBy(how = How.NAME, using = "Country")
    public WebElement tara;
    @FindBy(how = How.NAME, using = "InsertIntoDonersTable")
    public WebElement anonimCheckbox;
    @FindBy(how = How.NAME, using = "AgreeTermsAndConditions")
    public WebElement agreeTermsCheckbox;
    @FindBy(how = How.ID, using = "card-bancar")
    public WebElement cardBancMethod;
    @FindBy(how = How.ID, using = "paypal")
    private WebElement paypalButton;
    @FindBy(how = How.XPATH, using = "//button[@id='donate-button']")
    public WebElement submitButton;


    public FormPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public FormPage nrSumCheckboxes(){
    List<WebElement> sumCheckBoxes=driver.findElements(By.xpath("//input[contains(@name,'Amount') or contains(@name, 'otherAmountCheckbox')]"));
    int sumListSize=sumCheckBoxes.size();
    int expectedCheckBoxes=7;
    Assert.assertEquals(expectedCheckBoxes, sumListSize);
    return this;

    }
    public FormPage fillFormCardBancar( ){
        functions.clickWebElement(lei100button);
        functions.fillWebElement(Nume, "NumeTest");
        functions.fillWebElement(Prenume, "PrenumeTest");
        functions.fillWebElement(email, "test"+System.currentTimeMillis()+"@gmail.com");
        functions.fillWebElement(telefon, "0756328943");
        functions.fillWebElement(adresa, "Strada Macesului nr 3");
        functions.fillWebElement(oras, "Cluj");
        functions.fillWebElement(codPostal, "02653");
        functions.fillWebElement(tara, "Romania");
        functions.clickWebElement(anonimCheckbox);
        functions.clickWebElement(agreeTermsCheckbox);
//        jsx.executeScript("window.scrollBy(0, 500)", "");
        functions.clickWebElement(cardBancMethod);
        functions.clickWebElement(submitButton);
        return this;
    }

    public FormPage fillFormPaypal( ){
        functions.clickWebElement(lei100button);
        functions.fillWebElement(Nume, "NumeTest");
        functions.fillWebElement(Prenume, "PrenumeTest");
        functions.fillWebElement(email, "test"+System.currentTimeMillis()+"@gmail.com");
        functions.fillWebElement(telefon, "0756328943");
        functions.fillWebElement(adresa, "Strada Macesului nr 3");
        functions.fillWebElement(oras, "Cluj");
        functions.fillWebElement(codPostal, "02653");
        functions.fillWebElement(tara, "Romania");
        functions.clickWebElement(anonimCheckbox);
        functions.clickWebElement(agreeTermsCheckbox);
        functions.clickWebElement(paypalButton);
        functions.clickWebElement(submitButton);
        return this;

    }

}
