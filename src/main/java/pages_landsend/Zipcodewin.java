package pages_landsend;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import wdMethods.ProjectMethods;

public class Zipcodewin extends ProjectMethods{
	
	public Zipcodewin() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement eleEnterZip;

	public Zipcodewin enterZipcode(String ZipCode) {
		switchToFrame(locateElement("searchFrame"));
		type(eleEnterZip,ZipCode);
		return this;
	}


	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	private WebElement eleGoButton;

	public Zipcodewin clickGoButton()  {

		clickWithNoSnap(eleGoButton);
		driver.switchTo().defaultContent();
		return this;		
	}

	@FindBy(how=How.XPATH,using="(//a[@class=' dataCell '])[1]")
	private WebElement eleZipLink;

	public SHomePage clickZipLink() throws InterruptedException  {
		switchToFrame(locateElement("resultsFrame"));	
		Thread.sleep(3000);
		clickWithNoSnap(eleZipLink);
		switchToWindow(0);
		return new SHomePage();		
	}

	
}
