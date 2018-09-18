package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC003_DuplicateLead extends ProjectMethods {
	
	@BeforeClass(groups="common")
	public void setData() {
		testCaseName = "TC004_DuplicateLead";
		testCaseDescription ="Duplicate a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public  void duplicateLead(String fname)   {
		
		System.out.println(fname);
		new MyHomePage()
		.clickLeads()
		.clickFindLeads()
		.TypeFirstName(fname)
		.ClicksearchLeads()
		.clickresultname2()
		.clickDuplicate()
		.ClickCreateDup();
		
		
		
	}
	

}
