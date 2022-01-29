package A2A.Seleniummadeeasy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public String getPageTitle(WebElement element) {
		return element.getText();
	}
	
	public void clickButton(WebElement element) {
		element.click();
	}
	
	

}
