package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompareListCartPage extends CategoriesPage {
    WebDriver driver;

    private By FirstProduct = By.xpath("//div[@data-productid='38']");
    private By addFirstToCart =By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[2]/button");
    private By SecondProduct = By.xpath("//div[@data-productid='20']");
    private By addSecondToCart =By.xpath("//button[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/20\"),!1']");
    private By successAddToCompare =By.xpath("//*[@id=\"bar-notification\"]/div/p");
    public CompareListCartPage(WebDriver driver) {
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
