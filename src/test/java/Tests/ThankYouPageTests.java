package Tests;

import org.junit.Test;
import PageComponenets.ThankYouPageComponents;
import PageComponenets.MainPageComponents;


public class ThankYouPageTests extends BaseTests {

    MainPageComponents mainPageComponents = MainPageComponents.getMainPageComponents();
    ThankYouPageComponents thankYouPageComponents = ThankYouPageComponents.getThankYouPageComponents();

    /**
     * The function tests the page buttons.
     */
    @Test
    public void thankYouPageButtonsCheckTest(){
        thankYouPageComponents.goToPage(thankYouPageComponents.getPageUrl());
        thankYouPageComponents.checkPageLinksAndButtons();
        mainPageComponents.verifyPage();
    }



}
