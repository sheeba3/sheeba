package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;


public class hooksconcepts extends SeMethods {
	
	@Before
	public void beforescenario (Scenario jeba) {
		
		startResult();
		
		testCaseName = jeba.getName();
		testCaseDescription =jeba.getId();
		category = "Smoke";
		author= "Babu";
		
		startTestCase();
		startApp("chrome","http://leaftaps.com/opentaps/" );
		
		
	}
	@After
public void afterscenario (Scenario jeba) {
		
		
		
		stopResult();
		
		closeAllBrowsers();
		
		System.out.println("SCENARIO STATUS" + jeba.getStatus());
		
	}

}
