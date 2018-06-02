package steps_definitions;

import cucumber.api.java.en.Given;
import pages.HomePage;

public class HomeSteps {
    HomePage homePage = new HomePage();
    @Given("^I should see the home page$")
    public void iSeeTheHomePage() {
        homePage.verifyBrandingHomePage();
    }
}
