package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@MobileTest")
	public void beforeValidation() {
		System.out.println("before validation is running");
	}
	
	@After("@MobileTest")
	public void afterValidation() {
		System.out.println("after validation is running");
	}
}
