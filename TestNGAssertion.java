package ui;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestNGAssertion {

	@Test
	public void AssertionTest() {
		
		SoftAssert softassert = new SoftAssert();
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D://Automation Tester//Eclipse IDE for Enterprise Java and Web Developers//chromedriver-win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		
		 //System.out.println(driver.getTitle());
		
		 String expectedTitle1 = "Amazon.com. Spend less. Smile more.";
		 String expectedTitle2 = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		 String actualTitle = driver.getTitle(); 
		 softassert.assertEquals(expectedTitle1, actualTitle, "Title Verification Failed 1");
		 softassert.assertEquals(expectedTitle2, actualTitle, "Title Verification Failed 2");
		 softassert.assertAll();
	}
	
	

}
