package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumHelper;

public class LoginPage {

	WebDriver ldriver ;
	
	public LoginPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div//input[@id='user-name']")
	WebElement uName;
	
	@FindBy(xpath="//div//input[@id='password']")
	WebElement pwd;
	
	@FindBy(xpath="//div//input[@id='login-button']")
	WebElement login_btn;
	
public void Login() {
		
		SeleniumHelper.sendDataTextBox(uName, "standard_user");
		SeleniumHelper.sendDataTextBox(pwd, "secret_sauce");
		SeleniumHelper.clickElement(login_btn);
		
	}
}
