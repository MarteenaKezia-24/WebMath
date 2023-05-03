package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;

public class MainDriver {

	WebDriver driver;
	
	public WebDriver startBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marte\\eclipse-workspace\\OrangeHRM\\Drivers\\chromedriver.exe");
		if(driver==null)
		driver = new ChromeDriver();
		return driver;
	}
	
	@And("User Close the Browser")
	public void user_close_the_browser() {
		 driver.quit();  
		   driver=null;
	}
}
