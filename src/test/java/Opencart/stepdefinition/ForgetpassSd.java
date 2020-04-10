package Opencart.stepdefinition;

import Opencart.Pages.ForgetPass_OCpage;
import baseclass.Basepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Screenshot;

public class ForgetpassSd extends Basepage {
	ForgetPass_OCpage forgot;

	@Given("^the user opens broswer$")
	public void the_user_opens_broswer() throws Throwable {
		launchBrowser();
	}

	@When("^the user clicks on my accounts and login$")
	public void the_user_clicks_on_my_accounts_and_login() throws Throwable {
		forgot = new ForgetPass_OCpage(driver);
		forgot.ChangePass();

	}

	@And("^the user clicks on forgot button$")
	public void the_user_clicks_on_forgot_button() throws Throwable {
		forgot.ForgotBtn();

	}

	@Then("^the user enters the email and clicks continue$")
	public void the_user_enters_the_email_and_clicks_continue() throws Throwable {
		forgot.Email("rakeshsara539@gmail.com");
		forgot.ContBtn();

	}

	@Then("^the user close the page$")
	public void the_user_close_the_page() throws Throwable {
		Screenshot util = new Screenshot(driver);
		util.takeSnapShot("src\\test\\resources\\screenshot\\forgotpassPage.png");
		driver.close();

	}

}
