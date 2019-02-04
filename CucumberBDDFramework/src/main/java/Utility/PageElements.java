package Utility;

public class PageElements {
	//Login Page Elements:
	public static final String TestName = "testname";
	public static final String UserName = "username";
	public static final String Password = "password";
	public static final String LoginButton = "//input[@value='Login']";

	//Home Page Elements:
	//public static final String Logout = "//i[@class='fa fa-sign-out icon-2x']";
	public static final String Logout = "//a[@href='https://www.freecrm.com/index.cfm?logout=1']";
	public static final String CompaniesMenu = "//a[@title='Companies']";
	public static final String NewCompanySubMenu = "//a[@title='New Company']";
	public static final String CompanyName = "company_name";
	public static final String Industry = "industry";
	public static final String AnnualRevenue = "annual_revenue";
	public static final String Employees = "num_of_employees";
	public static final String Status = "status";
	public static final String Phone = "phone";
	public static final String AddressTitle = "address_title";
	public static final String Address = "address";
	public static final String ZipCode = "postcode";
	public static final String Tags = "tags";
	public static final String SaveButton = "//input[@value='Save']";

	//Monster Login Page
	public static final String m_EmailAddress = "EmailAddress";
	public static final String m_Password = "Password";
	public static final String m_btn_login = "btn-login";
	
	//Monster Home Page
	public static final String m_Profile= "//a[@class='dropdown-toggle navbar-icon-link loginLink2']//span[contains(text(),'Raghavender Reddy Vedire')]";
	public static final String m_Resume= "//ul[@class='dropdown-menu']//a[contains(text(),'Resumes/Cover')]";
	
	//Monster Resume Edit
	public static final String m_LinEdit= "lnkEdit";
	
	//Monster Settings
	public static final String m_SettingsButton = "//i[@data-original-title='SETTINGS']";

	//Monster Profile Update
	public static final String m_ProfileUpdateButton = "btn-Resume_Name";

	//Dice Login Page
	public static final String d_Email = "email";
	public static final String d_Password = "password";
	public static final String d_btn_login = "//button[@data-automation-id='sign-in-button']";
	
	//Dice Home Page
	public static final String d_Profile= "editProfile";
	
	//Dice Resume Edit
	public static final String d_ToggleOnOff= "//div[@class='col-md-5 col-lg-5']//div[@class='toggle-switch-handle']";

	//Dice Profile Update
	public static final String d_ProfileUpdateButton = "//button[@data-ng-if='isOnEditMode']";
}
