package qaPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ixigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://users//ayush//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		BrowserCall b1 = new BrowserCall();

		b1.launch(driver, "https://www.ixigo.com/");

		driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
//		driver.findElement(By.xpath("//div[contains(@class,'dstn')]//input[contains(@class,'u-v-align-middle') and contains(@placeholder,'airport')]")).click();

		String date = driver.findElement(By.xpath("//div[@class='rd-month']//div[@class='rd-month-label']")).getText();


		while(!(date.contains("April")))
		{
			driver.findElement(By.xpath("//button[contains(@class,'rd-next')]")).click();
			date = driver.findElement(By.xpath("//div[@class='rd-month']//div[@class='rd-month-label']")).getText();
			System.out.println(date);

		}

		driver.findElement(By.xpath("//td[@class='rd-day-body']//div[text()='23']")).click();
	}

}
