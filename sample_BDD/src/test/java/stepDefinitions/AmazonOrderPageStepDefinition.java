package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class AmazonOrderPageStepDefinition {

	@Given("User enters username and password and hits enters login button")
	public void user_enters_username_and_password_and_hits_enters_login_button() {
	    System.out.println("Now displaying step definition for  ====>User enters username and password and hits enters login button ");
	}

	@When("User clicks on the Returns and Orders button")
	public void user_clicks_on_the_returns_and_orders_button() {
	    System.out.println("Now displaying step definition for  ====> User clicks on the Returns and Orders button");
	}

	@Then("user is taken to Your orders page")
	public void user_is_taken_to_your_orders_page() {
	    System.out.println("Now displaying step definition for  ====>user is taken to Your orders page ");
	}

	@Then("the default page is Your Orders page")
	public void the_default_page_is_your_orders_page() {
	    System.out.println("Now displaying step definition for  ====>the default page is Your Orders page ");
	}

	@Then("user clicks on the {string} tab")
	public void user_clicks_on_the_tab(String string) {
	    System.out.println("Now displaying step definition for  ====>user clicks on the {string} tab ");
	}

	@Then("User sees his purchase history")
	public void user_sees_his_purchase_history() {
	    System.out.println("Now displaying step definition for  ====> User sees his purchase history");
	}
}
