package PageObjects;

import Shared.BaseObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThankYouPageObjects extends BaseObjects {

    @FindBy(className = "thankYou__button-avz2fr-9.fIeAdZ")
    public WebElement heroloWebsiteBtn;

    @FindBy(className = "thankYou__backLink-avz2fr-10.bBzcJF")
    public WebElement automationWebsiteBtn;

    @FindBy(xpath = "//a[contains(@href,'instagram.com')]")
    public WebElement instagramBtn;

}
