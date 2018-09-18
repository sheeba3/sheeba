package BankTests;

import org.testng.annotations.*;

import BankPages.HomePage;
import wdMethods.BBProjectMethods;

public class BankBazzarTest extends BBProjectMethods{
	
	@BeforeClass
	public void setData() {
		testCaseName = "BankBazzarTest";
		testCaseDescription ="investmentschemes";
		category = "Smoke";
		author= "js";
		
	}
	
	@Test
	public void BBinvestmentsschemes() throws InterruptedException {
		
		new HomePage()
		.MouseOverIvestments()
		.clickmutualfunds()
		.clickSearchMutualFunds()
		.moveAgeSlider()
		.clickMonthandYear()
		.clickDay()
		.clickAgeContinue()
		.moveandIncomeSlider()
		.clickSalaryContinue()
		.clickBank()
		.entername()
		.clickviewmutualfunds();
		
		
		
	}

	
	
	
	
	
}
