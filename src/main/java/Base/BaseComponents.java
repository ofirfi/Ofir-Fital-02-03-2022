package Base;


import Selenium.Selenium;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseComponents {
    protected Selenium selenium = Selenium.getSelenium();

    protected void sleep(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }
        catch(Exception e){}
    }

    public void goToPage(String url){
        selenium.goToURL(url);
        selenium.verifyPageURL(url);
    }

    /**
     * The function verifies the integrity of link elements.
     * @param linkElements The list of link elements.
     * @param urlLinks The list of the expected URLs.
     */
    public void checkUnbrokenLinks(List<WebElement>linkElements, List<String> urlLinks){
        for(int i=0; i< linkElements.size();i++) {
            selenium.verifyElementLink(linkElements.get(i),urlLinks.get(i));
            selenium.verifyUnbrokenLink(linkElements.get(i));
        }
    }
}
