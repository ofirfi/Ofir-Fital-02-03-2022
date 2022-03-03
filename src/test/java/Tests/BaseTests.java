package Tests;

import Selenium.Selenium;
import org.junit.After;
import org.junit.Before;

public class BaseTests {

    Selenium selenium = Selenium.getSelenium();

    @Before
    public void testsSetUp(){
        selenium.goToURL("https://automation.herolo.co.il/");
    }

//    @After
    public void afterTests(){
        selenium.close();
    }

}
