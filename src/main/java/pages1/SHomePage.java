package pages1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;


public class SHomePage extends ProjectMethods{
		
		public SHomePage() {
			PageFactory.initElements(driver,this);
		}
	
	@FindBy(how=How.XPATH,using="//span[@id='userNavLabel']")
	private WebElement eleLoggedName;
	
	public SHomePage verifyLoggedName(String data) {
	verifyPartialText(eleLoggedName, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Sales Orders']")
	private WebElement eleSalesorder;
	
	public SHomePage clickSalesorderMenu() {
		click(eleSalesorder);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='new']")
	private WebElement eleNewSalesorder;
	
	public SHomePage clickNewSalesorderButton() {
		click(eleNewSalesorder);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//img[@alt='Account Lookup (New Window)']")
	private WebElement eleAccountICon;
	
	public SAccountWindow clickAccountIcon() {
		clickWithNoSnap(eleAccountICon);
		switchToWindow(1);
		return new SAccountWindow();		
	}
	
	@FindBy(how=How.XPATH,using="//img[@alt='Contact Lookup (New Window)']")
	private WebElement eleContactICon;
	
	public SContactWindow clickContactIcon() {
		clickWithNoSnap(eleContactICon);
		switchToWindow(1);
		return new SContactWindow();		
	}
	
	//@FindBy(how=How.XPATH,using="//table[@class='calDays']/tbody/tr[2]/td[5]")
	@FindBy(how=How.XPATH,using="(//span[@class='dateInput dateOnlyInput'])[1]")
	private WebElement eleOrderdate;
	
	public SHomePage clickOrderDate(String data1) {
		type(eleOrderdate, data1);
		
		//clickWithNoSnap(eleOrderdate);
		
		return new SHomePage();		
	}
}
