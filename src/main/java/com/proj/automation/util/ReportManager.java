package com.proj.automation.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportManager {
	
	public static ExtentReports extent;

    public static ExtentReports getReport(){

        if(extent == null){

            ExtentSparkReporter spark =
                    new ExtentSparkReporter("reports/test-report.html");

            extent = new ExtentReports();
            extent.attachReporter(spark);

        }

        return extent;
    }

}
