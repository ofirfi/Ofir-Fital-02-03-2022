package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Shared.BaseObjects;

public class MainPageObjects extends BaseObjects {


    //Contact Us Elements
    @FindBy(xpath = "//input[@name='name' and @class='Footer__Input-sc-159s1ql-6 vqSrW']")
    public WebElement helpFormNameTextBox;

    @FindBy(xpath = "//input[@name='email' and @class='Footer__Input-sc-159s1ql-6 vqSrW']")
    public WebElement helpFormEmailTextBox;

    @FindBy(xpath =  "//input[@name='phone' and @class='Footer__Input-sc-159s1ql-6 vqSrW']")
    public WebElement helpFormPhoneTextBox;

    @FindBy(xpath = "//button[@class='Footer__Button-sc-159s1ql-7 kOOAFW']")
    public WebElement helpFormSendBtn;

    public By helpFormNameErrorMsg = By.xpath("//label[@class='Footer__InputError-sc-159s1ql-5 blyfOW']/span");


    //Hear More Elements
    @FindBy(id = "name")
    public WebElement contactUsNameTextBox;

    @FindBy(id = "company")
    public WebElement contactUsCompanyTextBox;;

    @FindBy(id = "email")
    public WebElement contactUsEmailTextBox;;

    @FindBy(id = "telephone")
    public WebElement contactUsPhoneTextBox;;

    @FindBy(linkText = "דברו איתנו")
    public WebElement contactUsSendBtn;

    public By contactUsErrorMsgs = By.xpath("//span[@class='commun__ErrorText-zi6nvq-6 bDkbFh']/span");


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

    public By popupErrorMsgs = By.xpath("//label[@class='onUnloadPopup__InputError-v34ylr-15 dsvIDy']/span");


    //Other buttons and links
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
