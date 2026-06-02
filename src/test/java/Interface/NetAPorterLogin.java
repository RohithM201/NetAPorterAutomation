package Interface;

import Library.CommonFunctions;
import Library.UI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NetAPorterLogin extends CommonFunctions {

    public NetAPorterLogin(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "Account2_anchor")
    WebElement myAccount;

    @FindBy(id = "logonId")
    WebElement username;


    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    @FindBy(xpath = "//button[contains(@class,'Button10--submit')]")
    WebElement submitBtn;



    public void Runner ()
    {
        clickWait(myAccount);
        sendKeysWait(username, UI.username);
        sendKeysWait(password, UI.password);
        clickWait(submitBtn);





    }

}

