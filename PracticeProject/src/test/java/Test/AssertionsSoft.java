package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsSoft {

	@Test
	public void m1(){
	String exp = "hi";
	String act = "hi";
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(exp, act);
	soft.assertNotEquals(act, exp);
	soft.assertAll();
	}

	
	
}
