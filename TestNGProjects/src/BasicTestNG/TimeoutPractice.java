package BasicTestNG;

import org.testng.annotations.Test;

public class TimeoutPractice {
	
	
	@Test(timeOut=2000)
	public void method1() {
		System.out.println("Method1 Completed");
	}
	
	@Test(timeOut=5000)
	public void method4() {
		System.out.println("Method4 Completed");
	}
	
	@Test(timeOut=3000)
	public void method2() {
		System.out.println("Method2 Completed");
	}
	
	@Test(timeOut=4000)
	public void method3() throws InterruptedException {
		System.out.println("Method3 Completed");
		Thread.sleep(6000);
	}
	

}
