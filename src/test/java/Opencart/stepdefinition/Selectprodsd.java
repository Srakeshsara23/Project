package Opencart.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Opencart.Pages.SelectProduct_OCpage;
import baseclass.Basepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.Screenshot;

public class Selectprodsd extends Basepage {
	SelectProduct_OCpage product;
	final static Logger logger = LogManager.getLogger(Selectprodsd.class.getName());

	@Given("^user opens the chrome browser$")
	public void user_opens_the_chrome_browser() throws Throwable {
		launchBrowser();
		logger.info("browser opens");

	}

	@Then("^user select product$")
	public void user_select_product() throws Throwable {
		product = new SelectProduct_OCpage(driver);
		product.SelectProduct();
		logger.debug("product selected");

	}

	@And("^user add the product to cart$")
	public void user_add_the_product_to_cart() throws Throwable {
		product.Verify();
		logger.info("product added");
	}

	@Then("^close the opencart page$")
	public void close_the_opencart_page() throws Throwable {
		Screenshot util = new Screenshot(driver);
		util.takeSnapShot("src\\test\\resources\\screenshot\\productPage.png");
		logger.error("page is closed");
		driver.close();
	}

}
