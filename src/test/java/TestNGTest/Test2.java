package TestNGTest;

import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void m2()
	{
		System.out.println("This is test2 method.");
	}

	@Test(groups = {"Smoke"})
	public void method2()
	{
		System.out.println("this is test2 second method./smoke");
	}
}
