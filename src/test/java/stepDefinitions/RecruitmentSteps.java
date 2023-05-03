package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RecruitmentSteps {
	WebDriver driver;
	public RecruitmentSteps (MainDriver maindriver) {
		driver = maindriver.startBrowser();
	}
	
	@When("Click on Recruitment module")
	public void Click_on_Recruitment_module() throws Exception {
		Actions action = new Actions(driver);
		 Thread.sleep(5000);
		 WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));
		 action.click(save).perform();
		 System.out.println("user clicked on Recruitment module");
	}
	@When("Select Candidates field")
	public void select_candidates_field() throws Exception {
		Actions action = new Actions(driver);
		 Thread.sleep(5000);
		 WebElement Candidates = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a"));
		 action.click(Candidates).perform();
		 System.out.println("user clicked on candidates field");
	}

	@Then("Select any one option from Job Title")
	public void select_any_one_option_from_job_title() throws Exception {
		Thread.sleep(3000);
		WebElement dd1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i"));
		dd1.click();
		Thread.sleep(3000);
		Select jobtitle = new Select(dd1);
		jobtitle.selectByVisibleText("QA Engineer");									 
		System.out.println("Selected 'Job Title'");
		
	}

	@Then("Select any one option from Vacany")
	public void select_any_one_option_from_vacany() throws Exception {
		Thread.sleep(3000);
		WebElement dd2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i"));
		dd2.click();
		Thread.sleep(3000);
		Select vacancy = new Select(dd2);
		vacancy.selectByVisibleText("Software Engineer");									 
		System.out.println("Selected 'vacancy'");
		
	}

	@Then("Select any one option from Status")
	public void select_any_one_option_from_status() throws Exception {
		Thread.sleep(3000);
		WebElement dd3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i"));
		dd3.click();
		Thread.sleep(3000);
		Select status = new Select(dd3);
		status.selectByVisibleText("Interview Passed");									 
		System.out.println("Selected 'status'");
	}

	@When("Enter Candidate name in Candidated field")
	public void enter_candidate_name_in_candidated_field()throws Exception {
		Thread.sleep(5000);
		WebElement candidate = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input"));
		candidate.sendKeys("Peter");
		Select status = new Select(candidate);
		status.selectByVisibleText("Peter Smith");	
	}

	@Then("Select date of application from calender")
	public void select_date_of_application_from_calender() throws Exception{
		Actions action = new Actions(driver);
		WebElement doa = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div/i"));
		action.click(doa).perform();
		WebElement month = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div"));
		month.click();
		Select dropdown1 = new Select(month);
		dropdown1.selectByIndex(3);
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/comment()"));
		year.click();
		Select dropdown2 = new Select(year);
		dropdown2.selectByValue("2023");
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='April 10th, 2023']"));
		action.click(date).perform();
	}

	@Then("Select method of applcation")
	public void select_method_of_applcation() throws Exception{
		Thread.sleep(3000);
		WebElement dd4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/div/div/div/div[2]/div/div/div[2]/i"));
		dd4.click();
		Thread.sleep(3000);
		Select method = new Select(dd4);
		method.selectByVisibleText("Online");									 
		System.out.println("Selected 'method of application'");
	}

	@Then("Click on Search button")
	public void click_on_search_button() throws Exception{
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]"));
		Thread.sleep(5000);
		action.click(search).perform();
	}
		
	@Then("Click on reset button")
	public void click_on_reset_button() throws Exception{
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		WebElement reset = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[1]"));
		Thread.sleep(5000);
		action.click(reset).perform();
	}
	
	@And("Click on add button")
	public void click_on_add_button() throws Exception{
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		WebElement add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
		Thread.sleep(5000);
		action.click(add).perform();
	}
	@Then("Enter FirstName MiddleName LastName")
	public void enter_firstname_middlename_lastname() throws Exception {
		Thread.sleep(5000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("Max");
		Thread.sleep(5000);
		WebElement middlename = driver.findElement(By.xpath("//input[@name='middleName']"));
		middlename.sendKeys("Well");
		Thread.sleep(5000);
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("James");
	}

	@Then("Enter email id")
	public void enter_email_id() throws Exception{
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));
		email.sendKeys("maxwel.james@gmail.com");
	}

	@Then("Enter contact Number")
	public void enter_contact_number() throws Exception{
		Thread.sleep(5000);
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input"));
		contact.sendKeys("846126896");
	}
	
	@Then("Click on candidate save button")
	public void click_on_candidate_save_button() throws Exception{
		 Actions action = new Actions(driver);
		 Thread.sleep(5000);
		 WebElement save = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
		 action.click(save).perform();
	}
	
	@Then("Click on candidate cancel button")
	public void click_on_candidate_cancel_button() throws Exception{
		 Actions action = new Actions(driver);
		 Thread.sleep(5000);
		 WebElement save = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']"));
		 action.click(save).perform();
	}
	
	@Then("Click on Vacancies module")
	public void click_on_vacancies_module() throws Exception {
		Actions action = new Actions(driver);
		 Thread.sleep(5000);
		 WebElement vacancies = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a"));
		 action.click(vacancies).perform();
		 System.out.println("user clicked on vacancies field");
	}

}
