package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Deleting the Lead";
		testNodes="DeleteLeads";
		category="Smoke";
		authors="Prasanth";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void DeleteLead(String uName,String pwd,String code,String number,String ID,String records) {
		try {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.clickPhoneTab()
		.enterPhoneAreaCode(code)
		.enterPhoneNumber(number)
		.clickFindLeadsButton()
		.clickLeadIDLink()
		.clickDeleteButton()
		.clickFindLeadsLink()
		.enterLeadID(ID)
		.clickFindLeadsButton()
		.verifyNoRecords(records);
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
