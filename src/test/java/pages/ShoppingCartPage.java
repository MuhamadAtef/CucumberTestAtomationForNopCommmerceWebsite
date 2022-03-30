package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends CategoriesPage {
    WebDriver driver;

    private By FirstProduct = By.xpath("//div[@data-productid='39']");
    private By addFirstToCart =By.id("add-to-cart-button-39");
    private By SecondProduct = By.xpath("//div[@data-productid='19']");
    private By addSecondToCart =By.id("add-to-cart-button-19");
    private By successAddToShopping =By.xpath("//*[@id=\"bar-notification\"]/div/p");

    public ShoppingCartPage(WebDriver driver) {
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
    public String getResultToAddToCart(){
        return driver.findElement(successAddToShopping).getText();
    }


}
