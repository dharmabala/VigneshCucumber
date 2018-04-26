package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;
public class Hooks extends ProjectMethods{
	public String browserName;

	@Before
    public void before(Scenario s) {
		//System.out.println(s.getName());
		startResult();
		startTestModule(s.getName(),s.getId());	
		test = startTestCase(s.getName());
		test.assignCategory("smoke");
		test.assignAuthor("vicky");
		startApp("chrome");
    }                                            
	@After
	public void after() {
		endResult();
		closeAllBrowsers();
	}



}
