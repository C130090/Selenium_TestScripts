package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D://Automation Tester//Eclipse IDE for Enterprise Java and Web Developers//chromedriver-win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_forms.asp");
		driver.manage().window().maximize();
		
		int checkboxSize = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(checkboxSize);
		
		// Focus on elements not in page view
		WebElement element = driver.findElement(By.id("html"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);
		
		checkboxSize += 1;
		for (int i=1; i<checkboxSize; i++) {
			driver.findElement(By.id("vehicle"+i)).click();
			Thread.sleep(1000);
		}

//		Thread.sleep(5000);
//		driver.findElement(By.id("vehicle1")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("vehicle2")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("vehicle3")).click();
		
	}
}
