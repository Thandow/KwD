package testing_framework1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNg {
	
	@Test
	public void adminReg() {
		System.out.println("To validate the rgistration functionality");
	}
	
	@BeforeMethod
	public void setUp() {
		System.out.println("To initialize the browser");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("To close the appln");
	}

}
