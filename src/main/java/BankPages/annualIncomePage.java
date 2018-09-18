package BankPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.BBProjectMethods;

public class annualIncomePage extends BBProjectMethods{
	
	public annualIncomePage moveandIncomeSlider() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String requiredincome = "10,00,000";
		WebElement drag = locateElement("xpath", "//div[@class='rangeslider__handle']");
		WebElement income = locateElement("xpath", "//div[@class='rangeslider__handle']/span");
		String text="";
		Actions builder = new Actions(driver);
		do {
			builder.dragAndDropBy(drag, 5, 0).build().perform();
			income = locateElement("xpath", "//div[@class='rangeslider__handle']/div");
			text = income.getText();
			System.out.println(text);
		} while (!text.equals(requiredincome));
		return this;

	}

	
	public SelectBankPage clickSalaryContinue() {
		WebElement elecontinue = locateElement("linktext", "Continue");
		click(elecontinue);
		return new SelectBankPage();

	
}
}