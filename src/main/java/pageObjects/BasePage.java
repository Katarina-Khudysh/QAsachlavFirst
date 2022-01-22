package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
//    Elements
    WebDriver driver;

//    Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    Methods
    public void fillText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
    public void clickElement(WebElement element){
        element.click();
    }
    public String getElementText(WebElement element){
        return element.getText();
    }
    public void sleep(long mills){
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public boolean elementIsDisplayed(WebElement element){
        return  element.isDisplayed();
    }
    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
    public void tearDown(){
        driver.quit();
    }
}
