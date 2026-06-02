package Interface;

import Library.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;

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
    @FindBy(xpath = "//div[@class='SizeSelect89__gridFeatureContainer']")
    WebElement item2list;
    @FindBy(xpath = "//label[@aria-label= 'R (sold out)']")
    WebElement rNecklace;
    @FindBy(xpath = "//label[contains(@aria-label, '(sold out)')]")
    boolean soldOut;


    public void selection (WebElement a)
    {
        List<WebElement> available = driver.findElements((By) a);
        Iterator<WebElement> itr = available.iterator();

        clickWait(rNecklace);

        if (soldOut)
        {
            System.out.println("necklace is unavailable");

            while (itr.hasNext())
            {
                item2list = itr.next();
                clickWait(item2list);
                clickWait(addtoCart);


            }



        }
        }





   public void Runner2 ()
   {

    dropdown(dropdown1,3);
    clickWait(item1);
    clickWait(addtoCart);
    backArrow();
    clickWait(item2);
    selection(item2list);





    }

}

