package qaPract;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2EAir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://users//ayush//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("IND");

		List<WebElement> L1 = driver.findElements(By.cssSelector("li.ui-menu-item"));

		for(int i=0; i<L1.size(); i++)
		{
			String name = driver.findElements(By.cssSelector("li.ui-menu-item")).get(i).getText();

			if(name.equalsIgnoreCase("IndiA"))
			{
				driver.findElements(By.cssSelector("li.ui-menu-item")).get(i).click();
				break;
			}
		}

		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Hyderabad')]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[contains(text(),'Delhi')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
		String op = driver.findElement(By.cssSelector("div#Div1")).getAttribute("style");
		System.out.println(op);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

		if(op.contains("0.5"))
		{
			System.out.println("return date field is disabled.");
		}
		else
			System.out.println("return date field is enabled.");

		driver.findElement(By.xpath("(//div[@id='divpaxinfo'])[1]")).click();

		driver.findElement(By.cssSelector("span#hrefIncAdt")).click();

		WebElement drop = driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));

		Select s1 = new Select(drop);

		s1.selectByVisibleText("USD");



	}

}
