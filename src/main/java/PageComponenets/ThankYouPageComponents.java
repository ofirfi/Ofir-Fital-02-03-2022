package PageComponenets;

import PageObjects.ThankYouPageObjects;
import Base.BaseComponents;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class ThankYouPageComponents extends BaseComponents {
    private ThankYouPageObjects thankYouPageObjects = new ThankYouPageObjects();
    public String pageUrl = "https://automation.herolo.co.il/thank-you/";
    private String thankYouMsg = "הנתונים התקבלו בהצלחה, ניצור קשר ממש בקרוב…";
    private List<String> urlLinks = Arrays.asList("https://herolo.co.il/",
            "https://www.facebook.com/Herolofrontend",
            "https://www.instagram.com/herolofrontend/",
            "https://www.linkedin.com/company/herolo/");


    private static ThankYouPageComponents thankYouPageComponents;

    private ThankYouPageComponents(){}
    public static ThankYouPageComponents getThankYouPageComponents(){
        if(thankYouPageComponents == null){
            thankYouPageComponents = new ThankYouPageComponents();
        }
        return thankYouPageComponents;
    }



    public void verifyPage(){
        selenium.verifyElementText(thankYouPageObjects.thankYouMsg,thankYouMsg);
    }


    /**
     * The function verifies the integrity of the link buttons.
     */
    public void checkPageLinksAndButtons(){
        List<WebElement> outSideElements = thankYouPageObjects.outsidePageLinks;
        checkUnbrokenLinks(outSideElements,urlLinks);
        selenium.clickOnElement(thankYouPageObjects.returnBtn);
    }
}
