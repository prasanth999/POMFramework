package testcases_myntra;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages_myntra.Myntra_HomePage;
import pages_myntra.Myntra_PDPpage;
import pages_myntra.Myntra_shoppingpage;
import wdMethods.ProjectMethods;

public class TC001_Myntra_Homepage extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_Myntra_Homepages";
		testDescription="login to myntrahomepages";
		testNodes="Myntra";
		category="Smoke";
		authors="Prasanth";
		browserName="chrome";
		dataSheetName="TC021";
	}
	@Test(dataProvider="fetchData")
	public void HomePage(String data) throws InterruptedException {
		new Myntra_HomePage()
		.enterValue(data)
		.findlessValues()
		.uniqueProducts()
		.clickOnColor();

		String text = new Myntra_HomePage()
				.getProductName();
		new Myntra_HomePage()
		.clickonProductName()
		.verifyonProductName(text);
		String text1 = new Myntra_PDPpage()
				.getPrice();
		new Myntra_PDPpage()
		.clickAddtoBag()
		.clickGotoBag();
		new Myntra_shoppingpage()
		.verifyProductName(text);
		new Myntra_shoppingpage()
		.verifyPrice(text1);

	}

}
