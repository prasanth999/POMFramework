package pages_myntra;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.CreateLeadPage;
import pages.FindLeadsPage;
import pages.ViewLeadPage;
import wdMethods.ProjectMethods;


public class Myntra_HomePage extends ProjectMethods {
	static String text;
	public Myntra_HomePage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.CLASS_NAME,using="desktop-searchBar")
	private WebElement eleEnterValue;
	@And("Enter the sunglass from the search textbox as (.*)")
	public Myntra_HomePage enterValue(String data) {
		typeEnter(eleEnterValue, data, Keys.ENTER);
		return this;
	}

	@FindBy(how = How.XPATH , using = "//span[contains(text(),'40%')]/preceding::h4[1][contains(text(),'Unisex')]")
	private List<WebElement> elelessValue;
	@When("get the count of the sunglasses with 40% discount and product should be unisex product")
	public Myntra_HomePage findlessValues() throws InterruptedException
	{
		Thread.sleep(2000);
		
		System.out.println("Printing sunglasses with 40% discount and product should be unisex product : ");

		for (WebElement wb : elelessValue) {

			String value = wb.getText();

			System.out.println(value);
		}
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME , using = "product-brand")
	private List<WebElement> eleUniqueValue;
	@When("Print all unique brand names of sunglasses")
	public Myntra_HomePage uniqueProducts() throws InterruptedException
	{
		

		Set<String> names = new TreeSet<>();

		for (WebElement string : eleUniqueValue) {

				names.add(string.getText());
			}
		
		System.out.println("Print all unique brand names of sunglasses : ");
		
		System.out.println(names);
		
		Thread.sleep(2000);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[@style='background-color: rgb(94, 177, 96);']")
	private WebElement eleClickcolor;
	@When("click on green color filter icon")
	public Myntra_HomePage clickOnColor() {
	click(eleClickcolor);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='product-productMetaInfo']/div[1])[2]")
	private WebElement eleGetProductName;
	
	public String getProductName() {
	
		text =  getText(eleGetProductName);
		
		System.out.println("Print the Product name in PLP Page : ");
		
		System.out.println(text);
		
		return text;		
	}
	
	
	
	@FindBy(how=How.XPATH,using="(//li[@class='product-base'])[2]//img")
	private WebElement eleClickonProduct;
	@When("click on second listed search result of the sunglasses")
	public Myntra_PDPpage clickonProductName() {
	click(eleClickonProduct);
		return new Myntra_PDPpage();		
	}
}
