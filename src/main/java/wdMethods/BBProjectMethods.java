package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.DataInputProvider;

public class BBProjectMethods extends SeMethods{

	//public String dataSheetName;
	
	@BeforeMethod
	public void login() {
		startApp("chrome", "https://www.bankbazaar.com/");
		
	}
	
	/*@AfterMethod(groups="common")
	public void close() {
		closeAllBrowsers();
	}*/
	
	/*@DataProvider(name="fetchData")
	public String[][] getData() {
	return DataInputProvider.getSheet(dataSheetName);
	}
	*/
	
	
	
	
	
	
	
	
}