package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLead extends ProjectMethods {
	public MyLead() {
		PageFactory.initElements(driver,this);
		}
		@FindBy(how=How.LINK_TEXT,using="Create Lead")
		private WebElement eleCreateLead;
		
		public CreateLead clickCreateLead() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleCreateLead);
			return new CreateLead();		
		}
		@FindBy(how=How.LINK_TEXT,using="Find Leads")
		private WebElement eleFindLeadPage;
		
		public FindLeadPage clickFindLeadPage() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleFindLeadPage);
			return new FindLeadPage();		
		}
		
		@FindBy(how=How.XPATH,using="//input[@class=' x-form-text x-form-field ']")
		private WebElement eleFindLeads;
		
		public FindLeadPage clickFindLeads() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleFindLeads);
			return new FindLeadPage();		
		}
		
	
		
	
	
}
