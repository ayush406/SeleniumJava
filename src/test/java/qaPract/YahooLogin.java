package qaPract;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjs.CreateAccNew;
import PageObjs.YahooCreateAcc;
import PageObjs.YahooHome;

public class YahooLogin {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C://users//ayush//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fmail.yahoo.com%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		YahooHome y1 = new YahooHome(driver);
		
		y1.user().sendKeys("Hi! this is Ayush");
		y1.stay().click();
		y1.create().click();
		
//		YahooCreateAcc c = new YahooCreateAcc(driver);
//		
//		c.firstName().sendKeys("Ayush");
//		c.lastName().sendKeys("Chaudhary");
//		c.email().sendKeys("1235");
//		c.password().sendKeys("Pass@1234");
//		c.phone().sendKeys("9876543211");
		
		CreateAccNew c1 = new CreateAccNew(driver);
		
		c1.firstName().sendKeys("Ayush");
		c1.lastName().sendKeys("Chaudhary");
		c1.email().sendKeys("AyushChaudhary");
		
	}

}
