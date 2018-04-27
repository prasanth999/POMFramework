package pages1;

import org.openqa.selenium.WebElement;
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
}
