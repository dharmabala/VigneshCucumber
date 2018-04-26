package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;


public class EditLeadPage extends ProjectMethods {
	public EditLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.ID, using="updateLeadForm_companyName")
	private WebElement eleTypeComp;
	
	public EditLeadPage updatedcompany(String data) {
		type(eleTypeComp, data);
		
		return this;
	}
	
	@FindBy(how=How.ID, using="updateLeadForm_firstName")
	private WebElement eleTypeFname;
	
	public EditLeadPage updatedfName(String data) {
		type(eleTypeFname, data);
		
		return this;
	}
	
	@FindBy(how=How.ID, using="updateLeadForm_lastName")
	private WebElement eleTypeLname;
	
	public EditLeadPage updatedlName(String data) {
		type(eleTypeLname, data);
		
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME, using="smallSubmit")
	private WebElement eleClickUpdate;
	
	public ViewLead clickUpdate() {
		
		click(eleClickUpdate);
		
		return new ViewLead();
	}

}
