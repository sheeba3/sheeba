package BankPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.BBProjectMethods;

public class AgePage extends BBProjectMethods{

	public AgePage moveAgeSlider() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String requiredAge = "27";
		WebElement drag = locateElement("xpath", "//div[@class='rangeslider__handle']");
		WebElement age = locateElement("xpath", "//div[@class='rangeslider__handle']/div");
		String text = age.getText();
		Actions builder = new Actions(driver);
		do {
			builder.dragAndDropBy(drag, 5, 0).build().perform();
			age = locateElement("xpath", "//div[@class='rangeslider__handle']/div");
			text = age.getText();
			System.out.println(text);
		} while (!text.equals(requiredAge));
		return this;

	}



	public AgePage clickMonthandYear()
	{

		WebElement eleyear = locateElement("linktext", "Oct 1990");
		click(eleyear);
		return this;

	}

	public AgePage clickDay()
	{

		WebElement eleday = locateElement("xpath", "//div[text()='20']");
		click(eleday);
		return this;


	}
	public annualIncomePage clickAgeContinue() {
		WebElement elecontinue = locateElement("linktext", "Continue");
		click(elecontinue);
		return new annualIncomePage();

	}
}
