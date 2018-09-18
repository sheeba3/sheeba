package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	@And("enter the companyname as (.*)")
	public CreateLeadPage typeCompanyName(String data) {
		WebElement eleCompanyName = locateElement("id", "createLeadForm_companyName");
		type(eleCompanyName, data);
		return this;
	}
	
	@And("enter the firstname as (.*)")
	public CreateLeadPage typeFirstName	(String data) {
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName, data);
		return this;
	}
	@And("enter the lastname as (.*)")
	public CreateLeadPage typeLastName	(String data) {
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName, data);
		return this;
	}
	@When("Clicks on createLead")
	public CreateLeadPage clickCreateLead() {
		WebElement eleCreateLead= locateElement("class", "smallSubmit");
		click(eleCreateLead);
		return this; 
	}
	
}









