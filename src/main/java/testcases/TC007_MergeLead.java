package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_MergeLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC007_MergeLead";
		testDescription="Merge Lead";
		testNodes="MergeLeads";
		category="Smoke";
		authors="Prasanth";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String ID1,String ID2,String ID3,String records1) {
		try {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeadsLink()
		.clickMergeLeadsLink()
		.clickLookupIcon1()
		.enterWinLeadID(ID1)
		.clickwindowHandling()
		.clickWinLeadIDLink1()
		.clickLookupIcon2()
		.enterWinLeadID(ID2)
		.clickwindowHandling()
		.clickWinLeadIDLink2()
		.clickMergeButton()
		.clickFindLeadsLink()
		.enterLeadID(ID3)
		.clickFindLeadsButton()
		.verifyNoRecords(records1);
		
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
