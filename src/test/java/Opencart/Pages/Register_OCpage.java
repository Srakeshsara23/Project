package Opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Basepage;

public class Register_OCpage extends Basepage {

	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement myaccount;
	@FindBy(linkText = "Register")
	WebElement register;
	@FindBy(id = "input-firstname")
	WebElement firstname;
	@FindBy(id = "input-lastname")
	WebElement lastname;
	@FindBy(id = "input-email")
	WebElement usernameweb;
	@FindBy(id = "input-telephone")
	WebElement telephone;
	@FindBy(id = "input-password")
	WebElement passwordweb;
	@FindBy(id = "input-confirm")
	WebElement confirm;
	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input\n")	
	WebElement agree;
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement ctn;
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement ctn1;

	public Register_OCpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void OcLogin() {
		myaccount.click();
		register.click();
	}

	public void FirstName(String username) {
		firstname.sendKeys(username);

	}

	public void LastName(String username2) {
		lastname.sendKeys(username2);

	}

	public void UserName1(String mail) {
		usernameweb.sendKeys(mail);

	}

	public void TelephoneNum(String number) {

		telephone.sendKeys(number);
	}

	public void Password(String password) {

		passwordweb.sendKeys(password);
	}

	public void ConfirmPass(String password1) {

		confirm.sendKeys(password1);
	}

	public void Agree() {
		agree.click();

	}

	public void ctn() {

		ctn.click();
	}

	public void ctn1() {

		ctn1.click();
	}

}
