package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonScenarioOutline {

	@Given("an existing user enters amazon url and hits enter")
	public void an_existing_user_enters_amazon_url_and_hits_enter() {
	  
	}

	@When("existing user clicks on sign in button")
	public void existing_user_clicks_on_sign_in_button() {
	    
	}

	@When("existing user enters this {string} and hits the sign in button")
	public void existing_user_enters_this_and_hits_the_sign_in_button(String string) {
	   
	}

	@When("existing user enters this {string} hits the sign in button")
	public void existing_user_enters_this_hits_the_sign_in_button(String string) {
	    
	}

	@Then("user is signed in succesfully and enters into amazon home page")
	public void user_is_signed_in_succesfully_and_enters_into_amazon_home_page() {
	  
	}
}
