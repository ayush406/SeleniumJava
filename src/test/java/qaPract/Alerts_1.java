package qaPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://users//ayush//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		BrowserCall b1 = new BrowserCall();

		b1.launch(driver,  "https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.cssSelector("input#name")).sendKeys("ayush");
		driver.findElement(By.cssSelector("input#alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

}
