package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Editing the Lead";
		testNodes="EditLeads";
		category="Smoke";
		authors="Prasanth";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String LeadID,String cName) {
		try {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.enterLeadID(LeadID)
		.clickFindLeadsButton()
		.clickLeadIDLink()
		.clickEditButton()
		.ClearCompanyName(cName)
		.enterTypeCompanyName(cName)
		.clickUpdateButton()
		.verifyViewCompanyName(cName);
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
