package BasicTestNG;

import org.testng.annotations.Test;

public class InvocationCountPractice {
	
	//default value = 1
	

	@Test(priority = 1, enabled=false)
	public void login() {

	}

	@Test(priority = 6)
	public void logout() {

	}

	@Test(priority = 2, invocationCount = 2)
	public void homepage() {

	}

	@Test(priority = 3, invocationCount=3)
	public void productpage() {

	}

	@Test(invocationCount=2,priority = 4)
	public void purchespage() {

	}

	@Test(priority = 5)
	public void paymentpage() {

	}

}
