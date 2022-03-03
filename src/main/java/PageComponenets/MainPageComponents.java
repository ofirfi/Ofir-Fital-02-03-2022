package PageComponenets;
import PageObjects.MainPageObjects;
import Shared.BaseComponents;



public class MainPageComponents extends BaseComponents {

    private MainPageObjects mainPageObjects = new MainPageObjects();

    private String requiredFieldMsg = "שדה * הוא שדה חובה";
    private String illegalEmailMsg = "כותבת אימייל לא חוקית";
    private String illegalPhoneMsg = "מספר טלפון לא חוקי";


    public void fillHelpForm(String name, String email, String phone){
        selenium.elementSendText(mainPageObjects.helpFormNameTextBox,name);
        selenium.elementSendText(mainPageObjects.helpFormEmailTextBox,email);
        selenium.elementSendText(mainPageObjects.helpFormPhoneTextBox,phone);
    }

    public void sendHelpForm(){
        selenium.clickOnElement(mainPageObjects.helpFormSendBtn);
    }

    public void fillHearMoreForm(String name,String company,String email,String phone){
        selenium.elementSendText(mainPageObjects.hearMoreNameTextBox,name);
        selenium.elementSendText(mainPageObjects.hearMoreCompanyTextBox,company);
        selenium.elementSendText(mainPageObjects.hearMoreEmailTextBox,email);
        selenium.elementSendText(mainPageObjects.hearMorePhoneTextBox,phone);
    }

    public void sendHearMoreForm(){
        selenium.clickOnElement(mainPageObjects.hearMoreSendBtn);
    }


}
