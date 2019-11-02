package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	private @FindBy(xpath="//input[@name='username']") WebElement email;
	private @FindBy(xpath="//input[@name='password']") WebElement password;
	private @FindBy(xpath="//button[@type='submit' and @class='btn btn-primary block full-width m-b']") WebElement loginButton;
	
	

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public PatientListingPage doLogin(String email, String pass){
		
		getEmail().sendKeys(email);
		getPassword().sendKeys(pass);
		getLoginButton().click();
		
		return new PatientListingPage();
	}
	
	
}
