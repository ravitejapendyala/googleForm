package com.Assesment.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.Collections;

public class DriverBase {

static WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public static WebDriver getDriver()
    {
        if(driver==null){

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.setExperimentalOption("useAutomationExtension", false);
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();




        }
            return  driver;
    }

    @AfterSuite(alwaysRun = true)
    public static void QuitDriver() {
        if(driver!=null){
            driver.quit();
        }

    }
}
