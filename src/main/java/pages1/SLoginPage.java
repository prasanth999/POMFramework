package pages1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;
	
	public class SLoginPage extends ProjectMethods{
		
		public SLoginPage() {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(how=How.ID,using="username")
		private WebElement eleUserName;
		
		public SLoginPage enterUserName(String data) {
			type(eleUserName, data);
			return this;
		}
		
		@FindBy(how=How.ID,using="password")
		private WebElement elePassword;
		
		public SLoginPage enterPassword(String data) {
			type(elePassword, data);
			return this;
		}

		@FindBy(how=How.ID,using="Login")
		private WebElement eleLogin;
		
		public SHomePage clickLogIn() {
			click(eleLogin);
			return new SHomePage();		
		}
		
		
	}

