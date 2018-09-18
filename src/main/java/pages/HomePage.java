package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	@And("click on crmsfa")
	public MyHomePage clickCRMSFA() {
		WebElement eleCRMSFA = locateElement("linktext", "CRM/SFA");
		click(eleCRMSFA);
		return new MyHomePage();
	}
	
	
	@Then("verify  login is sucess")
	public void verifylogin() {
		System.out.println("user logged in");
	}
	
}









