package BankPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import wdMethods.BBProjectMethods;

public class selfDetailsPage extends BBProjectMethods {
	
	public selfDetailsPage entername() {
		
		WebElement elename = locateElement("name", "firstName");
		type(elename, "JS");
		return this;
		
	}

	
	public investmentSchemePage clickviewmutualfunds()  {
		WebElement elecontinue = locateElement("linktext", "View Mutual Funds");
		click(elecontinue);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return new investmentSchemePage();
	}
	
}
