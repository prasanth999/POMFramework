package testcases_landsend;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages_landsend.SLoginPage;
import pages_landsend.SHomePage;
import pages_landsend.Zipcodewin;
import wdMethods.ProjectMethods;

public class TC003_Account_Creation extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_Account_Creation";
		testDescription="Creating Account";
		testNodes="Lands";
		category="Smoke";
		authors="Prasanth";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void accountCreation(String uName,String pwd,String FirstName,String LastName,String PhoneNo,String AddressLine1,String ZipCode) throws InterruptedException  {
		
		new SLoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickAccountLink()
		.clickNewButton()
		.enterFirstNumber(FirstName)
		.enterLastName(LastName)
		.enterPhoneNo(PhoneNo)
		.enterAddressLine1(AddressLine1)
		.checkPrimaryBill()
		.clickZipCode()
		.enterZipcode(ZipCode)
	    .clickGoButton()
	    .clickZipLink()
	    .clickSaveButton()
	    .getAccountNumber();
		
		
	}

}
