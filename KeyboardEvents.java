package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D://Automation Tester//Eclipse IDE for Enterprise Java and Web Developers//chromedriver-win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare");
		driver.manage().window().maximize();
		WebElement sourcetextarea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/pre/span"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.keyDown(sourcetextarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement destinationtextarea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[4]/pre/span"));
		Thread.sleep(2000);
		action.keyDown(destinationtextarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}

}
