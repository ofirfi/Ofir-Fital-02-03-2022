package Base;

import Selenium.Selenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BaseObjects {
    Selenium selenium = Selenium.getSelenium();

    public BaseObjects(){
        PageFactory.initElements(selenium.getDriver(),this);
    }

    @FindBy(xpath = "//a[@target='_blank']")
    public List<WebElement> outsidePageLinks;

}
