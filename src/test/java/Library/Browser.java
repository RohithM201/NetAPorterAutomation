package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

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
                driver = new ChromeDriver();
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


