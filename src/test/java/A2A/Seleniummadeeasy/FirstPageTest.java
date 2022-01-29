package A2A.Seleniummadeeasy;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import resources.base;

public class FirstPageTest extends base{
	
	WebDriver driver;
	Firstformdemo firstobj;
	CheckForm checkobj;
	
	@BeforeClass
	public void initialize() {
		
	driver = initializeDriver();
	
	}
	
	@Test(priority = 1)
	public void messageInput() {
		firstobj = new Firstformdemo(driver);
		firstobj.singleInputCheck("hello");
		assertEquals(firstobj.displayMesaage().getText(), "hello");
	}
	
	@Test(priority = 2)
	public void twomessageInput() {
		firstobj = new Firstformdemo(driver);
		firstobj.twoInputField("1","2");
		assertEquals(firstobj.displayValue().getText(),"3");
	}
	
	@Test(priority = 3)
	public void SimpleformNavigate() {
		firstobj = new Firstformdemo(driver);
		checkobj = firstobj.SimpleformNavigateTo();
		System.out.println(checkobj.getPageTitle());
		
	}
	
	


	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	
	
}
