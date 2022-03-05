package Tests;

import org.junit.Test;
import PageComponenets.ThankYouPageComponents;
import PageComponenets.MainPageComponents;
import org.junit.FixMethodOrder;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class MainPageTests extends BaseTests{

    MainPageComponents mainPageComponents = MainPageComponents.getMainPageComponents();
    ThankYouPageComponents thankYouPageComponents = ThankYouPageComponents.getThankYouPageComponents();


    /**
     * The function tests "How to help" form E2E process.
     */
    @Test
    public void a_HelpFormE2ETest(){
        mainPageComponents.goToPage(mainPageComponents.getPageURL());
        mainPageComponents.fillHelpForm("Automation","Automation@Test.com","0501234567");
        mainPageComponents.sendHelpForm();
        thankYouPageComponents.verifyPage();
    }

    /**
     * The function tests "How To Help" form fields validation error messages.
     */
    @Test
    public void b_HelpFormValidationTest(){
        mainPageComponents.goToPage(mainPageComponents.getPageURL());
        mainPageComponents.sendHelpForm();
        mainPageComponents.MissingRequiredFieldsErrorsCheck(MainPageComponents.FormType.HELP_FORM);
        mainPageComponents.fillHelpForm("Automation","Automation@Test","Ab12#");
        mainPageComponents.invalidFieldsErrorCheck(MainPageComponents.FormType.HELP_FORM);
    }

    /**
     * The function tests "Contact us" form E2E process.
     */
    @Test
    public void c_ContactUsFormE2ETest(){
        mainPageComponents.goToPage(mainPageComponents.getPageURL());
        mainPageComponents.scrollDownToContactForm();
        mainPageComponents.fillContactUsForm("Automation","Test","Automation@Test.com","0501234567");
        mainPageComponents.sendContactUsForm();
        thankYouPageComponents.verifyPage();
    }

    /**
     * The function tests "Contact Us" form fields validation error messages.
     */
    @Test
    public void d_ContactUsValidationTest(){
        mainPageComponents.goToPage(mainPageComponents.getPageURL());
        mainPageComponents.scrollDownToContactForm();
        mainPageComponents.sendContactUsForm();
        mainPageComponents.MissingRequiredFieldsErrorsCheck(MainPageComponents.FormType.CONTACT_US_FORM);
        mainPageComponents.fillContactUsForm("Automation","Test","Automation@Test","Ab12#");
        mainPageComponents.invalidFieldsErrorCheck(MainPageComponents.FormType.CONTACT_US_FORM);
    }

    /**
     * The function tests the page buttons.
     */
    @Test
    public void e_MainPageButtonsCheckTest(){
        mainPageComponents.goToPage(mainPageComponents.getPageURL());
        mainPageComponents.checkPageButtons();
    }

    /**
     * The function tests the popup E2E process.
     */
    @Test
    public void f_PopupE2ETest(){
        mainPageComponents.goToPage(mainPageComponents.getPageURL());
        mainPageComponents.getPopup();
        mainPageComponents.fillPopupForm("Automation","Automation@Test.com","0501234567");
        mainPageComponents.sendPopup();
        thankYouPageComponents.verifyPage();
    }
}
