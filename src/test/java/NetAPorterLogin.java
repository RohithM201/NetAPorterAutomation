import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NetAPorterLogin extends CommonFunctions {

    public NetAPorterLogin(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "Account2_anchor")
    WebElement myAccount;

    @FindBy(id = "logonId")
    WebElement username;


    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    public void Runner ()
    {
        clickWait(myAccount);
        sendKeysWait(username, UI.username);
        sendKeysWait(password,UI.password);





    }

}

