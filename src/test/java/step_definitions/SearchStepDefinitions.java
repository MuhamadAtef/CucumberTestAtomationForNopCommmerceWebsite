package step_definitions;

import io.cucumber.java.en.Given;
import pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SearchStepDefinitions {

    SearchPage searchPage=Hooks.homepage.SearchPage();

    @Given("user is clicked on search field")
    public void user_is_clicked_on_search_field()
    {
        searchPage.clickingSearchField();
    }

    @When("user is entered existing product name")
    public void user_is_entered_existing_product_name()
    {
        searchPage.SearchItems("book");

    }

    @And("user is clicked on search button")
    public void user_is_clicked_on_search_button()
    {
         searchPage.clickingSearchBtn();
    }

    @Then("user could find relative results")
    public void user_could_find_relative_results()
    {
        //int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();  // 0
        int count = searchPage.CountSearchResultItems();  // 0

        System.out.println(count);
        Assert.assertTrue(count > 0);

        // findelements     [webelement0, webelement1]
        for (int x = 0; x < count ; x++) {
            System.out.println("res"+Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
            Assert.assertTrue(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText().toLowerCase().contains("book"));


        }
    }

}
