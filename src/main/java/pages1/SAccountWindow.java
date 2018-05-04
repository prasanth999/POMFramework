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
		
		@FindBy(how=How.XPATH,using="//input[@name='lksrch']")
		private WebElement eleEnterSearch;
		
		public SAccountWindow enterSearch(String data) {
			switchToFrame(locateElement("searchFrame"));
			type(eleEnterSearch, data);
			return this;
		}
		
		@FindBy(how=How.XPATH,using="//input[@name='go']")
		private WebElement eleGoButton;
		
		
		public SAccountWindow clickGoButton() {
			clickWithNoSnap(eleGoButton);
			driver.switchTo().defaultContent();
			return this;		
		}
		
		@FindBy(how=How.XPATH,using="//a[text()='Delta UAT Testing']")
		private WebElement eleAccountNameLink;
		
		
		public SHomePage clickAccountNameLink() throws InterruptedException {
			
			switchToFrame(locateElement("resultsFrame"));
			Thread.sleep(5000);
			clickWithNoSnap(eleAccountNameLink);
			switchToWindow(0);
			return new SHomePage();		
		}
}
