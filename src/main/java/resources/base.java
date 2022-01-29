package resources;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {
	
	public WebDriver driver;
	
	
	public WebDriver initializeDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahuu\\eclipse-workspace\\Seleniummadeeasy\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("No")).click();
		return driver;
	}
	
	
	
}
