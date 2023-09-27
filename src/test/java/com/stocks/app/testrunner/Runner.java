package com.stocks.app.testrunner;
import com.stocks.app.utils.ApplicationConfigReader;
import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

import static com.vimalselvam.cucumber.listener.Reporter.*;

// Cucumber HTML Reports

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/user/Documents/SeleniumCoreJavaTraining/src/test/resources/Features"} ,
        glue={"/com/stocks/app/stepdefinitions"},
        plugin= {"pretty", "html:target/cucumber-reports/reports.html",
        "junit:target/cucumber-reports/reports.xml","json:target/cucumber-reports/reports.json"}, monochrome = true,
        tags= "@Regression",
        dryRun = false
)

public class Runner {
   /*@AfterClass
    public static void writeExtentReport() {
           Reporter.loadXMLConfig(new File(ApplicationConfigReader.getInstance().getConfigReader().getReportConfigPath()));
       }*/
    }

