package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D://Automation Tester//Eclipse IDE for Enterprise Java and Web Developers//chromedriver-win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
	}
}
