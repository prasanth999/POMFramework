package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {
	
	public EditLeadPage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='updateLeadForm_companyName']")
	private WebElement eleClearCompanyName;
	@When("Clear the existing company name as (.*)")
	public EditLeadPage ClearCompanyName(String data) {
		type(eleClearCompanyName,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='updateLeadForm_companyName']")
	private WebElement eleTypeCompanyName;
	@When("Enter the company name as (.*)")
	public EditLeadPage enterTypeCompanyName(String data) {
		type(eleTypeCompanyName, data);
		return this;
	}

	@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit'])[1]")
	private WebElement eleUpdateButton;
	@When("Click on update button")
	public ViewLeadPage clickUpdateButton() {
	click(eleUpdateButton);
		return new ViewLeadPage();		
	}
	
}
