package qaPract;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalEnvVar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ayush\\eclipse-workspace\\QAPract\\src\\test\\java\\qaPract\\data.properties");

		p.load(fis);

		System.out.println(p.getProperty("User"));
		p.setProperty("User", "Ayush Dev");
		System.out.println(p.getProperty("User"));

		FileOutputStream fos = new FileOutputStream("C:\\Users\\ayush\\eclipse-workspace\\QAPract\\src\\test\\java\\qaPract\\data.properties");
		p.store(fos, null);

	}

}
