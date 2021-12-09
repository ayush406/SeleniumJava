package PageObjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccNew {

	WebDriver driver;
	
	public CreateAccNew(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement fName;
	
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lName;
	
	
	@FindBy(css="input#usernamereg-yid")
	WebElement eAdd;
	
	public WebElement firstName()
	{
		return fName;
	}
	public WebElement lastName()
	{
		return lName;
	}
	public WebElement email()
	{
		return eAdd;
	}
	
	
}
