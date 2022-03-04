package Tests;

import org.junit.Test;

import PageComponenets.ThankYouPageComponents;
import PageComponenets.MainPageComponents;

public class MainPageTests extends BaseTests{

    MainPageComponents mainPageComponents = new MainPageComponents();
    ThankYouPageComponents thankYouPageComponents = new ThankYouPageComponents();


    /**
     * The function tests "How to help" form E2E process.
     */
    @Test
    public void helpFormE2ETest(){
        mainPageComponents.goToPage();
        mainPageComponents.fillHelpForm("Automation","Automation@Test.com","0501234567");
        mainPageComponents.sendHelpForm();
        thankYouPageComponents.verifyPage();
    }


    /**
     * The function tests "How To Help" form fields validation error messages.
     */
    @Test
    public void helpFormValidationTest(){
        mainPageComponents.goToPage();
        mainPageComponents.sendHelpForm();
        mainPageComponents.MissingRequiredFieldsErrorsCheck(MainPageComponents.FormType.HELP_FORM);
        mainPageComponents.fillHelpForm("Automation","Automation@Test","Ab12#");
        mainPageComponents.invalidFieldsErrorCheck(MainPageComponents.FormType.HELP_FORM);
    }


    /**
     * The function tests "Contact us" form E2E process.
     */
    @Test
    public void contactUsFormE2ETest(){
        mainPageComponents.goToPage();
        mainPageComponents.scrollDownToContactForm();
        mainPageComponents.fillContactUsForm("Automation","Test","Automation@Test.com","0501234567");
        mainPageComponents.sendContactUsForm();
        thankYouPageComponents.verifyPage();
    }


    /**
     * The function tests "Contact Us" form fields validation error messages.
     */
    @Test
    public void contactUsValidationTest(){
        mainPageComponents.goToPage();
        mainPageComponents.scrollDownToContactForm();
        mainPageComponents.sendContactUsForm();
        mainPageComponents.MissingRequiredFieldsErrorsCheck(MainPageComponents.FormType.CONTACT_US_FORM);
        mainPageComponents.fillContactUsForm("Automation","Test","Automation@Test","Ab12#");
        mainPageComponents.invalidFieldsErrorCheck(MainPageComponents.FormType.CONTACT_US_FORM);
    }

}
