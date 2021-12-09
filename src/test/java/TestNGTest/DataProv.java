package TestNGTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv {


	@DataProvider(name="data")
	public Object[][] getdata()
	{
		Object[][] newData = new Object[3][2];

		newData[0][0] = "Ayush";
		newData[0][1] = "Chaudhary";

		newData[1][0] = "Jay";
		newData[1][1] = "Shetty";

		newData[2][0] = "har";
		newData[2][1] = "shri";

		return newData;
	}

	@Test(dataProvider="data")
	public void use(String name, String lname)
	{
		System.out.println(name+" "+lname);
	}

}
