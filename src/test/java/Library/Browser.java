package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Browser extends CommonFunctions {

    public Browser()
    {
        super();
    }

    public Browser(WebDriver driver) {
        super(driver);
    }


   public void browsertype() {

        switch (UI.browser) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
                options.setExperimentalOption("useAutomationExtension", false);
                options.addArguments("--disable-blink-features=AutomationControlled");
                options.addArguments("user-agent=Chrome (Macintosh; Arm64 Mac OS Tahoe 26.3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36");
                options.addArguments("--incognito");
                try {
                    // 6. Inject JavaScript via CDP to delete the 'navigator.webdriver' property completely
                    // This runs instantly on every new page document before any website script executes
                    Map<String, Object> params = new HashMap<>();
                    params.put("source", "Object.defineProperty(navigator, 'webdriver', {get: () => undefined})");
                    ((ChromeDriver) driver).executeCdpCommand("Page.addScriptToEvaluateOnNewDocument", params);

                    // 7. Test your script on the target website


                    // Keep browser open briefly to verify success
                   ;

                } catch (Exception e) {
                    e.printStackTrace();
                }

                driver = new ChromeDriver(options);
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            case "safari":
                driver = new SafariDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;


            default:
                throw new RuntimeException("Invalid WebBrowser" + "Required " + UI.browser);

        }
        driver.get(UI.link);

    }




        public static void main (String[]args){


    }

}


