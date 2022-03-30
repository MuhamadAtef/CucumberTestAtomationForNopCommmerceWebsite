package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPasswordPage {
    private WebDriver driver;

    private By EmailToResetPassword =By.id("Email");
    private By RecoverBtn =By.xpath("//button[@name='send-email']");
    private By resultReset=By.xpath("//p[@class='content']");


    public ResetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setEmailToRestPassword(String email){
        driver.findElement(EmailToResetPassword).sendKeys(email);
    }
    public void clickOnResetBtn(){
        driver.findElement(RecoverBtn).click();
    }
    public String getResultReset(){

        return driver.findElement(resultReset).getText();
    }

}
