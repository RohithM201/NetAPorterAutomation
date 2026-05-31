package Interface;

import Library.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NetAPorterJewelry extends CommonFunctions {

   public  NetAPorterJewelry (WebDriver driver) {
       super(driver);
       PageFactory.initElements(driver,this);
   }
    @FindBy (id = "order-by")
    WebElement dropdown1;
    @FindBy (xpath = "//img[contains(@alt, 'STONE AND STRAND')]")
    WebElement item1;
    @FindBy (xpath = "//img[contains(@alt,'ROXANNE ASSOULIN Initial Reaction gold-tone')]")
    WebElement item2;
    @FindBy (xpath = "//button[contains(@class, 'Button10 Button10--primary')]")
    WebElement addtoCart;





   public void Runner2 ()
   {

    dropdown(dropdown1,3);
    clickWait(item1);
    clickWait(addtoCart);
    backArrow();
    clickWait(item2);




    }

}

