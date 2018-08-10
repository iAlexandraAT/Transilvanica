package Help;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HelperMethods {

    WebDriver driver;

   public HelperMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickWebElement(WebElement element) {
        element.click();
    }

    public void validatePage(String expected, WebDriver driver) {
        if (!(expected.isEmpty())) {
            String actual = driver.getTitle();
            Assert.assertEquals(expected, actual);
        }
    }

    public void fillWebElement(WebElement element, String value)
    {
        element.sendKeys(value);    }

    public void selectByText( WebElement element, String text){

        Select dropDown=new Select(element);
        dropDown.selectByVisibleText(text);}

    public void selectByValue(WebElement element, String value)
    {Select dropDown=new Select(element);
        dropDown.selectByValue(value);}

    public void hoverWebElement(WebElement element, WebDriver driver)
    { Actions action= new Actions(driver);
        action.moveToElement(element).build().perform(); }

    public void waitExplicit(WebElement element, WebDriver driver)
    {
        new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOf(element));}

   /*     //validate presence of checkboxes
    public void validateCheckBoxes(WebElement element, int i, WebDriver driver) {
        List<WebElement> CheckBoxes= new List<WebElement>();
      //  CheckBoxes = driver.findElements();
        int ListSize = CheckBoxes.size();
        int expectedCheckBoxes = i;
        Assert.assertEquals(expectedCheckBoxes, ListSize);
    }
    */




}
