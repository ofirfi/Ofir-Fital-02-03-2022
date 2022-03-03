package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import net.jodah.failsafe.internal.util.Assert;

import java.time.Duration;
import java.util.List;


public class Selenium {
    private static Selenium selenium;
    private WebDriver driver;


    private Selenium(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
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

    public String getURL(){
        return driver.getCurrentUrl();
    }

    public void close(){
        driver.close();
    }


    public void clickOnElement(WebElement element){
        element.click();
    }

    public void verifyElementText(WebElement element,String text){
        Assert.isTrue(getElementText(element).equals(text),"Error! - Element does not contains the text:" + text);
    }

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



}
