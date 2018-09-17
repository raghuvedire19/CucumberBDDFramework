package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Configuration;
import Utility.PageElements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login {

	public WebDriver driver = Configuration.browser();
	public String url = Configuration.URL;
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = PageElements.UserName)
	private WebElement UserName;
	
	@FindBy(name = PageElements.Password)
	private WebElement Password;
	
	@FindBy(xpath = PageElements.LoginButton)
	private WebElement LoginButton;
	
	@FindBy(xpath = PageElements.Logout)
	private WebElement Logout;
	
	@Given("^User is present on Login page$")
	public void user_is_present_on_Login_page() throws Throwable {
	    driver.manage().window().maximize();
	    driver.get(url);
	}

	@When("^Title of page is Free CRM login$")
	public void title_of_page_is_Free_CRM_login() throws Throwable {
		String loginPage = driver.getTitle();
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service",loginPage);
	}

	@Then("^User enter \"(.*)\" and \"(.*)\"$")
	public void user_enter_username_and_password(String username, String password) throws Throwable {
		UserName.sendKeys(username);
		Password.sendKeys(password);
	}

	@Then("^User clicks on Submit button$")
	public void user_clicks_on_Submit_button() throws Throwable {
		Thread.sleep(5000);
		LoginButton.click();
		Thread.sleep(3000);
	}

	@Then("^User is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
		String homePage= driver.getTitle();
		//System.out.println(homePage);
		Assert.assertEquals("CRMPRO", homePage);
	}

	@Then("^User logout$")
	public void user_logout() throws Throwable {
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
//		System.out.println(frames.size());
		for (WebElement frame : frames) {
			String frameName = frame.getAttribute("name");
//			System.out.println(frameName);
			if (frameName.equals("mainpanel")){
				driver.switchTo().frame(frame);
			}
		}
		Logout.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("^Quit Browser$")
	public void quit_Browser() throws Throwable {
		driver.close();
		Thread.sleep(2000);
	}
}
