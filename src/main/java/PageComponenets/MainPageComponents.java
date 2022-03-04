package PageComponenets;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import PageObjects.MainPageObjects;
import Shared.BaseComponents;


public class MainPageComponents extends BaseComponents {

    private MainPageObjects mainPageObjects = new MainPageObjects();
    private String url = "https://automation.herolo.co.il/";
    private String requiredFieldMsg = "שדה * הוא שדה חובה";
    private String illegalEmailMsg = "כתובת אימייל לא חוקית";
    private String illegalPhoneMsg = "מספר טלפון לא חוקי";
    private List<String> outsidePageLinks = Arrays.asList("https://api.whatsapp.com/send?phone=972544945333",
            "https://www.linkedin.com/company/herolo/",
            "https://api.whatsapp.com/send?phone=972544945333",
            "https://www.facebook.com/Herolofrontend",
            "https://herolo.co.il/?lang=he");

     public enum FormType {
         HELP_FORM,
         CONTACT_US_FORM,
         POPUP_FORM
    }

    public void goToPage(){
        selenium.goToURL(url);
    }

    /**
     * The function fills "How To Help" form.
     * @param name The name text box value.
     * @param email The email text box value.
     * @param phone The phone number text box value.
     */
    public void fillHelpForm(String name, String email, String phone){
        selenium.elementSendText(mainPageObjects.helpFormNameTextBox,name);
        selenium.elementSendText(mainPageObjects.helpFormEmailTextBox,email);
        selenium.elementSendText(mainPageObjects.helpFormPhoneTextBox,phone);
    }

    /**
     * The function sends "How To Help" form.
     */
    public void sendHelpForm(){
        selenium.clickOnElement(mainPageObjects.helpFormSendBtn);
    }

    /**
     * The function scrolls down the page to "Contact Us" form.
     */
    public void scrollDownToContactForm(){
        selenium.scrollToElement(mainPageObjects.contactUsSendBtn);
    }

    /**
     * The function fills "Contact Us" form.
     * @param name The name text box value.
     * @param company The company text box value.
     * @param email The email text box value.
     * @param phone The phone number text box value.
     */
    public void fillContactUsForm(String name,String company,String email,String phone){
        selenium.elementSendText(mainPageObjects.contactUsNameTextBox,name);
        selenium.elementSendText(mainPageObjects.contactUsCompanyTextBox,company);
        selenium.elementSendText(mainPageObjects.contactUsEmailTextBox,email);
        selenium.elementSendText(mainPageObjects.contactUsPhoneTextBox,phone);
    }

    /**
     * The function sends "How To Help" form.
     */
    public void sendContactUsForm(){
        selenium.clickOnElement(mainPageObjects.contactUsSendBtn);
    }

    /**
     * The function verifies errors of missing fields.
     * @param form The type of form to check the errors for.
     */
    public void MissingRequiredFieldsErrorsCheck(FormType form){
         List<WebElement> elements;
         List<String> errors = fillErrorList(Arrays.asList("שם","אימייל","טלפון"));

         if(form == FormType.HELP_FORM)
             elements = selenium.findElementsByXpath(mainPageObjects.helpFormNameErrorMsg);
         else if(form==FormType.CONTACT_US_FORM){
             elements = selenium.findElementsByXpath(mainPageObjects.contactUsErrorMsgs);
             errors.add(1, "שדה חברה הוא שדה חובה");
         }
         else
             elements = selenium.findElementsByXpath(mainPageObjects.popupErrorMsgs);

         selenium.verifyElementsTexts(elements,errors);
    }

    /**
     *  The function verifies error messages of invalid values in text fields.
     * @param form The type of form.
     */
    public void invalidFieldsErrorCheck(FormType form){
        List<WebElement> elements;
        if(form == FormType.HELP_FORM)
            elements = selenium.findElementsByXpath(mainPageObjects.helpFormNameErrorMsg);
        else if(form == FormType.CONTACT_US_FORM)
            elements = selenium.findElementsByXpath(mainPageObjects.contactUsErrorMsgs);
        else
            elements = selenium.findElementsByXpath(mainPageObjects.popupErrorMsgs);

        selenium.verifyElementText(elements.get(0),illegalEmailMsg);
        selenium.verifyElementText(elements.get(1),illegalPhoneMsg);
    }

    /**
     * The function creates error messages for missing required form fields.
     * @param errorFields - The missing required text field value.
     * @return A list of error messages.
     */
    private List<String> fillErrorList(List<String>errorFields){
        List<String> newErrors = new ArrayList<>();
        for (String error : errorFields)
            newErrors.add(requiredFieldMsg.replace("*",error));
        return newErrors;
    }

    /**
     * The function verifies the integrity of the link buttons.
     */
    public void checkPageButtons(){
        List<WebElement> linkElements = mainPageObjects.outsidePageLinks;
        selenium.scrollToElement(linkElements.get(0));
        for(int i=0; i< linkElements.size();i++) {
            selenium.verifyElementLink(linkElements.get(i),outsidePageLinks.get(i));
            selenium.verifyUnbrokenLink(linkElements.get(i));
        }

        //Verify "Back To Top" button.
        selenium.clickOnElement(mainPageObjects.scrollUpBtn);
        Assert.isTrue(selenium.getPageYOffset() == 0,"Fail! - Scroll to top button is not working");
    }
}
