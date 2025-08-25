package com.Member4Task;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    // synchronized to avoid thread issues
    public synchronized static ExtentReports getExtentReports() {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/reports/ExtentReport.html";
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);

            sparkReporter.config().setReportName("Demo Web Shop Automation Report");
            sparkReporter.config().setDocumentTitle("Automation Execution Report");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);

            // Add system info
            extent.setSystemInfo("Project", "Demo Web Shop");
            extent.setSystemInfo("Tester", "Member 4");
        }
        return extent;
    }
}
