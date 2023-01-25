package StepDefinitons;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BeforeAndAfterStepDefinition {
	
	// this will be apliceable for all the features before and after every scenario like "background"
	// if you want to make it specific for a scenario write tag like that >> @Before("WebTest")
	
	@Before
	public void precondition() {
		System.out.println("pre condition");
		// we will launch browser here and open the application on the browser
	}
	
	@After
	public void postcondition() {
		System.out.println("post condition");
		// we will close browser here 


	}
}
