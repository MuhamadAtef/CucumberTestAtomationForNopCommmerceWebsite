package step_definitions;

import pages.ResetPasswordPage;
import pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ResetPasswordStepDefinitions {

    ResetPasswordPage resetPasswordPage;
//    LoginPage loginPage = Hooks.homepage.loginPageNavigate();

   @Given("user go to Reset page")
    public void user_go_to_reset_page() {
     //  loginPage.logOutUser();
      Hooks.homepage.loginPageNavigate();
       resetPasswordPage =Hooks.homepage.restPasswordPage();
    }
    @When("user reset with valid email as {string}")
    public void user_reset_with_valid_email(String email) {
       resetPasswordPage.setEmailToRestPassword(email);
    }
    @And("user press on Recover button")
    public void user_press_on_recover_button() {
       resetPasswordPage.clickOnResetBtn();
    }
    @Then("user rest password successfully")
    public void user_rest_password_successfully() throws InterruptedException {
       Assert.assertEquals(resetPasswordPage.getResultReset(),"Email with instructions has been sent to you.","incorrect message");
       System.out.println("msg : "+ resetPasswordPage.getResultReset());
       Thread.sleep(3000);
     }


}
