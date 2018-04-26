package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
	public CreateLead() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecompanyName;
	
	public CreateLead entercompanyName(String data) {
		type(elecompanyName, data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLead enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	public CreateLead enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmitCreateButton;
	
	public ViewLead clickCreateLeadButton() {
		click(eleSubmitCreateButton);
		return new ViewLead();		
	}
	

}
