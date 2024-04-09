package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D://Automation Tester//Eclipse IDE for Enterprise Java and Web Developers//chromedriver-win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		JavascriptExecutor jsexec = (JavascriptExecutor) driver;
		
		//Print title of page
		String script = "return document.title;";
		String title = (String) jsexec.executeScript(script);
		System.out.println(title);
		
		//Click button
		driver.switchTo().frame("iframeResult");
		jsexec.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//highlight
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jsexec.executeScript("arguments[0].style.border='3px solid red'", button);
		
		//Navigate and Scroll
		driver.navigate().to("https://www.w3schools.com/");
		WebElement certifiedbutton = driver.findElement(By.xpath("//*[@id=\"main\"]//div[1]/a[3]"));
		jsexec.executeScript("arguments[0].scrollIntoView(true)", certifiedbutton);
	}

}
