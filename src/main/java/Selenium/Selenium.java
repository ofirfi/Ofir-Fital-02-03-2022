package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
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


    /**
     * The function gets the page Y axis offset.
     * @return The Y axis offset of the current page state.
     */
    public Long getPageYOffset(){
        try{
            Thread.sleep(500);
        }
        catch(Exception e){}
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        return ((Number)executor.executeScript("return window.pageYOffset;")).longValue();
    }

    /**
     * The function verifies the element's link URL.
     * @param element The element to verify the URL.
     * @param link The expected URL.
     */
    public void verifyElementLink(WebElement element,String link){
        Assert.isTrue(element.getAttribute("href").equals(link),"Error! - Wrong link");
    }


    public String getLinkUrl(WebElement element){
        return element.getAttribute("href");
    }

    /**
     * The function verifies integrity of the element's URL.
     * @param element The element to verify the link.
     */
    public void verifyUnbrokenLink(WebElement element){
        HttpURLConnection connection = null;
        String url = getLinkUrl(element);
        int responseCode;
        try {
            connection = (HttpURLConnection)new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            responseCode = connection.getResponseCode();

            if(responseCode >= 400)
                System.out.println(url + " is not valid. Response Code: " + responseCode);
        }
        catch (Exception e){
            System.out.println(e.getStackTrace() + "\t" +url);
        }
    }

}
