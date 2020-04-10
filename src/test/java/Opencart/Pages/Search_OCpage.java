package Opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Basepage;

public class Search_OCpage extends Basepage {

	@FindBy(xpath = "//div[@id='search']/input")
	WebElement searchpage;
	@FindBy(xpath = "//*[@id=\"search\"]/span/button")
	WebElement searchbtn;

	public Search_OCpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void SearchBox() {
		searchpage.click();
	}

	public void Search(String names) {

		searchpage.sendKeys(names);

	}

	public void Button() {
		searchbtn.click();

	}

}
