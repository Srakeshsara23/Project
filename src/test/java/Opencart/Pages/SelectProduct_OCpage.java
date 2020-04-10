package Opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Basepage;

public class SelectProduct_OCpage extends Basepage {

	@FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[4]/a")
	WebElement tablet;
	@FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[2]/div[1]/h4/a")
	WebElement product;
	@FindBy(xpath = "//*[@id='button-cart']")
	WebElement cart;

	public SelectProduct_OCpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void SelectProduct() {
		tablet.click();
		product.click();
	}

	public void Verify() {
		cart.click();

	}

}
