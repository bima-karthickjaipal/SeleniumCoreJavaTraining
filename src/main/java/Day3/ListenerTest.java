package Day3;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestMethodFinder;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ListenerTest implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(iTestResult.getName()+ "  is started for execution");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("The name of the testcase passed is :"+iTestResult.getName());

        /*BaseClass baseclass = new BaseClass();
        WebDriver driver= baseclass.launchBrowser();
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call getScreenshotAs() method using ts
        // store it into file object

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        // 3 . copy this file object into a real image file
        try {
            FileUtils.copyFile(scrFile,new File("/Users/user/Desktop/ReportsAndScreenshots/"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        System.out.println("The name of the testcase failed is :"+iTestResult.getName());

        /* BaseClass baseclass = new BaseClass();
        WebDriver driver= baseclass.launchBrowser();

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call getScreenshotAs() method using ts
        // store it into file object

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        // 3 . copy this file object into a real image file
        try {
            FileUtils.copyFile(scrFile,new File("/Users/user/Desktop/ReportsAndScreenshots/"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {}

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {}

    @Override
    public void onStart(ITestContext iTestContext) {}

    @Override
    public void onFinish(ITestContext iTestContext) {}
}
