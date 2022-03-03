package PageComponenets;

import PageObjects.ThankYouPageObjects;
import Shared.BaseComponents;

public class ThankYouPageComponents extends BaseComponents {

    private ThankYouPageObjects thankYouPageObjects = new ThankYouPageObjects();

    protected String url = "https://automation.herolo.co.il/thank-you/";
    private String thankYouMsg = "הנתונים התקבלו בהצלחה, ניצור קשר ממש בקרוב…";


    public void verifyPage(){
        selenium.verifyElementText(thankYouPageObjects.thankYouMsg,thankYouMsg);
    }


}
