package Tests;

import Selenium.Selenium;

import org.junit.AfterClass;


public class BaseTests {

    Selenium selenium = Selenium.getSelenium();


    @AfterClass
    public static void afterTests(){
        Selenium.getSelenium().close();
    }

}
