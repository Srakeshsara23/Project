package Opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Basepage;

public class Currency_OCpage extends Basepage {
	@FindBy(xpath = "//*[@id='form-currency']/div/button/span") /* xpath for currency option */
	WebElement currency;
	@FindBy(xpath = "//*[@id=\'form-currency\']/div/ul/li[2]/button") /* xpath for euro option under currency */
	WebElement euro;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/h4/a") /* xpath for selecting the product */
	WebElement product;

	public Currency_OCpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void CurrencyChange() {
		currency.click();
		euro.click();
	}

	public void SelectProduct() {
		product.click();

	}

}
