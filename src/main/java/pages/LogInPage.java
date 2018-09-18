package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class LogInPage extends ProjectMethods{
	@And("enter the userName as (.*)")
	public LogInPage typeUserName(String data) {
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, data);
		return this;
	}
	@And("enter the password as (.*)")
	public LogInPage typePassword(String data) {
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, data);
		return this;
	}
	
	
	@When("clicks on the login button")
	public HomePage clickLogin() {
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		return new HomePage();
	}
	
}









