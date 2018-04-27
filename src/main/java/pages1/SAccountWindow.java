package pages1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;



public class SAccountWindow extends ProjectMethods{
		
		public SAccountWindow() {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(how=How.XPATH,using="//a[text()='Delta UAT Testing']")
		private WebElement eleAccountNameLink;
		
		
		public SHomePage clickAccountNameLink() {
			switchToFrame(locateElement("resultsFrame"));
			clickWithNoSnap(eleAccountNameLink);
			switchToWindow(0);
			return new SHomePage();		
		}
}
