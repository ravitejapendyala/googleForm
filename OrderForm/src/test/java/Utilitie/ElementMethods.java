package Utilitie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.Assesment.tests.DriverBase;

public class ElementMethods {

    public void ClickElement(WebElement element){

        try
        {
            element.click();
        } catch (Exception e) {
        throw (e);
        }

    }

    public  void ClickElement(String xpath){
        try
        {
            WebElement element = DriverBase.getDriver().findElement(By.xpath(xpath));
            element.click();
        } catch (Exception e) {
            throw (e);
        }
    }
    public  void EnterData(String xpath,String text){
        try
        {
            WebElement element = DriverBase.getDriver().findElement(By.xpath(xpath));
            element.sendKeys(text);
        } catch (Exception e) {
            throw (e);
        }
    }
    public  void EnterData(WebElement element,String text){
        try
        {
            element.sendKeys(text);
        } catch (Exception e) {
            throw (e);
        }
    }

    public  boolean VerifyElementExists(WebElement element){
        try
        {
            element.isDisplayed();
            return  true;
        } catch (Exception e) {
            return  false;
        }
    }

    public  boolean VerifyElementExists(String xpath){
        try
        {
            WebElement element = DriverBase.getDriver().findElement(By.xpath(xpath));
            element.isDisplayed();
            return  true;
        } catch (Exception e) {
            return  false;
        }
    }
}
