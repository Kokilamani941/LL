package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.ConfigReader;

public class SigninPage {
	WebDriver driver=DriverFactory.getdriver();
	String loginURL=ConfigReader.getLoginPage();
	boolean isRequired;
	
	@FindBy (xpath="//*[@id='id_username']")static WebElement user;
	@FindBy (xpath="//*[@id='id_password']")static WebElement pwd;
	@FindBy (xpath="//*[@value='Login']")WebElement login_button;
	@FindBy (xpath="//div[@class='alert alert-primary']")WebElement alert;
	@FindBy (xpath="//a[@href='/register']")WebElement register;
	@FindBy (xpath="//a[@href='/logout']")WebElement signout;
	
	public SigninPage() {
		PageFactory.initElements(driver, this);
	}
	public void login_page() {
		driver.get(loginURL);
	}
	public Boolean doLogin(String username,String password) {
		user.clear();
		user.sendKeys(username);
		pwd.clear();
		user.sendKeys(password);
		
		if(username.isBlank()) {
		  JavascriptExecutor js_user=(JavascriptExecutor) driver;
		  isRequired=(Boolean)js_user.executeScript("return arguments[0].required;",user);
		return isRequired;
		}else if(password.isBlank()) {
			JavascriptExecutor js_password=(JavascriptExecutor) driver;
			isRequired=(Boolean)js_password.executeScript("return arguments[0].required;",password);
			return isRequired;
		}
	return isRequired;
	}
	public void login_button() {
		login_button.click();
		
	}
	public String click_login(){
		login_button.click();
		String msg=alert.getText();
		return msg;
	}
	public void register_link() {
		register.click();
	}
	public String register_page() {
		String Title=driver.getTitle();
		return Title;	
	}
	public void signout() {
		signout.click();
	}
}
