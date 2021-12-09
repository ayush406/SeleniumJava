package qaPract;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Windowshandle_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUpdated b1 = new BrowserUpdated();

		WebDriver driver = b1.WebLaunch("http://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();

		driver.findElement(By.linkText("Click Here")).click();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> it = s1.iterator();

		String pid = it.next();
		String cid = it.next();

		driver.switchTo().window(cid);
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());

		driver.switchTo().window(pid);

		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());

	}

}
