package groceryapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public WebDriver driver;

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement admin;
	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
	WebElement logout;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
	WebElement moreinfo;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[9]")
	WebElement categoryinfo;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
	WebElement searchmoreinfo;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[3]")
	WebElement contactmoreinfo;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[7]")
	WebElement newsmoreinfo;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[8]")
	WebElement footermoreinfo;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[6]")
	WebElement productmoreinfo;

	public Home_Page clickAdmin() {
		admin.click();
		return this;
	}

	public Home_Page clickLogout() {
		logout.click();
		return this;
	}

	public Admin_UserPage clickMoreinfo() {
		moreinfo.click();
		return new Admin_UserPage(driver);

	}

	public Manage_Category clickOnMoreinfo() {
		categoryinfo.click();
		return new Manage_Category(driver);

	}

	public Admin_SearchPage clickMoreinfosearch() {
		searchmoreinfo.click();
		return new Admin_SearchPage(driver);

	}

	public Manage_NewsPage clickOnMoreInfoNews() {
		newsmoreinfo.click();
		return new Manage_NewsPage(driver);
	}

	public Manage_ContactPage clickOnContactMoreInfo() {
		contactmoreinfo.click();
		return new Manage_ContactPage(driver);
	}

	public Manage_FooterTextPage clickOnFooterMoreinfo() {
		footermoreinfo.click();
		return new Manage_FooterTextPage(driver);
	}

	public Manage_ProductPage clickOnProductMoreinfo() {
		productmoreinfo.click();
		return new Manage_ProductPage(driver);
	}

	public Manage_CategorySearchPage clickOnCategorySearchMoreinfo() {
		categoryinfo.click();
		return new Manage_CategorySearchPage(driver);
	}

}
