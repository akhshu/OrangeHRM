package framework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Events {
	WebDriver driver;
	String filePath = "/OrangeHRM/src/Configuration/Configuration.properties";

	public Events(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @param by
	 * @return list of <webelement>
	 */
	public WebElement getElement(By by) {
		return driver.findElement(by);
	}

	/**
	 * @param by, value
	 */
	public void enterValue(By by, String value) {
		getElement(by).sendKeys(value);
	}

	/**
	 * @param by
	 */
	public void click(By by) {
		getElement(by).click();
	}

	/**
	 * @return title of the screen
	 */
	public String getTitle() {
		return driver.getTitle();
	}

	/**
	 * @param by
	 * @return text of object 
	 */
	public String getText(By by) {
		return getElement(by).getText();
	}


	public void hover(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

}
