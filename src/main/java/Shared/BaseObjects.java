package Shared;

import Selenium.Selenium;
import org.openqa.selenium.support.PageFactory;

public class BaseObjects {
    Selenium selenium = Selenium.getSelenium();

    public BaseObjects(){
        PageFactory.initElements(selenium.getDriver(),this);
    }
}
