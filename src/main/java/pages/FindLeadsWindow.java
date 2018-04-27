package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class FindLeadsWindow extends ProjectMethods {
	
	public FindLeadsWindow() {		
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleEnterWinLeadID;
	@And("Enter the LeadID in window as(.*)")
	public FindLeadsWindow enterWinLeadID(String data) {
		type(eleEnterWinLeadID, data);	
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleWindowIcon;
	@When("Click on Find Leads in window button")
	public FindLeadsWindow clickwindowHandling() {
		clickWithNoSnap(eleWindowIcon);
			return this;		
		}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleWinLeadIDLink1;
	@When("Click on LeadID link from Lead1 list section in window")
	public MergeLeadsPage clickWinLeadIDLink1() throws InterruptedException  {
		Thread.sleep(5000);
		clickWithNoSnap(eleWinLeadIDLink1);
		switchToWindow(0);
		return new MergeLeadsPage();		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleWinLeadIDLink2;
	@When("Click on LeadID link from Lead2 list section in window")
	public MergeLeadsPage clickWinLeadIDLink2() throws InterruptedException  {
		Thread.sleep(5000);
		clickWithNoSnap(eleWinLeadIDLink2);
		switchToWindow(0);
		return new MergeLeadsPage();		
	}
}
