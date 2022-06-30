package com.Assesment.tests.OrderRequest;

import Utilitie.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Assesment.tests.DriverBase;
import org.testng.asserts.SoftAssert;


public class OrderCreation extends DriverBase {

    ElementMethods elementMethods;
    public  OrderCreation(){
        elementMethods = new ElementMethods();
    }


    @Test(description="Verify positive workflow where when all required fields are populated , it should complete the order ")
    public void ValidateCreateOrder() throws Exception {
        WebDriver driver = getDriver();
        driver.get("https://docs.google.com/forms/d/11VwHLRVZPorB9VBiOqHn_KGnnf47ohXMxWh9dCJu6F4/viewform?edit_requested=true");

        // Select checkbox for item you would like to order?
        elementMethods.ClickElement("//div[@data-answer-value='Electronics and Computers']");

        // Select Yes radio button
        elementMethods.ClickElement("//div[@data-answer-value='Yes']");

        // Select Yes radio button
        elementMethods.ClickElement("//div[@data-answer-value='Yes']");


        // Enter name
        elementMethods.EnterData("//input[@type='text']","Sujith");


        // Upload a file
        elementMethods.ClickElement("//span[text()='Add file']");


        Thread.sleep(3000);
        elementMethods.ClickElement("//div[text()='Select files from your device']");
        elementMethods.EnterData("//div[text()='Select files from your device']","main/resources/File.docx");
        elementMethods.ClickElement("//div[@role='button' and text()='Upload']");


        // Set Favorite date
        elementMethods.EnterData("//input[@type='date']","2022-06-11");


        // Select preferred method of notification

        elementMethods.ClickElement("//div[@data-value='Phone']");


        // Enter email for updates

        elementMethods.EnterData("//input[@type='email']","sujith.csp15@gmail.com");

        // Click Next
        elementMethods.ClickElement("//span[text()='Next']");

        // Enter Phone Number
        elementMethods.EnterData("//input[@type='text']","1234567890");

        // Select option for SMS notification
        elementMethods.ClickElement("//div[@data-value='Yes']");

        // Submit form
        elementMethods.ClickElement("//span[text()='Submit']");

    }


    @Test(description = "Validate if mandatory fields are skipped & next button is clicked , then it should validate the presence of error  'This is a required question' ")
    public void ValidateErrors() throws Exception {
        WebDriver driver = getDriver();
        driver.get("https://docs.google.com/forms/d/11VwHLRVZPorB9VBiOqHn_KGnnf47ohXMxWh9dCJu6F4/viewform?edit_requested=true");

        // Select checkbox for item you would like to order?
        elementMethods.ClickElement("//div[@data-answer-value='Electronics and Computers']");

        // Select Yes radio button
        elementMethods.ClickElement("//div[@data-answer-value='Yes']");





        // Click Next
        elementMethods.ClickElement("//span[text()='Next']");

        // Verify 'This is a required question' error is displayed

        Assert.assertTrue(elementMethods.VerifyElementExists("//span[text()='This is a required question']"));

        // Enter Phone Number

    }

    @Test(description = "Validate if mandatory fields are skipped & next button is clicked , then it should validate the presence of error  'This is a required question' ")
    public void ValidateTestNGAsseert() throws Exception {
        WebDriver driver = getDriver();
        driver.get("https://www.facebook.com/");
        //Creating softAssert object
        SoftAssert softAssert = new SoftAssert();
        //Assertion failing
        softAssert.fail("Failing first assertion");
        System.out.println("Failing 1");

        Assert.assertTrue(false);

        //Assertion failing
        softAssert.fail("Failing second assertion");
        System.out.println("Failing 2");
        //Collates the assertion results and marks test as pass or fail
        softAssert.assertAll();

    }
}
