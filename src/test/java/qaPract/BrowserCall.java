package qaPract;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class BrowserCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub




	}

	public void launch(WebDriver driver, String url)
	{
//		System.setProperty("webdriver.chrome.driver","C://users//ayush//chromedriver.exe");
//		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
