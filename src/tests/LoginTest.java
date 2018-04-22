package tests;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.HomePage;

public class LoginTest extends BaseTest {

	String filePath = "/OrangeHRM/src/Configuration/Configuration.properties";

	@Test
	public void verifyHomePage() {
		System.out.println("verify home page");
		HomePage homePage = new HomePage(driver);
		String title = homePage.getTitle();
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.findElement(By.cssSelector("body")).isEnabled());
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
	    
	    
		System.out.println("Title is ===" + title);
		Assert.assertEquals(title, "OrangeHRM");
	}

	@Test
	public void verifyInvalidLogin() {
		System.out.println("verfy invalid login");
		HomePage homePage = new HomePage(driver);
		homePage.enterUsername("Admin");
		homePage.enterpassword("admin1");
		homePage.clickLogin();
		String errmsg = homePage.getErrorMessage();
		System.out.println("error message is ----> " + errmsg);
		Assert.assertEquals(errmsg, "Invalid credentials");

	}

	@Test
	public void verifyValidLogin() {
		System.out.println("verify valid login");
		HomePage homepage = new HomePage(driver);
		homepage.enterUsername("Admin");
		homepage.enterpassword("admin");
		homepage.clickLogin();
		DashboardPage dashboardpage = new DashboardPage(driver);
		dashboardpage.verifyWelcomeText();
	}
	
	@Test
	public void selectMenuOption() {
		System.out.println("this is to test git pull request");
				System.out.println("this is to test git pull request 1");

	}

}
