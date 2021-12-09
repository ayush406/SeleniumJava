package qaPract;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotCapture {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BrowserUpdated b1 = new BrowserUpdated();
		WebDriver driver = b1.WebLaunch("https://facebook.com");

		File fl = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl, new File(""));




	}

}
