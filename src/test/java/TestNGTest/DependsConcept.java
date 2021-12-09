package TestNGTest;

import org.testng.annotations.Test;

public class DependsConcept {


	@Test(dependsOnMethods= {"login"})
	public void demo1()
	{
		System.out.println("this is to check depends method.");
	}


	@Test
	public void login()
	{
		System.out.println("This is login");
	}

	@Test(dependsOnMethods= {"demo1"})
	public void logout()
	{
		System.out.println("this is logout");
	}
}
