package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.BrowserManager;

public class LoginPage {

    WebDriver driver;
    public LoginPage(){
        driver=BrowserManager.getDriverInstance("firefox");
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="txtUsername")
    private WebElement userNameTextBox;

    @FindBy(id="txtPassword")
    private WebElement passwordTextBox;

    @FindBy(id="btnLogin")
    private WebElement loginButton;

    public LoginPage setUserNameTextBox(String userName){
        userNameTextBox.sendKeys(userName);
        return this;
    }

    public LoginPage setPasswordTextBox(String password){
        passwordTextBox.sendKeys(password);
        return this;
    }

    public HomePage clickOnLoginButton(){
        loginButton.click();
        return new HomePage();
    }

    public LoginPage navigateToLoginPage(){
        driver.get("http://opensource.demo.orangehrmlive.com/");
        return this;
    }
}
