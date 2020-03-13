package New_Java.Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Learn_Properties {

	public static void main(String[] args) throws IOException {
	
		Properties abc = new Properties();
		
		FileInputStream input = new FileInputStream("E:\\Maven_New\\Selenium\\src\\main\\java\\New_Java\\Selenium\\IP_file");
		
		abc.load(input);
		String value = abc.getProperty("Browser");
		
		System.out.println(value);
		
		FileOutputStream OP = new FileOutputStream("E:\\Maven_New\\Selenium\\src\\main\\java\\New_Java\\Selenium\\OP_file");
		
		abc.setProperty("Cat", "Kill");
		abc.setProperty("Boy", "Girl");
		abc.store(OP, "nan thana");
		
		

	}


}
