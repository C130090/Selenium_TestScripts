package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.BaseTest;

public class ReportGeneration extends BaseTest{

	@Test
	public void reportTest1() {
		System.out.println("This is test1");
		driver.get("https://salesforce.com");
		Assert.assertTrue(false);
	}

	@Test
	public void reportTest2() {
		Reporter.log("This is test2");
		System.out.println("This is test2");
	}
	
	@Test
	public void reportTest3() {
		System.out.println("This is test3");
	}
	
	@Test
	public void reportTest4() {
		System.out.println("This is test4");
	}
}
