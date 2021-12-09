package qaPract;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUpdated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public WebDriver WebLaunch(String url)
	{

		System.setProperty("webdriver.chrome.driver","C://users//ayush//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;
	}
}
