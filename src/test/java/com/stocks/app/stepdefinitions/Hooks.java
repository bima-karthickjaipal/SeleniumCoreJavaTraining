package com.stocks.app.stepdefinitions;

import Day3.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends BaseClass {
    static WebDriver driver;

    @Before
    public static WebDriver launchApplication()
    {
        driver= BaseClass.initialiseBrowser();
        driver.get("https://stock.scriptinglogic.org/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    @After
    public void teardown()
    {

        driver.quit();
    }
}
