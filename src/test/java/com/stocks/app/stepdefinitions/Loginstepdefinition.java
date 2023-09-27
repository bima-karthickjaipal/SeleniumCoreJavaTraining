package com.stocks.app.stepdefinitions;

import Day3.BaseClass;
import Day3.ListenerTest;
import Day3.loginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Listeners(ListenerTest.class)

public class Loginstepdefinition extends Hooks {
    loginPage loginpage;
    WebDriver driver;

   /* @Before
    public void setUp()
    {
        driver= BaseClass.launchBrowser();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }*/

    @Given("User is on login page")
    public void user_is_on_login_page() {
        driver= Hooks.launchApplication();
        driver.getCurrentUrl();

    }

    @When("Enter valid username and password")
    public void enter_valid_username_and_password() {
        loginpage= new loginPage(driver);
        loginpage.setUsername("admin");
        loginpage.setPassword("admin");
    }

    @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void I_enter_Username_as_and_Password_as(String username, String password) {
        loginpage= new loginPage(driver);
        loginpage.setUsername(username);
        loginpage.setPassword(password);
    }

   /* @When("^I enter$")
    public void i_enter(DataTable user_credentials) {
        List<List<String>> obj= user_credentials.asLists();
        loginpage= new loginPage(driver);
        loginpage.setUsername(obj.get(0).get(0));
        loginpage.setPassword(obj.get(0).get(1));

    }*/

    @When("Enter valid username and Invalid password")
    public void enter_valid_username_and_invalid_password() {
        loginpage= new loginPage(driver);
        loginpage.setUsername("admin");
        loginpage.setPassword("admin123");
    }

    @When("Enter Invalid username and valid password")
    public void enter_invalid_username_and_valid_password() {
        loginpage= new loginPage(driver);
        loginpage.setUsername("admin123");
        loginpage.setPassword("admin");
    }

    @When("Enter Invalid username and Invalid password")
    public void enter_invalid_username_and_invalid_password() {
        loginpage= new loginPage(driver);
        loginpage.setUsername("admin123");
        loginpage.setPassword("admin123");
    }

    @And("Clicks on submit button")
    public void clicks_on_submit_button() {
        loginpage.clickSubmit();
    }

    @Then("User navigates to Dashboard screen.")
    public void user_navigates_to_dashboard_screen() {
        String expected1 = "https://stock.scriptinglogic.org/dashboard.php";

        String actual1 = "";
        try {
            Thread.sleep(3000);
            actual1 = driver.getCurrentUrl();
            System.out.println("Actual :"+actual1);
            System.out.println("Expected :"+expected1);

        } catch (Exception e) {
        }
        if(actual1.equalsIgnoreCase(expected1))
        {
            System.out.println("Entering this method");
            System.out.println("Actual :"+actual1+ " :: "+"Expected :"+expected1);
            Reporter.log("LoginTestcasePassed");
        }
        else
        {
            if (loginpage.isErrorMessageDisplayed()) {
                String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
                String fileName = "IMG" + timeStamp + ".png";
                TakesScreenshot ts = (TakesScreenshot) driver;
                File file = ts.getScreenshotAs(OutputType.FILE);
                try {
                    FileUtils.copyFile(file, new File("/Users/user/Desktop/ReportsAndScreenshots/" + fileName));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else
            {
                Reporter.log("Screenshot is not appropriate to the use case testing");
            }
        }
        driver.close();
    }

    @Given("validate the browser")
    public void validateTheBrowser() {
        System.out.println("Browser is validated");

    }

    @When("Browser is triggered")
    public void browserIsTriggered() {
        System.out.println("Browser is Triggered");
    }

    @Then("check if browser is started")
    public void checkIFBrowserISStarted() {
        System.out.println("Browser is Started");
    }



    /*@After
    public void tearDown()
    {
        driver.close();
    }*/


}
