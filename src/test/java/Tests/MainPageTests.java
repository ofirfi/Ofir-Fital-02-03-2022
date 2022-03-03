package Tests;

import PageComponenets.ThankYouPageComponents;
import org.junit.Test;
import PageComponenets.MainPageComponents;

public class MainPageTests extends BaseTests{

    MainPageComponents mainPageComponents = new MainPageComponents();
    ThankYouPageComponents thankYouPageComponents = new ThankYouPageComponents();

    /**
     * A function to check Form E2E
     */
    @Test
    public void helpFormE2ETest(){
        mainPageComponents.fillHelpForm("Ofir","Ofir@gmail.com","0501234567");
        mainPageComponents.sendHelpForm();
        thankYouPageComponents.verifyPage();
    }

    /**
     *
     */
    @Test
    public void hearMoreFormE2ETest(){
        mainPageComponents.fillHearMoreForm("Name","Automation","Name@Automation.com","0501234567");
        mainPageComponents.sendHearMoreForm();
        thankYouPageComponents.verifyPage();
    }

}
