package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D://Automation Tester//Eclipse IDE for Enterprise Java and Web Developers//chromedriver-win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println(alltags.size());
		
		for(int i=0; i<alltags.size(); i++) {
			System.out.println("Links on page are " + alltags.get(i).getAttribute("href"));
			System.out.println("Links on page are " + alltags.get(i).getText());
		}
		
		
		Thread.sleep(5000);
		driver.close();
	}
}
