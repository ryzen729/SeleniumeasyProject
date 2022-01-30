package A2A.Seleniummadeeasy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import resources.base;

public class CheckBoxText extends base{
	
	public static Logger log =LogManager.getLogger(CheckBoxText.class.getName());
	public WebDriver driver;
	CheckForm check;
	Firstformdemo page;
	
	
	@BeforeClass
	public void initialize() {
		log.info("Initializing CheckBox Driver");
		driver = initializeDriver();
		log.info("CheckBox Driver Initialized");
	
	
	}
	
	@Test(priority = 1)
	public void checkDisplayedCheck() {
		log.info("Navigating to Chebox webPage");
		page = new Firstformdemo(driver);
		check = new CheckForm(driver);
		check = page.SimpleformNavigateTo();
		
		check.checkDisplayed();
		assertEquals(check.displayText().getText(),"Success - Check box is checked");
		log.info("Successfully launched Checkbox Page ");
	}
	
	
	
	@Test(priority = 2)
	public void checkSelected() {
		log.info("Testing all checkbox selected");
		check = new CheckForm(driver);
		check.clickButton(check.checkboxButton());
		log.info("Check All button clicked");
		for (WebElement x : check.multiCheckbox()) {
			assertTrue(x.isSelected());
		}
		log.info("All checked box selected verified");
	}
	
	@Test(priority = 3)
	public void Text() {
		log.info("Testing button value");
		check = new CheckForm(driver);
		assertEquals(check.buttonValue(),"Uncheck All");
			log.info("Button value uncheck all veified");
		
	}
	
	@Test(priority = 4)
	public void uncheckedCheck() {
		log.info("uncheckedCheck");
		page = new Firstformdemo(driver);
		check = new CheckForm(driver);
		check = page.SimpleformNavigateTo();
		check.clickButton(check.checkboxButton());
		log.info("Check all box");
		check.clickButton(check.anycheckBox());
		log.info("Uncheck any one box");
		assertEquals(check.buttonValue(),"Check All");
		log.info("Button value verified");
		
	}

	@AfterClass
	public void closeBrowser() {
		log.info("Closing driver");
		driver.close();
	}
	

}
