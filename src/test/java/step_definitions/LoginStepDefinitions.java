package step_definitions;

import pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage;
    @Given("user go to login page")
    public void go_to_login_page()  {
        loginPage =Hooks.homepage.loginPageNavigate();
       }


    @When("user login with Email {string} and password {string} and click on login")
    public void valid_username_password(String Email , String password)
    {
        loginPage.UserLogin(Email,password);
    }


    @Then("user login to the system successfully")
    public void success_login()
    {
        Assert.assertEquals(loginPage.GetMyAccount(),"My account","Login successful");
        System.out.println("muhammad "+loginPage.GetMyAccount());
        loginPage.logOutUser();
    }

    @Then("user couldn't login and Error msg is appeared")
    public void fail_login(){
        System.out.println("invalid credentials");
    }

}
