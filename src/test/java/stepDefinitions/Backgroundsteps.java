package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Backgroundsteps {
		
		 WebDriver driver;
		 public Backgroundsteps (MainDriver maindriver) {
				driver = maindriver.startBrowser();
		
		}

		@When("User opens WebMath {string}")
		public void user_opens_WebMath(String url) {
		    driver.get(url);
		    driver.manage().window().maximize();
		} 
		
		@Then("User click on Trig and Calculus")
		public void user_click_on_trig_and_calculus() throws Exception{
			Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id='navBox-6']/a")).click();
		}
		
		@Then("User click on Other Stuff")
		public void user_click_on_Other_Stuff() throws Exception{
			Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id='navBox-7']/a")).click();
		}

	}

