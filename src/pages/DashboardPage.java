package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import framework.Events;

public class DashboardPage extends Events{

	private By welcometext = By.id("welcome");
	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	public void verifyWelcomeText() {
		String txt = getText(welcometext);
		System.out.println("Welcome text is : ===" + txt);
		Assert.assertEquals(txt, "Welcome Admin");
	}
	

}
