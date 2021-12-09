package qaPract;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C://users//ayush//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String[] name = {"Brocolli", "Cucumber", "Beans"};

		List<String> s1 = Arrays.asList(name);

		List<WebElement> L1 = driver.findElements(By.cssSelector("h4.product-name"));

		int j=0;

		for(int i=0; i<L1.size(); i++)
		{

			String veggie = driver.findElements(By.cssSelector("h4.product-name")).get(i).getText().split(" ")[0];

			if(s1.contains(veggie))
			{
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				j++;
				if(j==name.length)
					break;
			}
		}

	}

}
