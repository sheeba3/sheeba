package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	
	
	
	public EditLead ClickEdit() {
		
		WebElement eleedit = locateElement("linktext", "Edit");
		click(eleedit);
		return new EditLead();
		
	}
	
	public DuplicateLead clickDuplicate() {
		
		WebElement eleduplicate = locateElement("linktext","Duplicate Lead");
		click(eleduplicate);
		return new DuplicateLead();
	}
	
	
	

	
}









