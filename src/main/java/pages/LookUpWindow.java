package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LookUpWindow extends ProjectMethods {

	public LookUpWindow() {		
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleEnterLeadID;
	
	public LookUpWindow enterLeadID(String data) {
		type(eleEnterLeadID, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	
	public FindLeadsWindow clickFindLeadsButton() {
	clickWithNoSnap(eleFindLeadsButton);
		return new FindLeadsWindow();		
	}
	
}
