package upsPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpsLOginPageObject {
	
	public WebDriver driver;
	public UpsLOginPageObject(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	

	@FindBy(linkText = "Log In")
	@CacheLookup
	WebElement login;

	@FindBy(xpath= "//input[@id='email']")
	@CacheLookup
	WebElement email;

	@FindBy(id = "pwd")
	@CacheLookup
	WebElement Password;

	@FindBy(name = "getTokenWithPassword")
	@CacheLookup
	WebElement SendKey;

	public void clickLogin() {
		login.click();
	}

	public void sendEmail(String Email) {
		email.sendKeys(Email);

	}

	public void sendpassword(String password) {
		Password.sendKeys(password);
	}

	public void clickSendButton() {
		SendKey.click();
	}

}
