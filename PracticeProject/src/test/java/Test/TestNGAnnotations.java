package Test;

import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test(invocationCount = 2)
	public void m1() {
		System.out.println("method m1");
	}
	
	@Test(timeOut = 2000)
	public void m2() {
		System.out.println("method m2");
	}
	
	@Test
	public void m3() {
		System.out.println("method m3");
	}
	
	@Test
	public void m4() {
		System.out.println("method m4");
	}
	
	@Test
	public void m5() {
		System.out.println("method m5");
	}
	
	@Test(dependsOnMethods = {"m5"})
	public void m6() {
		System.out.println("method m6");
	}
	
	@Test(priority = -1)
	public void m7() {
		System.out.println("method m7");
	}
	
	@Test(enabled = false)
	public void m8() {
		System.out.println("method m8");
	}
}

