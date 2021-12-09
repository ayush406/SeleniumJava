package qaPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://users//ayush//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		BrowserCall b1 = new BrowserCall();
		Actions a = new Actions(driver);
		b1.launch(driver, "https://jqueryui.com/droppable/");

		System.out.println(driver.findElements(By.tagName("iframe")).size());

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		WebElement draggable = driver.findElement(By.cssSelector("div#draggable"));
		WebElement droppable = driver.findElement(By.cssSelector("div#droppable"));

		a.dragAndDrop(draggable, droppable).build().perform();
		driver.switchTo().defaultContent();
	}

}
