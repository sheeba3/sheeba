package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{

	
	
	
	public ViewLead ClickCreateDup() {
		
		WebElement eleDup = locateElement("name", "submitButton");
		click(eleDup);
		return new ViewLead();
	}
		
}