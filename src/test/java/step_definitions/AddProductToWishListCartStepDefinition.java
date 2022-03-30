package step_definitions;

import pages.WishListCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductToWishListCartStepDefinition {
    WishListCartPage wishListCartPage=Hooks.homepage.WishListCartPage1();
    @Given("user must be login")
    public void user_must_be_login() {

    }
    @When("user add First products to Wishlist cart")
    public void user_add_first_products_to_wishlist_cart() {

        wishListCartPage.addFirstProduct();
    }
    @When("user add Second products to Wishlist cart")
    public void user_add_Second_products_to_wishlist_cart() {

        wishListCartPage.addSecondProduct();
    }
    @Then("assert Wishlist cart have two product")
    public void assert_wishlist_cart_have_two_product() {
        Assert.assertEquals(wishListCartPage.getResultSuccessAddToCompare(),"The product has been added to your wishlist");
        System.out.println("--Two product--"+wishListCartPage.getResultSuccessAddToCompare());
    }

}
