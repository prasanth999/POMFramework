package pages_landsend;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class SHomePage extends ProjectMethods{
	static String text;
	public SHomePage() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	
	@FindBy(how=How.XPATH,using="//a[text()='Accounts']")
	private WebElement eleAccountlink;
	
	public SHomePage clickAccountLink()  {
		
	click(eleAccountlink);
		return new SHomePage();		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='new']")
	private WebElement eleNewButton;
	
	public SHomePage clickNewButton()  {
		
	click(eleNewButton);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@type='text'])[2]")
	private WebElement eleFirstName;

	public SHomePage enterFirstNumber(String FirstName) {
		type(eleFirstName, FirstName);
		return this;		
	}

	@FindBy(how=How.XPATH,using="(//input[@type='text'])[4]")
	private WebElement eleLastName;

	public SHomePage enterLastName(String LastName) {
		type(eleLastName, LastName);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@type='text'])[6]")
	private WebElement elePhoneNo;

	public SHomePage enterPhoneNo(String PhoneNo) {
		type(elePhoneNo, PhoneNo);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="(//input[@type='text'])[9]")
	private WebElement eleAdrressLine1;

	public SHomePage enterAddressLine1(String AddressLine1) {
		type(eleAdrressLine1, AddressLine1);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@type='checkbox'])[1]")
	private WebElement eleCheckPrimary;
	
	public SHomePage checkPrimaryBill()  {
		
	click(eleCheckPrimary);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//img[@title='For US and Canada, Zip Code/Postal Lookup (New Window)'])[1]")
	private WebElement eleClickZipCode;
	
	public Zipcodewin clickZipCode()  {
		
	clickWithNoSnap(eleClickZipCode);
	switchToWindow(1);
		return new Zipcodewin();		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@type='submit'])[5]")
	private WebElement eleSaveButton;
	
	public SHomePage clickSaveButton()  {
		
	click(eleSaveButton);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='00NU00000039TCz_ileinner']")
	private WebElement eleGetAccountNumber;
	
	public String getAccountNumber() {
	
		text =  getText(eleGetAccountNumber);
		
		System.out.println("Print the Account Number details: ");
		
		System.out.println(text);
		
		return text;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@title='New Contact']")
	private WebElement eleContactbutton;
	
	public NewContact clickContactButton()  {
		
	click(eleContactbutton);
		return new NewContact();		
	}
}
