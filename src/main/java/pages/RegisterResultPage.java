package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterResultPage extends PageBase
{

	public RegisterResultPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className="result")
	WebElement registerResult ;



	public String getRegisterResultText (){
		return registerResult.getText();
	}
	

	
}
