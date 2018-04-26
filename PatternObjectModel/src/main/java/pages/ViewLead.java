package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {
	
	public ViewLead() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleviewLead_firstName_sp;
	
	public ViewLead verifyLead(String data) {
	verifyPartialText(eleviewLead_firstName_sp, data);
	
		return this;		
	
	}
	@FindBy(how=How.CLASS_NAME, using="subMenuButton")
	private WebElement eleClickEditButton;
	
	public EditLeadPage clickEditButton() {
		
		click(eleClickEditButton);
		
		return new EditLeadPage();
	}


}
