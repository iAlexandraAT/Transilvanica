package Screens;

import Help.HelperMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DoneazaSumaPage {
    WebDriver driver;
    HelperMethods functions = new HelperMethods(driver);

    @FindBy(how = How.XPATH, using = "//a[@href='/donează/suma/']")
    private WebElement doneazaSumaButton;

    @FindBy(how = How.XPATH, using= "//a[@href='/donează/borna/']")
    private WebElement achizitioneazaBornaButton;


    public DoneazaSumaPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public FormPage goToFormPage(){
        functions.clickWebElement(doneazaSumaButton);
        return new FormPage(driver);

    }
    public BornaPage goToBornaPage(){
        functions.clickWebElement(achizitioneazaBornaButton);
        return new BornaPage(driver);
    }

}
