import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonFunctions implements UI {
    public WebDriver driver;
    public WebDriverWait wait;
    public Actions act;


    public CommonFunctions(WebDriver driver) {
       this.driver = driver;
       this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       this.act = new Actions(driver);
    }


    public void setWait(WebElement a)
    {
        wait.until(ExpectedConditions.visibilityOf(a));

    }

    public void clickWait (WebElement a)
    {
       wait.until(ExpectedConditions.elementToBeClickable(a));
    }

    public void sendKeysWait(WebElement a, String b)
    {
        wait.until(ExpectedConditions.elementToBeClickable(a)).sendKeys(b);
    }

}




