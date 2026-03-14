package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Homepage;
import pageObjects.LoginPage;
import utils.BaseClass;
import utils.BrowserInvoke;

public class LoginTest extends BaseClass{
	

	@Test(priority = 1)
	public void login() throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.Login();
		Thread.sleep(3000);
		//WebElement titlepage = driver.findElement(By.xpath("//div//div[text()='Swag Labs']"));
		//Assert.assertEquals(titlepage.getText(), "Swag Labs");
		//Thread.sleep(3000);
		Homepage hp = new Homepage(driver);
		hp.menuaboutverification();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,3000)", "");
		
		Thread.sleep(3000);
		WebElement easticon = driver.findElement(By.xpath("(//div[@class=\"MuiStack-root css-rejsjb\"])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(easticon).click().build().perform();
		Thread.sleep(5000);
		
		
	}
	
	//@Test(priority = 2)
	//public void assertcheck() {
		//WebElement titlepage = driver.findElement(By.xpath("//div//h1[text()='MOBILE APP TESTING']"));
		//Assert.assertEquals(titlepage.getText(), "MOBILE APP TESTING");
	//}
}
