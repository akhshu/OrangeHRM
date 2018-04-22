package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.Events;

public class HomePage extends Events{
	
	private static final By loginButtonBy = By.id("btnLogin");
	private By usernameBy = By.id("txtUsername");
	private By passwordBy = By.id("txtPassword");
	private By errormessageBy = By.id("spanMessage");
	//private WebElement errorMessageElement= driver.findElement(By.id("spanMessage"));
	
		
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void enterUsername(String username) {
		enterValue(usernameBy, username);
	}
	
	public void enterpassword(String password) {
		enterValue(passwordBy, password);
	}
	
	public void clickLogin() {
		click(loginButtonBy);
	}
	
	public String getErrorMessage() {
		return getText(errormessageBy);
	}
	
	public String getTitle(By by) {
		return getTitle();
	}
}
