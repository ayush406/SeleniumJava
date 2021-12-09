package qaPract;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://users//ayush//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		BrowserCall b = new BrowserCall();

		b.launch(driver, "https://www.amazon.in/");


		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().sendKeys("Onyx").sendKeys(Keys.ENTER).doubleClick().build().perform();
	}

}
