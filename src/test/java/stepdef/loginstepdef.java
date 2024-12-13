package stepdef;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdef {
	


	@Given("User navigates to FB page")
	public void user_navigates_to_fb_page() {
	  // ChromeDriver driver = new ChromeDriver();
	 //  driver.get("http://www.fb.com");
	  // Assert.fail();	
	   }

	@When("User enters username and password")
	public void user_enters_username_and_password() {
	  
	}

	@When("User clicks on Signin button")
	public void user_clicks_on_signin_button() {
	 
	}

	@Then("User navigated to HomePage")
	public void user_navigated_to_home_page() {
	  
	}

	//@Then("^user enters \"([^\\\"]*)\" and \"([^\\\"]*)\" $")

	@Then("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
//	  System.out.println(username + " is entered");
//	  System.out.println(password + " is entered");

	}
	
	

	@Then("user validates {string} {string} {string} {string} {string} {string}")
	public void user_validates(String title, String url, String h1, String h2, String h3, String menu) {

	}
	
	//Hooks
	@Before
	public void abc()
	{
		System.out.println("TESTING ************************");
	}
	


	






}
