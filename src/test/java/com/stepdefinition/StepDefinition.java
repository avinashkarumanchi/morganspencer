package com.stepdefinition;

import com.Morgan.pages.*;
import com.base.LaunchWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {


	
	
	@Given("User is on Morgan Webpage")
	public void user_is_on_Morgan_Webpage() {
		LaunchWebDriver.setUp();
	    
	}

	
	@When("User enters the name in the Your name field and Date of birth is Provided")
	public void user_enters_the_name_in_the_Your_name_field_and_Date_of_birth_is_Provided() {
		DetailsEntryPage detailsEntryPage = new DetailsEntryPage(LaunchWebDriver.driver);
		detailsEntryPage.Name("Avinash");
		detailsEntryPage.Birthdate("10011995");
		
	   
	}
	@Then("Click on submit button then name and age is displayed")
	public void click_on_submit_button_then_name_and_age_is_displayed() {
		DetailsEntryPage detailsEntryPage = new DetailsEntryPage(LaunchWebDriver.driver);
		detailsEntryPage.Submitbutton();
	    
	}
	@Given("User submits with missing mandatory data")
	public void user_submits_with_missing_mandatory_data() {
		DetailsEntryPage detailsEntryPage = new DetailsEntryPage(LaunchWebDriver.driver);
		detailsEntryPage.Submitbutton();
	    
	}

	@Then("user should see Fail submission, error message at Name field")
	public void user_should_see_Fail_submission_error_message_at_Name_field() {
		DetailsEntryPage detailsEntryPage = new DetailsEntryPage(LaunchWebDriver.driver);
		detailsEntryPage.getNameErrorMessage();
				
	    
	}

	@Given("User submits with missing mandatory data for Birth date")
	public void user_submits_with_missing_mandatory_data_for_Birth_date() {
		DetailsEntryPage detailsEntryPage = new DetailsEntryPage(LaunchWebDriver.driver);
		detailsEntryPage.Name("Avinash");
		detailsEntryPage.Submitbutton();
		
	   
	}
	@Then("user should see Fail submission, error message at Birth Date field")
	public void user_should_see_Fail_submission_error_message_at_Birth_Date_field() {
		DetailsEntryPage detailsEntryPage = new DetailsEntryPage(LaunchWebDriver.driver);
		detailsEntryPage.getDateErrorMessage();
	    
	}
}