package A2A.Seleniummadeeasy;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import resources.base;

public class FirstPageTest extends base{
	
	WebDriver driver;
	Firstformdemo firstobj;
	CheckForm checkobj;
	RadioButton radioobj;
	public static Logger log =LogManager.getLogger(FirstPageTest.class.getName());
	@BeforeClass
	public void initialize() {
		
		log.info("Initializing Driver");
	driver = initializeDriver();
		log.info("Driver Initialized");
	
	}
	
	@Test(priority = 1)
	public void messageInput() {
		log.info("Testing message Input");
		firstobj = new Firstformdemo(driver);
		firstobj.singleInputCheck("hello");
		log.info("Entered into textbox");
		assertEquals(firstobj.displayMesaage().getText(), "hello");
		log.info("Mesaage verified");
	}
	
	@Test(priority = 2)
	public void twomessageInput() {
		log.info("Testing twomessageInput");
		firstobj = new Firstformdemo(driver);
		firstobj.twoInputField("1","2");
		log.info("Two numbers enterted into inputfield");
		assertEquals(firstobj.displayValue().getText(),"3");
		log.info("Addition of two number verified");
	}
	
	@Test(priority = 3)
	public void SimpleformNavigate() {
		log.info("Testing navigation to simpleform");
		firstobj = new Firstformdemo(driver);
		checkobj = firstobj.SimpleformNavigateTo();
		System.out.println(checkobj.getPageTitle());
		log.info("Simple form navigation verified");
		
	}
	
	@Test(priority = 4)
	public void radioNavigation() {
		log.info("Testing radioNavigation");
		firstobj = new Firstformdemo(driver);
		log.info("Navigating to RadiPage");
		radioobj = firstobj.navigateToRadioBox();
		log.info("Radio Button navigated");
		
	}


	
	@AfterClass
	public void closeBrowser() {
		log.info("Closing driver");
		driver.close();
	}
	
	
	
}
