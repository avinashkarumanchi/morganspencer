$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Feature/Application.feature");
formatter.feature({
  "name": "How old are you",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on Morgan Webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinition.StepDefinition.user_is_on_Morgan_Webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Display Name and age",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters the name in the Your name field and Date of birth is Provided",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinition.StepDefinition.user_enters_the_name_in_the_Your_name_field_and_Date_of_birth_is_Provided()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on submit button then name and age is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinition.StepDefinition.click_on_submit_button_then_name_and_age_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on Morgan Webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinition.StepDefinition.user_is_on_Morgan_Webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Display Error for name field",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User submits with missing mandatory data",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdefinition.StepDefinition.user_submits_with_missing_mandatory_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see Fail submission, error message at Name field",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinition.StepDefinition.user_should_see_Fail_submission_error_message_at_Name_field()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on Morgan Webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinition.StepDefinition.user_is_on_Morgan_Webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Display Error for Birth Date field",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User submits with missing mandatory data for Birth date",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdefinition.StepDefinition.user_submits_with_missing_mandatory_data_for_Birth_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see Fail submission, error message at Birth Date field",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinition.StepDefinition.user_should_see_Fail_submission_error_message_at_Birth_Date_field()"
});
formatter.result({
  "status": "passed"
});
});