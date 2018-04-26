package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005EditLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC005Edit_LEAD";
		testDescription="EditLead Function";
		testNodes="Leads";
		category="Smoke";
		authors="Vignesh";
		browserName="chrome";
		dataSheetName="TC006";
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
		.clickFindLink()
		.clickEditButton();

		
	
	}
}
