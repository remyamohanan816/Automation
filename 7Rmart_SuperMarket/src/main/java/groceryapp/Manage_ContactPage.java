package groceryapp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import utilities.Wait_Utility;

public class Manage_ContactPage {
	public WebDriver driver;
	// Wait_Utility wait = new Wait_Utility();

	public Manage_ContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
	WebElement action;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "(//textarea[@id='content'])[1]")
	WebElement address;
	@FindBy(xpath = "(//textarea[@id='content'])[2]")
	WebElement delivery;
	@FindBy(xpath = "//input[@id='del_limit']")
	WebElement limit;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement update;

	public Manage_ContactPage clickOnAction() {
		action.click();
		return this;
	}

	public Manage_ContactPage enterPhoneNumber(String Phone) {
		phone.clear();
		phone.sendKeys(Phone);
		return this;
	}

	public Manage_ContactPage enterEmail(String Email) {
		email.clear();
		email.sendKeys(Email);
		return this;
	}

	public Manage_ContactPage enterAddress(String Address) {
		address.clear();
		address.sendKeys(Address);
		return this;
	}

	public Manage_ContactPage enterDeliveryTime(String Delivery) {
		delivery.clear();
		delivery.sendKeys(Delivery);
		return this;
	}

	public Manage_ContactPage enterDeliveryChargeLimit(String Limit) {
		limit.clear();
		limit.sendKeys(Limit);
		return this;
	}

	public Manage_ContactPage clickOnUpdate() {

		// wait.elementtoBeClickable(driver, update);
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", update);
		update.click();
		return this;
	}

}
