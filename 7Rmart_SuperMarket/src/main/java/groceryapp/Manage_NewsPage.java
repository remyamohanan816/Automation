package groceryapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_NewsPage {
	public WebDriver driver;

	public Manage_NewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement neww;
	@FindBy(xpath = "//textarea[@id='news']")
	WebElement news;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement save;
	@FindBy(xpath = "//span[@id='res']")
	WebElement alert;

	public Manage_NewsPage clickOnNew() {
		neww.click();
		return this;
	}

	public Manage_NewsPage enterNews(String News) {
		news.sendKeys(News);
		return this;
	}

	public Manage_NewsPage clickOnSave() {
		save.click();
		return this;
	}

	public boolean noResultFound() {
		return alert.isDisplayed();
	}

}
