package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_Utility {
public WebDriver driver;
	
	public Page_Utility(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void selectByIndex(WebElement element, int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void selectByVisibleText(WebElement element, String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void selectByValue(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void javaScriptExecuterClick(WebElement element)
	{
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();",element);
	}
	public void rightClick(WebElement element) //mouse right click
	{
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

}
