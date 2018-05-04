package pages_myntra;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class Myntra_shoppingpage extends ProjectMethods {
	public Myntra_shoppingpage() {		
		PageFactory.initElements(driver,this);
	}
		@FindBy(how=How.XPATH,using="//a[@class='c-gray']")
		private WebElement eleverifyProductN;
		@When("verify the product name")
		public String verifyProductName(String text) {
		verifyPartialText(eleverifyProductN,text);
			return text;		
		}
		
		@FindBy(how=How.XPATH,using="//div[@class='c-dblue total-rupees']")
		private WebElement eleverifyPrice;
		@When("verify the price is correct")
		public String verifyPrice(String text1) {
		verifyPartialText(eleverifyPrice,text1);
			return text1;		
		}
}
