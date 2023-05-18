package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrigCalculusSteps {
	WebDriver driver;
	public TrigCalculusSteps (MainDriver maindriver) {
		driver = maindriver.startBrowser();
	}

@When("User checks any action from drop down")
public void user_checks_any_action_from_drop_down() throws Exception {
	Thread.sleep(3000);
	WebElement dd1 = driver.findElement(By.className("//select[@name='topicItem']"));
	dd1.click();
	Thread.sleep(3000);
	Select chooseMath = new Select(dd1);
	chooseMath.selectByVisibleText("Coins, Counting");									 
	System.out.println("Selected 'Coins, Counting'");
}

@Then("User click Go button")
public void user_click_go_button() throws Exception{
		Thread.sleep(5000);
		WebElement go = driver.findElement(By.xpath("//*[@id=\"d-quickJump\"]/div[1]/div/a/img"));
		go.click();
		System.out.println("Clicked on Go button");
		Thread.sleep(3000);
		driver.navigate().to("https://www.webmath.com/index6.html");
}

@Then("User click on help typing link")
public void user_click_on_help_typing_link() throws Exception{
	Thread.sleep(5000);
	WebElement link = driver.findElement(By.xpath("//*[@id=\"d-quickJump\"]/div[2]/a"));
	link.click();
	System.out.println("Clicked on link");
	Thread.sleep(3000);
	driver.navigate().to("https://www.webmath.com/index6.html");
}

@When("User click on Trignometry Expressions")
public void user_click_on_trignometry_expressions() throws Exception{
	Thread.sleep(5000);
	WebElement trigexp = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td[1]/font/font/a[1]"));
	trigexp.click();
	System.out.println("Clicked on Trignometry Expression");
}

@Then("User verify Trignometry expressions page title")
public void user_verify_trignometry_expressions_page_title() throws Exception {
	String ActualTitle = driver.getTitle();							//verify title
	String ExpectedTitle = "Simplify a Trigonometric Expression - WebMath";
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

@Then("User Types Trignometry expression in box")
public void user_types_trignometry_expression_in_box() throws Exception{
	Thread.sleep(5000);
	WebElement trigval = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[1]/input"));
	trigval.sendKeys("sin^2 + cos^2");
}

@Then("User clicks on click here to simply button")
public void user_clicks_on_click_here_to_simply_button() throws Exception{
	Thread.sleep(5000);
	WebElement result = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[2]/input[1]"));
	result.click();
	System.out.println("Clicked for Trig Exp");
}

@Then("User Navigates to answer page")
public void user_navigates_to_answer_page() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("scrollBy(0, 2000)");
}

@Then("User click on go to math problem")
public void user_click_on_go_to_math_problem() throws Exception{
	Thread.sleep(5000);
	WebElement goback = driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img"));
	goback.click();
	System.out.println("Clicked on go to math problem");
}

@Then("User navigate back to Trig & Calculus page")
public void user_navigate_back_to_trig_calculus_page() {
   driver.navigate().to("https://www.webmath.com/index6.html");
}

@Then("User click on Right Triangle")
public void user_click_on_right_triangle()  throws Exception{
	Thread.sleep(5000);
	WebElement rgttriangle = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td[1]/font/font/a[2]"));
	rgttriangle.click();
	System.out.println("Clicked on Right triangle");
}
@Then("User verify Title of Right Triangle page")
public void user_verify_title_of_right_triangle_page() throws Exception {
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

@Then("User send values for right triangle")
public void user_send_values_for_right_triangle()throws Exception{
	Thread.sleep(5000);
	WebElement v1 = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/center/table/tbody/tr/td/form/center/table/tbody/tr/td/pre/input[2]"));
	v1.sendKeys("2");
	Thread.sleep(5000);
	WebElement v2 = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/center/table/tbody/tr/td/form/center/table/tbody/tr/td/pre/input[3]"));
	v2.sendKeys("2");
	Thread.sleep(5000);
	WebElement v3 = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/center/table/tbody/tr/td/form/center/table/tbody/tr/td/pre/input[5]"));
	v3.sendKeys("1");
	Thread.sleep(5000);
	WebElement v4 = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/center/table/tbody/tr/td/form/center/table/tbody/tr/td/pre/input[4]"));
	v4.sendKeys("1");
	Thread.sleep(5000);
	WebElement v5 = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/center/table/tbody/tr/td/form/center/table/tbody/tr/td/pre/input[1]"));
	v5.sendKeys("?");
}

@Then("User click on go button")
public void user_click_on_go_button() throws Exception{
	Thread.sleep(5000);
	WebElement gorgttriangle = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/center/table/tbody/tr/td/form/center/table/tbody/tr/td/p/input[1]"));
	gorgttriangle.click();
}

@Then("User click on Clear the form button")
public void user_click_on_Clear_the_form_button() throws Exception{
	Thread.sleep(5000);
	WebElement gorgttriangle = driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/center/table/tbody/tr/td/form/center/table/tbody/tr/td/p/input[2]"));
	gorgttriangle.click();
}
}
