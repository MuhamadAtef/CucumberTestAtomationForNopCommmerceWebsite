package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;
    private By SearchField=By.id("small-searchterms");
    private By SearchBtn=By.cssSelector("button[class=\"button-1 search-box-button\"]");
    private By SearchResultItem = By.cssSelector("h2[class=\"product-title\"] a");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickingSearchField(){
        driver.findElement(SearchField).click();
    }
    public void SearchItems(String searchItem){
        driver.findElement(SearchField).sendKeys(searchItem);

    }
    public void clickingSearchBtn(){
        driver.findElement(SearchBtn).click();
    }
    public int CountSearchResultItems(){
       return driver.findElements(SearchResultItem).size();
    }

}
