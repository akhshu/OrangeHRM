package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import framework.Utilities;


public class BaseTest{
	
	public WebDriver driver;
	/**
	 * Launch application
	 */
	@BeforeTest
	public void launchApplication() {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumResource\\geckodriver.exe"); 
		 driver = new FirefoxDriver();
		 String url = Utilities.readConfig("url");
		 System.out.println(url);
		 driver.get(url);
	}
	
	/**
	 * close application after test
	 */
	@AfterTest
	public void closeApplication() {
		System.out.println("After test --> Close application");
		driver.quit();
	}
}
