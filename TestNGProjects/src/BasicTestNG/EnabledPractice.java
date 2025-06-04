package BasicTestNG;

import org.testng.annotations.Test;

public class EnabledPractice {

	// default value = true

	@Test(priority = 1, enabled = true)
	public void login() {

	}

	@Test(priority = 3, invocationCount = 3, enabled = false)
	public void productpage() {

	}

	@Test(priority = 6)
	public void logout() {

	}

	@Test(priority = 2, invocationCount = 2)
	public void homepage() {

	}

	@Test(invocationCount = 2, priority = 4)
	public void purchespage() {

	}

	@Test(priority = 5)
	public void paymentpage() {

	}

}
