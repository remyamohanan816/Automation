package groceryapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Page_Utility;

public class Manage_ProductPage {
	public WebDriver driver;
	Page_Utility page = new Page_Utility(driver);

	public Manage_ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement search;
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	WebElement title;
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	WebElement code;
	@FindBy(xpath = "//select[@id='cat_id']")
	WebElement category;
	@FindBy(xpath = "//select[@id='sb']")
	WebElement sub;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	WebElement finalsearch;

	public Manage_ProductPage clickOnSearh() {
		search.click();
		return this;
	}

	public Manage_ProductPage enterTitle(String Title) {
		title.clear();
		title.sendKeys(Title);
		return this;
	}

	public Manage_ProductPage enterproductCode(String Code) {
		code.clear();
		code.sendKeys(Code);
		return this;
	}

	public Manage_ProductPage selectCategory(int Category) {

		page.selectByIndex(category, Category);
		return this;
	}

	public Manage_ProductPage selectSubCategory(int Sub) {

		page.selectByIndex(sub, Sub);
		;
		return this;
	}

	public Manage_ProductPage clickSearch() {
		finalsearch.click();
		return this;
	}

}
