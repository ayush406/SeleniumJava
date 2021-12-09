package TestNGTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentrep {

	ExtentReports r;
	@BeforeTest
	public void rep()
	{
		
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Test Automation results");
		reporter.config().setDocumentTitle("Extent Reports");
		r = new ExtentReports();
		r.attachReporter(reporter);
		r.setSystemInfo("QA", "Mr. Ayush");
	}
	
	@Test
	public void genR()
	{
		ExtentTest test = r.createTest("genR");
		System.setProperty("webdriver.chrome.driver", "C://users//ayush//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.getTitle();
	
		test.fail("Results donot match");
		
		r.flush();
	}
}
