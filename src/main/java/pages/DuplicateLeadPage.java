package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods {

	public DuplicateLeadPage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleCreateLeadButton;
	@When("Click on submit button")
	public ViewLeadPage clickCreateLeadButton() {
	click(eleCreateLeadButton);
		return new ViewLeadPage();		
	}
	
	@FindBy(how=How.XPATH,using="//div[text()='Duplicate Lead']")
	private WebElement eleDuplicateText;
	@When("Verify the exact text of duplicate lead as")
	public DuplicateLeadPage verifyDuplicateText() {
	verifyTitle(getTitle());
		return this;		
	}
}
