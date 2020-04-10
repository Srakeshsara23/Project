package Opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Basepage;

public class Specials_OCpage extends Basepage {

	@FindBy(linkText = "Specials")
	WebElement offers;
	@FindBy(xpath = "//div[@id='content']/div[2]/div/div/div[2]/div[2]/button/span")
	WebElement Addtocart;

	public Specials_OCpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void SpecialOffer() {
		offers.click();

	}

	public void AddCart() {
		Addtocart.click();

	}
}