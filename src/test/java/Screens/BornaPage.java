package Screens;

import Help.HelperMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BornaPage {
    WebDriver driver;
    HelperMethods functions = new HelperMethods(driver);
    JavascriptExecutor jsj=(JavascriptExecutor)driver;

    @FindBy(how = How.XPATH, using = "//select[@id='number-of-milestones']")
    public WebElement dropdownBorne;
    @FindBy(how = How.XPATH, using ="//input[@name='CustomMilestoneName']")
    public WebElement numeInscriptionat;
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

    @FindBy(how = How.XPATH, using= "//a[@href='/donează/borna/']")
    private WebElement achizitioneazaBornaButton;

    public BornaPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public BornaPage completeazaCampuriCardBancar( ){
        functions.validatePage("VIA TRANSILVANICA",driver);
        functions.selectByValue(dropdownBorne,"3");
        functions.waitExplicit(Nume,driver);
        functions.fillWebElement(numeInscriptionat, "Aliasul meu");
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
        functions.clickWebElement(cardBancMethod);
        functions.clickWebElement(submitButton);
        return this;
    }

    public BornaPage completeazaCampuricuPaypal( ){
        functions.validatePage("VIA TRANSILVANICA",driver);
        functions.selectByValue(dropdownBorne,"3");
        functions.waitExplicit(Nume,driver);
        functions.fillWebElement(numeInscriptionat, "Aliasul meu");
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
