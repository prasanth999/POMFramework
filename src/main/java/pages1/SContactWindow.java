package pages1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SContactWindow extends ProjectMethods {

	public SContactWindow() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Show all results']")
	private WebElement eleShowLink;
	
	
	public SContactWindow clickShowLink() {
		switchToFrame(locateElement("resultsFrame"));
		
		clickWithNoSnap(eleShowLink);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Prasanth Sundaresan']")
	private WebElement eleContactLink;
	public SHomePage clickContactLink() throws InterruptedException {
		
		
		Thread.sleep(5000);
		clickWithNoSnap(eleContactLink);
		switchToWindow(0);
		return new SHomePage();		
	}
	
}
