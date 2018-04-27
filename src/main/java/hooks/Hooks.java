package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {
	public String browserName;
	@Before
	public void before(){
		startResult();
		startTestModule("CreateLead", "Creating Lead");
		test = startTestCase("CreateLeads");
		test.assignCategory("smoke");
		test.assignAuthor("prasanth");
		startApp("chrome");	
	}
	
	@After
	public void afterSuite(){
		endResult();
		closeAllBrowsers();
	}


}
