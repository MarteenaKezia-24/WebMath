package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OtherStuffSteps {
	WebDriver driver;
	public OtherStuffSteps (MainDriver maindriver) {
		driver = maindriver.startBrowser();
	}
	
	@Then("User verify Other Stuff page title")
	public void user_verify_other_stuff_page_title() throws Exception {
		String ActualTitle = driver.getTitle();							//verify title
		String ExpectedTitle = "Calculate Quantity of a Right Triangle - WebMath";
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
		{
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title not matched");
		}
		Thread.sleep(2000);
	}
	
	@When("User click on basic math")
	public void user_click_on_basic_math() throws Exception {
	Thread.sleep(5000);
	WebElement go = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td[1]/font/font/a[1]"));
	go.click();
	System.out.println("Clicked on Basic math");
	}

	@Then("User verify basic math page title")
	public void user_verify_basic_math_page_title() throws Exception {
		String ActualTitle = driver.getTitle();							//verify title
		String ExpectedTitle = "Create a Basic Math Worksheet - WebMath";
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
		{
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title not matched");
		}
		Thread.sleep(2000);
	}

	@When("User select type of math problem")
	public void user_select_type_of_math_problem() throws Exception {
		Thread.sleep(3000);
		WebElement mathpblm = driver.findElement(By.className("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/ol/li[1]/select"));
		mathpblm.click();
		Thread.sleep(3000);
		Select chooseMath = new Select(mathpblm);
		chooseMath.selectByVisibleText("Addition problems");									 
		System.out.println("Selected 'Addition problems'");
	}

	@Then("User select type of numbers")
	public void user_select_type_of_numbers() throws Exception {
		Thread.sleep(3000);
		WebElement mathpblm = driver.findElement(By.className("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/ol/li[2]/select"));
		mathpblm.click();
		Thread.sleep(3000);
		Select chooseMath = new Select(mathpblm);
		chooseMath.selectByVisibleText("Whole numbers");									 
		System.out.println("Selected 'Whole numbers'");
		}

	@Then("User click on do it")
	public void user_click_on_do_it() throws Exception {
		Thread.sleep(5000);
		WebElement doit = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/p/input[1]"));
		doit.click();
		System.out.println("Clicked on do it");
	}
	@Then("User Navigate to answer page")
	public void user_navigate_to_answer_page() throws Exception {
		Thread.sleep(5000);
		
	}

	@Then("User click go back to math page")
	public void user_click_go_back_to_math_page() throws Exception {
		Thread.sleep(5000);
		WebElement doit = driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img"));
		doit.click();
		System.out.println("Clicked on go back to math page");
	}

	@Then("User click on Average")
	public void user_click_on_average() throws Exception {
		Thread.sleep(5000);
		WebElement average = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td[2]/font/font/a[1]"));
		average.click();
		System.out.println("Clicked on average");
	}

}
