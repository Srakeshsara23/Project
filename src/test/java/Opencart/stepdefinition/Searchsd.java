package Opencart.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Opencart.Pages.Search_OCpage;
import baseclass.Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Screenshot;

public class Searchsd extends Basepage {
	Search_OCpage search;
	final static Logger logger = LogManager.getLogger(Searchsd.class.getName());

	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
		launchBrowser();
		logger.info("browser opens");
	}

	@When("^the user opens the opencart search page$")
	public void the_user_opens_the_opencart_search_page() throws Throwable {
		search = new Search_OCpage(driver);
		search.SearchBox();
		search.Search("Palm Treo Pro");
		logger.debug("product opened");

	}

	@Then("^the user search the product$")
	public void the_user_search_the_product() throws Throwable {
		search = new Search_OCpage(driver);
		search.Button();
		logger.info("product searched");

	}

	@Then("^the user close the search page$")
	public void the_user_close_the_search_page() throws Throwable {

		Screenshot util = new Screenshot(driver);
		util.takeSnapShot("src\\test\\resources\\screenshot\\searchPage.png");
		logger.error("browser is closed");
		driver.close();

	}

}
