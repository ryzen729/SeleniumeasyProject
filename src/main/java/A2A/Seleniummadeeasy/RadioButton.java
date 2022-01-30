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
	
	@FindBy(xpath = "(//input[@name=\"gender\"])[2]")
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
	
	@FindBy(xpath = "//button[contains(text(),\"Get values\")]")
	private WebElement getvalue;
	
	@FindBy (className = "groupradiobutton")
	private WebElement genderagetext;
	
	public WebElement checKValueButton() {
		return this.button;
	}
	
	public WebElement genderAgeText() {
		return this.genderagetext;
	}
	
	
	public String displayedText() {
		return this.text.getText();
	}
	
	public void getValues(String gender,String age) {
		gender = gender.strip().toLowerCase();
		switch(age) {
			case "0-5":
				if (gender.equals("male")) {
					this.clickButton(secondmale);
				}else if(gender.equals("female")) {
					this.clickButton(secondfemale);	
				}
				
				this.clickButton(age0to5);
				this.getvalue.click();
				break;
		
	case "5-15":
		if (gender.equals("male")) {
			this.clickButton(secondmale);
		}else if(gender.equals("female")) {
			this.clickButton(secondfemale);	
		}
		
		this.clickButton(age5to15);
		this.getvalue.click();
		break;
		
	case "15-50":
		if (gender.equals("male")) {
			this.clickButton(secondmale);
		}else if(gender.equals("female")) {
			this.clickButton(secondfemale);	
		}
		
		this.clickButton(age15to50);
		this.getvalue.click();
		break;
		
	default:
		System.out.println("Not a valid Age");
		break;
		}
	}
	
	
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}

}
