package A2A.Seleniummadeeasy;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import resources.base;

public class RadioboxTest extends base {

		WebDriver driver;
		RadioButton btn;
		Firstformdemo page;
	public static Logger log =LogManager.getLogger(RadioboxTest.class.getName());
	
	@BeforeClass
	public void initialize() {
		log.info("Initializing Driver");
		driver = initializeDriver();
		log.info("Driver Initialized");
	}
	
	@Test(priority = 1)
	public void emptyValue() {
		log.info("Checking displayed value without selecting any rardio button");
		page = new Firstformdemo(driver);
		btn = new RadioButton(driver);
		btn = page.navigateToRadioBox();
		btn.clickButton(btn.checKValueButton());
		assertEquals(btn.displayedText(),"Radio button is Not checked");
		log.info(btn.displayedText());
		log.info("Displayed message verified");
	}
	
	@Test(priority = 2)
	public void genderAge() {
		btn = new RadioButton(driver);
		btn.getValues("male", "0-5");
		log.info(btn.genderAgeText().getText());
		btn.getValues("male", "5-15");
		log.info(btn.genderAgeText().getText());
		btn.getValues("male", "15-50");
		log.info(btn.genderAgeText().getText());
		btn.getValues("female", "0-5");
		log.info(btn.genderAgeText().getText());
		btn.getValues("female", "5-15");
		log.info(btn.genderAgeText().getText());
		btn.getValues("female", "15-50");
		log.info(btn.genderAgeText().getText());
		
		
		
		
	}
	
	@Ignore
	@AfterClass
	public void closeBrowser() {
		log.info("Closing driver");
		driver.close();
	}
}
