package groceryapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Admin_SearchPage {
	public WebDriver driver;

	public Admin_SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement search;
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	WebElement username;
	@FindBy(xpath = "//select[@id='ut']")
	WebElement usertype;
	@FindBy(xpath = "(//button[@class='btn btn-block-sm btn-danger'])[1]")
	WebElement srch;
	@FindBy(xpath = "//span[@id='res']")
	WebElement result;

	public Admin_SearchPage clickOnSearch() {
		search.click();
		return this;

	}

	public Admin_SearchPage typeUsername(String Username) {
		username.sendKeys(Username);
		return this;
	}

	public Admin_SearchPage clickUserType(int type) {
		Select select = new Select(usertype);
		select.selectByIndex(type);
		return this;
	}

	public Admin_SearchPage clickAgainSearch() {
		srch.click();
		return this;
	}

	public boolean isResultDisplayed() {
		return result.isDisplayed();
	}

}
