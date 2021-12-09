package TestNGTest;

import org.testng.annotations.Test;

	public class DataProvDiff {


		@Test(dataProvider="data", dataProviderClass=DataProv.class)
		public void get(String user, String l)
		{
		 System.out.println(user+ " "+l);

		}

}