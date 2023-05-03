package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Backgroundsteps {
		
		 WebDriver driver;
		 public Backgroundsteps (MainDriver maindriver) {
				driver = maindriver.startBrowser();
		
		}

		@When("User opens OrangeHRM {string}")
		public void user_opens_orange_hrm(String url) {
		    driver.get(url);
		    driver.manage().window().maximize();
		} 
		
		@When("User enter Username as {string} and Password as {string}")
		public void user_enter_username_as_and_password_as(String username, String password) throws Exception {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
			Thread.sleep(3000);
		}

		@Then("User Click on Login button")
		public void user_click_on_login_button() throws Exception{
			Actions action = new Actions(driver);
			WebElement btnlogin = driver.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button"));
			action.click(btnlogin).perform();
			Thread.sleep(3000);

		}

		
		@Then("Verify that the logo presents on page")
		public void verify_that_the_logo_presents_on_page() throws Exception{
		  boolean status = driver.findElement(By.cssSelector(".orangehrm-login-logo")).isDisplayed();
//		  boolean status = driver.findElement(By.xpath("//*[@class=\"orangehrm-login-logo\"]/img")).isDisplayed();
		  Thread.sleep(3000);
		  Assert.assertEquals(status, true);
		}

	}

