package com.Member4Task;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestListener implements ITestListener {

    private static WebDriver driver;
    private static ExtentReports extent = ExtentManager.getExtentReports();

    public static void setDriver(WebDriver driverInstance) {
        driver = driverInstance;
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        ExtentTestManager.setTest(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTestManager.getTest().log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTestManager.getTest().log(Status.FAIL, result.getThrowable());

        if (driver != null) {
            String screenshotPath = ScreenshotUtil.captureScreenshot(driver, result.getMethod().getMethodName());
            try {
                ExtentTestManager.getTest().addScreenCaptureFromPath(screenshotPath);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
