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

public class Dice {

	public WebDriver driver = Configuration.browser();
	public String url = "https://www.dice.com/dashboard/login";
	
	public Dice() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = PageElements.d_Email)
	private WebElement d_Email;

	@FindBy(id = PageElements.d_Password)
	private WebElement d_Password;

	@FindBy(xpath = PageElements.d_btn_login)
	private WebElement d_btn_login;
	
	@FindBy(id = PageElements.d_Profile)
	private WebElement d_Profile;

	@FindBy(xpath = PageElements.d_ToggleOnOff)
	private WebElement d_ToggleOnOff;
	
	@FindBy(xpath = PageElements.d_ProfileUpdateButton)
	private WebElement d_ProfileUpdateButton;
		
	@Given("^Dice: User is on Dice website$")
	public void dice_User_is_on_Dice_website() throws Throwable {
	    driver.manage().window().maximize();
	    driver.get(url);
	}

	@When("^Dice: User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void dice_User_enters_username_and_Password(String username, String password) throws Throwable {
		d_Email.clear();
		d_Email.sendKeys(username);
		d_Password.clear();
		d_Password.sendKeys(password);
	}
	
	@When("^Dice: User click on Login button$")
	public void dice_User_click_on_Login_button() throws Throwable {
		d_btn_login.click();
		Thread.sleep(5000);
	}

	@Then("^Dice: User is on home page$")
	public void dice_User_is_on_home_page() throws Throwable {
		String homePage = driver.getTitle();
		System.out.println(homePage);
		Assert.assertEquals("Seeker Dashboard - Profile", homePage);
		
	}

	@Then("^Dice: User Click on Profile button$")
	public void dice_User_Click_on_Profile_button() throws Throwable {
		d_Profile.click();
	}

	@Then("^Dice: UnSelect and Select Willing to Travel option$")
	public void dice_UnSelect_and_Select_Willing_to_Travel_option() throws Throwable {
		d_ToggleOnOff.click();
		Thread.sleep(1000);
		d_ToggleOnOff.click();
	}

	@Then("^Dice: Click on Done button$")
	public void dice_Click_on_Done_button() throws Throwable {
		d_ProfileUpdateButton.click();
	}
}
