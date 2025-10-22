package groceryapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;

	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	WebElement username;
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")
	WebElement signin;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement alert;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;

	public Login_Page enterUsernamePassword(String Username, String Password) {
		username.sendKeys(Username);
		password.sendKeys(Password);
		return this;
	}

	public Home_Page clickSignup() {
		signin.click();
		return new Home_Page(driver);
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

	public boolean isdashboardDisplayed() {
		return dashboard.isDisplayed();
	}

}
