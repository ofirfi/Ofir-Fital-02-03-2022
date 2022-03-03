package Shared;

import Selenium.Selenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseObjects {
    Selenium selenium = Selenium.getSelenium();

    public BaseObjects(){
        PageFactory.initElements(selenium.getDriver(),this);
    }

    @FindBy(xpath = "//a[contains(@href,'facebook.com')]")
    protected WebElement facebookLink;

    @FindBy(xpath = "//a[contains(@href,'linkedin.com')]")
    protected WebElement linkedinLink;

}
