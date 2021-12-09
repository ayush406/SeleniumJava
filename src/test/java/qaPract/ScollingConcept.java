package qaPract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;




public class ScollingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUpdated b1 = new BrowserUpdated();

		WebDriver driver = b1.WebLaunch("https://www.rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,350)");
		js.executeScript("document.querySelector('div.tableFixHead').scrollTop=200");

		List<WebElement> l1 =driver.findElements(By.cssSelector("div.tableFixHead td:nth-child(4)"));
		int sum =0;

		for(WebElement l:l1)
		{
//			l.getText();
			sum = sum +Integer.parseInt(l.getText());
		}
		System.out.println(sum);

		String total = driver.findElement(By.cssSelector("div.totalAmount")).getText().split(":")[1].trim();

		int t1 = Integer.parseInt(total);

		Assert.assertEquals(sum, t1);
	}

}
