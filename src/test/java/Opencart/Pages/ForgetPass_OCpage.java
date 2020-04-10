package Opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Basepage;

public class ForgetPass_OCpage extends Basepage {
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement myaccount;
	@FindBy(linkText = "Login")
	WebElement login;
	@FindBy(xpath = "//a[contains(text(),'Forgotten Password')]")
	WebElement forgotpas;
	@FindBy(id = "input-email")
	WebElement email;
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
	WebElement ctn;

	public ForgetPass_OCpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
//*myaccount and login*//
	public void ChangePass() {
		myaccount.click();
		login.click();
	}
//*for forget button*//
	public void ForgotBtn() {

		forgotpas.click();
	}

	public void Email(String mail) {

		email.sendKeys(mail);
	}

	public void ContBtn() {

		ctn.click();
	}

}
