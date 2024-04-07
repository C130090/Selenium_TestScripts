package ui;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//Advertisement included
public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D://Automation Tester//Eclipse IDE for Enterprise Java and Web Developers//chromedriver-win32//chromedriver.exe");
		ChromeOptions options  = new ChromeOptions();
		//options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.makemytrip.com/");

		// Time to remove advertisement
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Sydney");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		
		Thread.sleep(5000);
		driver.close();
	}
}



//driver.findElement(By.className("desktop in")).click();
//List<WebElement> alltags = driver.findElements(By.tagName("iframe"));
//
//System.out.println(alltags.size());
//
//for(int i=0; i<alltags.size(); i++) {
//	System.out.println("Links on page are " + alltags.get(i).getAttribute("id"));
//	System.out.println("Links on page are " + alltags.get(i).getText());
//}


//List<WebElement> alltags = driver.findElements(By.id("webengage-notification-container"));
//
//System.out.println(alltags.size());
//
//for(int i=0; i<alltags.size(); i++) {
//	System.out.println("Links on page are " + alltags.get(i).getAttribute("id"));
//	System.out.println("Links on page are " + alltags.get(i).getText());


//Thread.sleep(5000);
//driver.close();
//System.out.println("IFRAME checking: " + driver.findElements(By.tagName("iframe")));

//Store the web element
//WebElement iframe = driver.findElement(By.id("_we_wk_data_store"));
//driver.switchTo().frame(iframe);
//driver.findElement(By.className("desktop in")).click();
//driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")).click();
//driver.findElement(By.xpath("/html/body/div/div[2]/div/div/a"));

