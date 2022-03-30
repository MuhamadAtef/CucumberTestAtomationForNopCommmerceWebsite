package step_definitions;

import pages.CompareListCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductToCompareCartStepDefinition {
    CompareListCartPage compareListCartPage=Hooks.homepage.CompareListCartPage1();

    @Given("user must be login")
    public void user_must_be_login() {

    }
    @When("user add First products to compare cart")
    public void user_add_first_products_to_compare_cart() {
       compareListCartPage.addFirstProduct();
    }
    @And("user add second products to compare cart")
    public void user_add_second_products_to_compare_cart() {
        compareListCartPage.addSecondProduct();
    }
    @Then("assert compare cart have two product")
    public void assert_compare_cart_have_two_product() throws InterruptedException {
        Assert.assertEquals(compareListCartPage.getResultSuccessAddToCompare(),"The product has been added to your product comparison");
        System.out.println("--Two product--"+compareListCartPage.getResultSuccessAddToCompare());
        Thread.sleep(3000);
    }


}
