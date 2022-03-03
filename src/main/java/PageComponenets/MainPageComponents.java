package PageComponenets;
import PageObjects.MainPageObjects;
import Shared.BaseComponents;



public class MainPageComponents extends BaseComponents {

    private MainPageObjects mainPageObjects = new MainPageObjects();


    public void fillHelpForm(String name, String email, String phone){
        selenium.elementSendText(mainPageObjects.helpFormNameTextBox,name);
        selenium.elementSendText(mainPageObjects.helpFormEmailTextBox,email);
        selenium.elementSendText(mainPageObjects.helpFormPhoneTextBox,phone);
    }


}
