package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;


public class loginStepDefinitions {


    HomePage homeObject ;
    LoginPage loginPage;
    WebDriver drvier;


    @Given("user go to login page")
    public void go_to_login_page() throws Throwable {
        homeObject = new HomePage(drvier);
        homeObject.openLoginPage();
    }

    @When("user login with {string} and {string}")
    public void valid_username_password(String username, String password)
    {

        loginPage.UserLogin("username","password");
    }


    @Then("user login to the system successfully")
    public void success_login()
    {
        // Please remove below line and do it on your own
        Assert.assertTrue(homeObject.);



    }

    @And("user should navigate to homePage")
    public boolean navigate_to_homepage(){
        System.out.println();
        return false;
    }

}
