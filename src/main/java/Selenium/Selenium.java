package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


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


}
