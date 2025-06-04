package BasicTestNG;

import org.testng.annotations.Test;

public class PriorityPractice {

	// Can it be 0 ? Yes
	// Can it be negative? Yes
	// Can 2Test have same priority? Yes, it will execute alphabetic order
	// What is default priority of any test? 0
	
	//priority=0   ---> 2nd
	//priority=1   ---> 3rd
	//priority=-1  ---> 1st

	@Test(priority = 1)
	public void login() {

	}

	@Test(priority = 6)
	public void logout() {

	}

	@Test(priority = 2)
	public void homepage() {

	}

	@Test(priority = 3)
	public void productpage() {

	}

	@Test(priority = 4)
	public void purchespage() {

	}

	@Test(priority = 5)
	public void paymentpage() {

	}

}
