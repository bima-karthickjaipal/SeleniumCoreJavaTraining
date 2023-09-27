package com.stocks.app.pages;

import Day3.BaseClass;
import Day3.ListenerTest;
import Day3.loginPage;
import com.sun.deploy.security.SelectableSecurityManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Listeners(ListenerTest.class)

public class Loginpage extends BaseClass {
 loginPage loginpage;

 @BeforeMethod
 public void launchApp() {
  driver= BaseClass.initialiseBrowser();
  driver.get("https://stock.scriptinglogic.org/");
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }

 @Test(priority=0, dataProvider ="getData")
 public void validateLoginWithValidCredentials(String Username, String Password) throws IOException {
  loginpage= new loginPage(driver);
  loginpage.setUsername(Username);
  loginpage.setPassword(Password);
  loginpage.clickSubmit();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  String expected = "Dashboard";
  String actual = "";
  try {
   // actual = driver.findElement(By.xpath("//*[@id='tabs']/li[1]/a")).getText();
   actual = driver.findElement(By.linkText("Dashboard")).getText();
  } catch (Exception e) {
  }
  // Assert.assertEquals( actual, expected, "Landed on Home Page by verifying the landing page webelement");


   String expected1 = "https://stock.scriptinglogic.org/dashboard.php";
   String actual1 = "";
   try {
    actual1 = driver.getCurrentUrl();
   } catch (Exception e) {
   }

   Assert.assertEquals( actual1, expected1, "Landed on home page by verifying the landing page url");

  /*String expected2 = "POSNIC - Dashboard";
  String actual2 = "";
  try {
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   actual2 = driver.getTitle();
  } catch (Exception e) {
  }
  Assert.assertEquals( actual2, expected2, "Landed on home page by verifying the title of the page");*/

}

    @AfterMethod
    public void closeBrowser(ITestResult result) throws IOException {
     if (result.getStatus() == ITestResult.FAILURE) {
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
      } else {
       Reporter.log("Screenshot is not appropriate to the use case testing");
      }

     }
     driver.close();
    }

    @DataProvider
   public Object[][] getData()
        {
         Object[][] data = new Object[2][2];
         data[0][0] = "admin";
         data[0][1] = "admin";
         data[1][0] = "admin123";
         data[1][1] = "admin123";
         return data;
        }


}
