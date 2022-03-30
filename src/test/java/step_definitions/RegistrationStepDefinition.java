package step_definitions;

import pages.HomePage;
import pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegistrationStepDefinition {

    private  String firstname="Muhammad";
    private String lastname="Atef";
    public  String userEmail="eng.muhamadatef@gmail.com";
    public  String password="P@ssw0rd";
    RegistrationPage registrationPage;


    @Given("user is redirected to register page")
    public void user_is_redirected_to_register_page() {
        registrationPage =Hooks.homepage.RegisterPageNavigate();

    }
    @When("user is registered with valid firstname and lastname and email and password and confirmPassword")
    public void user_is_registered_with_valid_firstname_and_lastname_and_email_and_password_and_confirm_password() {
        registrationPage.registerNewUser(firstname,lastname,userEmail,password);

    }
    @And("user press on register button")
    public void user_press_on_register_button() {
        registrationPage.clickRegisterBtn();
    }

    @Then("user register to the system successfully")
    public void user_register_to_the_system_successfully() {
        Assert.assertEquals(registrationPage.resultRegister(), "Your registration completed");
        System.out.println("Welcome Muhammad..."+ registrationPage.resultRegister());
    }

    @And("user logout to login page")
    public void user_logout_to_login_page() {
        registrationPage.logOutUser();
    }


}
