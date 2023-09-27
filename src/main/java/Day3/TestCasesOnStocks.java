package Day3;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestCasesOnStocks {
 public static WebDriver driver = null;

 @BeforeMethod
 public void launchBrowser() {
  driver = new SafariDriver();
  driver.get("https://stock.scriptinglogic.org/");
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }

 @Test(priority=0)
 public void validateLoginWithValidCredentials() throws IOException {
  driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
  driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");
  driver.findElement(By.xpath("//input[@name='submit']")).click();

  String expected = "Dashboard";
  String actual = "";
  try {
   // actual = driver.findElement(By.xpath("//*[@id='tabs']/li[1]/a")).getText();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   actual = driver.findElement(By.linkText("Dashboard")).getText();
  } catch (Exception e) {
  }
  // Assert.assertEquals( actual, expected, "Landed on Home Page by verifying the landing page webelement");

  String expected1 = "https://stock.scriptinglogic.org/dashboard.php";
  String actual1 = "";
  try {
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   actual1 = driver.getCurrentUrl();
  } catch (Exception e) {
  }
  Assert.assertEquals( actual1, expected1, "Landed on home page by verifying the landing page url");

  String expected2 = "POSNIC - Dashboard";
  String actual2 = "";
  try {
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   actual2 = driver.getTitle();
  } catch (Exception e) {
  }
  Assert.assertEquals( actual2, expected2, "Landed on home page by verifying the title of the page");
  TakesScreenshot ts = (TakesScreenshot) driver;

  // 2. call getScreenshotAs() method using ts
  // store it into file object

  String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
  String fileName = "IMG"+timeStamp+".png";

  File scrFile = ts.getScreenshotAs(OutputType.FILE);

  // 3 . copy this file object into a real image file
  FileUtils.copyFile(scrFile,new File("/Users/user/Desktop/ReportsAndScreenshots/"+fileName));
}


    @Test(priority=1)
    public void validateLoginWithInValidCredentials() throws IOException {
     driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin123");
     driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin123");
     driver.findElement(By.xpath("//input[@name='submit']")).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     String expected1 = "https://stock.scriptinglogic.org/dashboard.php";
     String actual1 = "";
     try {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      actual1 = driver.getCurrentUrl();
     } catch (Exception e) {
     }
     TakesScreenshot ts = (TakesScreenshot) driver;

     // 2. call getScreenshotAs() method using ts
     // store it into file object

     String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
     String fileName = "IMG"+timeStamp+".png";

     File scrFile = ts.getScreenshotAs(OutputType.FILE);

     // 3 . copy this file object into a real image file
     FileUtils.copyFile(scrFile,new File("/Users/user/Desktop/ReportsAndScreenshots/"+fileName));
     Assert.assertNotEquals( actual1, expected1, "Not Landed on home page by verifying the landing page url");

    }

    @Test(priority=2)
    public void validateLoginWithNoCredentials() throws IOException {
     driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("");
     driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("");
     driver.findElement(By.xpath("//input[@name='submit']")).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     String expected2 = "POSNIC - Dashboard";
     String actual2 = "";
     try {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      actual2 = driver.getTitle();
     } catch (Exception e) {
     }
     TakesScreenshot ts = (TakesScreenshot) driver;

     // 2. call getScreenshotAs() method using ts
     // store it into file object

     String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
     String fileName = "IMG"+timeStamp+".png";

     File scrFile = ts.getScreenshotAs(OutputType.FILE);

     // 3 . copy this file object into a real image file
     FileUtils.copyFile(scrFile,new File("/Users/user/Desktop/ReportsAndScreenshots/"+fileName));
     Assert.assertNotEquals( actual2, expected2, "Not Landed on home page by verifying the title of the page");
    }

    @AfterMethod
    public void closeBrowser()
    {
     driver.close();
    }

}
