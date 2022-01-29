package A2A.Seleniummadeeasy;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class CheckForm extends BasePage{

	public CheckForm(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "isAgeSelected")
	private WebElement checkbox;
	
	@FindBy(id = "txtAge")
	private WebElement displayText;
	
	@FindBy(id = "check1")
	private WebElement button;
	
	@FindBy(css = ".cb1-element")
	private List<WebElement> checkboxes;
	
	@FindBy(xpath = "//label[contains(.,'Option 1')]")
	private WebElement anycheckBox;
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void checkDisplayed() {
		this.clickButton(checkbox);
	}
	
	public WebElement displayText() {
		return this.displayText;
	}
	
	public String buttonValue() {
		return this.button.getAttribute("value");
	}
	
	public WebElement checkboxButton() {
		return this.button;
	}
	
	public List<WebElement> multiCheckbox() {
		return this.checkboxes;
	}
	
	public WebElement anycheckBox() {
		return this.anycheckBox;
	}
	

}
