package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D://Automation Tester//Eclipse IDE for Enterprise Java and Web Developers//chromedriver-win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();


	}
}
