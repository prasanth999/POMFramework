package pages_landsend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class NewContact extends ProjectMethods {
	public NewContact() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	
	@FindBy(how=How.XPATH,using="//input[@title='Continue']")
	private WebElement eleContactbutton;
	
	public NewContact clickContinueButton()  {
		
	click(eleContactbutton);
		return new NewContact();		
	}
}
