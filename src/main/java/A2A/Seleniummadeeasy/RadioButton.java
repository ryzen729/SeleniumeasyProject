package A2A.Seleniummadeeasy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButton extends BasePage{

	public RadioButton(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "buttoncheck")
	private WebElement button;
	
	@FindBy(xpath = "(//label[contains(text(),\"Male\")])[1]")
	private WebElement male;
	
	@FindBy(xpath = "//label[contains(text(),\"Female\")])[1]")
	private WebElement female;
	
	@FindBy(xpath = "//label[contains(text(),\"Female\")])[2]")
	private WebElement secondfemale;
	
	@FindBy(xpath = "(//label[contains(text(),\"Male\")])[2]")
	private WebElement secondmale;
	
	@FindBy(xpath = "(//label[contains(text(),\"0 to 5\")])")
	private WebElement age0to5;
	
	@FindBy(xpath = "(//label[contains(text(),\"5 to 15\")])")
	private WebElement age5to15;
	
	@FindBy(xpath = "(//label[contains(text(),\"15 to 50\")])")
	private WebElement age15to50;
	
	@FindBy(className = "radiobutton")
	private WebElement text;
	
	public WebElement checKValueButton() {
		return this.button;
	}
	
	public String displayedText() {
		return this.text.getText();
	}
	
	
	
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}

}
