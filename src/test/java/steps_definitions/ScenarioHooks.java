package steps_definitions;

import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import support.BrowserManager;

public class ScenarioHooks
{

    @After
    public void afterScenario(){
        WebDriver driver=BrowserManager.getDriverInstance("firefox");
        driver.close();
    }
}
