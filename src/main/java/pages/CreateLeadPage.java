package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {
	
	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='createLeadForm_companyName']")
	private WebElement eleCompanyName;
	@And("Enter the Company Name as (.*)")
	public CreateLeadPage enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='createLeadForm_firstName']")
	private WebElement eleFirstName;
	@And("Enter the First Name as (.*)")
	public CreateLeadPage enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='createLeadForm_lastName']")
	private WebElement eleLastName;
	@And("Enter the Last Name as (.*)")
	public CreateLeadPage enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleCreateLeadsButton;
	@When("Click on Create Lead button")
	public ViewLeadPage clickCreateLeadsButton() {
	click(eleCreateLeadsButton);
		return new ViewLeadPage();		
	}
	

}
