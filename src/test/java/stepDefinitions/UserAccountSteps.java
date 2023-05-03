package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserAccountSteps {
	WebDriver driver;
	public UserAccountSteps (MainDriver maindriver) {
		driver = maindriver.startBrowser();
	}
	
	@Then("Click on User Account")
	public void click_on_user_account() throws Exception{
	    Actions action = new Actions(driver);
	    Thread.sleep(3000);
	    WebElement useraccount = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
	    action.click(useraccount).perform();
	}
	
	@Then("Select About module on user account menu")
	public void select_about_module_on_user_account_menu() throws Exception{
		 Actions action = new Actions(driver);
		 Thread.sleep(5000);
		 WebElement about = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[1]/a"));
		 action.click(about).perform();
	}

	@And("Click on dialogue close icon")
	public void click_on_dialogue_close_icon() throws Exception{
		Actions action = new Actions(driver);
		 Thread.sleep(5000);
		 WebElement closeabout = driver.findElement(By.xpath(" //*[@class='oxd-dialog-close-button oxd-dialog-close-button-position']"));
		 action.click(closeabout).perform();
	}
	
	@Then("Select Support module on user account menu")
	public void select_support_module_on_user_account_menu() throws Exception{
		 Actions action = new Actions(driver);
		 Thread.sleep(5000);
		 WebElement support = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[2]/a"));
		 action.click(support).perform();
	}

	@And("Go back to OrangeHRM home page")
	public void go_back_to_orange_hrm_home_page() throws Exception {
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index#");
	    Thread.sleep(5000);
	}
	
	@When("Select Change password module on user account menu")
	public void select_change_password_module_on_user_account_menu() throws Exception{
		 Actions action = new Actions(driver);
		 Thread.sleep(5000);
		 WebElement changepassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[3]/a"));
		 action.click(changepassword).perform();
	}

	@Then("Enter Current password")
	public void enter_current_password() throws Exception{
		WebElement currentpassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/input"));
		currentpassword.sendKeys("admin123");
		Thread.sleep(5000);
	}

	@Then("Enter Password")
	public void enter_password() throws Exception{
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
		password.sendKeys("Admin$21");
		
	}

	@Then("Enter Confirm password")
	public void enter_confirm_password()throws Exception{
		Thread.sleep(5000);
		WebElement confirmpassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));
		confirmpassword.sendKeys("Admin$21");
		
	}

	@Then("Click on cancel button")
	public void click_on_cancel_button() throws Exception{
		 Actions action = new Actions(driver);
		 Thread.sleep(5000);
		 WebElement cancel = driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--ghost']"));
		 action.click(cancel).perform();
	}

	@Then("Click on save button")
	public void click_on_save_button() throws Exception{
		 Actions action = new Actions(driver);
		 Thread.sleep(5000);
		 WebElement save = driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
		 action.click(save).perform();
	}

	@Then("Click on Logout module\"")
	public void click_on_logout_module() throws Exception{
		Actions action = new Actions(driver);
		 Thread.sleep(5000);
		 WebElement logout = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
		 action.click(logout).perform();
	}
	
	
}
