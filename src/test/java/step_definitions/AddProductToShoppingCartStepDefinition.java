package step_definitions;

import pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductToShoppingCartStepDefinition {
    ShoppingCartPage shoppingCartPage=Hooks.homepage.ShoppingCartPage1();
    @Given("user should login")
    public void user_should_login() {

    }
    @When("user add First products to Shopping cart")
    public void user_add_first_products_to_shopping_cart() {
        shoppingCartPage.addFirstProduct();
    }
    @Then("assert shopping cart is contained First product")
    public void assert_shopping_cart_is_contained_two_product2() {
        Assert.assertEquals(shoppingCartPage.getResultToAddToCart(),"The product has been added to your shopping cart");
        System.out.println("--First product --"+shoppingCartPage.getResultToAddToCart());
    }
    @And("user add second products to Shopping cart")
    public void user_add_second_products_to_shopping_cart() {
        shoppingCartPage.addSecondProduct();
    }
    @Then("assert shopping cart is contained second product")
    public void assert_shopping_cart_is_contained_two_product() {
        Assert.assertEquals(shoppingCartPage.getResultToAddToCart(),"The product has been added to your shopping cart");
        System.out.println("--second product --"+shoppingCartPage.getResultToAddToCart());
    }
}
