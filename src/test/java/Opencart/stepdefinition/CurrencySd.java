package Opencart.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Opencart.Pages.Currency_OCpage;
import baseclass.Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.Screenshot;

public class CurrencySd extends Basepage {
	Currency_OCpage currency;
	final static Logger logger = LogManager.getLogger(Currency_OCpage.class.getName());

	@Given("^the user launches the chrome browser$")
	public void the_user_launches_the_chrome_browser() throws Throwable {
		launchBrowser();
	}

	@Then("^the user clicks on currency and choose  currency$")
	public void the_user_clicks_on_currency_and_choose_currency() throws Throwable {
		currency = new Currency_OCpage(driver);
		currency.CurrencyChange();
		logger.debug("product selected");
	}

	@Then("^the user choose the product$")
	public void the_user_choose_the_product() throws Throwable {
		currency = new Currency_OCpage(driver);
		currency.SelectProduct();
		logger.debug("currency clicked");
	}

	@Then("^the user close the opencart$")
	public void the_user_close_the_opencart() throws Throwable {
		Screenshot util = new Screenshot(driver);
		util.takeSnapShot("src\\test\\resources\\screenshot\\CurrencyPage.png");
		logger.error("page is closed");
		driver.close();
	}

}
