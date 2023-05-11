package stepDefinitions;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLoginStepDefinition {

	@Given("an existing user enters amazon url {string} and hits enter")
	public void an_existing_user_enters_amazon_url_and_hits_enter(String string) {
		System.out.println("Now displaying step definition for  ====>an existing user enters amazon url {string} and hits enter ");
	}
	    	

	@When("existing user clicks on the sign in button")
	public void existing_user_clicks_on_the_sign_in_button() {
		System.out.println("Now displaying step definition for  ====> existing user clicks on the sign in button");
	}

	@When("existing user enters correct username as {biginteger} and hits the sign in button")
	public void existing_user_enters_correct_username_as_and_hits_the_sign_in_button(BigInteger int1) {
		System.out.println("Now displaying step definition for  ====>existing user enters correct username as {int} and hits the sign in button ");
	}

	@When("existing user enters correct password as {string} hits the sign in button")
	public void existing_user_enters_correct_password_as_hits_the_sign_in_button(String string) {
		System.out.println("Now displaying step definition for  ====>existing user enters correct password as {string} hits the sign in button ");
	}

	@Then("user is signed in succesfully and able to see amazon home page")
	public void user_is_signed_in_succesfully_and_able_to_see_amazon_home_page() {
		System.out.println("Now displaying step definition for  ====>user is signed in succesfully and able to see amazon home page ");
	}
	   

	@When("existing user enters incorrect username as {biginteger} and hits the sign in button")
	public void existing_user_enters_incorrect_username_as_and_hits_the_sign_in_button(BigInteger int1) {
		System.out.println("Now displaying step definition for  ====>existing user enters incorrect username as {int} and hits the sign in button ");
	}

	@Then("user gets a error message {string}")
	public void user_gets_a_error_message(String string) {
		System.out.println("Now displaying step definition for  ====> user gets a error message {string}");
	}

	@When("existing user enters incorrect password as {string} hits the sign in button")
	public void existing_user_enters_incorrect_password_as_hits_the_sign_in_button(String string) {
		System.out.println("Now displaying step definition for  ====>existing user enters incorrect password as {string} hits the sign in button ");
	}
	@Given("an new user enters amazon url {string} and hits enter")
	public void an_new_user_enters_amazon_url_and_hits_enter(String string) {
	   
	}

	@When("a new user hits the create your amazon account button")
	public void a_new_user_hits_the_create_your_amazon_account_button() {
	 
	}

	@Then("new user sees the create account page")
	public void new_user_sees_the_create_account_page() {
	  
	}

	@Then("new user enters the following details to create a new account")
	public void new_user_enters_the_following_details_to_create_a_new_account(DataTable dataTable) {
		List<List<String>>  userList = dataTable.asLists(String.class);
		
		for(List<String> e: userList) {
			System.out.println(e);
		}
	}
		@Then("new user enters the following details with headers")
		public void new_user_enters_the_following_details_with_headers(DataTable dataTable1) {
			List<Map<String,String>> userList1 = dataTable1.asMaps(String.class,String.class);
			
			System.out.println(userList1);
			System.out.println(userList1.get(0).get("name"));
		
			
			for(Map<String,String> e:userList1 ) {
				System.out.println(e.get("name"));
				System.out.println(e.get("phone number"));
				System.out.println(e.get("password"));
			}
			
		  
		}
	
}
