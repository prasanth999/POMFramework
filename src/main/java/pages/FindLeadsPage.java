package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleEnterLeadID;
	@And("Enter the LeadID as (.*)")
	public FindLeadsPage enterLeadID(String data) {
		type(eleEnterLeadID, data);	
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[2]")
	private WebElement eleEnterFirstname;
	
	public FindLeadsPage enterFirstName(String data) {
		type(eleEnterFirstname, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[3]")
	private WebElement eleEnterLastname;
	
	public FindLeadsPage enterLastName(String data) {
		type(eleEnterLastname, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[4]")
	private WebElement eleEnterCompanyname;
	
	public FindLeadsPage enterCompanyName(String data) {
		type(eleEnterCompanyname, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elePhoneTab;
	@When("Click on Phone Tab")
	public FindLeadsPage clickPhoneTab() {
	click(elePhoneTab);
		return new FindLeadsPage();		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneAreaCode']")
	private WebElement eleEnterPhoneAreaCode;
	@And("Enter the Area code as (.*)")
	public FindLeadsPage enterPhoneAreaCode(String data) {
		type(eleEnterPhoneAreaCode, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement eleEnterPhoneNumber;
	@And("Enter the Phone Number as (.*)")
	public FindLeadsPage enterPhoneNumber(String data) {
		type(eleEnterPhoneNumber, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmailTab;
	@When("Click on Email Tab")
	public FindLeadsPage clickEmailTab() {
	click(eleEmailTab);
		return new FindLeadsPage();		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement eleEnterEmailAddress;
	@And("Enter email address as (.*)")
	public FindLeadsPage enterEmailAddress(String data) {
		type(eleEnterEmailAddress, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	@When("Click on Find Lead button")
	public FindLeadsPage clickFindLeadsButton() {
	click(eleFindLeadsButton);
		return new FindLeadsPage();		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleLeadIDLink;
	@When("Click on LeadID link from Lead list section")
	public ViewLeadPage clickLeadIDLink() throws InterruptedException {	
		Thread.sleep(5000);
	click(eleLeadIDLink);
		return new ViewLeadPage();		
	}
	
	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	private WebElement eleNoRecords;
	@When("Verify the No records as (.*)")
	public FindLeadsPage verifyNoRecords(String data) {
	verifyPartialText(eleNoRecords, data);
		return this;		
	}
}
