package Interface;

import Library.CommonFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NetAPorterUI extends CommonFunctions {

    public NetAPorterUI ()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//button[@id='toggle-button']")
    WebElement menuBtn;

    @FindBy(xpath = "//a/span[text()='Jewelry']")
    WebElement jewelryBtn;

    @FindBy(xpath = "//span[text()='All Jewelry']")
    WebElement allJewelry;

    public void Runner()
    {
       hover(jewelryBtn);
       clickWait(allJewelry);


    }


    }



