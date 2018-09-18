package BankPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import wdMethods.BBProjectMethods;

public class MutualFundsPage extends BBProjectMethods {
	
	public AgePage clickSearchMutualFunds() throws InterruptedException {
		
		WebElement eleclickMF = locateElement("linktext", "Search for Mutual Funds");
		click(eleclickMF);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return new AgePage();
	}

}
