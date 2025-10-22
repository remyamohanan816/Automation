package groceryapp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUpload_Utility;
import utilities.Wait_Utility;

public class Manage_Category {
	public WebDriver driver;
	Wait_Utility wait = new Wait_Utility();
	FileUpload_Utility fileupload = new FileUpload_Utility();

	public Manage_Category(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement add;
	@FindBy(xpath = "//input[@id='category']")
	WebElement category;
	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement discount;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement file;
	@FindBy(xpath = "(//input[@value='yes'])[1]")
	WebElement radiotop;
	@FindBy(xpath = "(//input[@value='no'])[2]")
	WebElement radioleft;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement save;

	public Manage_Category clickOnAdd() {
		add.click();
		return this;
	}

	public Manage_Category clickOnCategory(String Category) {
		category.sendKeys(Category);
		return this;
	}

	public Manage_Category clickOnDiscount() {
		discount.click();
		return this;
	}

	public Manage_Category chooseFile(String File) {
		fileupload.fileUploadForSendKeys(file, Constant.IMAGEPATH);
		// file.sendKeys(File);
		return this;
	}

	public Manage_Category clickOnTopMenu() {
		wait.elementtoBeClickable(driver, radiotop);
		radiotop.click();
		return this;
	}

	public Manage_Category clickOnLeftMenu() {
		wait.elementtoBeClickable(driver, radioleft);
		radioleft.click();
		return this;
	}

	public Manage_Category clickOnSave() {
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", save);
		save.click();
		return this;
	}

}
