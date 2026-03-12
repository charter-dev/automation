package com.proj.automation.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.proj.automation.base.DriverFactory;
import com.proj.automation.util.ReportManager;
import com.proj.automation.util.ScreenshotUtil;

public class WebsiteTest {
	String[] websites = {
            "https://google.com",
            "https://github.com",
            "https://stackoverflow.com",
            "https://news.ycombinator.com"
    };

    @Test
    public void testWebsites(){

        ExtentReports report = ReportManager.getReport();

        for(String site : websites){

            ExtentTest test = report.createTest("Testing " + site);

            WebDriver driver = DriverFactory.createDriver();

            try{

                driver.get(site);

                Thread.sleep(3000);

                String screenshot =
                        ScreenshotUtil.capture(driver,
                                site.replace("https://",""));

                test.pass("Website loaded")
                        .addScreenCaptureFromPath(screenshot);

            }catch(Exception e){

                test.fail(e);

            }finally{

                driver.quit();

            }

        }

        report.flush();
    }

}
