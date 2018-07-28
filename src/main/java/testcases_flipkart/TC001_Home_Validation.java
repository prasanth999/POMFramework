package testcases_flipkart;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages_flipkart.Home_page;
import wdMethods.ProjectMethods;

public class TC001_Home_Validation extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC001_Home_Validation";
		testDescription="login to flipkart application";
		testNodes="flipkart";
		category="Smoke";
		authors="Prasanth";
		browserName="chrome";
		dataSheetName="TC024";
	}
	@Test(dataProvider="fetchData")
	public void homePageValidation(String username, String password) {
		new Home_page()
		.enterUser(username)
		.enterPassword(password)
		.clickLoginbutton()
		.mouseoverTop()
		.mouseoverSub();
				
	}

}

