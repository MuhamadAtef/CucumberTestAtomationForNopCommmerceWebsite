package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    private WebDriver driver;

    private By genderMale= By.id("gender-male" );
    private By FirstName=  By.id("FirstName" );
    private By LastName=  By.id("LastName" );
    private By Email= By.id("Email" );
    private By Password= By.id("Password" );
    private By ConfirmPassword= By.id("ConfirmPassword" );
    private By registerBtn= By.id("register-button" );
    private By resRegister= By.className("result");
    private  By logout=By.linkText("Log out");

    public RegistrationPage(WebDriver d){
        this.driver=d;
    }
    public void registerNewUser(String firstName,String lastName ,String email ,String password){
        clickButton(driver.findElement(genderMale));
        setTextField(FirstName,firstName);
        setTextField(LastName,lastName);
        setTextField(Email,email);
        setTextField(Password,password);
        setTextField(ConfirmPassword,password);

    }
    public void clickRegisterBtn(){
        clickButton(driver.findElement(registerBtn));
    }
    public String resultRegister(){
        return driver.findElement(resRegister).getText();
    }
    public void logOutUser(){
        clickButton(driver.findElement(logout));
    }
    public void setTextField(By element ,String s){
        driver.findElement(element).sendKeys(s);
    }
    protected static void clickButton(WebElement button)
    {
        button.click();
    }


}
