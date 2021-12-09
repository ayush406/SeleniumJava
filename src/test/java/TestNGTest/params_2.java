package TestNGTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class params_2 {


	@Parameters({"URL", "user"})
	@Test
	public void param2(String url, String username)
	{
		System.out.println(url+" and "+username);
	}
}
