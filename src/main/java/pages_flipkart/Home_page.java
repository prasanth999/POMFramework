package pages_flipkart;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;

import wdMethods.ProjectMethods;

public class Home_page extends ProjectMethods {
	static String text;
	public Home_page() {		
		PageFactory.initElements(driver,this);
	}	


	@FindBy(how=How.CLASS_NAME,using="(//input[@type='text'])[2]")
	private WebElement eleEnterusername;
	@And("Enter the sunglass from the search textbox")
	public Home_page enterUser(String username) {
		//moveMouseOver(eleEnterusername);
		//moveMouseOverClick(eleEnterusername);
		type(eleEnterusername, username);
		return this;
	}

	@FindBy(how=How.CLASS_NAME,using="//input[@type='password']")
	private WebElement eleEnterPassword;
	@And("Enter the sunglass from the search textbox")
	public Home_page enterPassword(String password) {
		//moveMouseOver(eleEnterPassword);
		//moveMouseOverClick(eleEnterPassword);
		type(eleEnterPassword, password);
		return this;
	}

	@FindBy(how=How.CLASS_NAME,using="(//button[@type='submit'])[2]")
	private WebElement eleClickLoginbutton;
	@And("Enter the sunglass from the search textbox")
	public Home_page clickLoginbutton() {
		//moveMouseOver(eleClickLoginbutton);
		click(eleClickLoginbutton);
		return this;
	}

	@FindBy(how=How.CLASS_NAME,using="//a[@title='Electronics']")
	private WebElement eleClickTopMenu;
	@And("Enter the sunglass from the search textbox")
	public Home_page mouseoverTop() {
		moveMouseOver(eleClickTopMenu);
		return this;
	}

	@FindBy(how=How.CLASS_NAME,using="//span[text()='Lenovo']")
	private WebElement eleClickSubMenu;
	@And("Enter the sunglass from the search textbox")
	public Home_page mouseoverSub() {
		moveMouseOverClick(eleClickSubMenu);
		return this;
	}

}