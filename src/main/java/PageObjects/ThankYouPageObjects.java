package PageObjects;

import Base.BaseObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ThankYouPageObjects extends BaseObjects {

    @FindBy(xpath ="//p[@class='thankYou__subtitile-avz2fr-6 cbgZUc']/span")
    public WebElement thankYouMsg;

    @FindBy(linkText = "חזור")
    public WebElement returnBtn;

}
