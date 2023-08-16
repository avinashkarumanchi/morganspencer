Feature: How old are you
	
Background: 
		Given User is on Morgan Webpage
				
Scenario: Display Name and age
		When User enters the name in the Your name field and Date of birth is Provided
        Then Click on submit button then name and age is displayed		

Scenario: Display Error for name field
		And User submits with missing mandatory data
        Then user should see Fail submission, error message at Name field
        
Scenario: Display Error for Birth Date field
		And User submits with missing mandatory data for Birth date
        Then user should see Fail submission, error message at Birth Date field


        
 
		

 	