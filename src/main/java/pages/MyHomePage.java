package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods {
	
	public MyHomePage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Leads']")
	private WebElement eleLeadsLink;
	@When("Click on Lead link")
	public MyLeadsPage clickLeadsLink() {
	click(eleLeadsLink);
		return new MyLeadsPage();		
	}
	

}
