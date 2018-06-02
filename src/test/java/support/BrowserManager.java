package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserManager {
    private static WebDriver browserInstance = null ;


    /**
     *
     * @return
     */
    public static WebDriver getDriverInstance(String browser){
        if(browserInstance == null){
            if (browser.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src\\test\\java\\support\\web_driver\\geckodriver.exe");
                browserInstance = new FirefoxDriver();
                return browserInstance;

            } else if (browser.equals("chrome")) {
                browserInstance = new ChromeDriver();
                return browserInstance;

            } else if (browser.equals("msie")) {
                browserInstance = new InternetExplorerDriver();
                return browserInstance;

            } else{
                throw new RuntimeException("The given browser could not be found: "+browser);
            }
        }
        return browserInstance;
    }

}
