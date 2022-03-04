package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;


public class Selenium {
    private static Selenium selenium;
    private WebDriver driver;
    private Actions actions;


    private Selenium(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        actions = new Actions(driver);
    }

    public static Selenium getSelenium(){
        if(selenium == null){
            selenium = new Selenium();
        }
        return selenium;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void goToURL(String url){
        driver.get(url);
    }

    public void close(){
        driver.close();
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

    /**
     * The function verifies element text value.
     * @param element The element to verify the text for.
     * @param text The text that's supposed to appear in the element.
     */
    public void verifyElementText(WebElement element,String text){
        Assert.isTrue(getElementText(element).equals(text),"Error! - Element does not contains the text:" + text);
    }

    /**
     * The function verifies number of elements and texts.
     * @param elements A list of elements to verify the texts.
     * @param texts A list of texts that appear in the elements.
     */
    public void verifyElementsTexts(List<WebElement> elements, List<String> texts){
        for (int i=0;i<elements.size();i++)
            verifyElementText(elements.get(i),texts.get(i));
    }

    public String getElementText(WebElement element){
        return element.getText();
    }

    public void elementSendText(WebElement element,String text){
        element.sendKeys(text);
    }

    /**
     * The function scrolls to a given element.
     * @param element The element to scroll to.
     */
    public void scrollToElement(WebElement element){
        actions.moveToElement(element).perform();
    }

    public List<WebElement> findElementsByXpath(By by){
            return driver.findElements(by);
    }
}
