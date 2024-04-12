package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.testUtils;

public class Listeners extends testUtils implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is - " + result.getName());
		System.out.println("Test case is starting");
	}
	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of execution is - " + result.getStatus());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed - screenshot captured");
		try {
			getScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.setProperty("org.uncommons.reportng.escape-output", "false"); //from -- https://reportng.uncommons.org/
		Reporter.log("<a href=\"D:\\Automation Tester\\Eclipse IDE for Enterprise Java and Web Developers\\eclipse-workspace\\SeleniumTesting\\screenshot\\" + getScreenshotfilename() + ".png\">Test Results</a>");
	}
	
	public void onTestSkipped(ITestResult result) {
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}
	
	public void onFinish(ITestContext context) {
		
	}
}
