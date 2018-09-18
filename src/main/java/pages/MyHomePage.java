package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{

	@And("click on leads")
	public MyLeadsPage clickLeads() {
		WebElement eleLeads = locateElement("linktext", "Leads");
		click(eleLeads);
		return new MyLeadsPage();
	}
	
}









