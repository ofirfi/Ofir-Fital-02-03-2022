package PageObjects;

import Shared.BaseObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPageObjects extends BaseObjects {


    //Contact Us Elements
    @FindBy(xpath = "//input[@name='name' and @class='Footer__Input-sc-159s1ql-6 vqSrW']")
    public WebElement helpFormNameTextBox;

    @FindBy(xpath = "//input[@name='email' and @class='Footer__Input-sc-159s1ql-6 vqSrW']")
    public WebElement helpFormEmailTextBox;

    @FindBy(xpath =  "//input[@name='phone' and @class='Footer__Input-sc-159s1ql-6 vqSrW']")
    public WebElement helpFormPhoneTextBox;

    @FindBy(className = "Footer__Button-sc-159s1ql-7.kOOAFW")
    public WebElement helpFormSendBtn;

    @FindBy(className = "Footer__InputError-sc-159s1ql-5.blyfOW")
    public WebElement helpFormNameErrorMsg;



    //Hear More Elements
    @FindBy(id = "name")
    public WebElement HearMoreNameTextBox;

    @FindBy(id = "company")
    public WebElement HearMoreCompanyTextBox;;

    @FindBy(id = "email")
    public WebElement HearMoreEmailTextBox;;

    @FindBy(id = "phone")
    public WebElement HearMorePhoneTextBox;;

    @FindBy(linkText = "דברו איתנו")
    public WebElement HearMoreSendBtn;

    @FindBy(className = "commun__ErrorText-zi6nvq-6.bDkbFh")
    public List<WebElement> hearMoreErrorMsgs;


    //Popup Elements
    @FindBy(xpath = "//span[@class='onUnloadPopup__CloseModalBtn-v34ylr-1 gFThxT']")
    public WebElement popupCloseBtn;

    @FindBy(xpath = "//input[@name ='name' and @class='onUnloadPopup__Input-v34ylr-18 kCHUMm']")
    public WebElement popupNameTextBox;

    @FindBy(xpath = "//input[@name ='name' and @class='onUnloadPopup__Input-v34ylr-18 kCHUMm']")
    public WebElement popupEmailTextBox;

    @FindBy(xpath = "//input[@name ='name' and @class='onUnloadPopup__Input-v34ylr-18 kCHUMm']")
    public WebElement popupPhoneTextBox;

    @FindBy(xpath = "//button[@class='onUnloadPopup__Button-v34ylr-19 cUxvnt']")
    public WebElement popupSendBtn;

    @FindBy(xpath = "//*[@class='onUnloadPopup__InputError-v34ylr-15 dsvIDy'")
    List<WebElement> popupErrorMsgs;

    //Others

    @FindBy(className = "backToTop__BtnGoUp-z83xj1-0.huPgzm")
    public WebElement scrollUpBtn;

    @FindBy(xpath = "//img[@alt='Right arrow']")
    public WebElement workExampleRightArrow;

    @FindBy(xpath = "//img[@alt='Left arrow']")
    public WebElement workExampleLeftArrow;

    @FindBy(xpath = "//a[contains(@href,'herolo.co.il')]")
    public WebElement heroloSiteLink;

    @FindBy(className = "callUsWhatsapp__BtnWhatsapp-rkzbui-0.cjunrQ")
    public WebElement floatingWhatsAppLink;

    @FindBy(className = "socialMediaBar__ImgSocial-sc-1ry1db0-2.jOgeKm")
    public WebElement staticWhatsAppLink;


}
