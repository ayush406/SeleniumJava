package TestNGTest;

import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void m3()
	{
		System.out.println("this is test3 method.");
	}

	@Test(groups = {"Smoke"})
	public void method1()
	{
		System.out.println("this is test3 second method./smoke");
	}

}
