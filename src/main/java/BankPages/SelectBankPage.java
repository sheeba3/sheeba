package BankPages;

import org.openqa.selenium.WebElement;

import wdMethods.BBProjectMethods;

public class SelectBankPage extends BBProjectMethods{
	
	public selfDetailsPage clickBank() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement elebank = locateElement("xpath", "((//input[@name='primaryBankAccount'])[3])");
		click(elebank);
		return new selfDetailsPage();
	}
	

}
