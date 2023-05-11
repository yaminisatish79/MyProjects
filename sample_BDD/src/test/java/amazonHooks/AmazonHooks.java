package amazonHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AmazonHooks {

	
	
	@Before
	public void setup() {
		System.out.println("This is my Before method call ");
	}
	@After
	public void tearDown() {
		System.out.println("This is my after method call ");
	}
}
