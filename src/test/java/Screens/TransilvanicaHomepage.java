package Screens;

import Help.BaseTest;
import Help.HelperMethods;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TransilvanicaHomepage extends BaseTest {
    public HelperMethods functions=new HelperMethods(driver);

    @FindBy(how = How.ID, using="accept-cookies")
    private WebElement acceptCookiesButton;
    @FindBy(how=How.XPATH, using="//a[@href='/donează/']")
    private WebElement doneazaButton;


      public TransilvanicaHomepage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public DoneazaSumaPage goToDoneazaSumaPage(){
        functions.clickWebElement(acceptCookiesButton);
        functions.clickWebElement(doneazaButton);
        return new DoneazaSumaPage(driver);
    }

}
