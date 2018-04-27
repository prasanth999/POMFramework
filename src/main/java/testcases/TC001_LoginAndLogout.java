package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginAndLogout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout";
		testDescription="login to LeafTaps And Logout1";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="firefox";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName) {
		System.out.println("hi");
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickLogOut();			
	}

}
