package PageObjs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooHome {
	
	WebDriver driver;
	
	public YahooHome(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By username = By.cssSelector("input#login-username");
	
	By stayLogin = By.cssSelector("label[for='persistent']");
	
	By creacc = By.linkText("Create an account");
	
	public WebElement user()
	{
		return driver.findElement(username);
	}
	
	public WebElement stay()
	{
		return driver.findElement(stayLogin);
	}
	
	public WebElement create()
	{
		return driver.findElement(creacc);
	}

}
