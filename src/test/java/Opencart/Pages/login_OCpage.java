package Opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_OCpage
{

	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement myaccount;
	@FindBy(linkText = "Login")
	WebElement login;
	@FindBy(id = "input-email")
	WebElement usernameweb;
	@FindBy(id = "input-password")
	WebElement passwordweb;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbtn;

	public login_OCpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void OcLogin() {
		myaccount.click();
		login.click();
	}

	public void UserName(String username) {
		usernameweb.sendKeys(username);
	}

	public void Password(String password) {

		passwordweb.sendKeys(password);
	}

	public void LoginBtn() {

		loginbtn.click();
	}

}