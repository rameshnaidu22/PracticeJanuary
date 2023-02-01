package com.qa.listeners;

import com.aventstack.extentreports.Status;
import com.qa.reports.ExtentReport;
import org.apache.commons.codec.binary.Base64;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.startTest(result.getName(),result.getMethod().getDescription()).
                assignAuthor("ramesh").
                assignCategory("andriod");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentReport.getTest().log(Status.PASS,"Test Passed");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentReport.getTest().log(Status.FAIL,"Test Failed");
        byte[] encoded=null;
       // encoded= Base64.encodeBase64()
        ExtentReport.getTest().fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentReport.getTest().log(Status.SKIP,"Test Skipped");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReport.getReporter().flush();

    }
}
