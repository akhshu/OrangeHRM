package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utilities {

	
	public static String readConfig(String tagname) {
		Properties prop = new Properties();
		String value = null;
		try {
			File file = new File("C:\\Users\\akhilesh\\eclipse-workspace\\OrangeHRM\\src\\Configuration\\config.properties");
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}

			value = prop.getProperty(tagname);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
}
