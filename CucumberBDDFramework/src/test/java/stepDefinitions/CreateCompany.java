package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.Configuration;
import Utility.PageElements;
import cucumber.api.java.en.Then;

public class CreateCompany {
	public WebDriver driver = Configuration.browser();

	public CreateCompany() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = PageElements.CompaniesMenu)
	private WebElement CompaniesMenu;

	@FindBy(xpath = PageElements.NewCompanySubMenu)
	private WebElement NewCompanySubMenu;

	@FindBy(id = PageElements.CompanyName)
	private WebElement CompanyName;
	
	@FindBy(name = PageElements.Industry)
	private WebElement Industry;
	
	@FindBy(id = PageElements.AnnualRevenue)
	private WebElement AnnualRevenue;
	
	@FindBy(id = PageElements.Employees)
	private WebElement Employees;
	
	@FindBy(name = PageElements.Status)
	private WebElement Status;
	
	@FindBy(id = PageElements.Phone)
	private WebElement Phone;
	
	@FindBy(name = PageElements.AddressTitle)
	private WebElement AddressTitle;

	@FindBy(name = PageElements.Address)
	private WebElement Address;
	
	@FindBy(name = PageElements.ZipCode)
	private WebElement ZipCode;
	
	@FindBy(name = PageElements.Tags)
	private WebElement Tags;
	
	@FindBy(xpath = PageElements.SaveButton)
	private WebElement SaveButton;
	
	@Then("^User onmouseover Company menu and select New Company$")
	public void user_onmouseover_Company_menu_and_select_New_Company() throws NoSuchElementException {
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
//		System.out.println(frames.size());
		for (WebElement frame : frames) {
			String frameName = frame.getAttribute("name");
//			System.out.println(frameName);
			if (frameName.equals("mainpanel")){
				driver.switchTo().frame(frame);
			}
		}
		Actions action = new Actions(driver);
		action.moveToElement(CompaniesMenu).build().perform();
	//	System.out.println("Sub-Menu is displayed: " + NewCompanySubMenu.isDisplayed());
		NewCompanySubMenu.click();
	}

	@Then("^User enter New company details: \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enter_New_company_details(String companyname, String industry, String annualrevenue, String employees, String status, String phone, String addresstitle, String address, String zipcode, String tags) throws Throwable {
		CompanyName.sendKeys(companyname);
		Industry.sendKeys(industry);
		AnnualRevenue.sendKeys(annualrevenue);
		Employees.sendKeys(employees);
		Select s = new Select(Status);
		s.selectByValue("Active");
		Phone.sendKeys(phone);
		AddressTitle.sendKeys(addresstitle);
		Address.sendKeys(address);
		ZipCode.sendKeys(zipcode);
		Tags.sendKeys(tags);
	}

	@Then("^User submit the page$")
	public void user_submit_the_page() throws Throwable {
		SaveButton.click();
	}
}
