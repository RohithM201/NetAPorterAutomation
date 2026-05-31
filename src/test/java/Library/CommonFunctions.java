package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

    public CommonFunctions() {

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
    public void hover (WebElement a)
    {
        act.moveToElement(a).perform();
    }

    public void dropdown(WebElement a, int i)
    {
        Select s = new Select(a);
        s.getOptions().get(i).click();
        s.getOptions().get(i).isSelected();

    }
    public void backArrow()
    {
        driver.navigate().back();
    }



}




