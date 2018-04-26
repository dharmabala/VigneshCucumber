package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{
	public FindLeadPage() {
		PageFactory.initElements(driver,this);
		}
	@FindBy(how=How.XPATH, using="(//input[@name='firstName'])[3]")
	private WebElement eleTypeFname1;
	
	public FindLeadPage fName1(String data) {
		
		type(eleTypeFname1, data);
		
		return this;
	}

	@FindBy(how=How.XPATH, using="(//input[@name='lastName'])[3]")
	private WebElement eleTypeLname1;

	public FindLeadPage lName1(String data) {
		
		type(eleTypeLname1, data);
		
		return this;
	}
	

	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	private WebElement eleClickFind;

	public FindLeadPage clickFind() throws InterruptedException {
		
		click(eleClickFind);
		Thread.sleep(2222);
		
		return  this;
	}
	
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement elelinkFind;

	public ViewLead clickFindLink()  {
		
		click(elelinkFind);
		return new ViewLead();
	}
	
	

	
	
}
