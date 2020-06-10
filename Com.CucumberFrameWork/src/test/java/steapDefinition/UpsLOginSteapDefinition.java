package steapDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upsPageObject.UpsLOginPageObject;

public class UpsLOginSteapDefinition {
  
  public WebDriver driver;
  public UpsLOginPageObject l;
	
		
	@Given("user launch Chrome driver")
	public void user_launch_Chrome_driver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		l = new UpsLOginPageObject(driver);
	}

	@When("user open url {string}")
	public void user_open_url(String url) {
		driver.get(url);
	}

	@When("click on login button")
	public void click_on_login_button() {
        l.clickLogin();
	}

	@When("user enters Email as {string} and Password As {string}")
	public void user_enters_Email_as_and_Password_As(String Email, String password) throws InterruptedException {
		Thread.sleep(2000);
	    l.sendEmail(Email);
	    l.sendpassword(password);
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		l.clickSendButton();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		driver.getTitle();
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}

}
