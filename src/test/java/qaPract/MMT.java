package qaPract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MMT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUpdated b1 = new BrowserUpdated();
		WebDriver driver = b1.WebLaunch("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//li[@data-cy='account']")).click();

		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();

		String month = driver.findElement(By.cssSelector("div.DayPicker-Caption div")).getText();

//		System.out.println(month);

		while(!(month.contains("April")))
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			month = driver.findElement(By.cssSelector("div.DayPicker-Caption div")).getText();
		}

		List<WebElement> l1 = driver.findElements(By.xpath("//div[@class='dateInnerCell']"));

		for (WebElement element : l1) {
			String date = element.getText();
			if(date.contains("23"))
			{
				element.click();
				break;
			}
		}

	}

}
