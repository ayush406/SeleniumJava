package qaPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUpdated b1 = new BrowserUpdated();

		WebDriver driver = b1.WebLaunch("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Nested Frames")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		System.out.println(driver.findElement(By.cssSelector("div#content")).getText());




	}

}
