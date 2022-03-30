package step_definitions;

import pages.CheckOutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CreateOrderE2EStepDefinition {
    CheckOutPage checkOutPage=Hooks.homepage.CheckOutPage1();
    @Given("User Go to Shopping cart")
    public void user_got_to_shopping_cart() {
        checkOutPage.GotoCart();
    }
    @When("user is entered Data to create order")
    public void user_is_entered_data_to_create_order() throws InterruptedException {
        checkOutPage.CheckoutProduct("Muhammad", "Atef", "Egypt", "test123@gmail.com", "Cairo", "12345", "25665214", "Center");

    }
    @Then("assert user created order successful")
    public void assert_user_created_order_successful() throws InterruptedException {
        checkOutPage.confirmOrder();
        Assert.assertTrue(checkOutPage.ThankYou.isDisplayed());
        checkOutPage.viewOrderDetails();
        System.out.println(checkOutPage.getOrderInfo());
        Assert.assertEquals(checkOutPage.getOrderInfo(),"Order information","order not compete");
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("orderdetails"));

    }

}
