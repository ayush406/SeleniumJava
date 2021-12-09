package qaPract;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		BrowserUpdated b1 = new BrowserUpdated();

		WebDriver driver = b1.WebLaunch("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> fRow = driver.findElements(By.cssSelector("div#gf-BIG td:nth-child(2) a"));

		SoftAssert a = new SoftAssert();

//		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();

		for(WebElement row: fRow)
		{
			String url = row.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();

			conn.setRequestMethod("HEAD");
			conn.connect();
			int code = conn.getResponseCode();
			System.out.println(code);
			a.assertTrue(code<400, row.getText());
		}
		a.assertAll();




	}

}
