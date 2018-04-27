package testcases_landsend;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages1.SLoginPage;
import wdMethods.ProjectMethods;

public class TC012_SSalesOrder extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC012_SSalesOrder";
		testDescription="SalesOrder in Landsend application";
		testNodes="Landsend";
		category="Smoke";
		authors="Prasanth";
		browserName="chrome";
		dataSheetName="TC012";
	}
	@Test(dataProvider="fetchData")
	public void sSalesOrder(String uName,String pwd,String vName) {
		new SLoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickSalesorderMenu()
		.clickNewSalesorderButton()
		.clickAccountIcon()
		.clickAccountNameLink();
	}

}
