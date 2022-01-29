package A2A.Seleniummadeeasy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Firstformdemo extends BasePage{
	

	public Firstformdemo(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "user-message")
	private WebElement message;
	
	@FindBy(xpath = "//button[contains(text(),\"Show\")]")
	private WebElement submit;
	
	@FindBy(id ="sum1")
	private WebElement inputa;
	
	@FindBy(id ="sum2")
	private WebElement inputb;
	
	@FindBy(xpath = "//button[contains(text(),\"Get\")]")
	private WebElement total;
	
	@FindBy(id ="display")
	private WebElement displayedMessage;
	
	@FindBy(id ="displayvalue")
	private WebElement displayedValue;
	
	@FindBy(linkText = "Input Forms")
	private WebElement inputform;
	
	@FindBy(linkText = "Checkbox Demo")
	private WebElement checkform;
	
	@FindBy(linkText = "Radio Buttons Demo")
	private WebElement radiobutton;
	
	public void singleInputCheck(String text) {
		this.enterText(message, text);
		this.clickButton(submit);
	}
	
	public void twoInputField(String text,String text2) {
		this.enterText(inputa, text);
		this.enterText(inputb, text2);
		this.clickButton(total);
	}
	

	
	public WebElement displayValue() {
		return this.displayedValue;
	}
	
	public WebElement displayMesaage() {
		return this.displayedMessage;
	}
	

	
	public CheckForm SimpleformNavigateTo() {
		inputform.click();
		checkform.click();
		return new CheckForm(driver);
		
	}
	
	public RadioButton navigateToRadioBox() {
		inputform.click();
		radiobutton.click();
		return new RadioButton(driver);
		
	}


}
