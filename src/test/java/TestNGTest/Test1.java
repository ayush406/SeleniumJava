package TestNGTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {


	@Test(groups = {"Smoke"})
	public void m1(String url, String username)
	{
		System.out.println("this is test1 method./smoke " +url+" and "+username);
	}

	@Test
	public void method1()
	{
		System.out.println("this is test1 second method.");
	}
	@Test
	public void method12()
	{
		System.out.println("this is test1 second method.");
	}

	@Test(groups = {"Smoke"})
	public void method13()
	{
		System.out.println("this is test1 second method./smoke");
	}


	@AfterClass
	public void AftClass()
	{
		System.out.println("this is after class method in Test1 Class.");
	}


	@BeforeClass
	public void BefClass()
	{
		System.out.println("this is before class method in Test1 Class.");
	}

	@Test
	public void method14()
	{
		System.out.println("this is test1 second method.");
	}

	@Test
	public void method15()
	{
		System.out.println("this is test1 second method.");
	}


}
