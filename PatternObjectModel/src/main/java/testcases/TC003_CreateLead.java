package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CREATELEAD";
		testDescription="CreateLead Function";
		testNodes="Leads";
		category="Smoke";
		authors="Vignesh";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String cname,String fname,String lname) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		//.verifyLoggedName(vName)
		.clickcrmsfa()
		.clickLeads()
		.clickCreateLead()
		.entercompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateLeadButton()
		.verifyLead(fname);
		
		//.clickLogOut();			
	}

	
	

}
