package groceryapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Page_Utility;

public class Admin_UserPage {
	public WebDriver driver;
	Page_Utility page = new Page_Utility(driver);

	public Admin_UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); //driver - element locator  this -object page
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement New;
	@FindBy(xpath = "//input[@id='username']")
	WebElement usern;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passn;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement type;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement save;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement alert;

	public Admin_UserPage clickOnNew() {
		New.click();
		return this;
	}

	public Admin_UserPage userAndPass(String User, String Pass) {
		usern.sendKeys(User);
		passn.sendKeys(Pass);
		return this;

	}

	public Admin_UserPage userType(int index) {
		page.selectByIndex(type, index);
		return this;
	}

	public Admin_UserPage clickOnSave() {
		save.click();
		return this;
	}

	// username already exist
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

}
