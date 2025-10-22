package groceryapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_FooterTextPage {
	public WebDriver driver;

	public Manage_FooterTextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
	WebElement footeraction;
	@FindBy(xpath = "//textarea[@id='content']")
	WebElement address;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement update;

	public Manage_FooterTextPage clickOnfooterAction() {
		footeraction.click();
		return this;
	}

	public Manage_FooterTextPage typeAddress(String Address) {
		address.clear();
		address.sendKeys(Address);
		return this;
	}

	public Manage_FooterTextPage typeEmail(String Email) {
		email.clear();
		email.sendKeys(Email);
		return this;
	}

	public Manage_FooterTextPage typePhoneNumber(String Phone) {
		phone.clear();
		phone.sendKeys(Phone);
		return this;
	}

	public Manage_FooterTextPage clickOnUpdate() {
		update.click();
		return this;
	}

}
