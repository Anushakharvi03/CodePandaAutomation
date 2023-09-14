package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentPageSteps {
	@When("user enter card number")
	public void user_enter_card_number() {
		System.out.println("Card number");
	    
	}

	@When("click on pay button")
	public void click_on_pay_button() {
		System.out.println("Pay button");
	    
	}

	@Then("validate successfull order")
	public void validate_successfull_order() {
		System.out.println("Order");
	    
	}



	

}
