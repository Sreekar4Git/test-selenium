package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumHelper;

public class Homepage {


	WebDriver ldriver ;
	
	public Homepage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//div//button[@id='react-burger-menu-btn']")
	WebElement menubtn;
	
	@FindBy(xpath="//div//nav//a[2][text()='About']")
	WebElement about;
	
	@FindBy(xpath="//div//button[@class='onetrust-close-btn-handler banner-close-button ot-close-icon']")
	WebElement alertclosebtn;
	
	@FindBy(xpath="//div//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-3bxbw2'][text()='Products']")
	WebElement productsbtn;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-1mh9myf'][text()='Sauce Mobile']")
	WebElement saucemblbtn;
	
	public void menuaboutverification() throws Exception {
		
		SeleniumHelper.clickElement(menubtn);
		Thread.sleep(3000);
		SeleniumHelper.clickElement(about);
		Thread.sleep(10000);
		SeleniumHelper.clickElement(alertclosebtn);
		Thread.sleep(3000);
		SeleniumHelper.clickElement(productsbtn);
		Thread.sleep(3000);
		SeleniumHelper.clickElement(saucemblbtn);
		Thread.sleep(3000);
		
	}
}
