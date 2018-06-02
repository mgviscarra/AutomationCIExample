package pages;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.BrowserManager;

public class HomePage {
    WebDriver driver;
    public HomePage(){
        driver=BrowserManager.getDriverInstance("firefox");
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="branding")
    private WebElement branding;

    public void verifyBrandingHomePage(){
        Assert.assertTrue("Branding was not displayed",branding.isDisplayed());
    }
}
