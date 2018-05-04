package pages_myntra;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class Myntra_PDPpage extends ProjectMethods {
	
	public Myntra_PDPpage() {		
		PageFactory.initElements(driver,this);
	}	
	String text1;
	@FindBy(how=How.XPATH,using="//h1[@class='pdp-title']")
	private WebElement eleverifyonProduct;
	@When("verify the name of product")
	public Myntra_PDPpage verifyonProductName(String text) {

		System.out.println(getText(eleverifyonProduct));
		verifyPartialText(eleverifyonProduct,text);
		return this;

		//return text;		
	}

	@FindBy(how=How.XPATH,using="//strong[@class='pdp-price']")
	private WebElement eleGetPrice;
	@When("verify the product price")
	public String getPrice() {

		text1 =  getText(eleGetPrice);
		System.out.println("Print the Product name in PDP page : ");
		System.out.println(text1);

		return text1;		
	}

	@FindBy(how=How.XPATH,using="//span[text()='ADD TO BAG']")
	private WebElement eleClickAddtoBag;
	@When("click on add to bag")
	public Myntra_PDPpage clickAddtoBag() {
		click(eleClickAddtoBag);
		return new Myntra_PDPpage();		
	}

	@FindBy(how=How.XPATH,using="//span[text()='GO TO BAG']")
	private WebElement eleClickGotoBag;
	@When("click on go to bag")
	public Myntra_PDPpage clickGotoBag() {
		click(eleClickGotoBag);
		return new Myntra_PDPpage();		
	}

}
