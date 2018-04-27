package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Creating the Lead";
		testNodes="CreateLeads";
		category="Smoke";
		authors="Prasanth";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String cName,String fName,String lName) {
		try {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeadsLink()
		.clickCreateLeadsLink()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadsButton()
		.verifyViewFirstName(fName);
		
		/*HomePage()
		.clickCrmsfa();	
		new MyHomePage()
		.clickLeadsLink();
		new MyLeadsPage()
		.clickCreateLeadsLink();
		new CreateLeadPage()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadsButton();
		new ViewLeadPage()
		.verifyViewFirstName(expectedFname);*/
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}


