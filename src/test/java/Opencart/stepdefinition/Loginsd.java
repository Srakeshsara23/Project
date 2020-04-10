package Opencart.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Opencart.Pages.login_OCpage;
import baseclass.Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Excelllogin;
import utility.Screenshot;

public class Loginsd extends Basepage {

	final static Logger logger = LogManager.getLogger(Loginsd.class.getName());
	Excelllogin data = new Excelllogin();
	login_OCpage login;

	@Given("^a user launch the browser$")
	public void a_user_launch_the_browser() throws Throwable {

		launchBrowser();
		logger.info("browser opens");

	}

	@When("^the user opens opencart login page$")
	public void the_user_opens_opencart_login_page() throws Throwable {

		login = new login_OCpage(driver);
		login.OcLogin();
		logger.debug("login page");
	}

	@Then("^the user login using (.+) and (.+)$")
	public void the_user_login_using_and(String username, String password) throws Throwable {
		Excelllogin excellogin = new Excelllogin();
		login.UserName(excellogin.excel_username(0));
		login.Password(excellogin.excel_password(0));

		logger.info("sucessful login");
	}

	@Then("^the user close the login page$")
	public void the_user_close_the_login_page() throws Throwable {
		Screenshot util = new Screenshot(driver);
		util.takeSnapShot("src\\test\\resources\\screenshot\\loginPage.png");
		logger.error("browser is closed");
		driver.close();

	}
}
