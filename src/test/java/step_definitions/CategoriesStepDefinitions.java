package step_definitions;

import pages.CategoriesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoriesStepDefinitions {

    CategoriesPage categoriesPage=Hooks.homepage.CategoriesPage1();
    @Given("Logged user in home page")
    public void logged_user_in_home_page() {

    }
    @When("User  has Selected Categories and Hover to Sub_Categories")
    public void User_has_Selected_Categories_and_Hover_to_Sub_Categories() {
        categoriesPage.selectSubCategory();
        categoriesPage.selectCategoryBook();


    }
    @Then("Click on sub categories successfully")
    public void click_on_sub_categories_successfully() {

        System.out.println("successfylly cat");

    }

}
