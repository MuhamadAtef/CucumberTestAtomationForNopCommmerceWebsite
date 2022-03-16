package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends PageBase 
{
	WebDriver driver;
	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="small-searchterms")
	WebElement searchTextBox ; 

	@FindBy(css="input.button-1.search-box-button")
	WebElement searchBtn ;


	@FindBy(css = "h2[class=\"product-title\"] a")
	List<WebElement> searchResults;


	public void ProductSearch(String productName) 
	{
		setTextElementText(searchTextBox, productName);
		clickButton(searchBtn);
	}




}
