package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListCartPage extends CategoriesPage {
    WebDriver driver;

    private By FirstProduct = By.xpath("//div[@data-productid='37']");
    private By addFirstToCart =By.id("add-to-wishlist-button-37");
    private By SecondProduct = By.xpath("//div[@data-productid='18']");
    private By addSecondToCart =By.id("add-to-wishlist-button-18");
    private By successAddToCompare =By.xpath("//*[@id=\"bar-notification\"]/div/p");

    public WishListCartPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public void addFirstProduct(){
        selectCategoryBook();
        driver.findElement(FirstProduct).click();
        driver.findElement(addFirstToCart).click();
    }

    public void addSecondProduct(){
        selectSubCategory();
        driver.findElement(SecondProduct).click();
        driver.findElement(addSecondToCart).click();
    }
    public String getResultSuccessAddToCompare(){
        return driver.findElement(successAddToCompare).getText();
    }



}
