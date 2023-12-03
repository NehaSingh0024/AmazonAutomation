package StepDefinition;

import java.util.Map;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import BaseClass.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import Pages.RegistrationPage;
import Pages.HomePage;

public class Registration extends BaseClass {
	 
	 RegistrationPage regUser;
	 HomePage homepage;
	
	
	@Given("the user is already on Amazon registration page")
	public void the_user_is_already_on_amazon_registration_page() throws Exception {
		
		BaseClass.initialization();
		
		homepage = new HomePage(driver);
		regUser = new RegistrationPage(driver);
		regUser.clicksigninbutton();
		regUser.clickregUserbtn();
	}
	
	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
		
		regUser.clickcontinue();
	}
	
	@Then("user should see error message on username, email and password fields")
	public void user_should_see_error_message_on_username_email_and_password_fields() {
	
	  Assert.assertEquals("Enter your name", regUser.customernameerror());
	  Assert.assertEquals("Enter your e-mail address or mobile phone number",regUser.emailaddresserror()); 
	  Assert.assertEquals("Minimum 6 characters required", regUser.passworderror());
	  driver.close();
	}
	
	@When("user clicks on Hello, Sign in option")
	public void user_clicks_on_hello_sign_in_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
//	@When("user entered existing account details as below")
//	public void user_entered_existing_account_details_as_below(DataTable dataTable) {
//		
//	   Map<String, String> dataMap= dataTable.asMap(String.class,String.class);
//	   
//	   regUser = new RegistrationPage (driver);
//	   
//	   regUser.entercustomername(dataMap.get("Name"));
//	   regUser.enteremail(dataMap.get("Email"));
//	   regUser.enterpassword(dataMap.get("Password"));
//	   regUser.enterpasswordagain(dataMap.get("PasswordAgain")); 
//	}
	
}
