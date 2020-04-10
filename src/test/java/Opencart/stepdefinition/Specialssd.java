package Opencart.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Opencart.Pages.Specials_OCpage;
import baseclass.Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Screenshot;

public class Specialssd extends Basepage {
	Specials_OCpage special;
	final static Logger logger = LogManager.getLogger(Specialssd.class.getName());

	@Given("^the user to open browser chrome$")
	public void the_user_to_open_browser_chrome() throws Throwable {
		launchBrowser();
		logger.info("browser opens");
	}

	@When("^the user clicks on the specials$")
	public void the_user_clicks_on_the_specials() throws Throwable {
		special = new Specials_OCpage(driver);
		special.SpecialOffer();
		logger.debug("Special selected");
	}

	@Then("^the user will see the specials and add to the cart$")
	public void the_user_will_see_the_specials_and_add_to_the_cart() throws Throwable {
		special = new Specials_OCpage(driver);
		special.AddCart();
		logger.info("Specials added");
	}

	@Then("^the user close the site and browser$")
	public void the_user_close_the_site_and_browser() throws Throwable {
		Screenshot util = new Screenshot(driver);
		util.takeSnapShot("src\\test\\resources\\screenshot\\specialPage.png");
		logger.error("page is closed");
		driver.close();
	}

}
