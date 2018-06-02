package steps_definitions;

import cucumber.api.java.en.Given;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage= new LoginPage();

    @Given("^I am logged to the application with user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iAmLoggedToTheApplicationWithUserNameAndPassword(String userName, String password) {
        loginPage.navigateToLoginPage()
                .setUserNameTextBox(userName)
                .setPasswordTextBox(password)
                .clickOnLoginButton();
    }
}
