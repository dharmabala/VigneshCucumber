package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_FindLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC004_FindLEAD";
		testDescription="FindLead Function";
		testNodes="Leads";
		category="Smoke";
		authors="Vignesh";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void findLead(String uName,String pwd,String fname,String lname) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmsfa()
		.clickLeads()
		.clickFindLeadPage()
		.fName1(fname)
		.lName1(lname)
		.clickFind()
		.clickFindLink();
		
		
		
		
	}
	

}
