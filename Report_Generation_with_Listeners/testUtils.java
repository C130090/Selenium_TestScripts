package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest;

public class testUtils extends BaseTest{
	
	public String getScreenshotfilename() {
		Date currentdate = new Date();
		String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		
		return screenshotfilename;
	}
	
	public void getScreenshot() throws IOException{
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + getScreenshotfilename() + ".png"));
	}
}
