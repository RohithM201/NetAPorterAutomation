import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser extends CommonFunctions {


    public Browser(WebDriver driver) {
        super(driver);
    }

    public void browsertype() {

        switch (UI.browser) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                driver = new ChromeDriver();

            case "edge":
                driver = new EdgeDriver();

            case "safari":
                driver = new SafariDriver();

            case "firefox":
                driver = new FirefoxDriver();


            default: System.out.println("Invalid WebBrowser");

        }
        driver.get(link);

    }




        public static void main (String[]args){


    }

}


