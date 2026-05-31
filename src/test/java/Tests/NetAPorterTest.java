package Tests;

import Library.Browser;


import Interface.NetAPorterJewelry;
import Interface.NetAPorterLogin;
import Interface.NetAPorterUI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NetAPorterTest extends Browser {


    @BeforeMethod
    public void getBrowser() {
        browsertype();
    }



    @Test
    public void runtime()
    {
        NetAPorterLogin a = new NetAPorterLogin(driver);
        a.Runner();
        NetAPorterUI e = new NetAPorterUI();
        e.Runner();
        NetAPorterJewelry i = new NetAPorterJewelry(driver);
        i.Runner2();
    }

}
