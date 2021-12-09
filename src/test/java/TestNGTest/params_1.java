package TestNGTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class params_1 {


	@Parameters({"URL"})
	@Test
	public void para1(String url)
	{
		System.out.println(url);
	}

	@Test
	public void para2()
	{
		System.out.println("");
	}
}
