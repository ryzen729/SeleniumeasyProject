package A2A.Seleniummadeeasy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import resources.base;

public class CheckBoxText extends base{
	
	public WebDriver driver;
	CheckForm check;
	Firstformdemo page;
	
	
	@BeforeClass
	public void initialize() {
		
	driver = initializeDriver();
	
	}
	
	@Test(priority = 1)
	public void checkDisplayedCheck() {
		page = new Firstformdemo(driver);
		check = new CheckForm(driver);
		check = page.SimpleformNavigateTo();
		
		check.checkDisplayed();
		assertEquals(check.displayText().getText(),"Success - Check box is checked");
	}
	
	
	
	@Test(priority = 2)
	public void checkSelected() {
		check = new CheckForm(driver);
		check.clickButton(check.checkboxButton());
		for (WebElement x : check.multiCheckbox()) {
			assertTrue(x.isSelected());
		}
	}
	
	@Test(priority = 3)
	public void Text() {
		check = new CheckForm(driver);
		assertEquals(check.buttonValue(),"Uncheck All");
		
	}
	
	@Test(priority = 4)
	public void uncheckedCheck() {
		page = new Firstformdemo(driver);
		check = new CheckForm(driver);
		check = page.SimpleformNavigateTo();
		check.clickButton(check.checkboxButton());
		check.clickButton(check.anycheckBox());
		assertEquals(check.buttonValue(),"Check All");
		
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	

}
