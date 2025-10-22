package groceryapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Page_Utility;

public class Manage_CategorySearchPage {
	public WebDriver driver;

	public Manage_CategorySearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement search;
	@FindBy(xpath = "//input[@class='form-control']")
	WebElement category;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	WebElement categorysearch;
	@FindBy(xpath = "//span[@id='res']")
	WebElement notfound;

	public Manage_CategorySearchPage clickOnSearch() {
		search.click();
		return this;
	}

	public Manage_CategorySearchPage typeCategory(String Category) {
		category.sendKeys(Category);
		return this;
	}

	public Manage_CategorySearchPage clickCategorySearch() {
		categorysearch.click();
		return this;
	}

	public boolean isAlertDisplayed() {
		return notfound.isDisplayed();
	}

}
