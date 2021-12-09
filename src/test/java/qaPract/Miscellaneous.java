package qaPract;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Miscellaneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver","C://users//ayush//chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		BrowserUpdated b1 = new BrowserUpdated();
		WebDriver driver = b1.WebLaunch("https://www.rahulshettyacademy.com/AutomationPractice/");

		int a = driver.findElements(By.tagName("a")).size();
		System.out.println(a);

		WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));

		System.out.println(footer.findElements(By.tagName("a")).size());

		WebElement row = driver.findElement(By.xpath("(//div[@id='gf-BIG']//ul)[1]"));

		System.out.println(row.findElements(By.tagName("a")).size());

		for(int i=1; i<row.findElements(By.tagName("a")).size(); i++)
		{
			String clickLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			driver.findElements(By.cssSelector("li.gf-li a")).get(i).sendKeys(clickLink);
		}

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> it = s1.iterator();

		while(it.hasNext())
		{
			String s = it.next();
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
//			driver.getTitle();
		}


	}

}
