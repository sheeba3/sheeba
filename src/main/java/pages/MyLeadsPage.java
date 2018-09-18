package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{

	@And("click on create lead")
	public CreateLeadPage clickCreateLead() {
		WebElement eleCreateLead = locateElement("linktext", "Create Lead");
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	public FindLeads clickFindLeads() {
		WebElement eleFindLeads = locateElement("linktext", "Find Leads");
		click(eleFindLeads);
		return new FindLeads();
	}
	
	
	
}









