package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.SearchPage;

public class searchStepDefinitions {

    HomePage homeObject ;
    SearchPage searchPage;
    WebDriver drvier;


    @Given("^the user in the home page$")
    public void the_user_in_the_home_page() throws Throwable {
        homeObject = new HomePage(drvier);
    }

    @When(("user search with name of product")
            public void user_search_with_name_of_product()
            {
            searchPage.ProductSearch("book");
            }


    @Then("user could find relative results")
    public void user_could_find_relative_results()
    {

        int count =  searchPage.searchResults.size(); // 0
        System.out.println(count);
        Assert.assertTrue(count > 0);

        // findelements     [webelement0, webelement1]
        for (int x = 0; x < count ; x++) {
            System.out.println(searchPage.searchResults.get(x).getText());
            Assert.assertTrue(searchPage.searchResults.get(x).getText().toLowerCase().contains("book"));
        }
    }

}
