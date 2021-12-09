package qaPract;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ayush\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		BrowserCall b1 = new BrowserCall();

		b1.launch(driver, "https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.className("blinkingText")).click();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> it = s1.iterator();

		String Pid = it.next();
		String Cid = it.next();

		driver.switchTo().window(Cid);
		String mail = driver.findElement(By.xpath("//p[contains(@class,'red')]")).getText().split("at")[1].trim().split(" ")[0];

		driver.switchTo().window(Pid);

		driver.findElement(By.cssSelector("input#username")).sendKeys(mail);

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));


	}

}
