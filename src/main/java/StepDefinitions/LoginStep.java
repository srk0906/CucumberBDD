package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStep {

	WebDriver driver;

	@Given("User is already on login page$") 
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\Rajkannan\\WorkItems\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://newtours.demoaut.com/index.php");
	}
	
	@When("Title of the login page is Demo Tours$")
	public void title_of_the_login_page_is_Demo_Tours() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Welcome: Mercury Tours", title);
	}
	
	@Then("User enter Username and Password$")
	public void user_enter_Username_and_Password() {
		driver.findElement(By.name("userName")).sendKeys("avnfact");
		driver.findElement(By.name("password")).sendKeys("avnfact");
	    
	}

	@And("User clicks on the login button$")
	public void user_clicks_on_the_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("User is on home page$")
	public void user_is_on_home_page() {
		String title1 = driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals("Find a Flight: Mercury Tours:", title1);
	    
	}


}
