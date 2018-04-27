package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicate Lead";
		testNodes="DuplicateLeads";
		category="Smoke";
		authors="Prasanth";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String email,String cname) {
		try {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.clickEmailTab()
		.enterEmailAddress(email)
		.clickFindLeadsButton()
		.clickLeadIDLink()
		.clickDuplicateButton()
		.verifyDuplicateText()
		.clickCreateLeadButton()
		.verifyViewCompanyName(cname);
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
