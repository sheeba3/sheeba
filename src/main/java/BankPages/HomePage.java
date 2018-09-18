package BankPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.BBProjectMethods;

public class HomePage extends BBProjectMethods {
	
	
	
	public HomePage MouseOverIvestments() {
		
		WebElement elemouseoverinvestment = locateElement("linktext", "INVESTMENTS");
		Actions actions = new Actions(driver);
		actions.moveToElement(elemouseoverinvestment).build().perform();
		return this;
	}
		
		public MutualFundsPage clickmutualfunds() {
		
		
		WebElement clickmutualfund = locateElement("linktext", "Mutual Funds");
		click(clickmutualfund);
		return new MutualFundsPage();
		
	}
	

}
