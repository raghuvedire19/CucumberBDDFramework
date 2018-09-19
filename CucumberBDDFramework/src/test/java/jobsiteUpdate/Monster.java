package jobsiteUpdate;

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

public class Monster {

	public WebDriver driver = Configuration.browser();
	public String url = "https://login20.monster.com/Login/SignIn?";
	
	public Monster() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = PageElements.m_EmailAddress)
	private WebElement m_EmailAddress;

	@FindBy(id = PageElements.m_Password)
	private WebElement m_Password;

	@FindBy(id = PageElements.m_btn_login)
	private WebElement m_btn_login;
	
	@FindBy(xpath = PageElements.m_Profile)
	private WebElement m_Profile;

	@FindBy(xpath = PageElements.m_Resume)
	private WebElement m_Resume;
	
	@FindBy(id = PageElements.m_LinEdit)
	private WebElement m_LinEdit;
	
	@FindBy(xpath = PageElements.m_SettingsButton)
	private WebElement m_SettingsButton;
	
	@FindBy(id = PageElements.m_ProfileUpdateButton)
	private WebElement m_ProfileUpdateButton;
		
	@Given("^User is on Monster website$")
	public void user_is_on_Monster_website() throws Throwable {
	    driver.manage().window().maximize();
	    driver.get(url);
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_Password(String username, String password) throws Throwable {
		m_EmailAddress.clear();
		m_EmailAddress.sendKeys(username);
		m_Password.clear();
		m_Password.sendKeys(password);
	}
	
	@When("^User click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
		m_btn_login.click();
		Thread.sleep(2000);
	}

	@Then("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		String homePage = driver.getTitle();
		System.out.println(homePage);
		Assert.assertEquals("Find Jobs: Find your next job and advance your career today | Monster.com", homePage);
		
	}

	@Then("^User Click on Profile button$")
	public void user_Click_on_Profile_button() throws Throwable {
		m_Profile.click();
	}

	@Then("^Select Resumes/Cover Letters$")
	public void select_Resumes_Cover_Letters() throws Throwable {
		m_Resume.click();
	}

	@Then("^Click on Self Resume link$")
	public void click_on_Self_Resume_link() throws Throwable {
		m_LinEdit.click();
	}

	@Then("^Click on Settings button$")
	public void click_on_Settings_button() throws Throwable {
		m_SettingsButton.click();
	}

	@Then("^Click on Update Name button$")
	public void click_on_Update_Name_button() throws Throwable {
		m_ProfileUpdateButton.click();
	}

}
