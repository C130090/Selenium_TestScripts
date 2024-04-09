package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D://Automation Tester//Eclipse IDE for Enterprise Java and Web Developers//chromedriver-win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.findElement(By.id("onetrust-accept-btn-handler")).click(); //accept advertisement
		
		driver.findElement(By.xpath("//*[@id=\"1707962206997_xa6\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
		Thread.sleep(4000);
		
		Set <String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator <String> iterator = windowhandles.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		
		driver.switchTo().window(childWindow);
		
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Jack");
		driver.findElement(By.name("UserLastName")).sendKeys("Lee");

	}
}
