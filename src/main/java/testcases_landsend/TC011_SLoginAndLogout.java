package testcases_landsend;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages1.SLoginPage;
import wdMethods.ProjectMethods;

public class TC011_SLoginAndLogout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC011_SLoginAndLogout";
		testDescription="login to Landsend application";
		testNodes="Landsend";
		category="Smoke";
		authors="Prasanth";
		browserName="chrome";
		dataSheetName="TC011";
	}
	@Test(dataProvider="fetchData")
	public void sloginAndLogout(String uName,String pwd,String vName) {
		new SLoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName);
				
	}

}
