package TestNGTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuiteAnn {

	@BeforeSuite
	public void SuiteTest()
	{
		System.out.println("This is a before suite method.");
	}

	@Test
	public void T()
	{
		System.out.println("this is an ordinary test inside Suite Test");
	}

	@BeforeTest
	public void BefTest()
	{
		System.out.println("This is a before test method.");
	}


	@BeforeClass
	public void befC()
	{
		System.out.println("This is a before class method for Suite Class");
	}

	@AfterTest
	public void AftTest()
	{
		System.out.println("this is AfterTest method.");
	}

	@Test
	public void T1()
	{
		System.out.println("this is a normal test method");
	}



	public void AfC()
	{
		System.out.println("This is a after class method for Suite Class");
	}

	@BeforeMethod
	public void Befm()
	{
		System.out.println("This is before method test");
	}

	@AfterMethod
	public void AftM()
	{
		System.out.println("This is After Method test.");
	}
	@AfterSuite
	public void AfterSui()
	{
		System.out.println("This is After Suite method.");
	}
}
