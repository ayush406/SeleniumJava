package PageObjs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooCreateAcc {
	
	
	WebDriver driver;
	
	public YahooCreateAcc(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By fname = By.xpath("//input[@name='firstName']");
	By lName = By.xpath("//input[@name='lastName']");
	By eAdd = By.cssSelector("input#usernamereg-yid");
	By pass = By.cssSelector("input#usernamereg-password");
	By phN = By.cssSelector("input#usernamereg-phone");
	
	public WebElement firstName()
	{
		return driver.findElement(fname);
	}
	public WebElement lastName()
	{
		return driver.findElement(lName);
	}
	public WebElement email()
	{
		return driver.findElement(eAdd);
	}
	public WebElement password()
	{
		return driver.findElement(pass);
	}
	public WebElement phone()
	{
		return driver.findElement(phN);
	}
}
