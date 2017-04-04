package com.cucumber.stepdefinitions;

import com.feature.common_functions.CommonFunctions;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepsDefenitions {

	CommonFunctions common = new CommonFunctions();
	@Given("^visit OrangeHRM login page$")
	public void visit_OrangeHRM_login_page() throws Throwable {
		// Open OrangeHRM site
		common.openOrangeHRMSite();
	}

	@When("^enter the username \"(.*?)\" and password \"(.*?)\"$")
	public void enter_valid_and(String userName, String password) throws Throwable {
		common.enterUserName(userName);
		common.enterPassword(password);
	}

	@When("^click on the Login button$")
	public void click_on_the_Login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		common.clickLoginButton();
	}

	@Then("^user should able to see the orangeHRM homepage with welcome message \"(.*?)\"$")
	public void user_should_able_to_see_the_orangeHRM_homepage(String welcomeText) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		common.UserSignInVerification(welcomeText);
	}

	@After
	public void closeDriver()
	{
	common.closeOrangeHRMSite();
	}
	
}
