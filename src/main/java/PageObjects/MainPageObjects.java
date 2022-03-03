package PageObjects;

import Shared.BaseObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageObjects extends BaseObjects {


    @FindBy(xpath = "//input[@name='name']")
    public WebElement helpFormNameTextBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement helpFormEmailTextBox;

    @FindBy(xpath =  "//input[@name='phone']")
    public WebElement helpFormPhoneTextBox;

    @FindBy(xpath = "//button[@class='Footer__Button-sc-159s1ql-7 kOOAFW']")
    public WebElement helpFormSendBtn;


}
